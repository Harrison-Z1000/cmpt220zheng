
package project2;

import java.sql.SQLException;
import java.sql.Statement;

public class Delete extends GUI{
    
    // No arg-constructor
    public Delete() {
    }
    
    // Delete database row with the ID specified by the user
    public void deleteEntry(int id) {
        try {
            Statement delete = myconObj.createStatement();
            String sqlCommand = "DELETE from root.TABLE1 where ID = " + id;
            delete.executeUpdate(sqlCommand);
        }
        // Print stack trace if an exception is thrown
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
