package controller;

import model.Student;
import soft.SoftByScoreAscending;
import soft.SoftByScoreDescending;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static ArrayList<Student> students = new ArrayList<>();
    Scanner scanner= new Scanner(System.in);
    public Student createStudent(){

        int studentCode;
        while (true){
            System.out.println("Nhập mã sinh viên :");
            try {
                studentCode= Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }
        System.out.println("Nhập tên sinh viên :");
        String name= scanner.nextLine();

        int age;
        while (true){
            System.out.println("Nhập tuổi :");
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            }
        }
        System.out.println("Nhập giới tính :");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ :");
        String address= scanner.nextLine();

        double mediumScore;
        while (true){
            System.out.println("Nhập điểm trung bình :");
            try{
                mediumScore = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
     return new Student(studentCode,name,age,gender,address,mediumScore);
    }

    public void showStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        Student student =createStudent();
        students.add(student);
    }

    public void editStudent(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần sửa");
        int code;
        while (true){
            try{
                code = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode()==code) {
                System.out.println("Nhap mã sinh viên mới:  ");
                int studentCode;
                while (true){
                    try{
                        studentCode = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                System.out.println("Nhap ten: ");
                String studentName = scanner.nextLine();
                System.out.println("Nhap tuổi : ");
                int studentAge;
                while (true){
                    try{
                        studentAge = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                System.out.println("Nhập giới tính : ");
                String gender = scanner.nextLine();
                System.out.println("Nhap địa chỉ :");
                String address = scanner.nextLine();
                System.out.println("Nhập điểm trung bình :");
                double mediumScore;
                while (true){
                    try{
                        mediumScore = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                students.get(i).setStudentCode(studentCode);
                students.get(i).setName(studentName);
                students.get(i).setAge(studentAge);
                students.get(i).setGender(gender);
                students.get(i).setAddress(address);
                students.get(i).setMediumScore(mediumScore);
                System.out.println("Sửa sinh viên thành công!");
            } else {
                System.out.println("Không tìm thấy sinh viên! ");
            }
        }
    }

    public void removeStudent() {
        boolean check= false;
        System.out.println("Nhập mã sinh viên cần xóa :");
        int code;
        while (true){
            try {
                code= Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode()==code) {
                students.remove(i);
                System.out.println("Xoa sinh viên thanh cong !");
                check = true;
            }
        }
        if (!check) {
            System.err.println("Khong tim thay sinh viên ! " + code);
        }
    }

    public void sortStudentsByScoreAscending() {
        students.sort(new SoftByScoreAscending());
        System.out.println("Sắp xếp thành công");
    }

    public void sortStudentsByScoreDescending() {
        students.sort(new SoftByScoreDescending());
        System.out.println("Sắp xếp thành công");
    }
}
