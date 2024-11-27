package com.learnwithifte.apiResponses;

public class ApiResponse <T> {
    private String status;
    private String message;
    private T data;
    private Object metadata;

    /**
     * Construct API Response
     * @param status Indicates the result of the operation (success or error)
     * @param message Provides a short, human-readable description of the result.
     * @param data Contains the requested or manipulated resource data.
     * @param metadata Optional. Includes additional information like pagination details when applicable.
     */
    public ApiResponse(String status, String message, T data, Object metadata) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.metadata = metadata;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
