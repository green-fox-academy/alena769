package Christmas;

import java.util.List;

public class Santa {
    private String name;
    private int age;
    private int numberOfGifts;


    public Santa(String name, int age) {
        this.name = name;
        this.age = age;
        this. numberOfGifts = 100;
    }

    public int getNumberOfGifts() {
        return numberOfGifts;
    }

    public String introduce() {
        System.out.println("My name is " + name + " I am " + age + " years old and I have " + numberOfGifts + " in my bag!");
        return ("My name is " + name + " I am " + age + " years old and I have " + numberOfGifts + " in my bag!");
    }

    public int giveAway(List<Kid> kids) {
        int counter = 0;

        for (Kid kid: kids) {
            if(kid.getIsNice() == true && this.numberOfGifts != 0) {
                kid.receiveGift();
                this.numberOfGifts --;
                counter++;
            }
        }
        return counter;
    }

}
