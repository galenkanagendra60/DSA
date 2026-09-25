import java.util.*;


class longestrepeatingchar {
    public  static int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];

        int left = 0;
        int maxFeq = 0;
        int maxlength = 0;
        for(int right = 0;right < s.length();right++)
        {
            freq[s.charAt(right) - 'A']++;

            maxFeq = Math.max(maxFeq,freq[s.charAt(right)-'A']);

            int replace = (right - left + 1) - maxFeq;

            if(replace > k )
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxlength = Math.max(maxlength,right - left + 1);

        }
        return maxlength;
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String  s = sc.nextLine();
        System.out.println("Enter the k value");
        int k = sc.nextInt();
        
        int longestrepfreq = characterReplacement(s, 0);
        System.out.println("longestrepfreq :"+longestrepfreq);



    }
}