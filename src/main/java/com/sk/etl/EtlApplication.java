package com.sk.etl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources({
//		@PropertySource("classpath:config/application.db-${spring.profiles.active}.properties")
//})
public class EtlApplication {
	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}

	//초기화 로직
//	@Bean
//	public CommandLineRunner runner(UserRepository userRepository) {
//		return (args) -> {
//			userRepository.save(new User("홍길동", "hong@naver.com", "1111"));
//		};
//	}
}