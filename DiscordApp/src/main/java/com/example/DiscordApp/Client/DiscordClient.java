package com.example.DiscordApp.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "discord", url = "https://discord.com/api")
public interface DiscordClient {

	@GetMapping("/users/@me")
	String getUser(@RequestHeader("Authorization") String Authorization);

	@GetMapping("/users/@me/connections")
	String getConnections(@RequestHeader("Authorization") String Authorization);

}
