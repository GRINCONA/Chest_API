package dao;

import java.util.ArrayList;

import data.champion;

public interface ChampionListDAO {

	public ArrayList<champion> getChampionList();
	
	public String getNameByKey(int id);
}
