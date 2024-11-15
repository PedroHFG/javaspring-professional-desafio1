package com.devsuperior.desafio1;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		
		Order order = new Order(1034, 150.0, 20.0);
		//Order order = new Order(2282, 800.0, 10.0);
		//Order order = new Order(1309, 95.90, 0.0);
		
		System.out.println("Pedido do código " + order.getCode());
		System.out.printf("Valor total: %.2f", orderService.total(order));
		
	}

}
