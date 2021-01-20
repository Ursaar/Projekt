package HRA;

import java.util.Scanner;

public class Hra {
    
    private Player p1;
    private Player p2;
    private Player p3;
    private Cards cards;
    private int score;
    
   
   public void Menu(){
       System.out.println("Tarot Cards of Fate");
       System.out.println();
       System.out.println("MAIN MENU");
       System.out.println();
       System.out.println("(1)New Game");
       System.out.println("(2)Start Round");
       System.out.println("(3)How to play?");
       System.out.println("(4)End Game?");
      }
   public void selectGameOption(int O){
       switch(O){
           case 1:
               this.startGame();
               break;
           case 2:
               this.playOneRound(p1);
               this.playOneRound(p2);
               this.playOneRound(p3);
               break;
           case 3:
               this.gameInstruction();
               break;
       }
       }
    public void startGame(){
       String p1Name;
       String p2Name;
       String p3Name;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Zadajte meno hráča 1:");
       p1Name = scanner.nextLine();
       System.out.print("Zadajte meno hráča 2:");
       p2Name = scanner.nextLine();
       System.out.print("Zadajte meno hráča 3:");
       p3Name = scanner.nextLine();
       
       p1 = new Player(p1Name);
       p2 = new Player(p2Name);
       p3 = new Player(p3Name);
       cards = new Cards();
      }
    
       public void playOneRound(Player p){
           
       int result;
      
               

       int FirstCardDraw = cards.drawCard();
       int ScndCardDraw = cards.drawCard();
       if(FirstCardDraw == ScndCardDraw){
           result = (FirstCardDraw + ScndCardDraw);
          p.setTotalScore(result);
           System.out.printf("%s vybral kartu %d , "
                    + " ktorá má %d bodov ,"
                    + " skóre teraz je %d bodov",
                   p.getName(),FirstCardDraw,ScndCardDraw,result,p.getTotalScore()
            );
           
        }
    else{
             result = (FirstCardDraw + ScndCardDraw);
             p.setTotalScore(result);
             System.out.printf("%s vybral kartu %d"
                    + "ktorá má %d bodov,"
                    + "skóre teraz je %d bodov",
                    p.getName(),FirstCardDraw,ScndCardDraw,result,p.getTotalScore()
             );  
        } 
   System.out.println();
}

    void gameInstruction() {
        System.out.println();
        System.out.println("3 hráči si zvolia mená");
        System.out.println("Potiahnu 2 karty");
        System.out.println("Spočíta sa ich skóre");
        System.out.println("Vyhráva hráč s najväčším počtom bodov");
    }

        
public static void main(String[] args) {

        Hra game = new Hra();
        
        int optionSelected;
        
        while(true){
          game.Menu();
          System.out.println();
          Scanner sc = new Scanner(System.in);
          optionSelected = sc.nextInt();
          game.selectGameOption(optionSelected);


          
        
        while(optionSelected > 4 || optionSelected < 0){
               System.out.print("Zadaj opäť číslo od 1 po 4:");
               optionSelected = sc.nextInt();       
}

        
        if (optionSelected == 4){
             System.out.println("Koniec hry");
             break;
}
}
}
}

