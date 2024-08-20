package day10;
import java.sql.*;
public class ConnebtDBTest {
	static Class<? extends ConnectDB> con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB cdb  = new ConnectDB();
		con =cdb.getClass();
		if(con == null) {
			System.out.println("연결 객체 생성 실패");
		}else {
			System.out.println("연결 객체 생성 성공");
		}
	}

}
