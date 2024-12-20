package hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length ;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}	
	public float getCost() {
		return cost;
	}
	  public DigitalVideoDisc(String titlle){
	        this.title=titlle;
	}
	public DigitalVideoDisc(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int nbDigitalVideoDics) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
		this.id =++ nbDigitalVideoDics;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
    public int getId() {
        return id;
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
    }
    public boolean isMatch(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle); 
    }
}
