package com.semihozer.TestUygulamasi;

import com.semihozer.TestUygulamasi.service.abstracts.ResultService;
import com.semihozer.TestUygulamasi.service.abstracts.StudentService;
import com.semihozer.TestUygulamasi.service.abstracts.TeacherService;
import com.semihozer.TestUygulamasi.service.abstracts.TestService;
import com.semihozer.TestUygulamasi.service.concretes.ResultServiceImpl;
import com.semihozer.TestUygulamasi.service.concretes.StudentServiceImpl;
import com.semihozer.TestUygulamasi.service.concretes.TeacherServiceImpl;
import com.semihozer.TestUygulamasi.service.concretes.TestServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication()
public class TestUygulamasiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestUygulamasiApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}

	@Bean
	public TeacherService getTeacherService(){
		return new TeacherServiceImpl();
	}

	@Bean
	public ResultService getResultService(){return new ResultServiceImpl();}

	@Bean
	public TestService getTestService(){
		return new TestServiceImpl();
	}

	@Bean
	public StudentService getStudentService(){
		return new StudentServiceImpl();
	}


}