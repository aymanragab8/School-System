package People;

public class Teacher extends Person{

    private float salary;
    private String subjectCode;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher(String name, int age, float salary , String subjectCode) {
        super(name,age);
        this.salary = salary;
        this.subjectCode=subjectCode;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String Display() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", salary=" + salary +
                ", subject=" + subjectCode +
                '}';
    }

}
