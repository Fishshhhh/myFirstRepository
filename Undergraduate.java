package Student;

public class Undergraduate extends Student{
	String getLevel(int score){
		if(score>=90) {
			return "优秀";
		}else if(score>=80) {
			return "良好";
		}else if(score>=70) {
			return "一般";
		}else if(score>=60) {
			return "及格";
		}else {
			return "不及格";
		}
	}
}
