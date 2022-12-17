import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PrintSumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		
		Optional<Integer> sum = l.stream().reduce((a,b)->a+b);
		System.out.println(sum);

	}

}
