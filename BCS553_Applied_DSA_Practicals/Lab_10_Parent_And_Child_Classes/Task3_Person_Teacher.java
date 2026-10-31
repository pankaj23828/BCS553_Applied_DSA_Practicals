// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 10 - Task 3
class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}

class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}
