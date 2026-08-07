
class StudentOp {
    String name;
    int age;

    // 1. Parameterized Constructor
    public StudentOp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2. Copy Constructor
    public StudentOp(StudentOp source) {
        this.name = source.name;
        this.age = source.age;
    }
}


