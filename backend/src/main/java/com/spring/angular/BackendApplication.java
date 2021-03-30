package com.spring.angular;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.angular.dto.Books;

@RestController
@SpringBootApplication
public class BackendApplication {
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getallbooks")
	public List<Books> getBooks()
	{
		return Stream.of(new Books(212,"Go","Kamal S.",565,0),
				new Books(2121,"Java","Himanshu J",674,1),
				new Books(2132,"Python","Monu Kumar",600,1),
				new Books(5122,".Net","Theia",900,0),
				new Books(9152,"Angular","Monty",100,10)).collect(Collectors.toList());
	}

	@GetMapping("/hello")
	public String getMsg()
	{
		return "Hello World From Java";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
