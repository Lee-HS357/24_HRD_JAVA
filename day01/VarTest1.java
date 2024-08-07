package day01;
import java.util.Scanner;

public class VarTest1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // 1. 정수 변수
        int x; 
        System.out.print("첫번째 정수 입력 : ");
        x = scan.nextInt();
        
        int y; 
        System.out.print("두번째 정수 입력 : ");
        y = scan.nextInt();
        
        int result = x + y;
        System.out.println("두 수의 합 : " + result);
        
        // 버퍼에서 개행 문자 제거
        scan.nextLine();
        
        // 2. 실수 변수
        double height; 
        System.out.print("키 입력 : ");
        height = scan.nextDouble();
        
        // 버퍼에서 개행 문자 제거
        scan.nextLine();
        
        float weight; // Initialize weight here, not at declaration
        System.out.print("몸무게 입력 : ");
        weight = scan.nextFloat();
        // 버퍼에서 개행 문자 제거
        scan.nextLine();
        
        System.out.println("키 : " + height + "\n몸무게 : " + weight);
        
        // 3. 문자형 변수
        char blood = 'A';
        System.out.println("혈액형 : " + blood + "형 입니다.");
        
        // 4. 문자열 변수
        String name = "";
        System.out.print("이름 입력 : ");
        name = scan.nextLine();
        System.out.println("이름 : " + name + "입니다.");
        
        // 5. 논리형 변수
        boolean stop = true;
        if (stop == true) {
            System.out.println("중지합니다.");
            stop = false;    
        } else {
            System.out.println("시작합니다.");
        }
        
        scan.close();
    }
}
