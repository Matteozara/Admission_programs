/*Scopo: Comunicare il nome del mese dopo aver inserito il numero,
 *Del nome del mese si conserva la prima lettera,
 *per gennaio la lettera e\u0027 maiuscola,
 *per giugno e\u0027 minuscola,
 *per aprile e\u0027 maiuscola,
 *per agosto e\u0027 minuscola
 *Autore:Marco Benetello
 *Classe:3^Bs
 *Data:15/01/15
 */



class LettereNumero

{public static void main (String[]asas)
 {//dichiarazone delle risorse


       int num = 0;//numero
       char mese = '\u0000';//mese in lettere
       String nome = "";

ConsoleReader tastiera = new ConsoleReader (System.in);

//input

   System.out.println("Digita il mese in lettere");
   nome = tastiera.readLine ().trim().toLowerCase();
   if (nome.compareTo("gennaio")!=0||   
    (nome.compareTo("febbario")!=0||
    (nome.compareTo("marzo")!=0|| 
    (nome.compareTo("aprile")!=0|| 
    (nome.compareTo("maggio")!=0|| 
    (nome.compareTo("giugno")!=0|| 
    (nome.compareTo("luglio")!=0|| 
    (nome.compareTo("agosto")!=0|| 
    (nome.compareTo("settembre")!=0|| 
    (nome.compareTo("ottobre")!=0|| 
    (nome.compareTo("novembre")!=0|| 
    (nome.compareTo("dicembre")!=0|| 
     nome = "z" + nome;

//elaborazione

   mese = nome.charAt(0);
if (nome.equals("gennaio") || nome.equals("aprile") || nome.equals("marzo"))
   mese = (char)(mese - ('a' - 'A'));


switch(mese)


   { case 'G'  :{num = 1; break;}
    case 'f'   :{num = 2; break;}
    case 'M'   :{num = 3; break;}
    case 'A'   :{num = 4; break;}
    case 'm'   :{num = 5; break;}
    case 'g'   :{num = 6; break;}
    case 'l'   :{num = 7; break;}
    case 'a'   :{num = 8; break;}
    case 's'   :{num = 9; break;}
    case 'o'   :{num = 10; break;}
    case 'n'   :{num = 11; break;}
    case 'd'   :{num = 12; break;}
    default    :{num = 99; break;}
   }

//comunicazione

if(num == 99)
System.out.println("\nERRORE;il nome del mese non e\u0027 previsto");
System.out.println("\nIl mese inserito e\u0027" + nome + " e pertanto il suo numero e\u0027 " + num );

 }
}





