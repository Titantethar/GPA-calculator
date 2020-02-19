import java.util.*;
/**
 * Write a description of class HangMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangMan
{

    public static void main()
    {
        String underline = "";
        int wrongguesses = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Word or Words? ");
        String Word = s.nextLine();   
        Word = Word.toLowerCase();
        System.out.println('\u000C');

        System.out.println(" -------------");
        System.out.println(" |           |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("___");
        
        
        for (int i = 0; i < Word.length(); i++)
        {
            if(Word.charAt(i) == ' ')
            {
                underline += " ";
            }
            else
            {
                underline += "_";
            } 
        }
        System.out.println("");
        char[] answer = underline.toCharArray();
        System.out.println(answer);

        while(underscoreCheck(answer))
        {
            System.out.println("Guess? ");
            String Guess = s.next().toLowerCase();
            char guess = Guess.charAt(0);
            boolean write = false;
            
            for (int i = 0; i < Word.length(); i++)
            {
                if(Guess.charAt(0) == Word.charAt(i))
                {
                    answer[i] = guess;
                    write = true;
                }
            }
            if(write == false)
            {
                System.out.println("You choose poorly.");
                wrongguesses ++;
            }
            if(wrongguesses == 1)
            {
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("___");
            }
            if(wrongguesses == 2)
            {
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |           |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("___");
            }
            if(wrongguesses == 3)
            {
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("___");
            }
            if(wrongguesses == 4)
            {
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |          |||");
                System.out.println(" |           |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("___");
            }
            if(wrongguesses == 5)
            {
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |          |||");
                System.out.println(" |           |");
                System.out.println(" |          | ");
                System.out.println(" |");
                System.out.println("___");
            }
            if(wrongguesses == 6)
            {
                System.out.println("You Lost, he hung.");
                System.out.println(" -------------");
                System.out.println(" |           |");
                System.out.println(" |          ( )");
                System.out.println(" |          |||");
                System.out.println(" |           |");
                System.out.println(" |          | |");
                System.out.println(" |");
                System.out.println("___");
                System.exit(1);
            }
            System.out.println("");
            System.out.println(answer);
        }
    }

    public static boolean underscoreCheck(char[] u)
    {
        for(char c: u)
        {
            if(c == '_')
            {
                return true;
            }
        }
        return false;
    }
    
}
