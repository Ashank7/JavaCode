public class Main {
    public static void logic1(){
      System.out.println("Logic1 - Line 1");
      logic2();
      System.out.println("Logic2 - Line 2");
   }
    public static void logic2() {
      try {
      System.out.println(10/0);
      } catch (Exception e) {
      System.out.println(e);
      }
      finally {
      System.out.println("This is Finally Block");
      }
   }
     public static void main(String [] args){
        logic1();
   }
 } 
