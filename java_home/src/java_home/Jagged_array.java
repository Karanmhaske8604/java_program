package java_home;

public class Jagged_array {

	public static void main(String[] args) {

		int [][]arr=new int[5][];
		
		int num=100;
		arr[0]= new int [4];
		arr[1]=new int[5];
		arr[2]=new int[21];
		arr[3]=new int[15];
		arr[4]=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
		  	for(int j=0;j<arr[i].length;j++)
		  	{
		  		arr[i][j]=num;
		  		num++;
		  	}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		}
		

}
