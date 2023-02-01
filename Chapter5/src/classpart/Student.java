package classpart;

class Student {

	int studentID; // 학번
	String studentName; // 학생 이름
	int grade; // 학년
	String address; // 사는 곳
	/*
	 * public Student(int id, String name) { studentID }
	 */

	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}

	/*
	 * public static void main(String[] args) { Student studentLee = new Student();
	 * studentLee.studentName = "이순신"; studentLee.address = "서울시 서초구 서초동";
	 * studentLee.showStudentInfor(); }
	 */
	public String getStudentName() {
		return studentName;
	}

	public void setStudnetName(String name) {
		studentName = name;
	}

	public static void main(String[] args) {
		int i = 10;
		Student studentLee = new Student();
		studentLee.studentName = "이순신"; // ctrl +스페이스
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";

		Student studentKim = new Student();
		studentKim.studentName = "김유신"; // ctrl +스페이스
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
