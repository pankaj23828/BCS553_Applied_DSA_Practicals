// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 13 - Task 3
class Main {
    static void printReverse(int[] a, int i) {
        if (i < 0) {
            return;
        }
        System.out.println(a[i]);
        printReverse(a, i - 1);
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        printReverse(a, a.length - 1);
    }
}
