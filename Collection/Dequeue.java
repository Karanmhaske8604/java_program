package java_home.Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
	public class Dequeue {

		public static void main(String[] args) {
			
	    Deque<Integer> queue=new ArrayDeque<Integer>();
	    
	       queue.offer(12);
	       queue.offer(23);
	       queue.offer(34);
	       
	      
	       //[12,23,34]=>12,23,34
	       //34,23,12
	       
	       System.out.println(queue.poll());
	       System.out.println(queue.poll());
	       System.out.println(queue.poll());
	       System.out.println(queue.poll());
	      
	       
	     
	       
	    
	  
	    
	   
		}
	}
