package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public Skill getSkillBylD(String id) throws SQLException, Exception {
		
		ConnectionManager con=new ConnectionManager();
		
		Statement st=ConnectionManager.getConnection().createStatement();
		ResultSet rs=st.executeQuery("select * from skill");
		
		while(rs.next())
		{
			String skillid=rs.getString("skillid");
			String skillname=rs.getString("skillname");
			
			Skill skill=new Skill(skillid,skillname);			
		}
		return null;
		
	}
}
