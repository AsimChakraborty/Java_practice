//0 1 2 3 4
// 5 6 7 8 9
// 10 11 12 13 14
// 15 16 17 18 19
//output

package java_array;

public class Twod_array {
    public static void main(String[]args){
        int [][]num=new int[4][5];
        int temp=0;
        for (int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                num[i][j]=temp;
                temp++;
            }
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
    }
}
