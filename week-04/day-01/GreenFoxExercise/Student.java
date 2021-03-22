package GreenFoxExercise;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    /*
    Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
    Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
     */
    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "School of Life";
        this.skippedDays = 0;

    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " a " + getGender() + " from " +
                previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        return this.skippedDays + numberOfDays;
    }

}
