package day05;

public class Teacher extends Person {
    // 교사 ID와 담당 과목
    private String id;
    private String subject;

    // 생성자
    public Teacher(String id, String subject, String name, int age) {
        super(name, age);
        this.id = id;
        this.subject = subject;
    }

    // getter 및 setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 메서드 오버라이딩
    @Override
    public String personInfo() {
        String info = super.personInfo();
        info += "교사 ID: " + id + "\n담당 과목: " + subject + "\n";
        return info;
    }
}
