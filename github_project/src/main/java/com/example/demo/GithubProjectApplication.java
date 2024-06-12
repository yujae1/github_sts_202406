package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubProjectApplication.class, args);
		System.out.println("깃헙 스프링부트 실행");
		System.out.println("sub1 사용자가 추가한 문장");
	}

}
