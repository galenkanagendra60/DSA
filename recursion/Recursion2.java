class Recursion2
{
   /*void printname(String name,int n,int count)
   {
       if(count==n)
         return;

        System.out.println(name);
        printname(name,n,count+1);
   }
   */
  // incremental numbers printing statement 
  /* void numbers(int n,int current)
  {
      if(current>n)
        return;
      System.out.println(current);
      numbers(n,current+1);
  }
  */
 // decremental numbers printing statement 
  void numbers(int current)
  {
      if(current<1)
        return;
      System.out.println(current);
      numbers(current-1);
  }

}