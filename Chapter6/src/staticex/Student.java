package staticex;

public class Student {
	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
}
