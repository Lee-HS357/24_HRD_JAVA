package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 * */
import java.io.*;
import java.sql.*;
public class BoardWithFileInsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		try {
			// 1. JDBC드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");			
			// 2. 데이터베이스 연결
			String url = "jdbc:mysql://localhost : 3306/contacts";
			String id ="root";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공");
			// 3. sql 실행을 위한 Statement. PreparedStatement 객체생성		
			String sql="insert into boards (btitle, bcontent, bwriter, bdate, bfilename,bfiledata)"
			+"values(?,?,?,now(),?,?)";
			PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.setString(1,"눈 오는날 ");
			st.setString(2,"한박눈이 내려요");
			st.setString(3,"winter");
			st.setString(4, "snow.PNG");
			st.setBlob(5,new FileInputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow.PNG"));
			
			// 4. 데이터 추가 명령어 전송
			int result = st.executeUpdate();
			if(result > 0) {
				System.out.println("데이터 저장 성공");
			}else {
				System.out.println("데이터 저장 실패");
			}
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}finally {
			
		}try {
			con.close();
			System.out.println("연결 끊기");
		}catch(SQLException es) {
			
		}
	}

}
