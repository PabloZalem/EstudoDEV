package com.zalempablo.kata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class KataApplicationTests {

	@Test
	void contextLoads() {
		var stack = new Stack();
		assertTrue(stack.isEmpty());
	}
}
