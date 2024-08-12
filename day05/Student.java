package day05;

public class Student extends Person {
    // 학생 ID와 학급 이름
    private String id;
    private String className;  // "cName"을 "className"으로 수정

    // 생성자
    public Student(String id, String className, String name, int age) {
        super(name, age);
        this.id = id;
        this.className = className;
    }

    // getter 및 setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // 메서드 오버라이딩
    @Override
    public String personInfo() {
        String info = super.personInfo();
        info += "학생 ID: " + id + "\n학급 이름: " + className + "\n";
        return info;
    }
}

