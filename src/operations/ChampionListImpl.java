package operations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

import dao.ChampionListDAO;
import data.ChampionMasteryDTO;
import data.champion;

public class ChampionListImpl implements ChampionListDAO{
	
	public ChampionListImpl() {
		
	}
	
	@Override
	public  ArrayList<champion> getChampionList(){
		ArrayList<champion> list = new ArrayList<>();
		Reader reader;
		
		try {
			reader = new FileReader("myList.json");
			Gson gson = new Gson();
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				list.add(champ);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	@Override
	public  String getNameByKey(int id)  {
		String name = "";
		Reader reader;
		try {
			reader = new FileReader("myList.json");
			Gson gson = new Gson();
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				if(champ.getKey() == id) {
					name = champ.getName();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}
	
}
