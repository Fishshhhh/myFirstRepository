package Student;

public class Postgraduate extends Student{
	String getLevel(int score){
		if(score>=95) {
			return "����";
		}else if(score>=90) {
			return "����";
		}else if(score>=85) {
			return "һ��";
		}else if(score>=80) {
			return "����";
		}else {
			return "������";
		}
	}
}
