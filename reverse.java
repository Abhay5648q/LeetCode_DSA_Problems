import java.util.ArrayList;


public class reverse {
    public static int subsequences(int i,int s,ArrayList<Integer>list,int arr[],
    int n,int sum,int count){
    
        if(i==n){
           if(s==sum){
            System.out.println(list);
          return 1;
           }
           
           else return 0;

        }
        
        list.add(arr[i]);
        s+=arr[i];
      int left= subsequences(i+1,s, list, arr, n,sum,count);
        list.remove(list.size()-1);
        s-=arr[i];
      int right=  subsequences(i+1,s, list, arr, n,sum,count);
        return left+right;
    }
    public  static void main(String args[])
    {
        // System.out.println("enter n");
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int rev=0;
        // while(n>0)
        // {
        // int last_digit=n%10;
        //  rev=(rev*10)+last_digit;
        //  n=n/10;
        // }
        // System.out.print(rev);
        // sc.close();
        int arr[]={1,2,1};
        int sum=2;
        int n=arr.length;
         int count=0;
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(subsequences(0,0, list,arr, n,sum,count));
    }
        
        
}
