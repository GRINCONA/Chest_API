package dao;

import data.ChampionMasteryDTO;

public interface ChampionMasteryDAO {

	public ChampionMasteryDTO[] getMastery(String Id, int host);
}
