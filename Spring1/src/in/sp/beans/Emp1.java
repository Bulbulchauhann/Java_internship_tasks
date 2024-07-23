package in.sp.beans;

public class Emp1 {
	String name;
	String mail;
	String phone;
    Skill skill;
	

	//	setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	
	public Emp1(String name, String mail, String phone, Skill skill) {
		   this.name = name;
	        this.mail = mail;
	        this.phone = phone;
	        this.skill = skill;
	}
	public void interview() {
		System.out.println(name + " has been called for an interview on, " + phone + "--" + mail );
		System.out.println(skill);
	}
	


}
