package com.example.api.controllers;

import com.example.api.models.*;
import com.example.api.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    private final DoublingService doublingService;
    private final GreeterService greeterService;
    private final AppendAService appendAService;
    private final SumService sumService;
    private final FactorService factorService;
    private final ArraysService arraysService;

    @Autowired
    public MainController(DoublingService doublingService,
                          GreeterService greeterService,
                          AppendAService appendAService,
                          SumService sumService,
                          FactorService factorService,
                          ArraysService arraysService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendAService = appendAService;
        this.sumService = sumService;
        this.factorService = factorService;
        this.arraysService = arraysService;
    }

    @GetMapping(value = "/")
    public String render() {

        return "index";
    }

    @GetMapping(value = "/doubling")
    @ResponseBody
    public DoublingDTO doubling(@RequestParam(required = false) Integer input) {

        return new DoublingDTO(input, doublingService.doubleDoubling(input));
    }

    @GetMapping(value = "/greeter")
    @ResponseBody
    public ResponseEntity<GreeterDTO> greeter(@RequestParam(required = false) String name,
                                              @RequestParam(required = false) String title) {

        if (name == null && title == null) {
            GreeterDTO greeterDTO = new GreeterDTO();
            greeterDTO.setError(greeterService.bothMissing());
            return new ResponseEntity<>(greeterDTO, HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            GreeterDTO greeterDTO = new GreeterDTO();
            greeterDTO.setError(greeterService.errorName());
            return new ResponseEntity<>(greeterDTO, HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            GreeterDTO greeterDTO = new GreeterDTO();
            greeterDTO.setError(greeterService.errorTitle());
            return new ResponseEntity<>(greeterDTO, HttpStatus.BAD_REQUEST);
        }
        GreeterDTO greeterDTO = new GreeterDTO(name, title);

        return new ResponseEntity<>(greeterDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/appenda/{appendable}")
    @ResponseBody
    public AppendA append(@PathVariable(required = false) String appendable) {
        AppendA appendA = new AppendA();
        appendA.setAppended(appendAService.append(appendable));

        return appendA;
    }

    @PostMapping(value = "/dountil/{action}")
    @ResponseBody
    public ResponseEntity<?> sum(@RequestBody(required = false) SumDTO sumDTO, @PathVariable String action) {

        if (action.contains("sum") && sumDTO.getUntil() != 0) {
            SumDTO sumDTO1 = new SumDTO();
            sumDTO1.setUntil(sumDTO.getUntil());
            sumDTO1.setResult(sumService.sum(sumDTO.getUntil()));

            return new ResponseEntity<>(sumDTO1, HttpStatus.OK);

        }else if (action.contains("factor") && sumDTO.getUntil() != 0) {
            FactorDTO factorDTO = new FactorDTO();
            factorDTO.setUntil(sumDTO.getUntil());
            factorDTO.setResult(factorService.factor(sumDTO.getUntil()));

            return new ResponseEntity<>(factorDTO, HttpStatus.OK);
        }

        return new ResponseEntity<>(new SumDTO(), HttpStatus.BAD_REQUEST);
    }


    @PostMapping(value = "/arrays")
    private ResponseEntity<?> array(@RequestBody(required = false) String what,
                                    @RequestBody(required = false) List<Integer> numbers) {

        if (what.contains("sum") && numbers != null) {
            ArraysDTO arraysDTO = new ArraysDTO(numbers, what);
            arraysDTO.setResult(arraysService.sum(numbers));
            arraysDTO.setMethod("sum");

            return new ResponseEntity<>(arraysDTO,HttpStatus.OK);

        }else if (what.contains("multiply") && numbers != null) {

            ArraysDTO arraysDTOMultiply = new ArraysDTO(numbers, what);
            arraysDTOMultiply.setResult(arraysService.multiply(numbers));
            arraysDTOMultiply.setMethod("multiply");

            return new ResponseEntity<>(arraysDTOMultiply,HttpStatus.OK);

        }else if (what.contains("double") && numbers != null) {
            ArraysArrayDTO arraysArrayDTO = new ArraysArrayDTO();
            arraysArrayDTO.setMethod("double");
            arraysArrayDTO.setNumbers(arraysService.doubleTheArray(numbers));

            return new ResponseEntity<>(arraysArrayDTO,HttpStatus.OK);
        }

        return new ResponseEntity<>(new ArraysDTO(), HttpStatus.NOT_FOUND);
    }
}
