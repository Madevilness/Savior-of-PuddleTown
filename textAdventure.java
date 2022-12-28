

/*
 *  @version 1, 12/22/2022
 *  and prone to types :).
 * 
 *  HOW TO RUN
 *  1. Compile file to machine code (binary)
 *  i.e. javac textAdventure.java (jave + compile_)
 * 
 *  2. Run!
 *  i.e. java textAdventure
 */
import java.util.Scanner;  
public class textAdventure 
{ 
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        int choice;

        System.out.println("\n\t\t\tSavor of PuddleTown\n\t\t\tPress Enter to Progress");
        print(scan, "King", "I am King Narrator, Ruler of PuddleTown and named by my father Mr. Plot-Convinence!");
        print(scan, "King", "My daughter Princess Plot-Holes has been kidnap by the evil dragon, Lord Villian-Character.");
        print(scan, "King", "Because of this horror, we are in needs of a strong hero like yourself.");
        
        // Enter Player Name
        System.out.println("King: Tell me, what is your name young lad?"); 
        System.out.print("> Player Name: ");
        String playerName = scan.nextLine();
        // Auto-capitalize first char of playerName
        playerName = (playerName.substring(0, 1).toUpperCase()) + playerName.substring(1);
        System.out.println("");

        print(scan, "King", "Welcome, " + playerName + ", to the wonderous world of PuddleTown!");
        print(scan, "King", "Are you ready to save the world and my *super* hot daugher?");
        choice = options(scan, "Heck yeah!", "Nah, not feeling it", "Will I get paid?");
    
        // Option 3: Will I get paid?
        // will put a flat out NO and just reprompts the user indefinately. 
        while (choice == 3)
        {
            print(scan, "King", "No.\n");
            choice = options(scan, "Heck yeah!", "Nah, not feeling it", "Will I get paid?");
        }
        // Option 2: Nah, not feeling it (ENDING 1: WUSSY CAT!)
        if (choice == 2)
        {
            print(scan,"King","Welp, frick you too!\n");
            print(scan, "You flee from PuddleTown while your tailbone grows with shame...");
            print(scan, "Your tail lengthened to the point that you finally noticed that you even have a tail");
            print(scan, " and realized that you are extremely fluffy.");
            print(scan, "A Wussy Cat");
            System.out.println("\t\tBAD END 1: Wussy Cat");
            System.exit(0);
        }
        
        // Will run when player pickes Option 1: Heck Yeah!
        print(scan,"King", "Great! Just climb that omminus looking tower over there to begin!\n");
        print(scan, "You noticed that your journey begins.. right in the center of PuddleTown.");
        print(scan, "You glanced over the tower to your left and it's towerly goodness.");
        print(scan, "It was all bricks and stones that was loosely constructed.");
        print(scan, "Climbing it may be dangerous.");
        System.out.println("\n    |>>>\n    |\n    |\n|;|_|;|_|;|\n\\\\.    .  /\n\\\\:  .  /\n||:   |\n ||:.  |\n||:  .|");

