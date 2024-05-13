package Ex1;

import com.sun.source.tree.BreakTree;

public class ArrayCompare {
    public static <T> boolean compareArray(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 ={1,2,3,4};

        Integer[] arr2 = {1,2,3,4};

        Integer[] arr3 = {1,1,7,9};

        System.out.println(compareArray(arr1,arr2));
        System.out.println(compareArray(arr1,arr3));
    }

}
