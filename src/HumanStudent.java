public class HumanStudent extends Human {
    int course;
    private int[] marks = new int[10];
    private double average;

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

    @Override
    public int hashCode() {
        int res = 1;
        res *= this.age * this.course;

        for (int i = 0; i < this.fio.length(); i++) {
            res *= (int) this.fio.charAt(i);
        }
        return res;
    }
}
