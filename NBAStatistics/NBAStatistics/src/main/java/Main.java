import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//sabonis, coby white, mikal bridges, durant, dejonte, edwards, davis, tatum, reaves, maxey
public class Main {
  
  public static void main(String[] args) {
    
    List players[] = new List[200];
    String playerNames[] = new String[200];
    List players2[] = new List[200];
    String playerNames2[] = new String[200];

    Scanner fin = null;
    try {
      fin = new Scanner(new File("src/main/java/craftedThisSeason.txt"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Oops! Couldn't find file.");
      System.exit(0);
    }
    Scanner lst = null;
      try {
        lst = new Scanner(new File("src/main/java/referenceLastSeason.txt"));
      }
      catch (FileNotFoundException e)
      {
        System.out.println("Oops! Couldn't find file.");
        System.exit(0);
      }
    for(int i = 0; i < 99; i++)
      {
        fin.nextLine();
        playerNames[i] = fin.nextLine();
        fin.nextLine();
        fin.next();
        fin.next();
        String gamesPlayed = (fin.next());
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        fin.next();
        String freeThrowPercentage = (fin.next());
        fin.next();
        fin.next();
        String reboundsPerGame = (fin.next());
        String assistsPerGame = (fin.next());
        fin.next();
        fin.next();
        fin.next();
        String pointsPerGame = (fin.next());
        
        if (i < 98){fin.next();}

        List<String> pStats = new ArrayList<String>();
        pStats.add(gamesPlayed);
        pStats.add(pointsPerGame);
        pStats.add(reboundsPerGame);
        pStats.add(freeThrowPercentage);
        pStats.add(assistsPerGame);
        players[i] = pStats;
      }
    for(int j = 0; j < 99; j++){
      int jplus = j + 1;
      System.out.println("[" + jplus + "]" + playerNames[j]);
    }
    for(int k = 0; k < 92; k++){
      //System.out.println(k);
      lst.next();
      String firstName = lst.next();
      String lastName = lst.next();
      //System.out.println(lastName);
      if (k > 0 && (firstName + " " + lastName).equals(playerNames2[k-1])) 
      {
          lst.nextLine();
          lst.nextLine();
          lst.next();
          firstName = lst.next();
          lastName = lst.next();
      }
      playerNames2[k] = firstName + " " + lastName;
      lst.next();
      lst.next();
      lst.next();
      String gamesPlayed2 = (lst.next());
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      String freeThrowPercentage2 = (lst.next());
      float oReb = Float.parseFloat(lst.next());
      float dReb = Float.parseFloat(lst.next());
      String reboundsPerGame2 = String.valueOf(oReb + dReb);
      lst.next();
      String assistsPerGame2 = lst.next();
      lst.next();
      lst.next();
      lst.next();
      lst.next();
      String pointsPerGame2 = lst.next();
      if (k < 92){lst.nextLine();}
      List<String> pStats2 = new ArrayList<String>();
      pStats2.add(gamesPlayed2);
      pStats2.add(pointsPerGame2);
      pStats2.add(reboundsPerGame2);
      pStats2.add(freeThrowPercentage2);
      pStats2.add(assistsPerGame2);
      players2[k] = pStats2;
    }
    for(int m = 0; m < 92; m++){
      int mplus = m + 1;
      System.out.println("[" + mplus + "]" + playerNames2[m]);
    }
    
    List ultimateList[] = new List[200];
    for(int h = 0; h < 99; h++)
      {
        for(int t = 0; t < 92; t++)
          {
            if(playerNames[h].equals(playerNames2[t]))
            {
              ultimateList[h] = players[h];
              ultimateList[h].add(players2[t]);
              ///this where we left off
            }
          }
      }
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the number of the player you would like to see: ");
     int userChoice = userInput.nextInt();
    System.out.println(playerNames[userChoice-1]);
    System.out.println("Games Played: " + players[userChoice-1].get(0));
    System.out.println("Points: " + players[userChoice-1].get(1));
    System.out.println("Rebounds: " + players[userChoice-1].get(2));
    System.out.println("Free Throw Percentage: " + players[userChoice-1].get(3));
    System.out.println("Assists: " + players[userChoice-1].get(4));
    } 
  }

