package day03;

import java.util.HashMap;
import java.util.Map;

public class MemberService {
    private Map<String, Member> memberMap = new HashMap<>();

    public MemberService() {
        memberMap.put("hong", new Member("홍길동", "hong", "12345"));
        
    }

    public boolean login(String username, String password) {
        Member member = memberMap.get(username);
        if (member != null && member.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public void logout(String username) {
        System.out.println(username + "님이 로그아웃되었습니다.");
    }
}


