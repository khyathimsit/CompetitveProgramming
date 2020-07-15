import java.util.*; 
  
class CommonDivisors  
{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        System.out.println(commonDiv(num1,num2));
    } 

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int commonDiv(int a,int b) 
    {  
        int n = gcd(a, b);  
        int result = 0; 
        for (int i=1; i<=Math.sqrt(n); i++) 
        {  
            if (n%i==0) 
            { 
                if (n/i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        return result; 
    } 
} 