package com.example.kashishgupta.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.widget.TextView;
public class SixthActivity extends AppCompatActivity {

    private String hiduke="";
    private int price=0;
    private String errmsg="";

    public void run() {
        System.out.println("Select Records Example by using the Prepared Statement!");
        Connection con = null;
        int count = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection
                    ("jdbc:mysql://localhost/test","root","root");
            try{
                String sql;
                //	  sql
                //	  = "SELECT title,year_made FROM movies WHERE year_made >= ? AND year_made <= ?";
                sql
                        =  "CREATE TABLE user (" + "id int,"
                        + "first_name varchar(30)," + "last_name varchar(30),"
                        + "email varchar(30)," + "phone varchar(30))";
                PreparedStatement prest = con.prepareStatement(sql);
                //prest.setInt(1,1980);
                //prest.setInt(2,2004);
                ResultSet rs = prest.executeQuery();
                while (rs.next()){
                    hiduke = rs.getString(1);
                    price = rs.getInt(4);
                    count++;
                    System.out.println(hiduke + "\t" + "- " + price);
                }
                System.out.println("Number of records: " + count);
                prest.close();
                con.close();
            }
            catch (SQLException s){
                System.out.println("SQL statement is not executed!");
                errmsg=errmsg+s.getMessage();

            }
        }
        catch (Exception e){
            e.printStackTrace();
            errmsg=errmsg+e.getMessage();
        }

        handler.sendEmptyMessage(0);

    }
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {


        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sixth);


        Thread thread = new Thread();
        thread.start();




    }


}
