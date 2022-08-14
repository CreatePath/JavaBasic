package Assignment;

class TV {
    private String company;
    private int madeYear;
    private int size;

    public TV(String company, int madeYear, int size) {
        this.company = company;
        this.madeYear = madeYear;
        this.size = size;
    }

    public void show() {
        System.out.println(this.company + "에서 만든 " + this.madeYear + "년형 " + this.size + "인치 TV");
    }
}

public class Ch_5_ps1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
