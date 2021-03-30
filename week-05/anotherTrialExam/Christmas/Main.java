package Christmas;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        Kid a = new Kid("a", 12);
        Kid b = new Kid("b",5);
        Kid c = new Kid("c", 2);
        Santa santa = new Santa("santa", 58);

        school.enroll(a);
        school.enroll(b);
        school.enroll(c);
        school.startChristmasParty(santa);
        a.introduce();
        santa.introduce();

    }
}
