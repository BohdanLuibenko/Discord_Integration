package com.example.DiscordApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.example.DiscordApp.Client.DiscordClient;

import Controller.Controller;
import Service.DiscordService;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = DiscordClient.class)
@ComponentScan(basePackageClasses = DiscordService.class)
@ComponentScan(basePackageClasses = Controller.class)
public class DiscordAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscordAppApplication.class, args);
	}

}
