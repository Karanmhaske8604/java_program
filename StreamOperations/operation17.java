package java_home.StreamOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class operation17 {

	public static void main(String[] args) {
		// Count()  By Custom_Collector class.
		
		
		List<StringBuffer> listt=List.of("Gayatri","Pradnya","Srushti")
		.stream()
		.collect(new Custom_Collector());
		System.out.println(listt);
		
		System.out.println("************************************");
		//Collect without Custom Class
		List<StringBuffer>list2=List.of("Gayatri","Pradnya","Srushti")
		.stream()
		.map(StringBuffer::new)
		.map(StringBuffer::reverse)
		.collect(Collectors.toList());
		System.out.println(list2);
		
	}
}

class Custom_Collector implements Collector<String,List<StringBuffer>,List<StringBuffer>>
{

	@Override
	public Supplier<List<StringBuffer>> supplier() {
		//return ()->{return new ArrayList<StringBuffer>();};
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<StringBuffer>, String> accumulator() {
		// with help of supplier add into List<StringBuffer>
		return (t,u)-> t.add(new StringBuffer(u).reverse());
		};
	

	@Override
	public BinaryOperator<List<StringBuffer>> combiner() {
		// TODO Auto-generated method stub
		return (t1,t2)->{
			t1.addAll(t2);
		    return t1;};
	}

	@Override
	public Function<List<StringBuffer>, List<StringBuffer>> finisher() {
		// TODO Auto-generated method stub
		return (t)->{return t;};
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return new HashSet<Collector.Characteristics>( );
	}
	}
