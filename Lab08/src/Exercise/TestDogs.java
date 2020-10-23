package Exercise;

public class TestDogs {
    public static void main(String[] args) {
        Animals objDog = new Dogs(3, "gau gau", "gauBo");
        System.out.println(objDog);
        objDog.eat();
        objDog.say();
    }
}
