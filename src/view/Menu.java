package view;

import controller.StudentManage;

import java.util.Scanner;
import storage.ReadData;
import storage.WriteData;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManage studentManager = new StudentManage();

        int choice;
        do {
            System.out.println("---- CHUONG TRINH QUAN LY SAN PHAM ----");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Sap xep");
            System.out.println("6. Doc tu file ");
            System.out.println("7. Ghi vao file ");
            System.out.println("8. Thoat chuong trinh");
            System.out.println("--------------------------------------------------------");
            System.out.print("Chon chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> studentManager.showStudent();
                case 2 -> studentManager.addStudent();
                case 3 -> studentManager.editStudent(scanner);
                case 4 -> studentManager.removeStudent();
                case 5 -> {
                    int choice1;
                    System.out.println("1. Sap xep tang dan");
                    System.out.println("2. Sap xep giam dan");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1 -> studentManager.sortStudentsByScoreAscending();
                        case 2 -> studentManager.sortStudentsByScoreDescending();
                    }
                }
                case 6 -> ReadData.readFileStudentList();
                case 7 -> WriteData.writeFileStudent("FileStudent.csv");
                case 8 -> System.exit(0);
            }
        }while (true);
    }
}
