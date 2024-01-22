import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array34 {
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
            for(int j=2;j<arr[i];j++){
                count++;

            }if(count<2){
                System.out.println("prime number "+arr[i]+"found at "+i+"index");
            }
        }
 
}
}


