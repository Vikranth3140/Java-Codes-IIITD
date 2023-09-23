import java.util.Scanner;

class Professor {
    private String name;
    private int year_exp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year_exp;
    }

    public void setYear(int year_exp) {
        this.year_exp = year_exp;
    }
}

class Student {
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

class Course {
    private Professor professor;
    private Student[] students;

    public Course(Professor professor, Student[] students) {
        this.professor = professor;
        this.students = students;
    }

    public void dispStudents() {
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollno());
        }
    }

    public void dispProf() {
        System.out.println("Professor Name: " + professor.getName());
        System.out.println("Years of Experience: " + professor.getYear());
    }
}

public class S3_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Professor Name: ");
        String prof_name = scanner.nextLine();
        System.out.println("Enter Years of Experience: ");
        int years_exp = scanner.nextInt();

        Professor p = new Professor();
        p.setName(prof_name);
        p.setYear(years_exp);

        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {
            scanner.nextLine();
            System.out.println("Enter Student Name " + (i + 1) + ": ");
            String stud_name = scanner.nextLine();
            System.out.println("Enter Roll No.: ");
            int roll_no = scanner.nextInt();

            Student student = new Student();
            student.setName(stud_name);
            student.setRollno(roll_no);

            students[i] = student;
        }

        Course c = new Course(p, students);
        c.dispProf();
        c.dispStudents();
    }
}