public class Student{
    String name;
    String dateOfBirth;
    String studentID;
    String degreeProgramme;

    public Student(String name,
                   String dateOfBirth,
                   String studentID){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramm;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getDegreeProgramme() {
        return degreeProgramme;
    }

    public String toString() {
        System.out.println(this.getName() + ", " + this.getDateOfBirth() +
                ", ID: " + this.getStudentID() + ", " + this.degreeProgramme);
    }
}