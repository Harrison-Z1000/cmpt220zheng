
package project2;

import java.sql.SQLException;
import java.sql.Statement;

public class Save extends GUI{
    
    // No arg-constructor
    public Save() {
    }
    
    // Modify a row in the database based on values entered by the user
    public void saveChanges(int id, String species, double length, double weight, 
            String shell, String head, String skin, String date, String notes) {
        try {
            Statement save = myconObj.createStatement();
            String sqlCommand = "UPDATE root.TABLE1 SET Species = '" + species + "'" +
                    ", Length_cm = " + length + ", Weight_kg = " + weight +
                    ", Shell_Top_Pattern = '" + shell + "'" +
                    ", Head_Pattern = '" + head + "'" + 
                    ", Skin_Color = '" + skin + "'" +
                    ", Date_Found = '" + date + "'" +
                    ", Notes = '" + notes + "'" +
                    " where ID = " + id;
            save.executeUpdate(sqlCommand);
        }
        // Print stack trace if an exception is thrown
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
