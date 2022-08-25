package Assignment;

class Calculator3 {
    int value;

    Calculator3() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator3 {
    public void minus(int num) {
        value -= value - num; //문제가 요구한 결과
//        value -= num; // 이게 원래 의도 아니었을까..?
    }
}

public class Ch_5_ps8 {
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        cal.add(10);
        System.out.println(cal.getValue());

        UpgradeCalculator upcal = new UpgradeCalculator();
        upcal.add(10);
        upcal.minus(3);
        System.out.println(upcal.getValue());
    }
}
