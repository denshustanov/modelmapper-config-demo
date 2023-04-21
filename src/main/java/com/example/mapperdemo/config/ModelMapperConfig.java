package com.example.mapperdemo.config;

import com.example.mapperdemo.model.Model1;
import com.example.mapperdemo.model.Model2;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        PropertyMap<Model1, Model2> map = new PropertyMap<>() {
            @Override
            protected void configure() {
                skip(destination.getField2());
            }
        };
        modelMapper.addMappings(map);
        return modelMapper;
    }
}
