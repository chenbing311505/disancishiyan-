package MONIXUANKE;

public class People {
	private int id;
	private String peopleName;
	private String peopleSex;
	public People(int id,String peopleName,String peopleSex) {
		this.id=id;
		this.peopleName=peopleName;
		this.peopleSex=peopleSex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getPeopleName(){
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName=peopleName;
	}
	public String getPeopleSex() {
		return peopleSex;
	}
	public void setPeopleSex(String peopleSex) {
		this.peopleSex=peopleSex;
	}
}
