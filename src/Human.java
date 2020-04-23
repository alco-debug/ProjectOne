public class Human {
    int age;
    int height;
    String fio;
    boolean married;

    public Human(int age, int height, String fio, boolean married) {
        this.age = age;
        this.height = height;
        this.fio = fio;
        this.married = married;
    }

    public void printToConsole() {
        System.out.print(
                this.fio +
                        " is " +
                        String.valueOf(this.age) +
                        " years old and is " +
                        String.valueOf(this.height) +
                        " cm height. He/she is"
        );
        if (this.married) {
            System.out.println(" married.");
        } else {
            System.out.println("n't married.");
        }
    }

    public void marry() {
        this.married = true;
        System.out.println(this.fio + " has married.");
    }

    public void divorce() {
        this.married = false;
        System.out.println(this.fio + " has divorced.");
    }

}
