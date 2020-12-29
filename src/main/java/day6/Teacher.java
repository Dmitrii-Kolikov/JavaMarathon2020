package day6;

import java.util.Random;

public class Teacher {
    Random random = new Random();
    Student student;
    private String name;
    private String subject;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student) {
        String grade2 = "неудовлетворительно";
        String grade3 = "удовлетворительно";
        String grade4 = "хорошо";
        String grade5 = "отлично";
        int grade = random.nextInt(4) + 2;
        if (grade == 2) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                    + " по предмету " + subject + " на оценку " + grade2);
        }
        else if (grade == 3)
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                    + " по предмету " + subject + " на оценку " + grade3);
        else if (grade == 4)
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                    + " по предмету " + subject + " на оценку " + grade4);
        else if (grade == 5)
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                    + " по предмету " + subject + " на оценку " + grade5);
    }
}
