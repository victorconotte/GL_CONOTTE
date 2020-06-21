package dao;

import java.util.ArrayList;
import java.util.List;



public class Movie {

	private String name;

	private List<Review> Lrev;
	
	private String Description;
	
	public Movie() {
		super();
		this.Lrev = new ArrayList<Review>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Review> getLrev() {
		return Lrev;
	}
	public void setLmap(List<Review> lrev) {
		Lrev = lrev;
	}
	public String getDes() {
		return Description;
	}
	public void setDes(String Description) {
		this.Description = Description;
	}
}
