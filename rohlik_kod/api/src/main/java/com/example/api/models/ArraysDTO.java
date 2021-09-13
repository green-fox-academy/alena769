package com.example.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArraysDTO {

    @JsonProperty("what")
    private String method;

    private List<Integer> numbers;
    private String error;
    private Integer result;


    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public ArraysDTO(List<Integer> numbers, String method) {
        this.numbers = numbers;
        this.method = method;

    }

    public ArraysDTO() {
        this.error = "Please provide what to do with the numbers!";
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
