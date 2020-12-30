package day6;

import java.util.Random;

public class Teacher {
    Random random = new Random();
    private String name;
    private String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String student) {
        String grade;
        int mark = random.nextInt(4) + 2;
        if (mark == 2) {
            grade = "неудовлетворительно";
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student
                    + " по предмету " + subject + " на оценку " + grade);
        }
        else if (mark == 3) {
            grade = "удовлетворительно";
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student
                    + " по предмету " + subject + " на оценку " + grade);
        }
        else if (mark == 4) {
            grade = "хорошо";
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student
                    + " по предмету " + subject + " на оценку " + grade);
        }
        else if (mark == 5) {
            grade = "отлично";
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student
                    + " по предмету " + subject + " на оценку " + grade);
        }
    }
}
