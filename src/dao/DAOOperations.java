package dao;

import operations.ChampionListImpl;
import operations.ChampionMasteryImpl;
import operations.ListByLanesImpl;
import operations.SummonerDataImpl;

public class DAOOperations extends DAOFactory {

	public DAOOperations() {
		
	}
	
	@Override
	public ChampionListDAO getChampionListDAO() {
		return new ChampionListImpl();
	}

	@Override
	public ChampionMasteryDAO getChampionMasteryDAO() {
		return new ChampionMasteryImpl();
	}

	@Override
	public ListByLanesDAO getListByLanesDAO() {
		return new ListByLanesImpl();
	}

	@Override
	public SummonerDataDAO getSummonerDataDAO() {
		return new SummonerDataImpl();
	}
	
}
