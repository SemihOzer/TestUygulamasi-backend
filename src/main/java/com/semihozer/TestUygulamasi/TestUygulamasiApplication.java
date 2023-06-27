package com.semihozer.TestUygulamasi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.module.ModuleDescriptor;

@SpringBootApplication
public class TestUygulamasiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestUygulamasiApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}

}
