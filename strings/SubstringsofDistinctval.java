import java.util.Scanner;

class SubstringsofDistinctval {
    public static  int countGoodSubstrings(String s) {

        int count =0;
        for(int i=2;i<s.length();i++)
        {
            char a = s.charAt(i-2);
            char b = s.charAt(i-1);
            char c = s.charAt(i);
            if(a!=b && b!=c && c!=a)
            {
                count++;
            }
        }

        return count;
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String :");
        String s = sc.next();
        
        int count = countGoodSubstrings(s);
        System.out.println("Count :"+count);

    }
}