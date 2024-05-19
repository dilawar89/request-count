package com.fleet.requestcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;


@SpringBootApplication
public class RequestCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestCounterApplication.class, args);
	}
	
	@Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("application", "request-counter");
    }

}
