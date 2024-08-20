package day10;

import java.sql.*;
import java.util.Scanner;

public class DataModel {
    Connection con = null;
    Scanner scan = null;

    public DataModel() {
        ConnectDB cdb = new ConnectDB();
        con = cdb.getcon();
        if (con != null) {
            System.out.println("연결 성공");
        } else {
            System.out.println("연결 실패");
        }
        scan = new Scanner(System.in);
    }

    // 데이터 추가 메소드
    public void insertData(Board board) throws SQLException {
        String sql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate) VALUES(?, ?, ?, NOW())";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, board.getBtitle());
            pst.setString(2, board.getBcontent());
            pst.setString(3, board.getBwriter());
            int num = pst.executeUpdate();
            if (num > 0) {
                System.out.println("저장 성공");
            } else {
                System.out.println("저장 실패");
            }
        }
    }

    // 게시물 데이터 입력 받기
    public void create() throws SQLException {
        Board board = new Board();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목 : ");
        board.setBtitle(scan.nextLine());
        System.out.print("내용 : ");
        board.setBcontent(scan.nextLine());
        System.out.print("작성자 : ");
        board.setBwriter(scan.nextLine());
        insertData(board);
    }

    // 데이터 검색
    public void list() throws SQLException {
        String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
        try (PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            System.out.println();
            System.out.println("[게시물 목록]");
            System.out.println("-------------------------------------------------");
            System.out.printf("%-6s %-12s %-16s %-40s\n", "no", "writer", "date", "title");
            System.out.println("-------------------------------------------------");
            while (rs.next()) {
                int bno = rs.getInt("bno");
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bwriter = rs.getString("bwriter");
                Date bdate = rs.getDate("bdate");
                System.out.printf("%-6d %-12s %-16s %-40s\n", bno, bwriter, bdate.toString(), btitle);
            }
        }
    }

    // 게시물 읽기 메소드
    public void read(int bno) throws SQLException {
        String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, bno);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int resultBno = rs.getInt("bno");
                    String btitle = rs.getString("btitle");
                    String bcontent = rs.getString("bcontent");
                    String bwriter = rs.getString("bwriter");
                    Date bdate = rs.getDate("bdate");
                    System.out.println("#####################");
                    System.out.println("번호 : " + resultBno);
                    System.out.println("제목 : " + btitle);
                    System.out.println("내용 : " + bcontent);
                    System.out.println("작성자 : " + bwriter);
                    System.out.println("날짜 : " + bdate.toString());
                    System.out.println("#####################");
                    
                    // 보조 메뉴 출력
                    System.out.println("----------------------------------------");
                    System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List | 4.Delete All");
                    System.out.print("메뉴 선택 : ");
                    String menuNo = scan.nextLine();
                    
                    switch (menuNo) {
                        case "1":
                            update(bno);
                            break;
                        case "2":
                            delete(bno);
                            break;
                        case "3":
                            list();
                            break;
                        case "4":
                            deleteAll();
                            break;
                        default:
                            System.out.println("잘못된 메뉴 선택입니다.");
                            break;
                    }
                } else {
                    System.out.println("해당 번호의 게시물이 없습니다.");
                }
            }
        }
    }

    // 게시물 수정 기능 메소드
    public void update(int bno) throws SQLException {
        String sqlSelect = "SELECT btitle, bcontent, bwriter FROM boards WHERE bno = ?";
        try (PreparedStatement pst = con.prepareStatement(sqlSelect)) {
            pst.setInt(1, bno);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String oldBtitle = rs.getString("btitle");
                    String oldBcontent = rs.getString("bcontent");
                    String oldBwriter = rs.getString("bwriter");

                    System.out.println("현재 게시물 정보:");
                    System.out.println("제목 : " + oldBtitle);
                    System.out.println("내용 : " + oldBcontent);
                    System.out.println("작성자 : " + oldBwriter);

                    System.out.println("[수정 내용 입력]");
                    System.out.print("제목 (현재: " + oldBtitle + ") : ");
                    String newBtitle = scan.nextLine();
                    if (newBtitle.trim().isEmpty()) {
                        newBtitle = oldBtitle;
                    }

                    System.out.print("내용 (현재: " + oldBcontent + ") : ");
                    String newBcontent = scan.nextLine();
                    if (newBcontent.trim().isEmpty()) {
                        newBcontent = oldBcontent;
                    }

                    System.out.print("작성자 (현재: " + oldBwriter + ") : ");
                    String newBwriter = scan.nextLine();
                    if (newBwriter.trim().isEmpty()) {
                        newBwriter = oldBwriter;
                    }

                    System.out.println("---------------------------");
                    System.out.println("수정 내용:");
                    System.out.println("제목 : " + newBtitle);
                    System.out.println("내용 : " + newBcontent);
                    System.out.println("작성자 : " + newBwriter);

                    System.out.println("---------------------------");
                    System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
                    System.out.print("메뉴 선택 : ");
                    String menuNo = scan.nextLine();
                    
                    if (menuNo.equals("1")) {
                        String sqlUpdate = "UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";
                        try (PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {
                            pstUpdate.setString(1, newBtitle);
                            pstUpdate.setString(2, newBcontent);
                            pstUpdate.setString(3, newBwriter);
                            pstUpdate.setInt(4, bno);
                            int num = pstUpdate.executeUpdate();
                            if (num > 0) {
                                System.out.println("수정 성공");
                            } else {
                                System.out.println("수정 실패");
                            }
                        }
                    } else if (menuNo.equals("2")) {
                        System.out.println("취소되었습니다.");
                    }
                } else {
                    System.out.println("해당 번호의 게시물이 없습니다.");
                }
            }
        }
    }

    // 게시물 삭제 기능 메소드
    public void delete(int bno) throws SQLException {
        String sql = "DELETE FROM boards WHERE bno = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, bno);
            int num = pstmt.executeUpdate();
            if (num > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }
        }
    }

    // 모든 게시물 삭제 기능 메소드
    public void deleteAll() throws SQLException {
        String sql = "DELETE FROM boards";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            int num = pstmt.executeUpdate();
            if (num > 0) {
                System.out.println("모든 게시물 삭제 성공");
            } else {
                System.out.println("모든 게시물 삭제 실패");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataModel dm = new DataModel();
        
        while (true) {
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.List | 4.Exit");
            System.out.print("메뉴 선택 : ");
            String menuNo = scanner.nextLine();
            
            try {
                switch (menuNo) {
                    case "1":
                        // 게시물 생성
                        dm.create();
                        break;
                    case "2":
                        // 게시물 번호 입력받기
                        System.out.print("게시물 번호를 입력하세요: ");
                        int readBno = Integer.parseInt(scanner.nextLine());
                        dm.read(readBno);
                        break;
                    case "3":
                        // 게시물 목록 출력
                        dm.list();
                        break;
                    case "4":
                        // 프로그램 종료
                        System.out.println("종료합니다.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못된 메뉴 선택입니다.");
                        break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("잘못된 번호 형식입니다.");
            }
        }
    }
}

