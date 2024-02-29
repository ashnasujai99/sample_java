package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> obj=new HashSet<String>();
		obj.add("beans");
		obj.add("carrot");
		obj.add("capsicum");
		obj.add("pumkin");
		System.out.println(obj);
		
		obj.remove("capsicum");//only content is taken(index not taken);
		System.out.println("after removing an element " + obj);

		obj.size();
		System.out.println("size of the set " + obj.size());
		
		Iterator<String> it1=obj.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
it1.remove();
System.out.println("after removing " + obj);

HashSet<String> obj2=new HashSet<String>();
obj2.add("manu");
obj2.add("anu");
obj2.add("capsicum");
obj2.add("keerthi");
System.out.println(obj2);

obj.removeAll(obj2);
System.out.println("after removing " + obj);

obj.addAll(obj2);
System.out.println("after adding " + obj);



	}

}
