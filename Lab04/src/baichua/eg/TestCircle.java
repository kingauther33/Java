package baichua.eg;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0, "blue");
        Circle c4 = new Circle("Gray");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
    }
}
