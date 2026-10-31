// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 12 - Task 2
class Main {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
