import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array31 {
    public static void main(String[] args) throws IOException{
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        int size1=Integer.parseInt(br.readLine());
        int arr[]=new int[size1];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }
        
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp=arr[i];
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            System.out.println(count);
        }
}
}
