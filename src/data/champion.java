package data;

public class champion implements Comparable {
	
	private String id;
	private int key;
	private String name;
	private int championPoints;
	private boolean isChest;
		
	public champion(String id, int key, String name, int championPoints, boolean isChest) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.championPoints = championPoints;
		this.isChest = isChest;
	}

	public champion() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChampionPoints() {
		return championPoints;
	}

	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}

	public boolean isChest() {
		return isChest;
	}

	public void setChest(boolean isChest) {
		this.isChest = isChest;
	}

	@Override
	public String toString() {
		return "champion [id=" + id + ", key=" + key + ", name=" + name + ", championPoints=" + championPoints
				+ ", isChest=" + isChest + "]";
	}

	@Override
	public int compareTo(Object o) {
		/*Sort array by champion key
		int compareKey = ((champion)o).getKey();
		return this.key - compareKey; */
		
		//Sort array by name
		return this.name.compareTo(((champion)o).getName());
	}
	
	
}
