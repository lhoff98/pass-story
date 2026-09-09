public class PassTheStory
{
    public static void main (String[] args)
    {
        int MAXLINES = 20;
        String[] story = new String[MAXLINES];
        story[0] = "There once was a silly little goose named Bruce, " +
                "and he once dropped his flute, and his friends sang. 'what cha lose goose?'" +
                "and then ";
        story[1] = "a large dog appeared, wagging its tail, with a bone in its mouth; and then...";
        
        for(int i = 0; i < MAXLINES; i++)
        {
            if(story[i] != null) //skips null lines
            {
                System.out.println(story[i]);
            }
        }
    }
}
