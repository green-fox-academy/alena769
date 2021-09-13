package com.example.api.models;

public class SumDTO {
    private Integer until;
    private Integer result;
    private String error;

    public Integer getUntil() {
        return until;
    }

    public SumDTO(Integer until) {
        this.until = until;
    }

    public SumDTO() {
        error = "Please provide a number!";
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
