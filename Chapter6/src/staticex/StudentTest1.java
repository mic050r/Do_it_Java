package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);

		Student studentT = new Student();
		System.out.println(studentT.studentID);

		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);

	}
	/*
	 * public static int getSerialNum() { int i = 10; //지역변수 i++;
	 * System.out.println(i); studentName = "홍길동"; //멤버변수, 인스턴스 변수 return serialNum;
	 * //static 변수, 클래스 변수 }
	 */

}
