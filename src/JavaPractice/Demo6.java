package JavaPractice;

public class Demo6 {
	  static void sortingAlgo(int[] a)
	    {
	        for(int pass=0; pass<a.length; pass++)
	        {
	            int temp;
	            for(int i=0; i<a.length-1;i++)
	            {
	                if(a[i]>a[i+1])
	                {
	                    temp=a[i];
	                    a[i]=a[i+1];
	                    a[i+1]=temp;
	          
	                }
	            }
	           
	        }
	        
	        System.out.println("Final List");
	        for(int i=0;i<a.length;i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	    }
	    public static void main(String[] args)
	    {
	        int[] arr={90,10,20,30,40};
	        
	        Demo6.sortingAlgo(arr);
	    }
}
