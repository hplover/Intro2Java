package chapter3;

public class AdditionQuiz {
  public static void main(String[] args) {
	  double result=0.0;
	  int count=2000000;
	  result=0.0;
	  for(int i=1;i<=count;i++){
		  result+=1.0/i;
	  }
	  System.out.println(result);
	  result=0.0;
	  for(int i=count;i>0;i--){
		  result+=1.0/i;
	  }
	  System.out.println(result);
	  xx((int) 9.1);
	  int[] myList;
	  myList = new int[10];
	  System.out.println(myList.length);
	  // Sometime later you want to assign a new array to myList 
	  myList = new int[20];
	  System.out.println(myList.length);
}
  public static void xx(int a){
	  return ;
  }
}
