import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(12);
		l.add(16);
		
		Set<Entry<Integer,Long>> entrySet = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet();
		entrySet.stream().forEach(n->System.out.println("Value: "+n.getKey()+" Frequency"+n.getValue()));
		
		Set<Integer> collect = entrySet.stream().filter(n->n.getValue()>1).map(n->n.getKey()).collect(Collectors.toSet());
		System.out.println(collect);
		
		Set<Integer>unique=new HashSet<Integer>();
		Set<Integer> duplicate = l.stream().filter(n->!unique.add(n)).collect(Collectors.toSet());
		System.out.println(duplicate);
		
		Set<Integer> duplicate1 = l.stream().filter(n->Collections.frequency(l,n)>1).collect(Collectors.toSet());
		System.out.println(duplicate1);
	}

}
