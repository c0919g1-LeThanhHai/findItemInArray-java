package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Nhập vào tên sinh viên muốn tìm: ");
        String name = scanner.nextLine();
        int index = find(students, name);
        if(index > 0) {
            System.out.printf("Tìm thấy sinh viên %s ở vị trí thứ %d", name, index);
        } else {
            System.out.printf("Không tìm thấy tên %s trong danh sách", name);
        }
    }

    public static int find(String[] arr, String name) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
