package notciprogramminglogics;

/**
 * @author barzy
 */
public class BubbleSort {

    private static int[] num = {2, 8, 5, 3, 7, 4, 1};

    public static void bubbleSort() {
        int len = num.length;
        printListIndexes(len);
        printNumList();

        System.out.println("");
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    swap(j);
                }
            }
        }
        printNumList();
    }

    private static void swap(final int j) {
        int temp = num[j];
        num[j] = num[j + 1];
        num[j + 1] = temp;
    }

    private static void printNumList() {
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    private static void printListIndexes(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }

}
