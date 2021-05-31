package omg;

import java.util.Scanner;

public class Calcuator {
    int sum(int a, int b)
    {
        return a+b;
    }

    int multi (int a, int b) {
        return a*b;
    }

    int mang () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần từ mảng");
        int n =sc.nextInt();
        int arr [];
        arr = new arr[n];
        for (int i = 0; i <n;i++){
            System.out.print("Nhập phần tử thứ " +i+ ": ");
            arr[i] =sc.nextInt();
        }
        return arr;
    }

    String chuoi (){
        Scanner sc = new Scanner(System.in);
        String chuoi;
        chuoi = sc.next();
        return chuoi;
    }
}
