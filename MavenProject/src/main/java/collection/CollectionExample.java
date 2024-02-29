package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class CollectionExample {

	public static void main(String[] args) {
ArrayList<String> obj=new ArrayList<String>();
obj.add("Apple");//0
obj.add("orange");//1
obj.add("grapes");//2
obj.add("water melon");//3
System.out.println(obj.get(3));
System.out.println(obj);
ArrayList obj1=new ArrayList();
obj1.add(37);
obj1.add("string");
obj1.add(37.89);
obj1.add('a');
System.out.println(obj1);

System.out.println("size of obj");
System.out.println(obj.size());

System.out.println("list using for loop");
for(int i=0;i<obj.size();i++) {
	System.out.println(obj.get(i));

}

System.out.println("list using for each loop");
for(String i:obj) {
	System.out.println(i);

}

Collections.sort(obj);
System.out.println("list using sort" + obj);

obj.set(2, "carrot");
System.out.println("after set the element " + obj);

System.out.println("list using iterator");
Iterator it=obj1.iterator();//important
while(it.hasNext()) {
	System.out.println(it.next());
}

System.out.println("list using iterator");
Iterator<String> it1=obj.iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}

ArrayList<String> obj3=new ArrayList<String>();
obj3.add("anu");//0
obj3.add("appu");//1
obj3.add("minnu");//2
obj3.add("water melon");//3
obj3.add("water melon");//3
System.out.println(obj3);

obj3.removeAll(obj);
System.out.println("after remove same elements " + obj3);

obj3.addAll(obj);
System.out.println("after add elements " + obj3);

it1.remove();
System.out.println(obj);

obj.remove("carrot");
System.out.println("after deleting " + obj);

ArrayList<Integer> obj4=new ArrayList<Integer>();//primitive datatype uses rapper class
obj4.add(1);//0
obj4.add(5);//1
obj4.add(7);//2
obj4.add(11);//3
System.out.println(obj4);


	}

}
