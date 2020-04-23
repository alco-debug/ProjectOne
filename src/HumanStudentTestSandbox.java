public class HumanStudentTestSandbox {
    public static void main(String[] args) {

        Human petya = new Human(30, 190, "Petya", true);

        HumanStudent vasya = new HumanStudent("Vasya", 180);

        petya.printToConsole();
        vasya.printToConsole();
        HumanStudent petyaStudent = new HumanStudent(petya);
        petyaStudent.printToConsole();

        petyaStudent.divorce();
        petyaStudent.printToConsole();

    }
}