        choice = options(scan, "Climb it.", "Break the wall and create an entrance", "Search for secret passage ways");
        boolean upstairs = false;
        boolean downstairs = false;
        switch(choice)
        {
            //Option 1: Climbing the Tower (BAD END 2: DEATH BY JENGA)
            case 1:
                print(scan, "Regardless of the dangers, you boldly climb the suspicious tower.\n");
                print(scan, "With your bare hands you gripped onto one brick and another with your other hand.");
                print(scan, "After a few stories up the fragil walls, you feel the bricks loosen like a cruel game of Jenga.");
                print(scan, "You lost grip, and you slip.");
                print(scan, "Pieces began to fall along with your corpse.");
                System.out.println("\t\tBAD END 2: DEATH BY JENGA");
                System.exit(0);

            //Option 2: Break the wall and create an entrance
            case 2:
                print(scan, "You noticed the dangers of climbing it, so you decided against it.\n");
                print(scan, "If you are the hero of this story, might as well do it in style.");
                print(scan, "You convientanly find a sledge hammer and made an ambitous swing against the walls");
                print(scan, "Debris tumbles down but due to your bravery you were able to survive.");
                print(scan, "Coming into the new entance, you find stairs leading up indefinately, but you also find what appears to be a bunker leading to below.");
                choice = options(scan, "Go Upstairs", "Go Downstairs");
                // Option 2a: Upstairs
                if (choice == 1)
                {
                    // Will eventually connect to Option 3 (line 117)
                    upstairs = true;
                   break; 
                }
                // Option 2b: Downstairs
                else
                {
                    // TK
                    downstairs = true;
                    break;
                }
            // Option 3: Find a secret entrance
            case 3:
                print(scan, "You know you are better than this, so you try to play smart.\n");
                print(scan, "After a not-so-thorough investigation, you find the front door of the tower.");
                print(scan, "You find the keys under the doormat and unlocked the door to find a myraid of stairs.");
                upstairs = true;
                break;
        }
        // Only accessible via case Options 2a or 3
        if (upstairs)
        {
            print(scan, "To get it over with, you climb the stairs.\n");
            print(scan, "Each step becomes increasingly heavier the more steps you take.");
            print(scan, "Eventually, you made it to the very end to find a rosewood door with a strong floral fragrance.");
            print(scan, "You knock to door to find a young woman with heavy perfume on the other side.");
            print(scan, " She gives the sense of royality and arrogance.");
            print(scan, "However, her room is awfully messy with pieces of fabric and clothing scattered across the floor.");
            print(scan, "Could this be the Princess?");
            choice = options(scan, "Slay", "Interrogate");
            // Option 1: Slay
            if (choice == 1)
            {
                print(scan, "Without question, you take a swing at the young woman.\n");
                print(scan, "With a convientent sledge hammar you happen to have, you aimed for temple. ");
                print(scan, "As you feel the weight of your shoulders release, your arms twists and becomes disfigured...");
                print(scan, "???", "I had high hopes for you, " + playerName );
                System.out.println("\t\tBAD END 3: WEAK HIT");
                System.exit(0);
            }
            // Option 2: Interrogate
            print(scan, "What will you ask?");
            // Will prompt the user to ask both the questions before continuing.
            boolean[] boolChecks = {false, false};
            while(!(boolChecks[0] && boolChecks[1]))
            {
                choice = options(scan, "Who are you?", "How did you get here?");
                // Who are you?
                if(choice == 1)
                {
                    System.out.println("> \"Who Are you?\"");
                    print(scan, "She smirks.");
                    print(scan, "???", "Princess Villian-Character.");
                    boolChecks[0] = true;
                }
                // How did you get here?
                if(choice == 2)
                {
                    System.out.println("> \"How did you get here?\"");
                    // If the player knows her name (Line 193)
                    if (boolChecks[0])
                    {
                        print(scan, "Princess Villian-Character", "I live here of course! Here to cause trouble on PuddleTown as always!");
                    }
                    // If name is unknown
                    else
                    {
                        print(scan,"???", "I live here of course! Here to cause trouble on PuddleTown as always!");
                    }
                    boolChecks[1] = true;
                }
            }
            print(scan, "Something seems wrong.");
            print(scan, "Although the room is pampered in luxerious clothing, nothing about her shows a heart of gold.");
            print(scan, "Something tells you she is the 'real deal'. She knows you are onto her.");
            print(scan, "She grabs her fancy louis vuitton bag and swings it like a blunt object.");
            print(scan, "Due to your bad luck with women though, you dodge and managed to tackle her when you have the chance.");
            
            choice = options(scan, "Kill", "Spare");
            switch(choice)
            {
                // Option 1: Kill (BAD END 4:  Fruitless Hassle)
                case 1:
                    print(scan, "Like a champ, you slay the woman.\n");
                    print(scan, "Blood splatters all over the rich carpets and luxery clothes on the floor");
                    print(scan, "With nothing but a dead body and redden raiments, you are suddenly lost");
                    print(scan, "\"Where's the Princess?\", You asked.");
                    print(scan, "You returned to PuddleTown, not as a hero, but as a murderer.");
                    System.out.println("\t\tBAD END 4: Fruitless Hassle");
                    System.exit(0);
                
                // Option 2: Spare.
                case 2:
                    print(scan, "Rather than killing her, you used the many garments on the floor to tie her up.\n");
                    print(scan, "\" Where is the princess? \", You demanded sternly.");
                    print(scan, "Downstairs in the dungeon! She cried.");
                    print(scan, "After ensuring the woman cannot escape, you went down the vexatious stairs to find a bunker leading below.");
                    break;
            }

        }
        print(scan, "You enter the bunker to find a grotesque dungeon with an even more ludicrous stench.\n");
        print(scan, "Moss leeched on the walls while the mold dominates the floor. Each step was moist as the water sunk into your boots.");
        print(scan, "\"Just how long the princess was living here?\" You asked.");
        print(scan, "In a sea of iron bars, you found a dragon wrapped in chains.");
        
