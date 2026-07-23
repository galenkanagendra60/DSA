import java.util.HashMap;
class CountExample
{
    public static void main(String[] args) {
        String sentence = " nagendra is b-tech 3rd year student ";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> wordcount =new HashMap<>();
        for(String word : words)
        {
            if(wordcount.containsKey(word))
            {
                wordcount.put(word,wordcount.get(word)+1);
            }
            else
            {
                wordcount.put(word,1);
            }
        }
        System.out.print("WORD FREQUENCY :");
        for(String word:wordcount.keySet())
        {
          System.out.println(word+":"+wordcount.get(word));
        }
        }
            
    }