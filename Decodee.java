import javax.swing.*;
public class Decodee
 { public static void main(String[] args)
   { int[] code = new int[27];
//This is the translation table:   
// code[0] holds code for ' ',
// code[1] holds code for 'a',
// code[2] holds code for 'b', etc.
     int seed = new Integer(JOptionPane.showInputDialog("Write the seed number (an integer please): ")).intValue();
     code[0] = seed; 
     for ( int i = 1; i!=code.length; i = i + 1 )
        { code[i] = (int)((code[i-1] * 2) + 1); } 
          String answer = "";
          boolean processing = true;
     while ( processing )
           { String input = JOptionPane.showInputDialog("Write an integer number to decode " + "(or nothing, to stop): ");
             if ( input.equals("") )
                { processing = false; }
             else { char c = decode(code, new Integer(input).intValue());
                    answer = answer + c;
                  }
           }
  System.out.println(answer);
   }
/** decode translates a code (an integer number) in a character
* @param code - the array that holds codes for ' ', 'a', 'b', ..., 'z'
* @param i - the integer number that is being decoded
* @return  the corresponding character, or '*' if the number can't be decoded */
  private static char decode(int[] code, int i)
  { char c = '!';
    boolean found = false;
    int index = 0;
    while ( !found && index != code.length )
          { if ( code[index] == i )
               { found = true;
                 if ( index == 0 )
                    { c = ' '; }
                 else { c = (char)(index + 'a' - 1); }
               }
            else { index = index + 1; }
          } 
    return c;
  }  
}