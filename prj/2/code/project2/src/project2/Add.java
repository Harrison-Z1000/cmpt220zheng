
package project2;

import java.sql.SQLException;
import java.sql.Statement;

public class Add extends GUI{

    // No arg-constructor
    public Add() {
    }
    
    // Add a new row to the database with values entered by the user
    public void addEntry (int id, String species, double length, double weight, 
            String shell, String head, String skin, String date, String notes) {
        try {
            Statement add = myconObj.createStatement();
            String sqlCommand = "INSERT into root.TABLE1 (ID, Species, " +
                        "Length_cm, Weight_kg, Shell_Top_Pattern, Head_Pattern, " +
                        "Skin_Color, Date_Found, Notes) values (" + id + ", '" +
                        species + "', " + length + ", " + weight + ", '" + shell +
                        "', '" + head + "', '" + skin + "', '" + date + "', '" +
                        notes + "')";
            add.executeUpdate(sqlCommand);
        }
        // Print stack trace if an exception is thrown
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
