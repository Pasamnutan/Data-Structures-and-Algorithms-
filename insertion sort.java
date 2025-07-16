import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int a[] = {10,2,4,9,50};
        System.out.println("Original Elements:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.println(" ");
        System.out.println("Sorted Elements:");
        System.out.println(Arrays.toString(a));
    }
}
