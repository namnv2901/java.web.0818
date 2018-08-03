package student;

public class Student {
    private String studentCode;
    private float avgMark;
    private int age;
    private String group;

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public Student() {


    }

    Student(String studentCode, float avgMark, int age, String group) {
        this.studentCode = studentCode;
        this.avgMark = avgMark;
        this.age = age;
        this.group = group;

    }


    private boolean isValidInfor() {
        return (studentCode.length() == 8 && age >= 18) && (!(avgMark < 0) && !(avgMark > 10)) && (group.startsWith("A") || group.startsWith("C"));

    }

    public void showInfor() {

        if (isValidInfor()) {
            System.out.println("Name is: " + getStudentCode());
            System.out.println("Age is: " + getAge());
            System.out.println("Group is: " + getGroup());
            System.out.println("Average is: " + getAvgMark());
            if (isGetScholarship()) {
                System.out.println("Eligibility for scholarship");
            } else
                System.out.println("Not Eligibility for scholarship");
        } else {
            System.out.println("Information is invalid:");
        }

    }

    private boolean isGetScholarship() {
        return isValidInfor() && avgMark > 8;
    }

}
