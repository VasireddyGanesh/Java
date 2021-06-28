
public class Demo1 {
    public static void fun(int []arr){
        arr=new int[4];
        arr[0]=4;
        arr[1]=3;
        arr[2]=3;
        arr[3]=4;
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int []ar=new int[4];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        fun(ar);
        for(int i:ar){
            System.out.println(i);
        }
    }
};
