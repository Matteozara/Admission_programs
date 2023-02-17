/*
*/

class Temperature
{ public static void main(String[] args)
 { // dichiarazione
     ConsoleReader tastiera = new ConsoleReader(System.in);
     String[] province;
     int[] t_max;
     int[] t_min;
     int massimo = 0;
     int minimo = 0;
     int num = 0;
     String nome = "";
     int g = 0;
   // elaborazione
    do 
     { System.out.println("\nQuante province vuoi inserire? (max 20)");
       num = tastiera.readInt();
        if (num <= 0 || num > 20)
         System.out.println("\nIl numero di province deve essere positivo e minore di 20");
     }
    while(num <= 0 || num > 20);

   province = new String[num];
   t_max = new int[num];
   t_min = new int[num];

   for(int i = 0; i < province.length; i++)
    { do 
       { System.out.println("\nInserisci il nome della " + (i+1) + " provincia");
        nome = tastiera.readLine();

       if (nome.length() > 0)
      province[i] = nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase();
       else 
       System.out.println("\nERRORE, non hai inserito nulla");
       g = nome.length();
       }
       while(g <= 0);

      System.out.println("\nInserire la temperatura massima");
      t_max[i] = tastiera.readInt();

      System.out.println("\nInserire la temperatura minima");
      t_min[i] = tastiera.readInt();

      }


     for(int i = 0; i < province.length; i++)
      {  System.out.println("\nNome provincia: " + province[i] + " \nTemperatura massima: " + t_max[i] + " \nTemperatura minima : " + t_min[i]);

      }

    System.out.println("\nFINE ELABORAZIONE");
   }
}
