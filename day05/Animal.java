package day05;

// 추상 클래스 Animal
public abstract class Animal {
    
    // 추상 메소드
    abstract void sound();

    // 정적 내부 클래스 Dog
    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("멍멍 소리낸다.");
        }
    }
    
    // 정적 내부 클래스 Cat
    public static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("야옹 소리낸다.");
        }
    }
    
    public static void main(String[] args) {
//        // Dog 객체 생성 및 메소드 호출
//        Animal animal = new Dog();
//        animal.sound();  // 출력: 멍멍 소리낸다.
//        
//        // Cat 객체 생성 및 메소드 호출
//        Animal anotherAnimal = new Cat();
//        anotherAnimal.sound();  // 출력: 야옹 소리낸다.
    	}
}

