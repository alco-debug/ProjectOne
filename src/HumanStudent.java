public class HumanStudent extends Human {
    int course;

    public HumanStudent(int age, int height, String fio, boolean married, int course) {
        super(age, height, fio, married);
        this.course = course;
    }

    public HumanStudent(String fio, int height) {
        super(17, height, fio, false);
        this.course = 1;
    }

    public HumanStudent(Human human) {
        super(human.age, human.height, human.fio, human.married);
        this.course = 1;
        System.out.println(this.fio + " has entered 1 course of sharaga.");
    }

    @Override
    public void printToConsole() {
        super.printToConsole();
        System.out.println(
                this.fio +
                        " is a student of " +
                        String.valueOf(this.course) +
                        " course."
        );
    }
}
