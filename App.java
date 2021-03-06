import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    public boolean running = true;

    CD evolve = new CD("Evolve", "Imagine Dragons", 2017, 10);
    CD grateful = new CD("Grateful", "DJ Khaled", 2017, 11);
    CD mackdaddy = new CD("Mack Daddy", "Sir Mix-A-Lot", 1992, 6);
    CD veggietunes = new CD("Veggie Tunes", "VeggieTales", 2005, 8);

    List<CD> allCD = new ArrayList<CD>();
    allCD.add(evolve);
    allCD.add(grateful);
    allCD.add(mackdaddy);
    allCD.add(veggietunes);

    while(running) {
      System.out.println("Welcome to our CD store, your options are: See all CD's, Max Release Year, Price, Artist, or Exit");
      String userInput = myConsole.readLine();

      if (userInput.equals("See all CD's")) {
        System.out.println("Here is a list of all our CD's:");
        for ( CD individualCD : allCD ) {
          System.out.println( "----------------------" );
          System.out.println( individualCD.mArtist );
          System.out.println( individualCD.mAlbum );
          System.out.println( individualCD.mYear );
          System.out.println( individualCD.mPrice );
        }
      } else if (userInput.equals("Max Release Year")) {
        System.out.println("What is the oldest album that you are looking for?");
        int userOldestYear = Integer.parseInt(myConsole.readLine());
        System.out.println("Alright, here's what we have in your year range:");
        for ( CD individualCD : allCD ) {
          if (individualCD.sortByYear(userOldestYear)) {
            System.out.println( "----------------------" );
            System.out.println( individualCD.mArtist );
            System.out.println( individualCD.mAlbum );
            System.out.println( individualCD.mYear );
            System.out.println( individualCD.mPrice );
          }
        }
      } else if (userInput.equals("Price")) {
        System.out.println("What is the highest price you are willing to spend?");
        int userPrice = Integer.parseInt(myConsole.readLine());
        System.out.println("Alright, here is a list of CD's in your price range:");
        for ( CD individualCD : allCD ) {
          if (individualCD.sortByPrice(userPrice)) {
            System.out.println( "----------------------" );
            System.out.println( individualCD.mArtist );
            System.out.println( individualCD.mAlbum );
            System.out.println( individualCD.mYear );
            System.out.println( individualCD.mPrice );
          }
        }
      } else if (userInput.equals("Artist")) {
        System.out.println("What artist would you like to see?");
        String userArtist = myConsole.readLine();
        System.out.println("Here is what we have from that artist:");
        for ( CD individualCD : allCD ) {
          if (individualCD.sortByPrice(userPrice)) {
            System.out.println( "----------------------" );
            System.out.println( individualCD.mArtist );
            System.out.println( individualCD.mAlbum );
            System.out.println( individualCD.mYear );
            System.out.println( individualCD.mPrice );
          }
        }
      } else if (userInput.equals("Exit")) {
        running = false;
      } else {
        System.out.println("Plese enter valid input");
      }
    }
  }
}
