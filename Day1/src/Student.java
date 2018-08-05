//Bai 2
public class Student {
	private String code;
	private double average;
	private int age;
	private String grade;
	public final String stringValue = "nan";
	public final double doubleValue = 0;
	public final int intValue = 0;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = stringValue;
		if (code.length() == 8) {
			this.code = code;
		}

	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = doubleValue;
		if ((average >= 0.0) && (average <= 10.0)) {
			this.average = average;
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = intValue;
		if (age > 18) {
			this.age = age;
		}

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = stringValue;
		if ((grade.charAt(0) == 'A') || (grade.charAt(0) == 'C')) {
			this.grade = grade;
		}
	}

	public Student(String code, double average, int age, String grade) {
		super();
		setCode(code);
		setAverage(average);
		setAge(age);
		setGrade(grade);

	}

	public void showInfo() {
		System.out.println("Ma sinh vien: " + code);
		System.out.println("Diem trung binh: " + average);
		System.out.println("Tuoi: " + age);
		System.out.println("Lop: " + grade);

	}

	public void checkScholarship() {
		if (average > 8.0) {
			System.out.println("Ban duoc hoc bong");
		} else {
			System.out.println("Ban khong duoc hoc bong");
		}
	}

	public static void main(String[] args) {
		Student student = new Student("111244044", 7.63, 24, "CNTT");
		student.showInfo();
		student.checkScholarship();
		
	}

}
