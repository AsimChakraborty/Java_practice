package java_array;

import java.util.Scanner;

public class practice_3 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);

        int [] number= new int[5];
        System.out.println("Enter  numbers:");
//        number[0]= abc.nextDouble();
//        number[1]= abc.nextDouble();
//        number[2]= abc.nextDouble();
//        number[3]= abc.nextDouble();
//        number[4]= abc.nextDouble();


        for (int i=0;i< number.length;i++){
            number[i]= abc.nextInt();
        }

        int sum=0;
        for (int i=0;i< number.length;i++){
            sum=sum+number[i];
        }
        System.out.println("sum:"+sum);


        double avg=sum/ number.length;
        System.out.println("avg:"+avg);


        System.out.println(number.length);

        int max=number[0];
        for(int i=0;i< number.length;i++){
            if (number[i]>max)
                max=number[i];
        }
        System.out.println("max number:"+max);


        int min=number[0];
        for (int i=0;i<number.length;i++){
            if(number[i]<min)
                min=number[i];
        }
        System.out.println("min number :"+min);
//       even position
        for(int i=1;i< number.length;i=i+2){
            System.out.println(number[i]);
        }

//   duplicate element
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i] == number[j]){
                    System.out.println("duplicate:"+number[j]);
                }
            }
        }
//        reverse
        System.out.println("Array in reverse order");
        for(int i= number.length-1; i>=0; i--) {
            System.out.println(number[i]);
        }

//        insert


    }
}
