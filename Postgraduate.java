package Student;

public class Postgraduate extends Student{
	String getLevel(int score){
		if(score>=95) {
			return "优秀";
		}else if(score>=90) {
			return "良好";
		}else if(score>=85) {
			return "一般";
		}else if(score>=80) {
			return "及格";
		}else {
			return "不及格";
		}
	}
}
