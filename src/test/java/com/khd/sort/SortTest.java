package com.khd.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mac
 * @title: SortTest
 * @projectName algorithm
 * @description: 排序测试
 * @date 2020-05-06 10:54
 */
public class SortTest {

    private static int[] array = {4, 6, 1, 8, 2, 7, 6};

    private static int[] expectedArray = {1, 2, 4, 6, 6, 7, 8};

    @Test
    public void TestBubbleSort() {
        // 测试冒泡排序
        Sort sort = new BubbleSort();
        sort.sort(array);
        sort.printArray(array);

        Assert.assertArrayEquals("排序结果与预期不符", expectedArray, array);

    }

    @Test
    public void TestSelectionSort() {
        // 测试选择排序
        Sort sort = new SelectionSort();
        sort.sort(array);
        sort.printArray(array);

        Assert.assertArrayEquals("排序结果与预期不符", expectedArray, array);
    }
}