        // The Dragon is only romancable if the player goes downstairs initially.
        if(downstairs)
        {
            choice = options(scan, "Slay", "Flirt", "Interrogate");
        }
        // Forces the player to pick option 3 if they went upstairs.
        if(upstairs)
        {
            choice = 3;
        }
        boolean dragonRoute[] = {false, false, false};
        switch(choice)
        {
            // Option 1: Slay (BAD END 5: YOU HAD ONE JOB)
            case 1:
                print(scan, "You slay the dragon.");
                print(scan, "In its cries, it yelp in a surprisingly feminine voice.");
                print(scan, "You feel a boast of courage as you slain the beast, and chop its head as a reward.");
                print(scan, "As you chopped off its head, you noticed it was wearing a necklace.");
                print(scan, "\"Princess Plot-Holes\" it said.");
                System.out.println("\t\tBAD END 5: YOU HAD ONE JOB");
                System.exit(0);
            // Option 2: Flirt
            case 2:
                print(scan, "Dragon", "You see a locked dragon and that's your first instinct?");
                print(scan, "Dragon","I could understand you humans ///");
                print(scan, "The dragon complained in a surprisingly feminine voice.");
                print(scan, "Despite her remarks, you can somehow see her scale-y cheeks flush with red.");
                dragonRoute[0] = true;
                // Connects to option 3
                break;
        }
        // Option 3: Interrogate. Will skip the additonal flirt dialouge.
        print(scan, "\" Who are you?\"");
        print(scan, "Dragon", "Princess Plot-Holes. My father adopted me when I was still in the egg. Despite being a dragon, I consider myself very much human.");
        print(scan, "\" Why are you here?\"");
        print(scan, "Princess Plot-Holes", "I was kidnapped obviously! I don't remember it quite well but all I remember was smelling a strong fragrance that made me gag, and an old witch took me away!");
        print(scan, "Princess Plot-Holes", "If you don't believe me, please take this");
        print(scan, "She hands you a golden necklace with the lettering \"Princess Plot-Holes\"");
        print(scan, "It also contains a photo of the dragon with the king");
        print(scan, "With the royal family emblem embedded into the back of the locket.");
        print(scan, "There doesn't appear to be anyone else in the dungeon.");
        print(scan, "If what she said was true, she really may be the princess.");

