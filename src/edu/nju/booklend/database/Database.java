package edu.nju.booklend.database;

import java.sql.*;
/**
 * 创建时间:2014-6-23下午3:01:15
 * 类名:Database
 * 创建者:qinzhenning
 * 功能:定义数据的操作方法
 */
public class Database {
	/**
	 * 基本参数
	 */
	Connection connection;
	String cmd;
	PreparedStatement ps;
	ResultSet rs;
	
	/**
	 * 初始化数据库，获得连接对象
	 */
	public Database() {
		connection = DatabaseDriver.getConnection();
	}
	
	/**
	 * 通过命令向数据库进行修改、删除、添加操作，返回结果为true则操作成功
	 */
	public boolean setResultToSQL(String cmd){
		this.cmd = cmd;
		boolean result = false;
		try {
			ps = connection.prepareStatement(cmd);
			if (ps.executeUpdate() != 0)
				result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 通过命令向数据库进行查询操作，返回ResultSet
	 */
	public ResultSet getResultFromSQL(String cmd){
		this.cmd = cmd;
		try {
			ps = connection.prepareStatement(cmd);
			if (ps.executeUpdate() != 0) {
				rs = ps.executeQuery();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * 关闭链接对象
	 * 
	 * @return 成功<code>true</code>，失败<code>false</code>
	 */
	public boolean closeConnection() {
		boolean result = false;
		if (connection != null) {
			try {
				connection.close();
				result = true;
				System.out.println("关闭连接");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	

	
	//测试
  	public static void main(String[] args) {
  	
  		Database test = new Database();
  		String cmd = "insert into Administrators(username, password, realname) values ('qinzhenning','123','xxxx')";
  		System.out.println(test.setResultToSQL(cmd));
  		test.closeConnection();
  	}

}
