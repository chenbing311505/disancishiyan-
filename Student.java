package MONIXUANKE;

public class Student {
	private int stuId;
	private String stuName;
	private String stuSex;
	private Course[] courses;
	public Student() {
		super();
		courses=new Course[3];
	}
	public Student(int stuId,String stuName,String stuSex) {
		super();
		this.stuId=stuId;
		this.stuName=stuName;
		this.stuSex=stuSex;
		courses=new Course[3];
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId=stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName=stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex=stuSex;
	} 
	public boolean addCourse(Course course) {
		boolean flag=false;
		if(!isSelectedCourse(course)&&isNullCourse(course)) {
			   for(int i=0;i<this.courses.length;i++){
				    if(courses[i]==null){
				     courses[i]=course;
				     course.addStudent(this);//课程也要添加学生
				     flag=true;
				     break;
				    }
				   }
				  }
				  return flag;
				 }
				 //学生移除课程
				 public boolean removeCourse(Course course){
				  boolean flag=false;
				  if(isSelectedCourse(course)){
				   for(int i=0;i<this.courses.length;i++){
				    if(courses[i]==course){
				     courses[i]=null;
				     course.removeStudent(this);//在课程中移除学生
				     flag=true;
				     break;
				    }
				   }
				 
				  }
				  return flag;
				 }
				 //显示学生所选的课程
				 public void displayCourse(){
				  System.out.println("学生"+this.stuName+"所选课程有：");
				  for(Course c:courses){
				   if(c!=null){
				    System.out.print(c.getName()+" ");
				   }
				  }
				  System.out.println();
				 }
				 public boolean isSelectedCourse(Course course){
				  boolean flag=false;
				  for(Course c:courses){
				   if(c==course){
				    flag=true;
				    break;
				   }
				  }
				  return flag;
				 }
				 public boolean isNullCourse(Course course){
				  boolean flag=false;
				  for(Course c:courses){
				   if(c==null){
				    flag=true;
				    break;
				   }
				  }
				  return flag;
				 }	
		
	}

