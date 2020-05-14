
package project2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Convert extends GUI{
    
    // No arg-constructor
    public Convert() {
    }
    
    public String[] convertUnits(int id) {
        try {
            Statement get = myconObj.createStatement();
            // Retrieve the database row with the specified ID
            String sqlCommand = "SELECT * from root.TABLE1 where ID = " + id;
            ResultSet rs = get.executeQuery(sqlCommand);
            String[] arr = new String[2];
            while(rs.next()) {
                // Get length and weight from the result set and convert them to
                // inches and pounds, respectively
                double length = rs.getDouble("length_cm") * 0.3937;
                double weight = rs.getDouble("weight_kg") * 2.2046;
                // Store converted measurements in an array to be read from in
                // the caller method
                arr[0] = String.valueOf(length) + " (in)";
                arr[1] = String.valueOf(weight) + " (lbs)";
            }
            rs.close();
            return arr;
        }
        // Print stack trace if an exception is thrown
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
