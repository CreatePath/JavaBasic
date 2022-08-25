package Assignment;

class Pen {
    protected int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class SharpPencil extends Pen {
    private int width;
}

class BallPen extends Pen {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class FountainPen extends BallPen {
    public void refill(int n) {
        amount = n;
    }
}

public class Ch_5_ps6 {
    public static void main(String[] args) {
        SharpPencil sharp = new SharpPencil();
        BallPen ballPen = new BallPen();
        FountainPen fountain = new FountainPen();

        sharp.setAmount(5);

        ballPen.setAmount(10);
        ballPen.setColor("red");

        fountain.setAmount(15);
        fountain.setColor("black");

        System.out.println(sharp.getAmount());
        System.out.println(fountain.getAmount() + fountain.getColor());
        System.out.println(ballPen.getAmount() + ballPen.getColor());
    }
}
