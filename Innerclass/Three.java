public class Three {
   class Two{
     class One{
       void print(){
          System.out.println("Hello World");
	}
     }
   }
   public static void main(String [] args)  {
   	Three obj = new Three();
	Three.Two obj1 = obj.new Two();
	Three.Two.One obj2 = obj1.new One();
        obj2.print();
	
   }
}
