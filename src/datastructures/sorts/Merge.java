package datastructures.sorts;

import java.util.Arrays;

public class Merge {

    public int [] sort(int [] arr) {

        if (arr.length == 1) return arr;

        int minIndex = arr.length/2;
        int [] left = sort(Arrays.copyOfRange(arr, 0, minIndex));
        int [] right = sort(Arrays.copyOfRange(arr, minIndex, arr.length));

        return merge(left, right);
    }

    private int [] merge(int [] arr1, int [] arr2) {
        int [] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            } else {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length) {
            combined[index] = arr1[i];
            index++;
            i++;
        }

        while (j < arr2.length) {
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }
}
