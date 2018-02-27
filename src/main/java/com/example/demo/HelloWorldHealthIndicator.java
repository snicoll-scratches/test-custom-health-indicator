package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().withDetail("hello", "world").build();
	}

}
