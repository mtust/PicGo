package com.tustanovskyy.dto;

/**
 * Created by Tust on 08.06.2016.
 */
public class UserActionDTO {

    private String message;
    private Integer responseCode;

    public UserActionDTO() {
    }

    public UserActionDTO(String message, Integer responseCode) {
        this.message = message;
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserActionDTO that = (UserActionDTO) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        return responseCode != null ? responseCode.equals(that.responseCode) : that.responseCode == null;

    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + (responseCode != null ? responseCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserActionDTO{" +
                "message='" + message + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}
