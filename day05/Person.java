package day05;

public class Person {
    // 이름과 나이 정보 은닉
    private int age;
    private String name;

    // 기본 생성자
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // 인자 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter 및 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Person 정보 출력 메서드
    public String personInfo() {
        return "이름: " + name + "\n나이: " + age + "\n";
    }
}

