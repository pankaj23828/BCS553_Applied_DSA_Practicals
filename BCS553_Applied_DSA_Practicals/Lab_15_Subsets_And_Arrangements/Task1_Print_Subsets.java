
class Main {
    static void printSubsets(int[] a, int index, String current) {
        if (index == a.length) {
            System.out.println("{" + current + "}");
            return;
        }

        // First skip the current value.
        printSubsets(a, index + 1, current);

        // Then include the current value.
        String next = current.isEmpty()
                ? String.valueOf(a[index])
                : current + ", " + a[index];
        printSubsets(a, index + 1, next);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        printSubsets(a, 0, "");
    }
}
