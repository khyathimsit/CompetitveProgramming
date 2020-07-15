import java.util.*; 
  
class ReducedArray  
{ 
    public static void convert(int arr[], int n) 
    {  
        int temp[] = arr.clone(); 
        Arrays.sort(temp); 
        HashMap<Integer, Integer> umap = new HashMap<>(); 
        int val = 0; 
        for (int i = 0; i < n; i++) 
            umap.put(temp[i], val++); 
        for (int j = 0; j < n; j++) 
            arr[j] = umap.get(arr[j]); 
        for (int k = 0; k < n; k++) 
            System.out.print(arr[k] + " "); 
    } 
  
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        convert(arr,n);
    } 
} 