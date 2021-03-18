package StudentTeacher;
/*
Student
        learn() -> prints: the student is actually learning
        question(teacher) -> calls the teacher's giveAnswer() method
 */

public class Student {
    String student;

    public Student() {
    }

    public void learn() {
        System.out.println("The student is acctually learning");
    }

    public void question(Teacher teacher) {
        new Teacher().giveAnswer();
    }
}
