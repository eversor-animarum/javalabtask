package com.tutorial.demo;

interface BubbleSort {
    public static int[] bubble_sort(int[] list) {
        int unsortedUntilIndex = list.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) {
                if (list[i] > list[i + 1]) {
                    sorted = false;
                    //these lines of code are supposed to swap the elements at these indexes
                    int temp =list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            unsortedUntilIndex--;
        }
        return list;
    }
}
