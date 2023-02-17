import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** @author Matteo Zaramella*/

public class ConsoleReader
{ public ConsoleReader(InputStream inStream)
 { reader = new BufferedReader(new InputStreamReader(inStream));
 }


public int readInt()
 { int n = 0;
   boolean ok = false;
   do
     {  try
            { String inputString = readLine();
              n = Integer.parseInt(inputString);
              ok = true;
            }
         catch(NumberFormatException e)
            { System.out.println("\nERRORE, il dato inserito non e\u0027 numerico. Ridigita");
            }
     }
   while(!ok);
    return n;
 }



public double readDouble()
 { double n = 0;
   boolean ok = false;
   do 
     {  try
           { String inputString = readLine();
             n = Double.parseDouble(inputString);
             ok = true;
           }
        catch(NumberFormatException e)
           { System.out.println("\nERRORE, il dato inserito non e\u0027 numerico. Ridigita");
           }
     }
    while(!ok);
    return n;
 }





public char readChar() 
 { String inputLine=readLine();
   char inputChar=inputLine.charAt(0);
   return inputChar;
 }  


public String readLine()
 { String inputLine = "";

 try {
       inputLine = reader.readLine();
     }
 catch(IOException e)
     {
       System.out.println(e);
       System.exit(1);
     }
 return inputLine;
}
private BufferedReader reader;
}
