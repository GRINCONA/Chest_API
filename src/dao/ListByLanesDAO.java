package dao;

import java.util.ArrayList;

import data.champion;

public interface ListByLanesDAO {

	public ArrayList<champion> getTopList();
	
	public ArrayList<champion> getMidList();
	
	public ArrayList<champion> getJnglList();
	
	public ArrayList<champion> getCarryList();
	
	public ArrayList<champion> getSuppList();
}
