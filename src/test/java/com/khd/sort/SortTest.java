package com.khd.sort;

import org.junit.Test;

/**
 * @author mac
 * @title: SortTest
 * @projectName algorithm
 * @description: TODO
 * @date 2020-05-06 10:54
 */
public class SortTest {

    public static int[] array = {4, 6, 1, 8, 2, 7, 6};

    @Test
    public void TestBubbleSort() {
        // 测试冒泡排序
        Sort sort = new BubbleSort();
        sort.sort(array);
        sort.printArray(array);
    }

    @Test
    public void TestSelectionSort () {
        // 测试选择排序
        Sort sort = new SelectionSort();
        sort.sort(array);
        sort.printArray(array);
    }
}
