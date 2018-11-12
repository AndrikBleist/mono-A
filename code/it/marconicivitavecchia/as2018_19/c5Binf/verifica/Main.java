
// TODO Inserire il package corretto
package Mono;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(800,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb= new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<b><h1>Almanacco astronomico</h1></b>");
		sb.append("<b><h2>Novembre 2018</h2></b>");
		sb.append("<b>Il Sole.</b><i>In Novembre perderemo complessivamente 1 ora e 3 minuti di luce.</i>");
		sb.append("<table>");
		sb.append("<tr><th>Data</th>");
		sb.append("<th>Sorge</th>");
		sb.append("<th>Tramonta</th></tr><br>");
		sb.append("<tr><th>1 gio</th>");
		sb.append("<th>6:55</th>");
		sb.append("<th>17:10</th></tr>");
		sb.append("<tr><th>2 ven</th>");
		sb.append("<th>6:56</th>");
		sb.append("<th>17:08</th></tr>");
		sb.append("<tr><th>3 sab</th>");
		sb.append("<th>6:55</th>");
		sb.append("<th>17:07</th></tr>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("/html");
		// TODO Convertire lo StringBuilder in String
		String html= sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println(html);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

