import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
 
  public static void main(String[] args) {
    // ArrayList al = new ArrayList();
    // al.add(10);
    // al.add("java");
    // al.add(true);

    // LinkedList <Integer> al = new LinkedList<Integer>();
    // al.add(10);
    // al.add(20);
    // al.add(30);
    //
    // for(int i=0;i<3;i++){
    //    System.out.println(al.get(i));
    // }

    List<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Banana");
    list.add("Mango");

    for (String fruit:list){
        System.out.println(fruit);
    }

    list.add(1,"Orange");
    list.remove("Banana");
    System.out.println(list.get(1));
    System.out.println("\nSize of the List is : " + list.size());
    System.out.println("\n");
    for (String fruit:list){
        System.out.println(fruit);
    }

  }

}
