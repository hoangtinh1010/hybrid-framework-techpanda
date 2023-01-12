package javaOOP;

public class Topic_01_Class_Object_Student {
	private int studentID;
	private String studentName;
	private float knowledgePoint;
	private float practicePoint;

	protected Topic_01_Class_Object_Student(int numberStudent, String fullName, float practicePoint,
			float knowledgePoint) {
		super();
		this.studentID = numberStudent;
		this.studentName = fullName;
		this.knowledgePoint = knowledgePoint;
		this.practicePoint = practicePoint;
	}

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int numberStudent) {
		this.studentID = numberStudent;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private final float getPracticePoint() {
		return practicePoint;
	}

	private void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	private Float getAveragePoint() {
		return (this.knowledgePoint + this.practicePoint * 2) / 3;
	}

	private void showStudentInfor() {
		System.out.println("*****************************");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getStudentName());
		System.out.println("Student knowledge Point = " + getKnowledgePoint());
		System.out.println("Student practicePoint = " + getPracticePoint());
		System.out.println("Student average Point = " + getAveragePoint());
	}

	public static void main(String[] args) {

		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student(1, "Hoàng Thị Tỉnh", 8, 6);
		firstStudent.setStudentID(1223);
		firstStudent.setStudentName("Hoang Thi Tinh");
		firstStudent.setKnowledgePoint(8.0f);
		firstStudent.setPracticePoint(7.8f);
		firstStudent.showStudentInfor();

		Topic_01_Class_Object_Student secondStudent = new Topic_01_Class_Object_Student(1, "Hoàng Thị Tỉnh", 8, 6);
		secondStudent.setStudentID(1223);
		secondStudent.setStudentName("Hoang Thi Tinh");
		secondStudent.setKnowledgePoint(9.0f);
		secondStudent.setPracticePoint(7.5f);
		secondStudent.showStudentInfor();

	}

}
