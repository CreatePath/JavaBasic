package Assignment;

import java.util.Scanner;

class Grade {
    private int math_score;
    private int science_score;
    private int english_score;

    public Grade(int math_score, int science_score, int english_score) {
        this.math_score = math_score;
        this.science_score = science_score;
        this.english_score = english_score;
    }

    public int average() {
        return (this.math_score + this.english_score + this.science_score) / 3;
    }
}

public class Ch_5_ps2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}
