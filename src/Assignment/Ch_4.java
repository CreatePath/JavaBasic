package Assignment;

public class Ch_4 {
    public static void main(String[] args) {
        // 1번
        // wife 포함 x ==> 첫번째 조건문 false
        // once 포함 run 포함 ==> 두번째 조건문 false
        // everywhere 포함 x ==> 세번째 조건문 true
        // 따라서 출력 결과는 everywhere

        // 2번
        int i = 1, sum = 0;
        while (i <= 1000) {
            if (i % 3 == 0) sum += i;
            ++i;
        }
        System.out.println(sum);

        // 3번
        for (int k = 0; k < 5; ++k) {
            for (int j = 0; j < k + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4번
        for (int l = 0; l < 100; ++l) {
            System.out.println(l+1);
        }

        // 5번
        int score_sum = 0;
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        for (int score: marks) {
            score_sum += score;
        }
        System.out.println(score_sum/ marks.length);
    }
}
