package day03;

public class Member {
    private String name;
    private String username;
    private String password;

    public Member(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

