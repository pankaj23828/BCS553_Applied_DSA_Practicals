// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 11 - Task 1
class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}

class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 4;
        System.out.println("Area: " + s.area());
    }
}
