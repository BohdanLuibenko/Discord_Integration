package Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.DiscordApp.Client.DiscordClient;

@Service
public class DiscordService {

	private final DiscordClient discordClient;
	private final String AccessToken;

	public DiscordService(DiscordClient discordClient, @Value("${discord.access.token}") String Token) {
		this.discordClient = discordClient;
		this.AccessToken = Token;
	}

	public String UserGet() {
		return discordClient.getUser(AccessToken);
	}

	public String ConnectionsGet() {
		return discordClient.getConnections(AccessToken);
	}

}