        choice = options(scan, "Abandon", "Freedom");
        // Option 1: Abandon (BAD END 6: PLAIN DISCRIMINATION)
        if (choice == 1)
        {
            print(scan, "You thought, \"There is no way she is the princess\"\n");
            print(scan, "\" I mean, in what world is the evil dragon the princess!\"");
            print(scan, "\" A dragon could never be the princess\"");
            print(scan, "You left the dragon without further question.");
            print(scan, "You searched the tower, and could not find anyone else who could possibly be the princess.");
            print(scan, "You returned to PuddleTown empty-handed");
            System.out.println("\t\tBAD END 6: PLAIN DISCRIMINATION");
            System.exit(0);
        }
        // Option 2: Freedom
        print(scan, "You free the dragon.\n");
        dragonRoute[1] = true;
        print(scan, "You found the not-so-hidden key on the counter and open the cellar.");
        print(scan, "The two of you book it outside and suddenly you found yourself in the middle of no where.");
        print(scan, "Princess Plot-Holes", "Don't worry, I got this.");
        print(scan, "She pulled out her wings and picked you up to great heights.");
        print(scan, "The two of you flew across the warm skies to Puddletown.");
        print(scan, "Upon landing, the dragon took a deep breathe,");
        print(scan, "And transformed into a human girl!");
        choice = options(scan, "You look better as a human.", "You look great!");
        switch (choice)
        {
            case 1:
                print(scan, "Princess Plot-Holes", "I could have you hanged for slander against the royal family.");
            case 2:
                print(scan, "Princess Plot-Holes", "Oh- Uh- Thanks...\n");
                print(scan, "She turned her head away.");
                print(scan, "However, from what you can see, you see a dash of pink in her cheeks.");
                dragonRoute[2] = true;
        }
        if(dragonRoute[0] && dragonRoute[1] && dragonRoute[2])
        {
            print(scan,"Princess Plot-Holes" , "You know what, "+ playerName + ". I like you.");
            choice = options(scan, "We can be something more.", "I think you're amazing too.");
            if(choice == 1)
            {
                print(scan, "Her eyes widen in surprise\n");
                print(scan, "Princess Plot-Holes" , "Close your eyes...");
                print(scan, "You feel a warm sensation on your lips.");
            }
            else
            {
                print(scan, "You feel like you and the Princess will become great friends from this point forward.");
            }
        }
        print(scan, "King", "Welcome back laddy!");
        print(scan, "King", "I will now bestow you the title,");
        print(scan, "King", "Hero of PuddleTown!");
        scan.close();
    }
    /*
     * Options(1, 2, 3): print out a set of options and returns user choice
     * 
     * @param scan      passes the Scanner object to options() 
     * @param option1   The following lists the available options to the player in the set format
     * @param option2
     * @param option3
     * @return x        returns the option number choice from the user
     */
    public static int options(Scanner scan, String option1, String option2, String option3)
    {
        System.out.println("Please type the corresponding number:");
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        
        // Will continue to prompt the user until choice is within range
        int x = 0;
        while (!(x >= 1 && x <= 3))
        {
            System.out.print("> ");
            x = scan.nextInt();
            System.out.println("");
        }
        return x;
    }

    /*
     * Options(1, 2):   print out a set of options and returns user choice
     * 
     * @param scan      passes the Scanner object to options() 
     * @param option1   The following lists the available options to the player in the set format
     * @param option2
     * @return x        returns the option number choice from the user
     */

    public static int options(Scanner scan, String option1, String option2)
    {
        System.out.println("Please type the corresponding number:");
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        
        // Will continue to prompt the user until choice is within range
        int x = 0;
        while (!(x >= 1 && x <= 2))
        {
            System.out.print("> ");
            x = scan.nextInt();
            System.out.println("");
        }
        return x;
    }
    /*
     * print(scan, Character name, Text):  Text for character dialouge format and waits for enter key
     *  
     * @param scan      passes the Scanner object to print() in order to 'wait for enter'
     * @param character Insert character name to indicate who is speaking
     * @param text      Insert character's speech  
     */
    static void print(Scanner scan, String character, String text)
    {
        System.out.println(character + ": \"" + text + "\"");
        // Waits for user to press enter 
        String pressEnter = scan.nextLine();
        // Quick way to end the program for debugging purposes
        if (pressEnter.equals("--"))
        {
            System.out.println("Exiting program.");
            System.exit(-1);
        }
    }/*
     * print(scan, text):  prints 'Narrator' dialouge and waits or inter
     *  
     * @param scan      passes the Scanner object to print() in order to 'wait for enter'
     * @param text      Insert narrator's dialouge
     */
    static void print(Scanner scan, String text)
    {
        System.out.println("> " + text);
        // Waits for user to press enter
        String pressEnter = scan.nextLine();
        // Quick way to end the program for debugging purposes
        if (pressEnter.equals("--"))
        {
            System.out.println("Exiting program.");
            System.exit(-1);
        }
    }
}

