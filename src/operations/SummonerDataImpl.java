package operations;

import java.io.FileNotFoundException;
import java.text.MessageFormat;
import com.google.gson.Gson;

import dao.SummonerDataDAO;
import data.API_Ref;
import data.Summoner;

public class SummonerDataImpl implements SummonerDataDAO{
	
	public SummonerDataImpl() {
		
	}
	
	@Override
	public Summoner summonerData(String summonerName, int host) {
		
		Summoner summ = null;
		
		Gson gson = new Gson();
		
		API_Ref myAPI = new API_Ref();
		String host_api = myAPI.getHost_api(host);
		
		//If the name has a blank space replace it with %20
		String summName = summonerName.replaceAll("\\s", "%20");
		
		String api_key = myAPI.getApi_key();
		String url_api = MessageFormat.format("https://{0}/lol/summoner/v4/summoners/by-name/{1}?api_key={2}", host_api,summName,api_key);
		
		String json;
		try {
			json = ReadURL.readUrl(url_api);
			
			summ = gson.fromJson(json, Summoner.class);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return summ;
		
	}
}
