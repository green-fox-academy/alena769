package StudentTeacher;
/*
        //Create Student and Teacher classes
        Teacher
        teach(student) -> calls the student's learn() method
        giveAnswer() -> prints: the teacher is answering a question

*/

public class Teacher {
    String teacher;

    public Teacher () {

    }
    public void teach(Student student) {
        new Student().learn();
    }
    public void giveAnswer() {
        System.out.println("The teacher is answering a question");
    }

}
