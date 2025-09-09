package com.op.spring_boot_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories("com.op.spring_boot_demo.repository")

@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	void loads() {
	}

}
