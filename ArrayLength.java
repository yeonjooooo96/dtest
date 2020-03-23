import java.util.Scanner;

public class ArrayLength{
	public static void main(String[] args){
		int intArray[]=new int[5];
		int sum=0;

		Scanner scanner=new Scanner(System.in);
		System.out.print(intArray.length+"input");
		for(int i=0; i<intArray.length; i++)
			intArray[i]=scanner.nextInt();

		for(int i=0; i<intArray.length; i++)
			sum+= intArray[i];

		System.out.print("avg"+(double)sum/intArray.length);
		scanner.close();
	}
}

