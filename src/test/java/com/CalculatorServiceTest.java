package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {

	@Test
	public void test() {
		CalculatorService ms = new CalculatorService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.add(10,20), 30);
	}
	
	@Test
	public void test1() {
		CalculatorService ms = new CalculatorService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.add(1,20), 21);
	}
	
	@Test
	public void test2() {
		CalculatorService ms = new CalculatorService();
		//System.out.println("hello");
		Assertions.assertEquals(120, ms.add(100,20));
	}
	
	@Test
	public void test3() {
		CalculatorService ms = new CalculatorService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.multiply(10,20), 200);
	}
	
	@Test
	public void test4() {
		CalculatorService ms = new CalculatorService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.multiply(40,20), 800);
	}
	
}