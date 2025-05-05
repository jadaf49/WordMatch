public class WordMatch
{
    private String secret;
    public WordMatch(String word)
    {
        secret=word;
    }
    public int scoreGuess(String guess)
    {
        int score=0;
        int length = guess.length();
        for (int i=0;i<=secret.length()-length;i++)
        {
            if ((secret.substring(i,i+length)).equals(guess))
            {
                score++;
            }
        }
        return (score*length*length);
    }

    public String findBetterGuess(String guess1, String guess2)
    {
        if (scoreGuess(guess1)>scoreGuess(guess2)) return guess1;
        if (scoreGuess(guess2)>scoreGuess(guess1)) return guess2;
    } 

}