import java.util.*;
public class numbertostring
{
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String word ="",counterstring="";
        int length = line.length();
         char character2='\0';
        for(int i=0;i<length;i++)
   {
       char character=line.charAt(i);     
     if(Character.isDigit(character))
                  { 
     if(i<length-1&&Character.isDigit(line.charAt(i+1)))
                  {
                  char character3=line.charAt(i+1);
                      i=i+1;
                      counterstring =  Character.toString(character) + Character.toString(character3);
                      int counter2 =Integer.parseInt(counterstring);
                      for(int j=0;j<counter2-1;j++)
            {
               word =word+character2;
       }
                    }
                    else
                    {
           for(int j=0;j<character-'1';j++)
            {
               word =word+character2;
       }
      
                    }               
                }
                if(Character.isLetter(character))
                {
    word=word+character;
     character2=character;
}
}
        System.out.println(word);
}
}

