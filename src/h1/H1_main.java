package h1;

public class H1_main {

    public static void main(String[] args) {

        int[] myArray = {5, 6, 7, 10};

        int left = 0;
        int right = myArray.length - 1;

        while (left < right) {
            int temp = myArray[left];
            myArray[left] = myArray[right];
            myArray[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
