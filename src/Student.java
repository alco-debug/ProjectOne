import java.util.Objects;

public class Student {
    private int age;
    private int course;
    private String fio;
    private int[] marks = new int[10];
    private double average;

    Student(int age, int course, String fio) {
        this.age = age;
        this.course = course;
        this.fio = fio;
        this.study();
    }

    Student(String fio) {
        this.age = 17;
        this.course = 1;
        this.fio = fio;
        this.study();
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
        System.out.print("His/her average mark = ");
        System.out.println(this.average);
    }

    public void toNextCourse() {
        if (this.course > 0 && this.course < 4) {
            this.course++;
            this.age++;
            this.study();
            System.out.print(this.fio);
            System.out.print(" has reached higher course (");
            System.out.print(this.course);
            System.out.println(").");
        } else {
            this.course = -1;
            System.out.print(this.fio);
            System.out.println(" can't reach higher course, he or she has already graduated.");
        }
    }

    private void getAverageMark() {
        double sum = 0;
        for (int i = 0; i < this.marks.length; i++) {
            sum += marks[i];
        }
        average = sum / this.marks.length;
    }

    private void study() {
        this.fillMarks();
        this.getAverageMark();
    }

    private void fillMarks() {
        for (int i = 0; i < this.marks.length; i++) {
            marks[i] = (int) (Math.random() * 9) + 1;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int newCourse) {
        this.course = newCourse;
    }

    public String getFio() {
        return fio;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        // field comparison
        return (this.age == student.getAge()) && (this.course == student.getCourse()) && (this.fio == student.getFio());
    }

}
