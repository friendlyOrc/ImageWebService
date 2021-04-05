/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ImageDAO {
    public static Connection con;
	
	public ImageDAO(){
            if(con == null){
                String dbUrl = "jdbc:mysql://localhost:3306/imageDb?autoReconnect=true&useSSL=false";
                String dbClass = "com.mysql.jdbc.Driver";

                try {
                    Class.forName(dbClass);
                    con = DriverManager.getConnection (dbUrl, "root", "G34r1#c42&");
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
	}
        
        public ArrayList<String> searchImage(String name){
		ArrayList<String> res = new ArrayList();
		String sql = "SELECT * FROM images WHERE name LIKE ?";
		try{
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, '%' + name + '%');
                    ResultSet rs = ps.executeQuery();

                    while(rs.next()){
                            res.add(rs.getString("name"));
                    }
		}catch(Exception e){
			e.printStackTrace();
		}	
		return res;
	} 
}
