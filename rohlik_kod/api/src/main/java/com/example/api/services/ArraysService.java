package com.example.api.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArraysService {

    public Integer sum(List<Integer> array) {

        return array.stream().reduce(0, Integer::sum);
    }

    public Integer multiply(List<Integer> array) {

        return array.stream().reduce(1, (a, b) -> a * b);
    }

    public List<Integer> doubleTheArray(List<Integer> array) {

        return array.stream().map(integer -> integer*2).collect(Collectors.toList());
    }
}
