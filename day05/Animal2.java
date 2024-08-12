package day05;

public abstract class Animal2 {
    // 인터페이스 정의
    interface Soundable {
        String sound();
    }

    // 내부 클래스 Dog 구현
    static class Dog implements Soundable {
        @Override
        public String sound() {
            return "멍멍";
        }
    }

    // 내부 클래스 Cat 구현
    static class Cat implements Soundable {
        @Override
        public String sound() {
            return "야옹";
        }
    }
  public class AnimalTest{
	  public static void printSound(Soundable soundable) {
		  System.out.println(soundable.sound());
	  }
  }
    public static void main(String[] args) {
       AnimalTest.printSound(new Dog());
       AnimalTest.printSound(new Cat());
    }
}
