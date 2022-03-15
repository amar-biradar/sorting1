package sorting;


//Java program for implementation of Insertion Sort
class InsertionSort {
 
 public static void main(String args[])
 {
   int[] a= {2,4,6,8,2,4,6,8,6,5,3,1};
   int temp,j;
   for(int i=0;i<a.length;i++)
   {
	   temp=a[i];
	   j=i;
	   
	   while(j>0 && a[j-1]>temp)
	   {
		   a[j]=a[j-1];
		   j=j-1;
	   }
	   a[j]=temp;
	   
   }
   for( int i=0;i<a.length;i++)
   {
	   System.out.println(a[i]+"");
   }
 }
}