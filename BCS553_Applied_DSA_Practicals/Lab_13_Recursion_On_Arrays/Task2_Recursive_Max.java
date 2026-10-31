// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 13 - Task 2
class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        int remainingMax = max(a, i + 1);
        return Math.max(a[i], remainingMax);
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
