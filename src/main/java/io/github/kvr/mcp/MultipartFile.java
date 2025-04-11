package io.github.kvr.mcp;

import java.util.Base64;

/**
 * A multipart file to be used as an attachment to a jira issue.
 */
public class MultipartFile {
    /**
     * The name of the attachment.
     */
    private String name;
    /**
     * The content/media type of the attachment.
     */
    private String contentType;
    /**
     * The content of the attachment.
     */
    private String base64Content;
    /**
     * The original file name of the attachment.
     */
    private String originalFilename;

    /**
     * Constructor for MultipartFile.
     *
     * @param base64Content The base64 encoded content of the file.
     * @param name The name of the file.
     * @param contentType The content type of the file.
     * @param originalFilename The original filename of the file.
     */
    public MultipartFile(String base64Content, String name, String contentType, String originalFilename) {
        this.name = name == null ? "noname" : name;
        this.contentType = contentType == null ? "text/plain" : contentType;
        this.base64Content = base64Content;
        this.originalFilename = originalFilename == null ? "noname" : originalFilename;
    }

    /**
     * Get the name of the attachment.
     *
     * @return The name of the attachment.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the attachment.
     *
     * @param name The name of the attachment.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the content type of the attachment.
     *
     * @return The content type of the attachment.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Get the content type of the attachment.
     *
     * @return The content type of the attachment.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Set the base64 encoded content of the attachment.
     *
     * @param base64Content The base64 encoded content of the attachment.
     */
    public void setBase64Content(String base64Content) {
        this.base64Content = base64Content;
    }

    /**
     * Get the base64 encoded content of the attachment.
     *
     * @return The base64 encoded content of the attachment.
     */
    public String getBase64Content() {
        return base64Content;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public byte[] getDecodedContent() {
        return Base64.getDecoder().decode(base64Content);
    }
}
