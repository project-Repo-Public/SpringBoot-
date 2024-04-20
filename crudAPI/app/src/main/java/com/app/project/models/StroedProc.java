package com.app.project.models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class StroedProc {
   
    public static String result;

    public void testproc() throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String conPath = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(conPath, "root", "");
        CallableStatement callstate = con.prepareCall("{call get_data(?)}");
        callstate.registerOutParameter(1, Types.VARCHAR);
        callstate.execute();
        result = callstate.getString(1);
    }

    public String get_res() throws SQLException{
        testproc();
        return result;
    }
}
