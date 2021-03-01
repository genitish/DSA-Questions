import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        
        while(left<=right){
            int curr = left + 1;
            if(a[left] == 0){
                left++;
            }
            if(a[right] == 2){
                right--;
            }
            else if(a[curr] == 0 && a[left] == 1){
                int temp = a[left];
                a[left] = a[curr];
                a[curr] = temp;
                curr++;
                left++;
            }
            else if(a[curr] == 2 && a[right] == 1){
                int temp = a[right];
                a[right] = a[curr];
                a[curr] = temp;
                curr++;
                right--;
            }
            else{
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
