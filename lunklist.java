
import java.lang.reflect.Array;
import java.util.ArrayList;

public class lunklist {
  

	public static void main(String[] args) {

//		ArrayList al = new ArrayList();
//
//		al.add(90);
//		al.add(2);
//		al.add(3);
//		al.add(9);
//		al.add(10);
//		al.add("");
//
//		ArrayList al1 = new ArrayList();
//		al.add(90);
//		al.add(2);
//		al.add(3);
//		al.add(9);
//
//		System.out.println("-----------------------");
//		System.out.println(al.contains(1));
//		System.out.println("--------Remove--------");
//		System.out.println(al.remove((Object) 2));
//		System.out.println("---------remove-------");
//		System.out.println(al.remove("9"));
//		System.out.println("--------clear--------"); 
//		// al.clear();
//		System.out.println("-----------------------");
//		System.out.println(al.size());
//		System.out.println("-------isEmpty()---------");
//		System.out.println(al.isEmpty());
//		System.out.println("-------toArray()---------");
//		System.out.println(al.toArray());
//		System.out.println("-------hashCode()---------");
//		System.out.println(al.hashCode());
//
//		System.out.println("-----------------------");
//		System.out.println(al);

		ArrayList al = new ArrayList(3);

		al.add(90);
		al.add(2);
		al.add(3);
		al.add(9);
		al.add(10);
		al.add("");

		
		ArrayList al1 = new ArrayList(al);
		al1.add(90);
		al1.add(2);
		al1.add(3);
		al1.add(9);
//
//		// System.out.println(al.addAll(al1));
//		// System.out.println(al.removeAll(al1));
//		System.out.println("------retainAll---------");
//		// System.out.println(al.retainAll(al1));
//
//		System.out.println("--------al-----------");
//		System.out.println(al);
//		System.out.println("--------al1----------");
//		System.out.println(al1);
//
////		for(int i=0;i<al.size();i++)
////		System.out.println(al.get(i));
//
//		for (Object o : al) {
//			System.out.println(o);
//		}
//		System.out.println("------Iterator------");
//		Iterator i = al.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
	}
}