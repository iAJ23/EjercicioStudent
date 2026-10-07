public class Main {

    public static void main(String[] args) {

        // Crear estudiantes
        Student angel = new Student("Angel", "Ochoa", 1, 70, 1);
        Student maria = new Student("Maria", "Lopez", 2, 85, 1);
        Student juan = new Student("Juan", "Perez", 3, 55, 1);
        Student ana = new Student("Ana", "Garcia", 4, 95, 1);


        System.out.println("===== ESTUDIANTE =====");

        angel.printFullName();

        angel.isApproved();

        angel.changeYearIfApproved();

        Course javaCourse = new Course(
                "Java Full Stack",
                "Maara Lomeli",
                2026
        );

        javaCourse.enroll(angel);

        Student[] students = {maria, juan, ana};

        javaCourse.enroll(students);

        System.out.println(
                "Estudiantes inscritos: "
                        + javaCourse.countStudents()
        );

        System.out.println(
                "Mejor calificación: "
                        + javaCourse.bestGrade()
        );

        System.out.println(
                "Promedio del curso: "
                        + javaCourse.averageGrade()
        );


        javaCourse.printRanking();

        javaCourse.printStudentsAboveAverage();

        javaCourse.unEnroll(juan);

        System.out.println(
                "Estudiantes después de dar de baja a Juan: "
                        + javaCourse.countStudents()
        );
    }
}