

package de.gympu.q11.tetris.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import de.gympu.q11.tetris.view.TetrisView;

public class Zeichenpanel extends JPanel {
       
        private BufferedImage roterStein,blauerStein,grünerStein,gelberStein,schwarzerStein,grauerStein,orangerStein,Tetris;
       
        private int[][] naechsterStein;
        private int [][] gehaltenerStein;
       
       
        private int[][] spielfeld;
       
        public Zeichenpanel() {
                spielfeld = new int[20][10];
                naechsterStein=new int[4][4];
                gehaltenerStein=new int [4][4];
                try {
                        roterStein = ImageIO.read(new File("Images/roterStein.jpg"));
                        blauerStein = ImageIO.read(new File("Images/blauerStein.jpg"));
                        grünerStein = ImageIO.read(new File("Images/grünerStein.jpg"));
                        gelberStein = ImageIO.read(new File("Images/gelberStein.jpg"));
                        schwarzerStein = ImageIO.read(new File("Images/schwarzerStein.jpg"));
                        grauerStein = ImageIO.read(new File("Images/grauerStein.jpg"));
                        orangerStein = ImageIO.read(new File("Images/orangerStein.jpg"));
                        Tetris = ImageIO.read(new File("Images/Tetris.jpg"));
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
               
        }

        public void paint(Graphics g) {
               
               
                // Hintergrund zeichnen
                g.drawImage(Tetris, 0, 0, null);
                
             //   Image gruenKlein = grünerStein.getScaledInstance(20, -1, BufferedImage.SCALE_SMOOTH);
              //  g.drawImage(gruenKlein, 30,30,null);
             
               
                // Nächsten Stein zeichen
               
                // Gehaltenen Stein zeichnen
               
                // Spielfeld zeichnen
                int x = 142;
                int y = 98;
               
                for(int i = 0; i < spielfeld.length; i++) {
                        for(int o = 0; o < spielfeld[i].length; o++) {
                        //      System.out.println(spielfeld[i][o]);
                                if(spielfeld[i][o] == 1) {g.drawImage(roterStein, x, y, null);}
                                else    
                                        {if(spielfeld[i][o] == 2) {g.drawImage(blauerStein, x, y, null);}
                                                       
                                else    
                                        {if(spielfeld[i][o] == 3) {g.drawImage(grünerStein, x, y, null);}
                                               
                                else    
                                        {if(spielfeld[i][o] == 4) {g.drawImage(gelberStein, x, y, null);}

                                else    
                                        {if(spielfeld[i][o] == 5) {g.drawImage(schwarzerStein, x, y, null);}
                                                       
                                else    
                                        {if(spielfeld[i][o] == 6) {g.drawImage(grauerStein, x, y, null);}
                                               
                                else    
                                        {if(spielfeld[i][o] == 7) {g.drawImage(orangerStein, x, y, null);}
                                                               
                       
                                                               
                                                       
                                                       
                                }}}}}}
                                x += 32;
                        }
                        y += 32;
                        x = 142;
                }
               
                for(int z = 0; z < naechsterStein.length; z++) {
                    for(int v = 0; v < naechsterStein[z].length; v++) {
                    //      System.out.println(spielfeld[i][o]);
                            if(naechsterStein[z][v] == 1) {
                            	g.drawImage(roterStein, 450,100, null);
      
                            	}
                            else    
                                    {if(naechsterStein[z][v] == 2) {g.drawImage(blauerStein,  450,200, null);}
                                                   
                            else    
                                    {if(naechsterStein[z][v] == 3) {g.drawImage(grünerStein,  450,200, null);}
                                           
                            else    
                                    {if(naechsterStein[z][v] == 4) {g.drawImage(gelberStein, 450,200, null);}

                            else    
                                    {if(naechsterStein[z][v] == 5) {g.drawImage(schwarzerStein, 450,200, null);}
                                                   
                            else    
                                    {if(naechsterStein[z][v] == 6) {g.drawImage(grauerStein,  450,200 ,null);}
                                           
                            else    
                                    {if(naechsterStein[z][v] == 7) {g.drawImage(orangerStein,  450,200, null);}
                                                           
                                    }}}}}}}}
                
                
                
                for(int a = 0; a < gehaltenerStein.length; a++) {
                    for(int b = 0; b < gehaltenerStein[a].length; b++) {
                    //      System.out.println(spielfeld[i][o]);
                            
                    				if(gehaltenerStein[a][b] == 1) {g.drawImage(roterStein, 100,100, null);
      
                            	}
                            else    
                                    {if(gehaltenerStein[a][b] == 2) {g.drawImage(blauerStein,  100,200, null);}
                                                   
                            else    
                                    {if(gehaltenerStein[a][b] == 3) {g.drawImage(grünerStein,  100,200, null);}
                                           
                            else    
                                    {if(gehaltenerStein[a][b] == 4) {g.drawImage(gelberStein, 100,200, null);}

                            else    
                                    {if(gehaltenerStein[a][b] == 5) {g.drawImage(schwarzerStein, 100,200, null);}
                                                   
                            else    
                                    {if(gehaltenerStein[a][b] == 6) {g.drawImage(grauerStein,  100,200 ,null);}
                                           
                            else    
                                    {if(gehaltenerStein[a][b] == 7) {g.drawImage(orangerStein,  100,200, null);}
                                                           
                                    }}}}}}}}
                            
                            
        }
       
        public void updateReihe(int reihe, int[] data) {
                spielfeld[reihe] = data;
        }
       
       
        public void setNextStein(int [][] stein)
        {
        	naechsterStein=stein;
        	
        }

		public void setGehaltenerStein(int[][] stein1)
		{
			gehaltenerStein=stein1;
		}
        
}


