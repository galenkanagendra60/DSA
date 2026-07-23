import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args)
    {
        List<String> name = new ArrayList<>();
        name.add("nagendra");
        name.add("vamshi");
        name.add("lokedh");
        name.add("karun");
        name.add("gadaboina");
        System.out.println("ALL THE NAMES WHICH ARE LISTED :");
        for(String names : name)
            {
                System.out.println(names);
                
            } 
    }
}
