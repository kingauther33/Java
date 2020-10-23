package Exercise;

public class Animals {
    protected int id;
    protected String name;

    public void eat() {
        System.out.printf("The %s is eating something\n", name);
    }

    public void say() {
        System.out.printf("The %s is saying something\n", name);
    }
}
