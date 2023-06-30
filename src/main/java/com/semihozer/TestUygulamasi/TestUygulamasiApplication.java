package com.semihozer.TestUygulamasi;

import com.semihozer.TestUygulamasi.service.abstracts.ResultService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.module.ModuleDescriptor;

@SpringBootApplication
@ComponentScan(basePackages = {"com.semihozer.TestUygulamasi.service.abstracts"})
public class TestUygulamasiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestUygulamasiApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}


}
