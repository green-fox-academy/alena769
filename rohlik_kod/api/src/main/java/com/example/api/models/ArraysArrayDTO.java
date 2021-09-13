package com.example.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArraysArrayDTO {

    @JsonProperty("what")
    private String method;

    private List<Integer> numbers;
    private List<Integer> result;


    public ArraysArrayDTO() {

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

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
