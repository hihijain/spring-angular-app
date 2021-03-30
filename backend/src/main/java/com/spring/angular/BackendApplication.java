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
		return Stream.of(new Books(212,"Go","Kamal S.",565,0,4),
				new Books(2121,"Java","Himanshu J",674,1,2),
				new Books(2132,"Python","Monu Kumar",600,1,1),
				new Books(5122,".Net","Theia",900,0,6),
				new Books(5126,"Java","Eclipse",1900,1,1),
				new Books(6122,".Net","Microsoft",700,0,3),
				new Books(9152,"Angular","Monty",100,10,1)).collect(Collectors.toList());
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
