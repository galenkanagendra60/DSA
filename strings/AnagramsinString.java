import java.util.*;

class AnagramsinString{
    public static  List<Integer> findAnagrams(String s, String p) {

        List<Integer>result = new ArrayList<>();

        if(p.length() > s.length())
        {
            return result ;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0;i<p.length();i++)
        {
            count1[p.charAt(i)-'a']++;
        } 
        int left=0;

        for(int right=0;right<s.length();right++)
        {
            count2[s.charAt(right) -'a']++;

            if(right-left+1>p.length())
            {
                count2[s.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(count1,count2))
            {
                result.add(left);
            }
        }

        return result;

    }
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the s string :");
        String s= sc.nextLine();
        System.out.println("Enter the p string :");
        String p= sc.nextLine();
        List<Integer> res = findAnagrams(s, p);

        System.out.println("result: ");
        System.out.println(res);
    }
}