package data;

public class ChampionMasteryDTO {
	
	boolean chestGranted;
	int championLevel;
	int championPoints;
	int championId;
	long championPointsUntilNextLevel;
	long lastPlayTime;
	int tokensEarned;
	long championPointsSinceLastLevel;
	String summonerId;
	
	public ChampionMasteryDTO() {
		
	}
	
	public ChampionMasteryDTO(boolean chestGranted, int championLevel, int championPoints, int championId,
			long championPointsUntilNextLevel, long lastPlayTime, int tokensEarned, long championPointsSinceLastLevel,
			String summonerId) {
		super();
		this.chestGranted = chestGranted;
		this.championLevel = championLevel;
		this.championPoints = championPoints;
		this.championId = championId;
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
		this.lastPlayTime = lastPlayTime;
		this.tokensEarned = tokensEarned;
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
		this.summonerId = summonerId;
	}
	public boolean isChestGranted() {
		return chestGranted;
	}
	public void setChestGranted(boolean chestGranted) {
		this.chestGranted = chestGranted;
	}
	public int getChampionLevel() {
		return championLevel;
	}
	public void setChampionLevel(int championLevel) {
		this.championLevel = championLevel;
	}
	public int getChampionPoints() {
		return championPoints;
	}
	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public long getChampionPointsUntilNextLevel() {
		return championPointsUntilNextLevel;
	}
	public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
	}
	public long getLastPlayTime() {
		return lastPlayTime;
	}
	public void setLastPlayTime(long lastPlayTime) {
		this.lastPlayTime = lastPlayTime;
	}
	public int getTokensEarned() {
		return tokensEarned;
	}
	public void setTokensEarned(int tokensEarned) {
		this.tokensEarned = tokensEarned;
	}
	public long getChampionPointsSinceLastLevel() {
		return championPointsSinceLastLevel;
	}
	public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
	}
	public String getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	
	
}
