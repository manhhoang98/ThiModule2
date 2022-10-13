package storage;

import model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static controller.StudentManage.students;

public class WriteData {
    public static void writeFileStudent(String File) {
        try {
            java.io.File file = new File("FileProduct.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student student: students) {
                bufferedWriter.write(student.getStudentCode()+","+student.getName()+","+student.getAge()+","+student.getGender()+","+student.getAddress()+","+student.getMediumScore());
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("");
        }
    }
}
