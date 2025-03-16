package one.digitalinovation.desafio.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

public class DesafioPadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesApplication.class, args);
	}

}
