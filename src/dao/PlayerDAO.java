package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Player;
import utility.ConnectionManager;

public class PlayerDAO{
	 List<Player> list=new ArrayList<Player>();

	@SuppressWarnings("static-access")
	public List<Player> getAllPlayers() throws SQLException, Exception{
		
		ConnectionManager con=new ConnectionManager();
		Statement stat=con.getConnection().createStatement();
		ResultSet rs=stat.executeQuery("select * from player");
		
		while(rs.next()) {
			String playerId=rs.getString("playerId");
			String playername=rs.getString("playename");
			String country=rs.getString("country");
			String skill=rs.getString("skill");
			Player player=new Player(playerId,playername,country,skill);
			list.add(player);
		}
		return list;
		
	}
}
