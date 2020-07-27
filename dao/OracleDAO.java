package com.kita.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO { 
	
	private static OracleDAO dao = null; //OracleDAO가 객체화가 된 주소값이 dao에 저장됨
	private OracleDAO() { } //기본 생성자 >> private를 붙였기 때문에 다른 클래스에서 생성 불가
	
	public static OracleDAO getInstance () { //getInstance가 있으면 싱글톤
		if (dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	
//	public static void main(String[] args) {
//		
//		//getCon을 호출하기 위해 OracleDAO을 객체화 >> 객체화를 하는 이유는 Connection getCon 메소드에 static이 없기 때문에
//		OracleDAO gc = new OracleDAO(); 
//		
//		try {
//			gc.getCon();	
//		} catch (Exception e) { //예외처리 부분
//			e.printStackTrace();
//		}
//		
//		
//	}


	public Connection getCon() throws Exception {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Connection con = null;
		
//		try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		con = DriverManager.getConnection(url, userName, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("접속성공");
		return con;
	}
	
	public void closeCon(Connection con)  {
		if (con != null) {
			try {
				con.close();
			} catch(Exception e) { }
		}
	}

}
