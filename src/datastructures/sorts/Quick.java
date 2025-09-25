package datastructures.sorts;

public class Quick {

    public void sort (int [] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            sort(arr, left, pivotIndex-1);
            sort(arr, pivotIndex+1, right);
        }
    }

    private int pivot(int [] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex+1; i <= endIndex; i++) {
            if(arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);

        return swapIndex;
    }

    private void swap (int [] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
