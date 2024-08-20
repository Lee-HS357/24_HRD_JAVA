package day10;

import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
    Scanner scan = new Scanner(System.in); 
    DataModel dm = null;
    public BoardExample() {
    	dm = new DataModel();
    }

    public void mainMenu() throws SQLException {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택 : ");
        String menuNo = scan.nextLine();
        System.out.println();

        switch(menuNo) {
            case "1" -> dm.create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
            default -> System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
        }
    }

    public void create() {
        System.out.println("*** create() 메소드 실행");
        list();
    }

    public void read() {
        System.out.println("*** read() 메소드 실행");
        list();
    }

    public void clear() {
        System.out.println("*** clear() 메소드 실행");
        list();
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }

    public void list() {
       
        System.out.println("리스트 메소드 실행");
    }

    public static void main(String[] args) {
        BoardExample bexample = new BoardExample();
        try {
			bexample.mainMenu();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

