public class Test{
  int a = 10;
  static int b = 20;
  class Inner{
   void print(){
      System.out.println(a);
      System.out.println(b);
     }
  }
  public static void main(String[] args) {
	new Test().new Inner().print();
  }
}
