import java.awt.*;

class Compito {
	public static void main(String []args){
		Frame f = new Frame ("Finestra");
		Panel p1 = new Panel();
		Label l1 = new Label("NUMERO INSERITO",Label.CENTER);
		Label l2 = new Label("NUMERO RESTITUITO",Label.CENTER);
		TextField txt1 = new TextField(50);
		TextField txt2 = new TextField(50);
		TextArea a1 = new TextArea("Inserisci un numero intero");
		Button b = new Button("Vai");
		
		f.setLayout(new GridLayout(3,1));
		p1.setLayout(new GridLayout(2,2));
		
		f.add(p1);
		p1.add(l1);
		p1.add(txt1);
		p1.add(l2);
		p1.add(txt2);
		f.add(b);
		f.add(a1);
		
		p1.setBackground(Color.BLUE);
		
		f.setVisible(true);
		f.pack();
		f.addWindowListener(new GestoreFinestra());
		b.addActionListener(new GestoreBottone(txt1,txt2,a1));
	}
}