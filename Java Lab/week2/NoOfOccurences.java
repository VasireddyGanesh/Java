import java.util.Arrays;
import java.util.Scanner;

class NoOfOccurences{
    public static int findUniqueElementsCount(int keyArr[],int n,int arr[]){
        Arrays.sort(arr);
        int prev=arr[0];
        int count=0;
        keyArr[count++]=arr[0];
        for(int i=1;i<n;i++){
              if(arr[i]>prev){
                  keyArr[count++]=arr[i];
                  prev=arr[i];
              }  
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of Elements :");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements :");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int freqArr[]=new int[n];
        int keyArr[]=new int[n];
        int count=findUniqueElementsCount(keyArr,n,arr);
        for(int i=0;i<count;i++){
            freqArr[i]=0;
            for(int j=0;j<n;j++){
                if(keyArr[i]==arr[j]){
                    freqArr[i]+=1;
                }
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(keyArr[i] + " : Frequency is "+ freqArr[i]);
        }
        s.close();
    }
}