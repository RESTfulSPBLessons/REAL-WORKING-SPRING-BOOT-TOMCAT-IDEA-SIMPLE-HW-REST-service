package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);

	/*		SpringApplication application = new SpringApplication(Demo6Application.class);
		Map<String, Object> map = new HashMap<>();
		map.put("SERVER_CONTEXT_PATH", "/spring-boot-app");
		map.put("SERVER_PORT", "1024");
		application.setDefaultProperties(map);
		application.run(args);
*/

/*
@SpringBootApplication
public class Demo6Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo6Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Demo6Application.class, args);
	}

}

/* */
	}
}

