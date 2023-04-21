package com.example.mapperdemo.controller;

import com.example.mapperdemo.model.Model1;
import com.example.mapperdemo.model.Model2;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TestController {
    private final ModelMapper modelMapper;

    public TestController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping("/test")
    public ResponseEntity<Model2> test(@RequestBody Model1 model1){
        return ResponseEntity.ok(modelMapper.map(model1, Model2.class));
    }

}
