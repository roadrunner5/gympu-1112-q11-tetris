package Testpackage;

import java.io.File;

import javax.swing.JFrame;

public class Testklasse extends JFrame {
	public Testklasse() {
		super("Testfenster");
		
		this.setResizable(false);
		this.setUndecorated(true);
		
		Zeichenpanel z = new Zeichenpanel(new File("test.jpg"));
		this.getContentPane().add(z);
		this.setSize(600, 600);
		this.setLocation(2200, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			Thread.sleep(2000);
			z.datei = new File("test2.jpg");
			z.repaint(50, 50, 50, 50);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] a) {
		new Testklasse();
	}

}
