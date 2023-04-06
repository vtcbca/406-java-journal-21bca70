import java.util.Scanner;

public class CharacterThread implements Runnable 
{
	private char startChar;
    private char endChar;

    public CharacterThread(char startChar, char endChar) 
	{
        this.startChar = startChar;
        this.endChar = endChar;
    }

    @Override
    public void run() 
	{
        try 
		{
            for (char c = startChar; c <= endChar; c++) 
			{
                System.out.print(c + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting character: ");
        char startChar = scanner.next().charAt(0);

        System.out.print("Enter ending character: ");
        char endChar = scanner.next().charAt(0);

        CharacterThread characterThread = new CharacterThread(startChar, endChar);
        Thread thread = new Thread(characterThread);
        thread.start();
    }
}
