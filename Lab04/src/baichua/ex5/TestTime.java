package baichua.ex5;

public class TestTime {
    public static void main(String[] args) {
        Time t1;
        try {
            t1 = new Time(373, 55, 21);
            System.out.println("Input succesful!");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error in Input. Set to default value");
            t1 = new Time();
            System.out.println("\nTime object: " + t1);
        }
        System.out.println(t1);
    }
}
