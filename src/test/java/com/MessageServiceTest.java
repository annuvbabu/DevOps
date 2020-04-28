package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void testMessage1() {
		MessageService ms = new MessageService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hi");
	}
	
	@Test
	public void testMessage2() {
		MessageService ms = new MessageService();
		//System.out.println("hello");
		Assertions.assertEquals("hello", ms.sayHello());
	}
	
	@Test
	public void testMessage3() {
		MessageService ms = new MessageService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.sayHelloworld(), "hello world");
	}
	
	@Test
	public void testMessage4() {
		MessageService ms = new MessageService();
		//System.out.println("hello");
		Assertions.assertEquals(ms.sayHelloworld(), "hello");
	}
	
}