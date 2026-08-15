package com.aranda.azureDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        com.azure.spring.cloud.autoconfigure.implementation.kafka.AzureEventHubsKafkaOAuth2AutoConfiguration.class
})
public class ArandaAzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArandaAzureDemoApplication.class, args);
	}

}
