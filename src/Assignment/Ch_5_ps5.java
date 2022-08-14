package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

// 4번 문제와 class 겹쳐서 클래스 명 끝에 2를 붙임.
class Calculator2 {
    int value;

    Calculator2() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    public int avg(int[] data) {
        int sum = 0;
        for (int num: data) {
            sum += num;
        }
        return sum / data.length;
    }

    public int avg(ArrayList<Integer> data) {
        int sum = 0;
        for (int num: data) {
            sum += num;
        }
        return sum / data.size();
    }
}

public class Ch_5_ps5 {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        Calculator2 cal = new Calculator2();
        int result = cal.avg(data);
        System.out.println(result);

        int result2 = cal.avg(data2);
        System.out.println(result2);
    }
}
