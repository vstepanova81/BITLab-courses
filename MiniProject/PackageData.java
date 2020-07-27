package prvt.vstepanova.Module2.MiniProject;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private Connection connection;

    private String operationType;
    ArrayList <Student> student;
    private Student students;


    public PackageData() {
    }

    public PackageData(String operationType, ArrayList<Student> student, Student students) {
        this.operationType = operationType;
        this.student = student;
        this.students = students;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab9t?useUnicode=true&serverTimezone=UTC", "root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student students) {
        try {

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO students (id, name, surname, age) " +
                    "VALUES (NULL, ?, ?, ?)"
            );
            statement.setString(1, students.getName());
            statement.setString(2, students.getSurname());
            statement.setDouble(3, students.getAge());
            int rows = statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM students");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                studentList.add(new Student(id, name, surname, age));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}