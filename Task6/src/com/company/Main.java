package com.company;

import java.util.Scanner;

public class Main {


        static void addElement(ArrayList list, int element) {
            if (list.count < list.elements.length) {
                list.elements[list.count] = element;
                list.count++;
            } else {
                System.err.println("Нет места");
            }
        }
    static void deleteElement(ArrayList list, int index){
        if (index < list.count) {
            for (int i = index; i < list.count; i++) {
                list.elements[i] = list.elements[i + 1];
            }
            list.count--;
        } else {
            System.err.println("Неверный индекс");
        }
    }
    static void printElements(ArrayList list) {
        for (int i = 0; i < list.count; i++) {
            System.out.print(list.elements[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList lists[] = new ArrayList[10];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList();
        }
        while (true) {
            System.out.println("MENU:" + '\n' + "1 - Add element" + '\n' + "2 - Delete element" + '\n' + "3 - Show array" + '\n' + "4 - Show all arrays" + '\n' + "0 - EXIT");
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.print("Enter array index : ");
                    int arrayNumber = scanner.nextInt();
                    System.out.println("Enter element : ");
                    int number = scanner.nextInt();
                    addElement(lists[arrayNumber],number);
                }break;
                case 2: {
                    System.out.print("Enter array index : ");
                    int arrayNumber = scanner.nextInt();
                    System.out.print("Enter element index : ");
                    int number = scanner.nextInt();
                    deleteElement(lists[arrayNumber],number);
                    System.out.println();
                }break;
                case 3: {
                    System.out.print("Enter array index : ");
                    int arrayNumber = scanner.nextInt();
                    printElements(lists[arrayNumber]);
                    System.out.println();
                }break;
                case 4: {
                    for (int i = 0 ; i < lists.length ; i++) {
                        System.out.print(i + "- array : ");
                        printElements(lists[i]);
                        System.out.println();
                    }
                }break;
                case 0: {
                    System.exit(0);
                }
            }

        }
    }
}

