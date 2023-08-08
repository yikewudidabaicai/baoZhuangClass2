package yunge.SystemAndArray;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        testArray();
    }

    public static void testArray(){
        int[] nums = {21,78,99,45};
        int i = Arrays.binarySearch(nums, 78);
        System.out.println(i);
    }

}
