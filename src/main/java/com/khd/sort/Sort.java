package com.khd.sort;

/**
 * @author mac
 * @title: Sort
 * @projectName algorithm
 * @description: TODO
 * @date 2020-05-06 10:32
 */
public interface Sort {
    void sort(int[] array);

    default void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
