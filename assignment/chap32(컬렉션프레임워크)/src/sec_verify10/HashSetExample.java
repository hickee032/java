package sec_verify10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");

		System.out.println("ÃÑ°´Ã¼¼ö - " + set.size());

		System.out.println("Iterator");
		int co = 1;
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String a = iterator.next();
			System.out.println(co+"¹øÂ° °´Ã¼ : "+a);
			co++;

		}

	}

}
