package com.example.api.models;

public class FactorDTO {

    private Integer until;
    private Integer result;
    private String error;

    public FactorDTO() {
        error = "Please provide a number!";
    }
    public FactorDTO(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
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
