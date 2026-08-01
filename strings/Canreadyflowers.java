class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        for(int i=0;i<size;i++)
        {  
            // checking the plot is empty
            if(flowerbed[i]==0)
            {
                // check the left plot is empty or not
              Boolean leftEmpty = (i==0)||(flowerbed[i-1]==0);
              // check the right plot is empty or not 
              Boolean rightEmpty = (i==size-1)||(flowerbed[i+1]==0);
              if(leftEmpty && rightEmpty)
              {
                flowerbed[i]=1;
                n--;
                if(n<=0)
                {
                    return true;
                }
              }
              

            }
        }
        return n<=0;
        
    }
}