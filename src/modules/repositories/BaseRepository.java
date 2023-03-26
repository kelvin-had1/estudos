package modules.repositories;
import java.sql.*;


public class BaseRepository extends ConnectionDatabase {
	public ResultSet read(String query) throws SQLException{
		Statement stmt = getConnection().createStatement();
		ResultSet result = stmt.executeQuery(query);
		getConnection().close();
		return result;
	}
	
	public boolean execute(String query) throws SQLException{
		Statement stmt = getConnection().createStatement();
		int result = stmt.executeUpdate(query);
		getConnection().close();
		
		if(result == 1) {
			return true;
		}else {
			return false;
		}
			
	}
}
