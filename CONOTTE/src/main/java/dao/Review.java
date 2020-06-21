package dao;

public class Review {
	private User reviewer;
	
	private int mark;
	
	private String Description;
	
	private Movie film;
	
	
	public Review() {
		super();
	}
	public User getuser() {
		return reviewer;
	}
	public void setuser(User reviewer) {
		this.reviewer = reviewer;
	}
	public String getDes() {
		return Description;
	}
	public void setDes(String Description) {
		this.Description = Description;
	}
	public Movie getmov() {
		return film;
	}
	public void setmov(Movie film) {
		this.film = film;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int note) {
		this.mark = note;
	}
}
