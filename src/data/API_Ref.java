package data;
import java.text.MessageFormat;

public class API_Ref {
	
	//private  final String host_api ="euw1.api.riotgames.com";
	private final String[] host_api = {"br1.api.riotgames.com",
			"eun1.api.riotgames.com",
			"euw1.api.riotgames.com",
			"jp1.api.riotgames.com",
			"kr.api.riotgames.com",
			"la1.api.riotgames.com",
			"la2.api.riotgames.com",
			"na1.api.riotgames.com",
			"oc1.api.riotgames.com",
			"tr1.api.riotgames.com",
			"ru.api.riotgames.com"};
	
	private  final String api_key =System.getenv("API_KEY");

	
	public String getHost_api(int pos) {
		return host_api[pos];
	}
	
	public String getApi_key() {
		return api_key;
	}
	
	
	
	
}
