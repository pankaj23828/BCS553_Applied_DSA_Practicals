// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 10 - Task 1
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
