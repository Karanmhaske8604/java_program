package java_home;

public class Java_3D {

	public static void main(String[] args) {

		int [][][] arr=new int [3][][];
		int no=1;
		int sum=0;
		arr[0]=new int [2][3];
		arr[1]=new int [5][6];
		arr[2]=new int [7][8];
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0; k<arr[i][j].length;k++)
				{
					arr[i][j][k]=no;
					no++;
					//sum=+no;
					sum+=no;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0; k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("*******************************************");
		}
		//System.out.println("The Next value in the row is "+sum);
		System.out.println("Total Sum of the numbers is "+ sum);
	}

}
