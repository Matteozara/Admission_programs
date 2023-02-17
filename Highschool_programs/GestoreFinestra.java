/* Classe GestoreFinestra.java
Descrizione: Classe che implementa l'Iterfaccia WindowListener
	ascoltatore di eventi ossia che definisce per ogni evento
	predefinito in WindowListener quali operazioni eseguire.
Autore: Mirco Cogato
Release: 0.1.0   Data: 9/11/2015
*/

import java.awt.*;
import java.awt.event.*;

class GestoreFinestra implements WindowListener {
	/*Tutti i seguenti metodi devono essere presenti
	anche se non contengono istruzioni in quanto
	previsti dall'interfaccia WindowListener
	In tal caso GestoreFinestra implementa il modello
	WindowListener. QUI I PUBLIC vanno usati*/
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);  //Chiusura finestra
	}
}
