package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 * 
 * */
import java.sql.*;
import java.util.ArrayList;
import java.io.*;

public class PersonSelect {

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
            String sql = "SELECT * FROM person";
            st = con.createStatement();            
            // 4. 데이터 조회 명령어 전송
            rs = st.executeQuery(sql);
            
            // 5. 결과 처리
            ArrayList<Person> arlist = new ArrayList<Person>();
            while (rs.next()) {
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                Person person = new Person(name, phone, email, age);
                arlist.add(person); // 데이터 추가
            }

            // 데이터 출력
            for (Person p : arlist) {
                System.out.println("이름: " + p.getName());
                System.out.println("전화번호: " + p.getPhone());
                System.out.println("이메일: " + p.getEmail());
                System.out.println("나이: " + p.getAge());
                System.out.println(); // 출력 간격 추가
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




