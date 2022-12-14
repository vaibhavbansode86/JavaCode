import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FebinnaciSeries {
	public static Integer[] solution(int n) {
		Integer[] array = (Integer[]) Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(n).toArray(Integer[]::new);
		return array;
	}
	
	public static void main(String []args) {
		System.out.println(Arrays.toString(solution(5)));
		
		
		
		}
	}


