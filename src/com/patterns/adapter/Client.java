package com.patterns.adapter;

/**
 * Created by alexg on 12.06.2015.
 */
public class Client {
    public static void main(String[] args) {
        int[] numbers = new int[]{34, 2, 4, 12, 1};
        Sorter sorter = new SortListAdapter();
        sorter.sort(numbers);
    }
}
