package com.example.globalexception.base;

public class ErrorResponse {
    private String timestamp;
    private String message;
    private String details;

    public ErrorResponse(String message, String details) {
        this.timestamp = java.time.ZonedDateTime.now().toString();
        this.message = message;
        this.details = details;
    }

    // Getters and setters
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

