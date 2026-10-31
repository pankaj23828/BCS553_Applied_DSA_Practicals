// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 4 - Task 3
class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;

        for (int value : a) {
            System.out.println(value);
        }
    }
}
