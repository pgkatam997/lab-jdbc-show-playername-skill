package model;

public class Player{
	String playerId;
	String playername;
	String country;
	String skill;
	public Player(String playerId, String playername, String country, String skill) {
		super();
		this.playerId = playerId;
		this.playername = playername;
		this.country = country;
		this.skill = skill;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
