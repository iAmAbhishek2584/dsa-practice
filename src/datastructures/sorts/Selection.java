package datastructures.sorts;

public class Selection {

    public void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    minValue = j;
                }
                if (i!=minValue) {
                    int temp = arr[i];
                    arr[i] = arr[minValue];
                    arr[minValue] = temp;
                }
            }
        }
    }
}
