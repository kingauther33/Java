package HomeWork.Ex42;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("An", "100 Hang Dau", "T2000", 2020, 20000000);
        System.out.println(s1);
        System.out.println("Ten chuong trinh: "+ s1.getProgram());
        System.out.println("Nam dang hoc: " + s1.getYear());
        System.out.println("Hoc phi: " + s1.getFee());
    }
}
