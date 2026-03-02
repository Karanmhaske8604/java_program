package java_home.array;

public class JavaArray {

	public static void main(String[] args) {
		
     int [] arr= {56,76,98,34,-45};
     int num =Integer.MAX_VALUE;
     int low = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]<num)
    	  {
    		 
    		  num=arr[i];
    		//  System.out.println(num);
    		  
    	  }
    	  for(int j=0;j<arr.length;j++)
          {
        	  if(arr [j]>low)
        	  {
        		 
        		  low=arr[j];
        	  }
          }
    	 
         }
      System.out.println("lowest "+num);
      System.out.println("highest "+low);
	}
}