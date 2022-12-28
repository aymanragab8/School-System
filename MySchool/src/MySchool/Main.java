package MySchool;

import People.Student;
import People.Teacher;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static School MainSchool = new School("Manaret El Farouk" ,"Masakan , Nasr City 11371 ,Cairo, Egypt " ,"57357");

    static boolean exit = true ;

    public static void main(String[] args) {

        DefaultStudents();
        DefaultTeachers();
        DefaultSubjects();

    do {
        System.out.println("********************************************************************************* " );

        System.out.println("Welcome To Our School " );

        System.out.println("What Service Do You Want ? \n" +
                "1-** About School ** \n" +
                "2-Students \n" +
                "3-Teachers \n" +
                "4-Grades \n" +
                "5-Exit \n");

        int input = in.nextInt();
     switch (input){

        case 1 :
            System.out.println(MainSchool.toString());
            break;
        case 2 :
            SetStudentData();
            break;
        case 3 :
            SetTeacherData();
            break;

        case 4 :
            SetGradeData();
            break;

        case 5 :
            exit=false;
            break;
        default:
                System.out.println("Try Number Between (1 : 5)");
    }
}while (exit);
    }

    public static void SetStudentData(){

        System.out.println("############## Students ############## \n" +
                "1- Add New Student \n" +
                "2- Remove Student \n" +
                "3- Search For Student By Name \n" +
                "4- Show All Students \n" +
                "5-Exit \n");

        int num1 = in.nextInt();
        switch (num1){

            case 1 :

                System.out.println("Enter Student First Name : " );
                String f1 = in.next();
                System.out.println("Enter Student Second Name : " );
                String f2 = in.next();
                System.out.println("Enter Student Last Name : " );
                String f3 = in.next();
                String name = f1+ " "+f2+" " +f3;
                System.out.println("Enter Student Age : " );
                int age = in.nextInt();
                System.out.println("Enter Student Parent Phone Number : " );
                String ParentPhoneNumber = in.next();
                Student s = new Student(name,age,ParentPhoneNumber);
                MainSchool.addStudent(s);
                System.out.println(" Congratulations , Done :) " );
                MainData();
                break;

            case 2 :
                System.out.println("Enter Student First Name : " );
                String l1 = in.next();
                System.out.println("Enter Student Second Name : " );
                String l2 = in.next();
                System.out.println("Enter Student Last Name : " );
                String l3 = in.next();
                String lname = l1+ " "+l2+" " +l3;
                System.out.println("Enter Student Age : " );
                int a = in.nextInt();
                Student rs =new Student(lname,a);
                MainSchool.removeStudent(rs);
                MainData();
                break;

            case 3 :
                System.out.println("Enter Student First Name : " );
                String n1 = in.next();
                System.out.println("Enter Student Second Name : " );
                String n2 = in.next();
                System.out.println("Enter Student Last Name : " );
                String n3 = in.next();
                String na = n1+ " "+n2+" " +n3;
                Student SearchStudent =  MainSchool.getStudentByName(na);
                if (SearchStudent!=null)
                System.out.println(SearchStudent.Display());
                else
                    System.out.println("Not Found");
                break;

            case 4 :
                System.out.println("ALL STUDENTS ");
                for (Student student:MainSchool.getStudents()){
                    System.out.println(student.Display());
                }
                break;

            case 5 :
                exit=false;
                break;

            default:
                System.out.println("Try Number Between (1 : 5)");

        }}
        public static void SetTeacherData(){
            System.out.println("############## Teachers ############## \n" +
                    "1- Add new Teacher \n" +
                    "2- Remove Teacher \n" +
                    "3- Search For Teacher By name \n" +
                    "4- Show All Teachers \n" +
                    "5-Exit \n");

            int num2 = in.nextInt();
            switch (num2) {

                case 1:

                    System.out.println("Enter Teacher First Name : ");
                    String t1 = in.next();
                    System.out.println("Enter Teacher Second Name : ");
                    String t2 = in.next();
                    System.out.println("Enter Teacher Last Name : ");
                    String t3 = in.next();
                    String name = t1 + " " + t2 + " " + t3;
                    System.out.println("Enter Teacher Age : ");
                    int age = in.nextInt();
                    if (age>=22){
                    System.out.println("Enter Teacher Salary : ");
                    float salary = in.nextFloat();
                    System.out.println("Enter Number of Subject Code From This List : ");

                    for (int i =0 ; i <MainSchool.getGrades().size();i ++)
                        System.out.println((i+1)+" -"+MainSchool.getGrades().get(i).code);

                    int gn = in.nextInt();
                    String sub = "";
                    boolean OutList=false;

                   switch (gn){
                       case 1 :
                           sub = "PHYS";
                           break;
                       case 2 :
                           sub = "ENG";
                           break;
                       case 3 :
                           sub = "FR";
                           break;
                       case 4 :
                           sub = "MUS";
                           break;
                       case 5 :
                           sub = "ARB";
                           break;
                       case 6 :
                           sub = "SCI";
                           break;
                       case 7 :
                           sub = "HIST";
                           break;
                       default:
                           OutList=true;
                           System.out.println("Invalid Number");
                   }

                        if (OutList==false){

                            Teacher t = new Teacher(name, age, salary, sub);
                            MainSchool.addTeacher(t);
                            System.out.println(" Congratulations , Done ");
                        }}
                    else
                        System.out.println(" Age Must Be More Than 21");

                    MainData();

                    break;

                case 2 :
                    System.out.println("Enter Teacher First Name : " );
                    String z1 = in.next();
                    System.out.println("Enter Teacher Second Name : " );
                    String z2 = in.next();
                    System.out.println("Enter Teacher Last Name : " );
                    String z3 = in.next();
                    String zxa = z1+ " "+z2+" " +z3;
                    System.out.println("Enter Teacher Age : " );
                    int a = in.nextInt();
                    Teacher rt =new Teacher(zxa,a);
                    MainSchool.removeTeacher(rt);
                    MainData();
                    break;

                case 3 :
                    System.out.println("Enter Teacher First Name : " );
                    String n1 = in.next();
                    System.out.println("Enter Teacher Second Name : " );
                    String n2 = in.next();
                    System.out.println("Enter Teacher Last Name : " );
                    String n3 = in.next();
                    String na = n1+ " "+n2+" " +n3;
                    Teacher SearchTeacher =  MainSchool.getTeacherByName(na);
                    if (SearchTeacher!=null)
                    System.out.println(SearchTeacher.Display());
                    else
                        System.out.println("Not Found");
                    break;

                case 4 :
                    System.out.println("ALL Teachers ");
                    for (Teacher teacher:MainSchool.getTeachers()){
                        System.out.println(teacher.Display());
                    }
                    break;

                case 5 :
                    exit=false;
                    break;

                default:
                    System.out.println("Try Number Between (1 : 5)");

            }}
            public static void SetGradeData(){
                System.out.println("############## Grades ############## \n" +
                        "1- Add new Grade \n" +
                        "2- Remove Grade \n" +
                        "3- Search For Grade By Code \n" +
                        "4- Show All Grades \n" +
                        "5-Exit \n");

                int num3 = in.nextInt();
                switch (num3){

                    case 1 :

                        System.out.println("Enter Grade Name : " );
                        String name = in.next();
                        System.out.println("Enter Grade Code : " );
                        String code = in.next();
                        Grade g = new Grade(name,code);
                        MainSchool.addGrade(g);
                        MainData();
                        break;

                    case 2 :
                        System.out.println("Enter Grade Code : " );
                        String c = in.next();
                        System.out.println("Enter Grade Name : " );
                        String n = in.next();
                        Grade rg =new Grade(c,n);
                        MainSchool.removeGrade(rg);
                        MainData();
                        break;

                    case 3 :
                        System.out.println("Enter Grade Code : " );
                        String cSearch = in.next();
                        Grade SearchGrade =  MainSchool.getGradeByCode(cSearch);
                        if (SearchGrade!=null)
                        System.out.println(SearchGrade.toString());
                        else
                            System.out.println("Not Found");
                        break;

                    case 4 :
                        System.out.println("ALL Grades ");
                        for (Grade grade:MainSchool.getGrades()){
                            System.out.println(grade.toString());
                        }
                        break;

                    case 5 :
                        exit=false;
                        break;

                    default:
                        System.out.println("Try Number Between (1 : 5)");

                }
    }
    public static void DefaultSubjects(){
        MainSchool.addGrade(new Grade("PHYS","Physics"));                              //Grade g = New Grade ("SPAN","Spanish");
        MainSchool.addGrade(new Grade("ENG","English"));                                //MainSchool.addGrade(g);
        MainSchool.addGrade(new Grade("FR","French"));
        MainSchool.addGrade(new Grade("MUS","Music"));
        MainSchool.addGrade(new Grade("ARB","Arabic"));
        MainSchool.addGrade(new Grade("SCI","Science"));
        MainSchool.addGrade(new Grade("HIST","History"));
    }
    public static void DefaultTeachers(){
        MainSchool.addTeacher(new Teacher("Ahmed Mohamed Taha",25,3500,"ARB"));
        MainSchool.addTeacher(new Teacher("Mona ALsaid Fouad",31,5500,"ENG"));
        MainSchool.addTeacher(new Teacher("Ali Mahmoud Ali",22,2500,"HIST"));
        MainSchool.addTeacher(new Teacher("AbdElwahed Ali Mahmoud",36,6500,"FR"));
        MainSchool.addTeacher(new Teacher("Salah ElSawy Ali",44,10000,"MUS"));
    }
    public static void DefaultStudents(){
        MainSchool.addStudent(new Student("Ahmed Mamdouh Farag",10,"12345"));
        MainSchool.addStudent(new Student("Ibrahim Elsaid Essam",7,"45789"));
        MainSchool.addStudent(new Student("Islam Hamdy Elwensh",8,"45871"));
        MainSchool.addStudent(new Student("Mahmoud Saad AboElola",11,"56987"));
        MainSchool.addStudent(new Student("Shery Ryad Elkholy",9,"56321"));
        MainSchool.addStudent(new Student("Sara Ibrahim Elmahdy",10,"78945"));
        MainSchool.addStudent(new Student("Khaled Salama Ali",7,"65412"));
        MainSchool.addStudent(new Student("Mostafa Marzok Dabash",8,"78542"));
        MainSchool.addStudent(new Student("Ryad Ahmed Mehrez",9,"78543"));
        MainSchool.addStudent(new Student("Mohamed Salah Farag",11,"96587"));
        MainSchool.addStudent(new Student("Dina Essam Yaser",12,"32569"));
        MainSchool.addStudent(new Student("Mohamed Nabil Koka",7,"85412"));
        MainSchool.addStudent(new Student("Helmy Samir Fouad",11,"98745"));
        MainSchool.addStudent(new Student("Alaa Reda bhrawy",9,"65478"));
        MainSchool.addStudent(new Student("Omnia AbdElrahman Kamar",8,"36987"));
    }
    public static void MainData(){
        System.out.println(" Number OF Students : " +MainSchool.getStudents().size());
        System.out.println(" Number OF Teachers : " +MainSchool.getTeachers().size());
        System.out.println(" Number OF Grades : " +MainSchool.getGrades().size());
    }


}

