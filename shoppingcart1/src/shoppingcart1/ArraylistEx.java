package shoppingcart1;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Java");
		a1.add("C++");
		a1.add("PERL");
		a1.add("PHP");
		a1.add("BASIC");
		System.out.println(a1);
		System.out.println("Does this list contain Java"+a1.contains("Java"));
		a1.add(2, "COBOL");
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
