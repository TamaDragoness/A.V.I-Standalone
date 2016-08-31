package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import attribute.strings_texte;

public class gui 
{
	static strings_texte version = new strings_texte(); 
	
	
	public static void guiausführen()
	{
	// Erzeugt das Hauptfenster von A.V.I
	JFrame guiframe = new JFrame();
	// Setzt denn Titeltext
	guiframe.setTitle("A.V.I Standalone");
	// Setzt die Größe des Hauptmenüs auf einen Wert
	guiframe.setSize(200,200);
	 //5-zeiliges und 20-spaltiges Textfeld wird erzeugt
    JTextArea textfeld = new JTextArea(5, 20);
    //Text für das Textfeld wird gesetzt
    textfeld.setText("A.V.I :V"+ version + "by Black-Sun");
    textfeld.setLocation(0, 0);
	// Macht die Elemente des JFrame Sichtbar + das JFrame Selbst
    textfeld.setVisible(true);
    guiframe.setVisible(true);
}}