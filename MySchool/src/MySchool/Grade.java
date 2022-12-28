package MySchool;



public class Grade {

    String code;
    String gradeName;


    public Grade(String code, String gradeName) {
        this.code = code;
        this.gradeName = gradeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }










    @Override
    public String toString() {
        return "Grade{" +
                "code='" + code + '\'' +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
