import java.util.function.*;
public class Combination {
	public static String solution(String f,String l, int a) {
		Function <String,String>f1=s->s.substring(0,2);
		return f1.apply(f)+f1.apply(l)+a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("ashrita","Pranav",18));

	}

}
