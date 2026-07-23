import java.util.HashSet;
import java.util.Set;

class HashsetExample 
{
    public static void main(String[] args)
    {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("greaps");
        fruits.add("apple");
        System.out.println("ALL THE FRUITS: ");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}