package Exercise;

public class Dogs extends Animals {
    private String dogFatherName;

    public Dogs(int id, String name, String dogFatherName) {
        this.id = id;
        this.name = name;
        this.dogFatherName = dogFatherName;
    }

    public void setDogFatherName(String dogFatherName) {
        this.dogFatherName = dogFatherName;
    }

    public void eat() {
        System.out.println("Dog is eating chocolate on the ground!");
    }

    public void say() {
        System.out.println("Dog is barking!!");
    }

    public String toString() {
        return String.format("Dog[id=%d,name=%s,fathername=%s]", id, name, dogFatherName);
    }
}
