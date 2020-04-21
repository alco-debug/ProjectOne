public class StudentTestSandbox {

    public static void main(String[] args) {
        Student galina = new Student(19, 2, "Galina Sergeevna");
        Student matroskin = new Student("Kot Matroskin");

        for (int i = 0; i < 4; i++) {
            galina.printToConsole();
            matroskin.printToConsole();

            galina.toNextCourse();
            matroskin.toNextCourse();
        }

        galina.printToConsole();
        matroskin.printToConsole();

        Student vasya1 = new Student("vasya");
        Student vasya2 = new Student("vasya");

        if(vasya1 == vasya2)
            System.out.println("Vasya1 and vasya2 are equal by reference.");
        else
            System.out.println("Vasya1 and vasya2 are not equal by reference.");

        if(vasya1.equals(vasya2))
            System.out.println("Vasya1 and vasya2 are equal po factu.");
        else
            System.out.println("Vasya1 and vasya2 are not equal po factu.");

        System.out.print("Vasya1 hashcode: ");
        System.out.println(vasya1.hashCode());

        System.out.print("Vasya2 hashcode: ");
        System.out.println(vasya2.hashCode());

    }
}
