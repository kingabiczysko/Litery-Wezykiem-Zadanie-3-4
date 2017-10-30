package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayDeque;

@SpringBootApplication
public class LiteryWezykiemApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(LiteryWezykiemApplication.class, args);

		int i;

		ArrayDeque<String> ASnake=new ArrayDeque<String>();

		for (i=0; i<50; i++)
		{
			Text object = new Text("a");
			ASnake.offer(object.getA());
		}

		System.out.println("The size of the queue ASnake is: " + ASnake.size());


		EvenTester tester = new EvenTester();
		tester.split(ASnake);




	}
}
