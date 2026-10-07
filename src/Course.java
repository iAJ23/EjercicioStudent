import java.util.ArrayList;

public class Course {

    String courseName;
    String professorName;
    int year;

    ArrayList<Student> students = new ArrayList<>();

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    // Inscribir un estudiante
    public void enroll(Student student) {
        students.add(student);
    }

    // Sobrecarga: inscribir varios estudiantes
    public void enroll(Student[] students) {

        for (Student student : students) {
            enroll(student);
        }
    }

    // Dar de baja un estudiante
    public void unEnroll(Student student) {

        if (students.contains(student)) {
            students.remove(student);
        }
    }

    // Contar estudiantes
    public int countStudents() {
        return students.size();
    }

    // Encontrar la mejor calificación
    public int bestGrade() {

        int max = 0;

        for (Student student : students) {

            if (student.grade > max) {
                max = student.grade;
            }
        }

        return max;
    }

    // Calcular promedio
    public double averageGrade() {

        if (students.isEmpty()) {
            return 0;
        }

        int suma = 0;

        for (Student student : students) {
            suma += student.grade;
        }

        return (double) suma / students.size();
    }

    // Ranking de estudiantes
    public void printRanking() {

        students.sort((student1, student2) ->
                Integer.compare(student2.grade, student1.grade)
        );

        System.out.println("===== RANKING =====");

        int position = 1;

        for (Student student : students) {

            System.out.println(
                    position + ". " +
                            student.firstName + " " +
                            student.lastName +
                            " - Grade: " +
                            student.grade
            );

            position++;
        }
    }

    // Estudiantes sobre el promedio
    public void printStudentsAboveAverage() {

        double average = averageGrade();

        System.out.println("===== PROMEDIO =====");
        System.out.println("Promedio: " + average);

        for (Student student : students) {

            if (student.grade > average) {

                System.out.println(
                        student.firstName + " " +
                                student.lastName +
                                " está por encima del promedio."
                );

            } else {

                System.out.println(
                        student.firstName + " " +
                                student.lastName +
                                " está por debajo o igual al promedio."
                );
            }
        }
    }
}