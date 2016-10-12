package org.springframework.sdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "org/springframework/sdr/datarest-919/repositories")
public class Datarest919Application {

	public static void main(String[] args) {
		SpringApplication.run(Datarest919Application.class, args);
	}
}
