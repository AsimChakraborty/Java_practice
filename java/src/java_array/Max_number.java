//STEP 1: START
//STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
//STEP 3: max = arr[0]
//STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
//STEP 5: if(arr[i]>max) max=arr[i]
//STEP 6: PRINT "Largest element in given array:"
//STEP 7: PRINT max
//STEP 8: END

package java_array;

public class Max_number {
    public static void main(String[] args) {
        int []arr=new int []{2,4,56,6,7};
        int max =arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest element in given array:"+max);


    }
}
