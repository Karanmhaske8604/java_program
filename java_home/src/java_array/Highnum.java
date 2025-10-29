package java_array;

public class Highnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {11,34,70,52,89,65,87,112,345};
		
		int num=Integer.MIN_VALUE;
		
		int second=Integer.MIN_VALUE;
		
		int third=Integer.MIN_VALUE;
		
		int fourth=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				
				second=num;
				
				num=arr[i];
				//System.out.println(num);
			}
			
			if( arr[i] < num && arr[i] > second )
			{
				third = second;
				second=num;
				num = arr[i];
			}
			if(arr[i] < second &&  arr[i] > third )
			{
				fourth=third;
				third=second;
				second=arr[i];
			}
			
			if(  arr[i] < third && arr[i] >fourth )
			{
				fourth = arr[i];
			}
		
			
		}
		System.out.println("Highest:"+num);
		System.out.println("Second:"+second);
		System.out.println("Third:"+third);
		System.out.println("Fourth:"+fourth);
		
		
	
	}
	}


