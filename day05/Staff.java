package day05;

public class Staff extends Person {
    // 사원 ID와 담당 부서
    private String id;
    private String department;  // "dape"를 "department"로 수정

    // 생성자
    public Staff(String id, String department, String name, int age) {
        super(name, age);
        this.id = id;
        this.department = department;
    }

    // getter 및 setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // 메서드 오버라이딩
    @Override
    public String personInfo() {
        String info = super.personInfo();
        info += "사원 ID: " + id + "\n담당 부서: " + department + "\n";
        return info;
    }
}
