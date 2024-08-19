package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터베이스 연결
 * 
 * */
import java.sql.*;
import java.io.*;

public class BoardSelectExample {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement st = null;
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
            
            // 3. SQL 실행을 위한 PreparedStatement 객체 생성
            String sql = "SELECT * FROM boards WHERE bwriter = ?";
            st = con.prepareStatement(sql); 
            st.setString(1, "winter");
            
            // 4. 데이터 조회 명령어 전송
            rs = st.executeQuery();
            
            // 5. 결과 처리
            while (rs.next()) {
                System.out.println("데이터 조회 성공");
                int bno = rs.getInt("bno");
                String btitle = rs.getString("btitle");  
                String bcontent = rs.getString("bcontent");
                String bwriter = rs.getString("bwriter");
                String d = rs.getDate("bdate").toString();
                String fname = rs.getString("bfilename");                 
                
                Blob blob = rs.getBlob("bfiledata");
                if (blob != null) {
                    try (InputStream is = blob.getBinaryStream();
                         OutputStream os = new FileOutputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow.PNG")) {
                         is.transferTo(os);
                          System.out.println("번호: " + bno);
                          System.out.println("제목: " + btitle);
                          System.out.println("내용: " + bcontent);
                          System.out.println("작성자: " + bwriter);
                          System.out.println("날짜: " + d);
                          System.out.println("파일명: " + fname);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
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



