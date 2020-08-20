package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	@SuppressWarnings("unused")
	public static void main(String argu[]) {
	Player player=new Player();
	PlayerDAO playerdao=new PlayerDAO();
	Skill skill=new Skill();
	SkillDAO skilldao=new SkillDAO();
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Skill ID:");
	System.out.println("Enter Skill Name:");
	String skillid=skill.getSkillid();
	String skillname=skill.getSkillname();
	
	System.out.println("Player ID:");
	System.out.println("player Name:");
	System.out.println("Country");
	System.out.println("Skill");
	String playerId= player.getPlayerId();
	String playerName=player.getPlayername();
	String country=player.getCountry();
	String Skill=player.getSkill();
	
	System.out.println("List of player and their skill");
	
	System.out.println("\nskillId"+skillid+"\skillname"+skillname);
	System.out.println("\nplayerId"+playerId+"\nplayerName"+playerName+"\nCountry"+country+"\nSkill"+Skill);
	System.out.println("Skill Id:"+skillid+"player name:"+playerName+"Country:"+country+"Skill name:"+skillname);
	}
}
