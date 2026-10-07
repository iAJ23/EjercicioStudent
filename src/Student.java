public class Student {

    public String firstName;
    public String lastName;
    int registration;
    int grade;
    int year;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int registration, int grade, int year) {
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    // Getters y Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {

        if (grade >= 60) {
            year++;
            System.out.println("Congratulations! Next year -> " + year);
        } else {
            System.out.println("Sorry, you did not pass grade");
        }

        return year;
    }
}