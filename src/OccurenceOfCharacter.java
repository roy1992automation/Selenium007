import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateString("aaassddccbbeee");
		
	}
	
	
	public static void duplicateString(String inputString)
	{
		
		String words[]=inputString.split("");
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		for(String word:words)
		{
			
			if(wordCount.containsKey(word))
			{
				wordCount.put(word,wordCount.get(word)+1);
				
				
			}
			else
			{
				wordCount.put(word,1);
				
			}
			
			
		}
		Set<String> wordInString=wordCount.keySet();
		for(String word:wordInString)
		{
			
			if(wordCount.get(word)>0)
			{
				
				System.out.println(word+":"+wordCount.get(word));
				
				
			}
			
		}
		
		
		
		
		
	}

}
