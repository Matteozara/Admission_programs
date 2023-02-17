import java.awt.*;
import java.awt.event.*;

class GestoreBottone implements ActionListener
{
	TextField t1,t2; //Variabili d'istanza 
	TextArea ar1; //Variabile d'istanza

	GestoreBottone(TextField txt1,TextField txt2,TextArea a1) //
	{	t1 = txt1;
		t2 = txt2;
		ar1 = a1;
	}

	public void actionPerformed(ActionEvent e)
	{	String commando,input,vuoto="";
		int numero=0;
		commando = e.getActionCommand();
		input=t1.getText();
	try{
		numero=Integer.parseInt(input);
			if(commando.equals("Vai"))
				{
				numero *=numero;
				t2.setText(""+numero);
		ar1.setText("Calcolo Eseguito");
				}
		}
	catch (NumberFormatException exception) 
	{t1.setText(vuoto);
	t2.setText(vuoto);
	ar1.setText("Caratteri inseriti non sono tutti numerici");
	}
	
	
	}}
	