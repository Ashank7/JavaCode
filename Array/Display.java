public class Display {

  public static void main(String [] args) {
    int arr [] = {24,34,96,18,10};

    int largest = 0;

    for(int i : arr){
      if(i>largest){
        largest = i;
      }
    }
    System.out.println("The Largest Number is "+largest);
  }

}
