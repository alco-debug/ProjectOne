public class Student {
    int age;
    int course;
    String fio;

    Student(int age, int course, String fio) {
        this.age = age;
        this.course = course;
        this.fio = fio;
    }

    Student(String fio) {
        this.age = 17;
        this.course = 1;
        this.fio = fio;
    }

    public void printToConsole() {
        System.out.print("Student ");
        System.out.print(this.fio);
        System.out.print(" at age ");
        System.out.print(this.age);
        if (this.course > 0) {
            System.out.print(" and is on ");
            System.out.print(this.course);
            System.out.print(" course.");
        } else {
            System.out.print(" has graduated the uni.");
        }
        System.out.println();
    }

    public void toNextCourse() {
        if (this.course > 0 && this.course < 4) {
            this.course++;
            this.age++;
            System.out.print(this.fio);
            System.out.print(" has reached higher course (");
            System.out.print(this.course);
            System.out.println(").");
        } else {
            System.out.print(this.fio);
            System.out.println(" can't reach higher course, he or she has already graduated.");
        }
    }
}
