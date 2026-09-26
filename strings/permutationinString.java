import java.util.Scanner;

public class permutationinString {
    public static  boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
        {
            return false ;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            count1[s1.charAt(i) -  'a']++;
        }

        int windowsize = s1.length();

        for(int i=0;i<s2.length();i++)
        {
            count2[s2.charAt(i) - 'a']++;
            if(i>=windowsize)
            {
                count2[s2.charAt(i-windowsize) - 'a']--;
            }

            if(java.util.Arrays.equals(count1,count2))
            {
                return true;
            }
        }
        return false; 
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s1  : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string s2  :");
        String s2 = sc. nextLine();

        boolean result = checkInclusion(s1, s2);
        System.out.println("Result :"+result );

    }
}
