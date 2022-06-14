package dummy_test;

/**
 * Find the closest number from array
 */
public class ClosestNumber {

    static int counter = 0;

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 32, 50, 60, 70, 80, 90};
        int k = -99;
        int closestIndex = findClosetElement(0, a.length - 1, a, k, 0);
        System.out.println("Closest Element " + a[closestIndex] + " Counter " + counter);
    }

    public static int findClosetElement(int start, int end, int[] arr, int number, int lastClosest) {
        counter++;

        if (end <= start) {
            return lastClosest;
        }
        if (arr[lastClosest] == number) {
            return lastClosest;
        }
        int middle = (start + end) / 2;
        if (arr[middle] == number) {
            return middle;
        }
        int diffLeft = Math.abs(arr[middle] - number);
        int diffRight = Math.abs(arr[middle + 1] - number);

        int closest = Math.abs(arr[lastClosest] - number);

        if (diffLeft < diffRight && diffLeft < closest) {
            return findClosetElement(start, middle, arr, number, middle);
        } else if (diffRight < closest) {
            return findClosetElement(middle + 1, end, arr, number, middle + 1);
        } else {
            return lastClosest;
        }


    }

}
