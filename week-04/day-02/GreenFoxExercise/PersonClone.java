package GreenFoxExercise;

public class PersonClone {
    public PersonClone() {
        Person person = null;
        try {
            person = (Person) super.clone() ;

        }catch (CloneNotSupportedException e){
            person = new Person();
        }
    }
}
