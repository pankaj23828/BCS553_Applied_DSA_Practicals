// Name: Pankaj Yadav | Roll No.: __________ | Assignment: 7 - Task 1
class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int key = 52;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
