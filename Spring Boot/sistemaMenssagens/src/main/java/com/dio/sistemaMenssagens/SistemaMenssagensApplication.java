package com.dio.sistemaMenssagens;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaMenssagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaMenssagensApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SpringPrimeirosPassosApplication sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
}
}
