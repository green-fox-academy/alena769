package GreenFoxExercise;

public class Mentor extends Person {
    private Level level;
    /*
    Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
     */

    public Mentor() {
        super();
        this.level = Level.INTERMEDIATE;
    }

    public Mentor(String name, int age, String gender, Level level) {
        super(name, age, gender);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " years old " + getGender()
                + " " + level + " mentor.");
    }

}
