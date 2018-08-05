//Bai 1
public class Employee {
	private String name;
	private int age;
	private String address;
	private double salary;
	private int totalTime;
	private double income;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String address, double salary, int totalTime) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.totalTime = totalTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
		System.out.println("Total time: " + totalTime);

	}

	public double totalIncome() {
		if (totalTime >= 200) {
			income = salary * 0.2 + salary;

		} else if (totalTime > 100) {
			income = salary * 0.1 + salary;

		} else
			income = salary;
		return income;
	}

	public static void main(String[] args) {
		Employee nv = new Employee("Tuan", 24, "Ha Noi", 2000000, 300);
		nv.printInfo();
		nv.totalIncome();
		System.out.println("Income: " + nv.income);

	}
}
