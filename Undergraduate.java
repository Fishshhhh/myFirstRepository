package Student;

public class Undergraduate extends Student{
	String getLevel(int score){
		if(score>=90) {
			return "����";
		}else if(score>=80) {
			return "����";
		}else if(score>=70) {
			return "һ��";
		}else if(score>=60) {
			return "����";
		}else {
			return "������";
		}
	}
}
