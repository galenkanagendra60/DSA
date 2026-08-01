class Gcdofstring
{

    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings match in both orders
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The prefix of length gcdLength is the result
        return str1.substring(0, gcdLength);
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
