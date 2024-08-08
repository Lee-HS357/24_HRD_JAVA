package day03;

import java.util.Calendar;

// Week 열거형 정의
public class WeekExample {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        
        // 열거형 참조 변수 선언 및 초기화
        Week today = null;
        
        // 요일에 따라 today 변수를 설정
        switch (week) {
            case Calendar.SUNDAY:
                today = Week.SUNDAY;
                break;
            case Calendar.MONDAY:
                today = Week.MONDAY;
                break;
            case Calendar.TUESDAY:
                today = Week.TUESDAY;
                break;
            case Calendar.WEDNESDAY:
                today = Week.WEDNESDAY;
                break;
            case Calendar.THURSDAY:
                today = Week.THURSDAY;
                break;
            case Calendar.FRIDAY:
                today = Week.FRIDAY;
                break;
            case Calendar.SATURDAY:
                today = Week.SATURDAY;
                break;
            default:
                System.out.println("Invalid day of the week.");
                return;
        }
        
        // today 변수의 값을 사용하여 조건문 작성
        if (today == Week.TUESDAY) {
            System.out.println("올림픽 시청하기");
        } else {
            System.out.println("자바 공부하기");
        }
    }
}


