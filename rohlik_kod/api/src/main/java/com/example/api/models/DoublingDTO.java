package com.example.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoublingDTO {


    private Integer received;
    private Integer result;
    private String error;

    public DoublingDTO(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public DoublingDTO() {
        this.error = "Please provide an input!";
    }


    public String getError() {
        return error;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
