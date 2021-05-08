package dao;

public abstract class DAOFactory {
	
	public abstract  ChampionListDAO getChampionListDAO();
	
	public abstract  ChampionMasteryDAO getChampionMasteryDAO();
	
	public abstract  ListByLanesDAO getListByLanesDAO();
	
	public abstract  SummonerDataDAO getSummonerDataDAO();
	
	public static DAOFactory getDAOFactory() {
		return new DAOOperations();
	}
	
}
