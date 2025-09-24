package java_array;

public class Java_2D {

	public static void main(String[] args) {

		int [][] two_array=new int[3][4];
		
		two_array[0][0]=1;
		two_array[0][1]=2;
		two_array[0][2]=3;
		two_array[0][3]=4;
		
		two_array[1][0]=9;
		two_array[1][1]=8;
		two_array[1][2]=7;
		two_array[1][3]=6;
		
		two_array[2][0]=3;
		two_array[2][1]=3;
		two_array[2][2]=3;
		two_array[2][3]=3;
		
		for(int i=0;i<two_array.length;i++)
		{
			for(int j=0;j<two_array[i].length;j++)
			{
				System.out.print(two_array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
