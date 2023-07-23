import java.util.Scanner;

class arrays{
public static void main(String[] args) {
 int n,sum=1;
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
    arr[i]=s.nextInt();
    sum*=arr[i];
    arr[i]=sum;
 }
 s.close();
 for(int i:arr){
    System.out.print(i+" ");
 }  
}
}