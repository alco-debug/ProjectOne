public class StudentTestSandbox {

    public static void main(String[] args) {
        Student galina = new Student(19, 2, "Galina Sergeevna");
        Student matroskin = new Student("Kot Matroskin");

        for (int i = 0; i < 3; i++) {
            galina.printToConsole();
            matroskin.printToConsole();

            galina.toNextCourse();
            matroskin.toNextCourse();
        }

        galina.getAverage();
        matroskin.getAverage();
    }
}
