package io.github.kvr.mcp;

import java.lang.reflect.Field;
import java.util.*;

/**
 * This class is used to remove empty values from an object.
 * It will remove all empty values from the object and all its fields.
 * It will also remove all empty values from all collections and maps.
 * It will also remove all empty values from all arrays.
 * It will also remove all empty values from all custom objects.
 */
public class EmptyValueCleaner {
    public static boolean DeepCleanCollection = true;

    @SuppressWarnings("unchecked")
    public static <T> T removeEmptyValues(T obj) {
        return (T)removeEmpty(obj, new HashSet<>());
    }

    private static Object removeEmpty(Object obj, Set<Object> visited) {
        if (obj == null) {
            return null;
        }

        if (visited.contains(obj)){
            return null; // cycle detected
        }
        visited.add(obj);
        try {

            if (obj instanceof String) {
                return ((String) obj).isEmpty() ? null : obj;
            } else if (obj instanceof List<?> list) {
                if(list.isEmpty()){
                    return null;
                }
                if (DeepCleanCollection) {
                    List<Object> cleanedList = new ArrayList<>();
                    for (Object item : list) {
                        Object cleanedItem = removeEmpty(item, visited);
                        if (cleanedItem != null) {
                            cleanedList.add(cleanedItem);
                        }
                    }
                    return cleanedList.isEmpty() ? null : cleanedList;
                }
            }  else if (obj instanceof Map<?, ?> map) {
                if(map.isEmpty()){
                    return null;
                }
                if (DeepCleanCollection) {
                    Map<Object, Object> cleanedMap = new LinkedHashMap<>();
                    boolean isEmpty = true;
                    for (Map.Entry<?, ?> entry : map.entrySet()) {
                        Object cleanedValue = removeEmpty(entry.getValue(), visited);
                        if (cleanedValue != null) {
                            cleanedMap.put(entry.getKey(), cleanedValue);
                            isEmpty = false;
                        }
                    }
                    return isEmpty ? null : cleanedMap;
                }
            } else if (obj.getClass().isArray()){
                Object[] arr = (Object[]) obj;
                if (arr.length == 0) {
                    return null;
                }
                if (DeepCleanCollection) {
                    Object[] cleanedArr = Arrays.stream(arr)
                            .map(item -> removeEmpty(item, visited))
                            .filter(Objects::nonNull)
                            .toArray();

                    return cleanedArr.length == 0 ? null : cleanedArr;
                }
            } else if (isCustomObject(obj)) {
                //check if it's a custom object by checking if it's not a Java class
                return handleCustomObject(obj, visited);
            }
            return obj;
        }finally {
            visited.remove(obj);
        }
    }

    private static boolean isCustomObject(Object obj) {
        //check if not a java standard object.
        String className = obj.getClass().getName();
        return !className.startsWith("java.") && !className.startsWith("javax.");
    }

    private static Object handleCustomObject(Object obj, Set<Object> visited){
        Field[] fields = getAllFields(obj.getClass()).toArray(new Field[0]);
        boolean allFieldsEmpty = true;
        try{
            for(Field field : fields){
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) ||
                        java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                    continue;
                }

                field.setAccessible(true);
                Object fieldValue = removeEmpty(field.get(obj), visited);

                if(fieldValue != null){
                    field.set(obj, fieldValue);
                    allFieldsEmpty = false;
                } else {
                    field.set(obj, null);
                }
            }
        } catch (IllegalAccessException e){
            return obj;
        }

        return allFieldsEmpty ? null : obj;
    }

    private static List<Field> getAllFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        while (clazz != null && clazz != Object.class) {
            Collections.addAll(fields, clazz.getDeclaredFields());
            clazz = clazz.getSuperclass();
        }
        return fields;
    }
}