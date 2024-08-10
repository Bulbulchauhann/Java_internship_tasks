package in.sp.beans;

public class StudentC {
	String name;
	String mail;
	String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //get age on desktop, set age in database
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(age + "--" + name + "--" + mail);
	}
	
	

}
