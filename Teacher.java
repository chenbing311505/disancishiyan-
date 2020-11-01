package MONIXUANKE;

public class Teacher {
	private int teaId;
	private String teaName;
	private String teaSex;
	private Course[]courses;
	public Teacher() {
		super();
		courses=new Course[3];
	}
	public Teacher(int teaId,String teaName,String teaSex) {
		super();
		this.teaId=teaId;
		this.teaName=teaName;
		this.teaSex=teaSex;
		courses=new Course[3];
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId=teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName=teaName;
	}
	public String getTeaSex() {
		return teaSex;
	}
	public void setTeaSex(String teaSex) {
		this.teaSex=teaSex;
	}

}
