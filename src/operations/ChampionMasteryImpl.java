package operations;

import com.google.gson.Gson;

import dao.ChampionMasteryDAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;

import data.API_Ref;
import data.ChampionMasteryDTO;

public class ChampionMasteryImpl implements ChampionMasteryDAO {
	
	public ChampionMasteryImpl() {
		
	}
	
	@Override
	public ChampionMasteryDTO[] getMastery(String Id,int host) {
		
		API_Ref myAPI = new API_Ref();
		String api_key = myAPI.getApi_key();
		String host_api = myAPI.getHost_api(host);
		
		String url_api = MessageFormat.format("https://{0}/lol/champion-mastery/v4/champion-masteries/by-summoner/{1}?api_key={2}",host_api,Id,api_key);
		String json;
		
		ChampionMasteryDTO[] championArray = null;
		
		try {
			json = ReadURL.readUrl(url_api);
			Gson gson = new Gson();
			championArray = gson.fromJson(json, ChampionMasteryDTO[].class);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return championArray;
	}
}
