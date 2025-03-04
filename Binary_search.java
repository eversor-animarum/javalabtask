package com.tutorial.demo;

interface Binary_search {
    public static int binary_search(int[] arr, int target) {
        /*here lower bound and upperbound are indexes in the array
        *and target is the element(variable/value) we're looking for */
        int lower_bound = 0;
        int upper_bound = arr.length - 1;
        while (lower_bound <= upper_bound) {
            int midpoint = (lower_bound + upper_bound) / 2;
            int midpoint_target = arr[midpoint];

            if (midpoint_target < target) {
                lower_bound = midpoint_target + 1;
            } else if (midpoint_target > target) {
                upper_bound = midpoint_target - 1;
            } else if (midpoint_target == target) {
                return midpoint;
            }

        }
        return -1;
    }

}