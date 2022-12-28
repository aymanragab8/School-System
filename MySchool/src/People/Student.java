package People;

public class Student extends Person{

    private String parentPhoneNumber ;

    public Student(String name, int age) {
      super(name, age);
    }

    public Student(String name, int age, String parentPhoneNumber) {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    @Override
    public String Display() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", parent Phone Number=" + parentPhoneNumber +
                '}';
    }
}
