package Student;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];//�༶ʮ���ˣ�		
		Class class1 = new Class();//�����±�ż���Ǳ��������������о���
		class1.setGrade(students);
		for(int i = 0; i<students.length;i++) {
			students[i].score=90;//�ɼ�����90��
		}
		class1.listLevel();//����ÿ���˵ĳɼ��ȼ�
	}
}
