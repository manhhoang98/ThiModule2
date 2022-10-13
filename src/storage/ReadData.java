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
            File file = new File("FileProduct.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Student student = new Student(Integer.parseInt(strings[0]),strings[1],Integer.parseInt(strings[3]),strings[4],strings[5],Double.parseDouble(strings[5]));
                students.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("");
        }
        return students;
    }
}
