package Christmas;

public class Kid {
    private String name;
    private int age;
    private boolean isNice;
    private boolean isHappy;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
        this.isNice = true;
        this.isHappy = true;
    }

    public boolean getIsHappy() {
        return isHappy;
    }

    public boolean getIsNice() {
        return isNice;
    }

    public int getAge() {
        return age;
    }

    public void receiveGift() {
        this.isHappy = true;
    }
    public String introduce() {
        System.out.println("My name is " + name + " I am " + age + " years old and I am " + isHappy + " !");
        return ("My name is " + name + " I am " + age + " years old and I am " + isHappy + " !");
    }
}
