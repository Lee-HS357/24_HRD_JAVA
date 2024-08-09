package day04;

import java.util.ArrayList;

// Main 클래스
public class Main {
    public static void main(String[] args) {
        // House 객체 생성
        House house1 = new House("이현수", 3, "대전 동구 용운동");
        house1.showOwner();
        System.out.println("방의 갯수 : " + house1.getRoomNum());
        house1.showInfo(); 
        house1.showInfo2();
        
        // ArrayList 선언 및 초기화
        ArrayList<House> arrList = new ArrayList<House>();
        arrList.add(house1);
        arrList.add(new House("강길동", 2, "대전 서구 갈마동"));
        arrList.add(new House("이자바", 4, "대전 중구 대흥동"));
        
        // ArrayList의 모든 House 객체 정보 출력
        for (House house : arrList) {
            house.showInfo2(); // 필요한 메소드 호출
        }
    }
}

// House 클래스
class House {
    // 멤버 변수
    String ownerName;
    int roomNum;
    String address;
    
    // 기본 생성자
    public House() { }
    
    // 인자 생성자
    public House(String ownerName, int roomNum, String address) {
        this.ownerName = ownerName;
        this.roomNum = roomNum;
        this.address = address;
    }
   
    // 주인 이름을 출력하는 메소드
    void showOwner() {
        System.out.println("주인 이름: " + this.ownerName);
    }   
    // 방의 갯수를 반환하는 메소드
    int getRoomNum() {
        return this.roomNum;
    }   
    // 모든 멤버 변수의 값을 출력하는 메소드
    void showInfo() {
        String result = "주인 이름 : " + ownerName + "\n방의 갯수: " + roomNum + "\n집 주소: " + address;
        return; 
    }   
    // 집의 정보를 출력하는 메소드
    void showInfo2() {
        System.out.println("주인 이름 : " + ownerName + "\n방의 갯수 : " + roomNum + "\n집 주소 : " + address);
    }
}
