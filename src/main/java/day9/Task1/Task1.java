package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Василий", "Аргентинское танго");
        Teacher teacher = new Teacher("Федорович", "Иностранные танцы");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        System.out.println();

        student.printInfo();
        System.out.println();

        teacher.printInfo();

    }
}
