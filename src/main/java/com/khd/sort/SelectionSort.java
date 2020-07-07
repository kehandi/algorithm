package com.khd.sort;

/**
 * @author mac
 * @title: SelectionSort
 * @projectName algorithm
 * @description: 选择排序
 * @date 2020-05-06 10:28
 */
public class SelectionSort implements Sort {

    /**
     * 思路：
     * 找到数组中最大的元素，与数组最后一位元素交换。
     * 当只有一个数时，则不需要选择了，因此需要n-1趟排序
     * <p>
     * 代码实现要点：
     * 两个for循环，外层循环控制排序的趟数，内层循环找到当前趟数的最大值，
     * 随后与当前趟数组最后的一位元素交换
     *
     * @param array int 数组
     */
    @Override
    public void sort(int[] array) {
        // 记录当前趟数的最大值交表
        int pos;

        // 交换的变量
        int temp;

        // 外层循环控制需要排序的趟数
        for (int i = 0; i < array.length - 1; i++) {

            // 新的趟数、将角标重新赋值为0
            pos = 0;

            // 内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[pos]) {
                    pos = j;
                }
            }

            // 交换
            temp = array[pos];
            array[pos] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
