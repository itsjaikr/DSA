import java.util.Arrays;

public class Intersection{
    
     public static void intersection(int[] arr1,int[] arr2){
         int i=0;
         int j=0;
         Arrays.sort(arr1);
         Arrays.sort(arr2);
     
         int size1= arr1.length;
         int size2=arr2.length;
         if(size1>size2){
         	while(j<size2){
             
             	if (arr1[i]==arr2[j]){
                 System.out.println(arr1[i]);
                 i++;
            	 }
			 	 if(arr1[i]<arr2[j])
                	 i++;
            	else 
                j++;
                
             }
         }
         else{
             while(i<size1){
                 if(arr2[j]==arr1[i]){
                     System.out.println(arr2[j]);
                         i++;
                     	 j++;
                 }
                 else if(arr2[j]<arr1[i])
                     j++;
                else
                    i++;
             }
         }
     }
    
     }
