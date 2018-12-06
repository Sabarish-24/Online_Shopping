package Dao;

import java.sql.*;
import javax.servlet.*;
import Item.*;
import java.io.*;

public class extDao{
    public String extract(int v, int c){
        String resp = "<br>";
        String cid = Integer.toString(c);
        String vnv = Integer.toString(v);
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/shop";
        final String user = "root";
        final String password = "";
        Connection conn = null;
        PreparedStatement ps = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, user, password);
            st = conn.createStatement();
            String sql = "select * from products where vnv=" +vnv+ " and cid=" +cid+ ";";
            rs = st.executeQuery(sql);
            while(rs.next()){
                resp += "<div class='indv'>";
                resp += "<img width='80px' height='50px' style='vertical-align: middle;' src='img/food"+rs.getString(3)+".jpg'>";
                resp += "<h2 class='data' style='display:inline; margin-left: 30px;'>"+ rs.getString(4) + "</h3>";
                resp += "<h3 class='data' style='display:inline; margin-left: 80px'> Rs." + rs.getString(5) + "</h4>";
                resp += "<button class='indv1' style='display:inline; color: red; margin-top: 10px; margin-right: 80px; float:right' onclick=\"remCart('"+rs.getString(4)+"','"+rs.getString(3)+"','"+Integer.toString(rs.getInt(5))+"')\">x</button>";
                resp += "<button class='indv1' style='display:inline; color: blue; margin-top: 10px; margin-right: 80px; float:right' onclick=\"addCart('"+rs.getString(4)+"','"+Integer.toString(rs.getInt(3))+"','"+Integer.toString(rs.getInt(5))+"')\">+</button>";
                resp += "<button class='indv1' style='display:inline; color: black; margin-top: 10px; margin-right: 80px; float:right' onclick=\"redCart('"+rs.getString(4)+"','"+Integer.toString(rs.getInt(3))+"','"+Integer.toString(rs.getInt(5))+"')\">-</button>";
                resp += "</div><br>";
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
}