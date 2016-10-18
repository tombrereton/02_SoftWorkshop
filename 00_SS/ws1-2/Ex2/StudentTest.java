public class StudentTest{
    public static void main(String[] args) {

        Student studentOne = new Student("Neville Longbottom",
                "21 December 1981", "1234567", "MSc Ham Science");

        System.out.println(studentOne.getName());

        System.out.println(studentOne.getDateOfBirth());

        System.out.println(studentOne.getStudentID());

        System.out.println(studentOne.getDegreeProgramme());

        System.out.println(studentOne.toString());
    }
}