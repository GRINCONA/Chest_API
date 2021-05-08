package operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

import dao.ListByLanesDAO;
import data.champion;

public class ListByLanesImpl implements ListByLanesDAO{
	
	private static int[] topList = {2,3,5,6,8,10,11,13,14,17,19,20,23,24,27,31,36,39,41,48,50,54,57,58,59,62,68,69,75,78,80,
			82,83,85,86,92,98,102,106,107,111,112,114,120,122,126,127,133,150,157,164,234,240,266,420,516,875};
	
	private static int[] junglList = {2,5,9,10,11,17,19,20,23,24,25,28,29,30,31,32,33,35,36,48,56,59,60,62,63,64,72,75,76,77,
			78,79,80,82,86,102,104,106,107,113,120,121,122,131,141,154,163,203,234,245,246,254,421,427,517,875,876};
	
	private static int[] midList = {1,3,4,6,7,8,10,13,18,25,26,30,34,38,39,41,42,43,45,50,55,61,63,68,69,74,80,82,84,85,90,
			91,99,101,103,105,115,127,131,134,136,142,147,157,161,163,236,238,245,246,268,518,777,876};
	
	private static int[] carryList = {18,21,22,29,42,51,67,81,96,110,119,133,145,157,202,203,235,236,360,429,498,523,777};
	
	private static int[] suppList = {1,3,9,10,12,14,16,21,22,25,26,37,40,43,44,45,50,53,63,89,98,99,101,111,117,143,147,
			161,201,235,267,350,412,427,432,497,526,555};
	
	
	public ListByLanesImpl() {
		
	}
	
	@Override
	public ArrayList<champion> getTopList() {
		ArrayList<champion> listTop = new ArrayList<>();
		Gson gson = new Gson();
		Reader reader;
		
		try {
			reader = new FileReader("myList.json");
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				for(int i = 0; i<topList.length; i++ ) {
					if(champ.getKey() == topList[i]) {
						listTop.add(champ);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listTop;
	}
	
	@Override
	public ArrayList<champion> getMidList(){
		ArrayList<champion> listMid = new ArrayList<>();
		Reader reader;
		Gson gson = new Gson();
		try {
			reader = new FileReader("myList.json");

			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				for(int i = 0; i<midList.length; i++ ) {
					if(champ.getKey() == midList[i]) {
						listMid.add(champ);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listMid;
	}
	
	@Override
	public ArrayList<champion> getJnglList() {
		ArrayList<champion> listJngl = new ArrayList<>();
		Reader reader;
		Gson gson = new Gson();
		try {
			reader = new FileReader("myList.json");
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				for(int i = 0; i<junglList.length; i++ ) {
					if(champ.getKey() == junglList[i]) {
						listJngl.add(champ);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listJngl;
	}
	
	@Override
	public ArrayList<champion> getCarryList() {
		ArrayList<champion> listCarry = new ArrayList<>();
		Reader reader;
		Gson gson = new Gson();
		try {
			reader = new FileReader("myList.json");
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				for(int i = 0; i<carryList.length; i++ ) {
					if(champ.getKey() == carryList[i]) {
						listCarry.add(champ);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listCarry;
	}
	
	@Override
	public ArrayList<champion> getSuppList(){
		ArrayList<champion> listSupp = new ArrayList<>();
		Reader reader;
		Gson gson = new Gson();
		try {
			reader = new FileReader("myList.json");
			champion[] championArray = gson.fromJson(reader, champion[].class);
			
			for(champion champ : championArray) {
				for(int i = 0; i<suppList.length; i++ ) {
					if(champ.getKey() == suppList[i]) {
						listSupp.add(champ);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listSupp;
	}
}
