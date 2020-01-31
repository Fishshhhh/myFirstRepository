package Student;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];//班级十个人，		
		Class class1 = new Class();//数组下标偶数是本科生，奇数是研究生
		class1.setGrade(students);
		for(int i = 0; i<students.length;i++) {
			students[i].score=90;//成绩都是90分
		}
		class1.listLevel();//输入每个人的成绩等级
	}
}
