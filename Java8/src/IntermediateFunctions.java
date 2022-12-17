import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class IntermediateFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr= {1,2,2,3,6,4,5,5};
		List<Integer>l=Arrays.asList(arr);
		
		l.stream().distinct().forEach(System.out::println);
		Optional<Integer> result = l.stream().distinct().sorted().peek(n->System.out.println(n))
		.reduce((a,b)->a+b);
		System.out.println(result);
		
		l.stream().limit(5).skip(2).forEach(System.out::println);
		
		boolean match = l.stream().anyMatch(n->n==5);
		System.out.println(match);
		
		boolean match1 = l.stream().allMatch(n->n<=5);
		System.out.println(match1);
		
		boolean match3 = l.stream().noneMatch(n->n<5);
		System.out.println(match3);
		
		long count = l.stream().filter(n->n<3).count();
		System.out.println(count);
		
		long count2 = l.stream().count();
		System.out.println(count2);
		
		Optional<Integer> findAny = l.stream().filter(n->n>3).findAny();
		System.out.println(findAny);
		
		Optional<Integer> first = l.stream().filter(n->n>3).findFirst();
		System.out.println(first);
		
		int min = l.stream().mapToInt(n->n).summaryStatistics().getMin();
		System.out.println(min);
		
		int max = l.stream().mapToInt(n->n).summaryStatistics().getMax();
		System.out.println(max);
		
		Optional<Integer> reduce = l.stream().reduce((a,b)->a-b);
		System.out.println(reduce);
		
		 int[] array = l.stream().mapToInt(n->n).toArray();
		 System.out.println(Arrays.toString(array));
		 
		

	}

}
