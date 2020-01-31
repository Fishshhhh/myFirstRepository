package Student;

public class Class {
	Student[] students;
	void setGrade(Student[] students){
		this.students=students;
		for(int i=0;i<students.length;i++) {//偶数是本科生，奇数是研究生
			if(i%2==0) {
				students[i]=new Undergraduate();
			}else {
				students[i]=new Postgraduate();
			}
		}
	}
	void listLevel() {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getLevel(students[i].score));
		}
	}
}
