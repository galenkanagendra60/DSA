import java.util.HashMap;
import java.util.Scanner;

public class fruitsinbasket {
    public static int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int maxlen = 0;
        for(int right=0;right<fruits.length;right++)
        {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2)
            {
                map.put(fruits[left],map.get(fruits[left])-1);

                if(map.get(fruits[left])==0)
                {
                    map.remove(fruits[left]);
                }

                left++;
            }

            int length = right - left + 1 ;
             
            maxlen = Math.max(maxlen,length);
        }
        return maxlen;
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] fruits = new int[n];
        for(int i=0;i<n;i++)
        {
            fruits[i]=sc.nextInt();
        }

        int result = totalFruit(fruits);
        System.out.println("Result :"+result);

    }
}
