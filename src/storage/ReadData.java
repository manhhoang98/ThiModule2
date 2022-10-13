package storage;

import model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static controller.StudentManage.students;

public class ReadData {
    public static ArrayList<Student> readFileStudentList() {
        try {
            File file = new File("C:\\Users\\admin\\Desktop\\QuanLiSinhVien\\FileStudent.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Student student = new Student(Integer.parseInt(strings[0]),strings[1],Integer.parseInt(strings[2]),strings[3],strings[4],Double.parseDouble(strings[5]));
                students.add(student);
                System.out.println("Đọc thành công");
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("");
        }
        return students;
    }
}
