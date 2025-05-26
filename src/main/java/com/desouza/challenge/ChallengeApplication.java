package com.desouza.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desouza.challenge.entities.Order;
import com.desouza.challenge.services.OrderService;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Order Number: " + order.getCode());
		System.out.printf("Total: $%.2f", orderService.total(order));
	}

}
