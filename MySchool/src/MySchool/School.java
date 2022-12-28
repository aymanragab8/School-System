package MySchool;

import People.Student;
import People.Teacher;

import java.util.ArrayList;

public class School {

    private String schoolName ;
    private String schoolAddress ;
    private String schoolPhoneNumber ;
    ArrayList<Student>students;
    ArrayList<Teacher>teachers;
    ArrayList<Grade>grades;

    public School(String schoolName, String schoolAddress, String schoolPhoneNumber) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolPhoneNumber = schoolPhoneNumber;
        this.Storage_space();
    }

    private void Storage_space(){
        this.students=new ArrayList<Student>();
        this.teachers=new ArrayList<Teacher>();
        this.grades=new ArrayList<Grade>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolPhoneNumber() {
        return schoolPhoneNumber;
    }

    public void setSchoolPhoneNumber(String schoolPhoneNumber) {
        this.schoolPhoneNumber = schoolPhoneNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return
                "############## School ############## \n" +
                "schoolName='" + schoolName + '\'' +"\n"+
                "schoolAddress='" + schoolAddress + '\'' +"\n"+
                "schoolPhoneNumber='" + schoolPhoneNumber + '\'' +"\n"+
                "Number Of Students ='" + students.size() + '\'' +"\n"+
                "Number Of Teachers ='" + teachers.size() + '\'' +"\n"+
                "Number Of Grades ='" + grades.size() + '\'' +
                "\n";

    }

    public Student getStudentByName(String name){
        for (Student student : students){
            if (student.getName().equals(name))
            {
                return student ;
            }
        }
        return null ;
    }

    public Teacher getTeacherByName(String name){
        for (Teacher teacher : teachers){
            if (teacher.getName().equals(name))
            {
                return teacher ;

            }
        }
        return null ;
    }

    public Grade getGradeByCode(String code){
        for (Grade grade : grades){
            if (grade.getCode().equals(code))
            {
                return grade ;
            }
        }
        return null ;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public void removeStudent(Student student){
        for (int i =0 ; i <students.size();i++){
            if (students.get(i).getName().equals(student.getName())&&students.get(i).getAge()==student.getAge()){
                students.remove(i);
                System.out.println("Removed "+students.get(i).getName()+" Done ");
            }
        }
    }

    public void removeTeacher(Teacher teacher){
        for (int i =0 ; i <teachers.size();i++){
            if (teachers.get(i).getName().equals(teacher.getName())&&teachers.get(i).getAge()==teacher.getAge()){
                teachers.remove(i);
                System.out.println("Removed "+teachers.get(i).getName()+" Done ");
            }
        }
    }

    public void removeGrade(Grade grade) {
        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i).code.equals(grade.code) && grades.get(i).gradeName.equals(grade.gradeName)) {
                grades.remove(i);
                System.out.println("Removed "+grades.get(i).gradeName+" Done ");
            }
        }
    }
}



