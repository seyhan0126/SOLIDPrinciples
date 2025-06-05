package org.server.SOLID.OpenCloseExercise;

public class Main {
    public static void main(String[] args) {
        SortingProcessor.sort(new InsertionSort());
        SortingProcessor.sort(new MergeSort());
    }
}
