import java.io.Console;

public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();


     CD evolve = new CD("Evolve", "Imagine Dragons", 2017, 10);
     CD grateful = new CD("Grateful", "DJ Khaled", 2017, 11);
     CD mackdaddy = new CD("Mack Daddy", "Sir Mix-A-Lot", 1992, 6);
     CD veggietunes = new CD("Veggie Tunes", "VeggieTales", 2005, 8);

    CD[] allCD = {evolve, grateful, mackdaddy, veggietunes};

    System.out.println("What is the oldest album that you are looking for?");
         String stringUserOldestYear = myConsole.readLine();
       int userOldestYear = Integer.parseInt(stringUserOldestYear);

       System.out.println("Alright, here's what we have in your year range:");

  for ( CD individualCD : allCD ) {
    if (individualCD.lookingFor(userOldestYear)){
      System.out.println( "----------------------" );
       System.out.println( individualCD.mArtist );
       System.out.println( individualCD.mAlbum );
       System.out.println( individualCD.mYear );
       System.out.println( individualCD.mPrice );
    }
  }
}
}
