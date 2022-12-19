import java.util.Scanner;
/*
In this section we will see how to find any element that occurring more than one times.
_________________________________________________________________________________________
Question : find the element that are occurring more than one time of element?
_______________________________________________________________________________
Approach : first take input from user and then find the element that are occurring more than one time and print it.
 */
public class OccurringNnumbers {
    static int CountingNumbers(int arr[] , int x){
        int count = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array you want initialize : " );
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value you want to enter inside array :");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Simply printing the given value by user :" + arr[i]);
            System.out.println();
       }
        System.out.println("Enter the value of X :");
        int x = sc.nextInt();
        System.out.println("Now finally printing the element that occurring more than one time: "+CountingNumbers(arr, x));
        }
    }

