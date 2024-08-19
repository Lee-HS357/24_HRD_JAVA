package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 * */
import java.sql.*;
import java.io.*;

public class UserSelectExample {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            // 1. JDBC 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. 데이터베이스 연결
            String url = "jdbc:mysql://localhost:3306/contacts";
            String id = "root";
            String pwd = "1234";
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("DB 연결 성공");
            
            // 3. SQL 실행을 위한 Statement 객체 생성
            
            String sql = "SELECT * FROM users WHERE userid = 'winter'";
            st = con.createStatement();
            
            // 4. 데이터 조회 명령어 전송
            rs = st.executeQuery(sql);
            if (rs.next()) {
            System.out.println("데이터 조회 성공");	
            String name = rs.getString("username");
            int age = rs.getInt("userage");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            }
     
        } catch (Exception e) {
            e.printStackTrace();
        	System.out.println("드라이버 로딩 실패");
        } finally {
            // 6. 리소스 해제
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
                System.out.println("연결 끊기");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



