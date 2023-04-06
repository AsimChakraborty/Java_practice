//output
//0
// 1 2
// 3 4 5
// 6 7 8 9

package java_array;

public class Twod_array_1 {
    public static void main(String[]args){
        int[][]number=new int[4][];
        int temp=0;
        number[0]=new int[1];
        number[1]=new int[2];
        number[2]=new int[3];
        number[3]=new int[4];


        for(int i=0;i<4;i++){
            for (int j=0;j<i+1;j++){
                number[i][j]=temp;
                temp++;
            }
        }
        for(int i=0;i<4;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
    }
}
