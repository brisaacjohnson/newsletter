package ung.mccb.csci.csci3300.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Subscriber {
    private String firstname;
    private String lastname;
    private String email;
    private String campus;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    public int saveRecord(){
        int affectedRow=0;
        String query = "insert into subscriber" + "(firstname, lastname, email, campus)"
                + "values(?,?,?,?)";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement sqlStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {

            sqlStatement.setString(1, getFirstname());
            sqlStatement.setString(2, getLastname());
            sqlStatement.setString(3, getEmail());
            sqlStatement.setString(4, getCampus());




            // get the number of return rows
            affectedRow = sqlStatement.executeUpdate();



        } catch (Exception e) {
            System.out.println("Status: operation failed due to " + e);

        }


        return affectedRow;

    }

}
