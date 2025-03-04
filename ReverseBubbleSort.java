package com.tutorial.demo;

public interface ReverseBubbleSort {
    public static int[] reverse_bubble(int[] list) {
        int unsortedUntilIndex = list.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) {
                if (list[i] < list[i + 1]) {
                sorted = false;
                int temp =list[i + 1];
                list[i+ 1] = list[i];
                list[i] = temp;
                }
            }
            unsortedUntilIndex--;
        }
        return list;
    }
}
