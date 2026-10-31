// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 11 - Task 2
class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}
