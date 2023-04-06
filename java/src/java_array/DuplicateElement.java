//STEP 1: START
//STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
//STEP 3: PRINT "Duplicate elements in given array:"
//STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
//STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
//STEP 6: if(arr[i] == arr[j])
//STEP 7: PRINT arr[j]
//STEP 8: END

package java_array;

public class DuplicateElement {
    public static  void main(String[]args){
        int arr[]=new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array:");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
