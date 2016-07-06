import javax.swing.*;

public class CardGame 
{
    public static void main(String[] args) 
    {
        int[] cards = new int[13];//for 10 numbers and for Jack, Queen and King
        for (int i =0; i < cards.length; i++) 
            {
              cards[i] = i;
            }
        String answer = "";
        int numberOfDivision = Integer.parseInt(JOptionPane.showInputDialog("Write the number of players."));
        if (numberOfDivision >5) 
           {
            JOptionPane.showMessageDialog(null, "Only 5 players can play!");
           } 
        else 
        {
          for (int i =0; i < numberOfDivision; i++) 
              {
               answer += "\n \n Player " + (i+1) + ": \n";
                for (int j = 0; j <5; j++) 
                    {
                      int card = (int)(Math.floor(13*Math.random()));//takes the floor of the random number
                      cards[card] = cards[card] + 1;
                      if (cards[card] - card > 4) 
                         {
                           j--;
                         }  
                      else 
                      {
                        answer += card + " ";
                      }
                   }
            }
        }
        System.out.println(answer);
    }
}