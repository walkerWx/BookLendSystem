package edu.nju.booklend.database;
import java.sql.*;
/**
 * 创建时间:2014-6-23下午2:51:30
 * 类名:DatabaseDriver
 * 创建者:覃臻宁
 * 功能:获取数据库连接，数据库的基本配置
 */

public class DatabaseDriver {
	
	/**
	 * 数据库基本配置，每个人的电脑可能不一样，请作相应修改!
	 */
    static String driver = "com.mysql.jdbc.Driver";
    static String dbName = "BookLendSystem";
    static String password = "root";
    static String userName = "root";
    static String url = "jdbc:mysql://127.0.1:3306/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
    private static Connection conn;
	
    
    /**
     * 获取数据库连接
     */
    public static Connection getConnection(){
    	if (conn != null) {
			return conn;
		}
    	else {
        	try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, userName,password);
                System.out.println("连接成功");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
		}
    }

 


}
