package model;

public class Skill{
	String skillid;
	String skillname;
	public Skill(String skillid, String skillname) {
		super();
		this.skillid = skillid;
		this.skillname = skillname;
	}
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public String getSkillid() {
		return skillid;
	}
	public void setSkillid(String skillid) {
		this.skillid = skillid;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	
}
