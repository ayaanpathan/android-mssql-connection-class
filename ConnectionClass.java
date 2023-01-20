package com.example.app;


import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass
{
    String classs = "net.sourceforge.jtds.jdbc.Driver"; //will have to add a jtds library to your project before creating this class.
    String ip = //your database IP
    String db = //your DB name
    String un = //username for database
    String pass = //DB password

    @SuppressLint("NewApi")
    public Connection CONN()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;
        try {
            Class.forName(clas).newInstance();
            ConnectionURL = "jdbc:jtds:sqlserver://" + ip + ";databaseName=" + db + ";user=" + un + ";password=" + pass + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        } catch (SQLException se) {
            Log.e("error here 1 : ", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("error here 2 : ", e.getMessage());
        } catch (Exception e) {
            Log.e("error here 3 : ", e.getMessage());
        }
        return connection;
    }
}

