public class SelectionSort{
  public static void main(String[] args) {
    int a[]={25,10,30,34,5};
    System.out.println(java.util.Arrays.toString(a));
    for(int i=0;i<a.length;i++){
      int minind=i;
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[minind]){
          minind=j;
        }
      }
      int temp = a[minind];
      a[minind] = a[i];
      a[i] = temp;
    }
    System.out.println(java.util.Arrays.toString(a));
  }
}