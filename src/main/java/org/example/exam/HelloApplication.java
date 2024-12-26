package org.example.exam;
import java.util.ArrayList;

public class HelloApplication {

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer item : list) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3); 
        listWithDuplicates.add(4);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(5);
        listWithDuplicates.add(6);
        listWithDuplicates.add(1);

        System.out.println("Исходный список:");
        for (Integer item : listWithDuplicates) {
            System.out.print(item + " ");
        }
        System.out.println();

        ArrayList<Integer> listWithoutDuplicates = removeDuplicates(listWithDuplicates);

        System.out.println("Список без дубликатов:");
        for (Integer item : listWithoutDuplicates) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
