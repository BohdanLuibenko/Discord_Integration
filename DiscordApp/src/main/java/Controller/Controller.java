package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.DiscordService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/discord")
@AllArgsConstructor
public class Controller {
	private final DiscordService dis;

	@GetMapping("/getuser")
	String getUser() {
		return dis.UserGet();
	}

	@GetMapping("/getcon")
	String getConnections() {
		return dis.ConnectionsGet();
	}
}
