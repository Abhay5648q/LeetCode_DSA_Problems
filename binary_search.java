public class binary_search {
    public static int binsrc(int numbers[], int key) {
        int first = 0;
        int last = numbers.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 5, 6, 7, 8, 9, 10, 13, 44 };
        int key = 78;
        System.out.println("index is=" + binsrc(numbers, key));
    }

}
