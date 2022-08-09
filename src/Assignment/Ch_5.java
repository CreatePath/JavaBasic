package Assignment;

// 클래스 하나. 멤버변수 2개 이상, 멤버함수 1개 이상.
// 객체 생성 && 메소드 사용.

import java.util.ArrayList;
import java.util.Arrays;

class Club {
    String clubName;
    int members_cnt;
    int money;
    String room;
    String president;
    ArrayList<String> members;

    Club(String clubName, int money, String room, String president,
         ArrayList<String> members) {
        this.clubName = clubName;
        this.money = money;
        this.room = room;
        this.president = president;
        this.members = members;
        this.members_cnt = members.size();
    }

    void info() {
        System.out.println("동아리 이름: " + this.clubName);
        System.out.println("회장: " + this.president);
        System.out.println("부원: " + this.members);
        System.out.println("동방: " + this.room);
        System.out.println("총 인원: " + this.members_cnt);
    }

    void greetingToPresident() {
        System.out.println(this.president + "님 납시오~");
    }

    void beggingMoney() {
        System.out.println("현재 가진 돈:" + this.money);
        if (this.money < 20000) {
            System.out.println("돈 좀 주시오");
            this.money += 100;
        } else {
            System.out.println("조금만 더 주시오.");
            this.money += 1;
        }
        System.out.println("현재 가진 돈:" + this.money);
    }

}

public class Ch_5 {
    public static void main(String[] args) {
        ArrayList<String> members = new ArrayList<>(Arrays.asList("세종대왕", "이순신", "홍길동"));
        int money = 12345;
        String room = "경복궁";
        String clubName = "조선";

        Club chosun = new Club(clubName, money, room, members.get(0), members);
        chosun.info();
        chosun.greetingToPresident();
        chosun.beggingMoney();
    }
}
