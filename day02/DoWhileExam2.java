package day02;
import java.util.Scanner;
public class DoWhileExam2 {

    public static void main(String[] args) {
       int num = 1;
        while(num<=10) {
        	num++;	
        	if(num %2 !=0) {
        		continue; // 무시	
        	}        	
        System.out.print(num+" ");
        }
    }
}



