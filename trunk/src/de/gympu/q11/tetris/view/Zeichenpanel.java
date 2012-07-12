

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
	
        private BufferedImage Tetris;
        private BufferedImage roterStein,blauerStein,grünerStein,gelberStein,lilaStein,hellblauerStein,orangerStein;
        private BufferedImage blau,gelb,grün,hellblau,lila,orange,rot;
       
        private int[][] naechsterStein;
        private int [][] gehaltenerStein;
       
       
        private int[][] spielfeld;
       
        public Zeichenpanel() {
                spielfeld = new int[20][10];
                naechsterStein=new int[4][4];
                gehaltenerStein=new int [4][4];
                try {
                		Tetris = ImageIO.read(new File("Images/Tetris.jpg"));
                		
                        roterStein = ImageIO.read(new File("Images/roterStein.jpg"));
                        blauerStein = ImageIO.read(new File("Images/blauerStein.jpg"));
                        grünerStein = ImageIO.read(new File("Images/grünerStein.jpg"));
                        gelberStein = ImageIO.read(new File("Images/gelberStein.jpg"));
                        hellblauerStein = ImageIO.read(new File("Images/hellblauerStein.jpg"));
                        lilaStein = ImageIO.read(new File("Images/lilaStein.jpg"));
                        orangerStein = ImageIO.read(new File("Images/orangerStein.jpg"));
                        
                        rot = ImageIO.read(new File("Images/rot.png"));
                        blau = ImageIO.read(new File("Images/blau.png"));
                        grün = ImageIO.read(new File("Images/grün.png"));
                        gelb = ImageIO.read(new File("Images/gelb.png"));
                        hellblau = ImageIO.read(new File("Images/hellblau.png"));
                        lila = ImageIO.read(new File("Images/lila.png"));
                        orange = ImageIO.read(new File("Images/orange.png"));
                        
                } catch (IOException e) {

                        e.printStackTrace();
                }
               
        }

        public void paint(Graphics g) {
               
               
                // Hintergrund zeichnen
                g.drawImage(Tetris, 0, 0, null);
                
             //   Image gruenKlein = grünerStein.getScaledInstance(20, -1, BufferedImage.SCALE_SMOOTH);
              //  g.drawImage(gruenKlein, 30,30,null);
             
               
                // Spielfeld zeichnen
                int x = 142;
                int y = 98;
               
                for(int i = 0; i < spielfeld.length; i++) {
                        for(int o = 0; o < spielfeld[i].length; o++) {
                        //      System.out.println(spielfeld[i][o]);
                                if(spielfeld[i][o] == 1) {g.drawImage(lilaStein, x, y, null);}
                                else    
                                        {if(spielfeld[i][o] == 2) {g.drawImage(hellblauerStein, x, y, null);} //I
                                                       
                                else    
                                        {if(spielfeld[i][o] == 3) {g.drawImage(orangerStein, x, y, null);} //J
                                               
                                else    
                                        {if(spielfeld[i][o] == 4) {g.drawImage(blauerStein, x, y, null);} //L

                                else    
                                        {if(spielfeld[i][o] == 5) {g.drawImage(gelberStein, x, y, null);} //O
                                                       
                                else    
                                        {if(spielfeld[i][o] == 6) {g.drawImage(grünerStein, x, y, null);} //S
                                               
                                else    
                                        {if(spielfeld[i][o] == 7) {g.drawImage(roterStein, x, y, null);} //Z
                                                               
                       
                                                               
                                                       
                                                       
                                }}}}}}
                                x += 32;
                        }
                        y += 32;
                        x = 142;
                }
               
                //nächsten Stein zeichnen
                for(int z = 0; z < naechsterStein.length; z++) {
                    for(int v = 0; v < naechsterStein[z].length; v++) {
                    //      System.out.println(spielfeld[i][o]);
                            if(naechsterStein[z][v] == 1) {
                            	g.drawImage(lila, 490,90, null);
      
                            	}
                            else    
                                    {if(naechsterStein[z][v] == 2) {g.drawImage(hellblau,  490,90, null);}
                                                   
                            else    
                                    {if(naechsterStein[z][v] == 3) {g.drawImage(orange,  490,90, null);}
                                           
                            else    
                                    {if(naechsterStein[z][v] == 4) {g.drawImage(blau, 490,90, null);}

                            else    
                                    {if(naechsterStein[z][v] == 5) {g.drawImage(gelb, 490,90, null);}
                                                   
                            else    
                                    {if(naechsterStein[z][v] == 6) {g.drawImage(grün, 490,90 ,null);}
                                           
                            else    
                                    {if(naechsterStein[z][v] == 7) {g.drawImage(rot,  490,90, null);}
                                                           
                                    }}}}}}}}
                
                
                
                for(int a = 0; a < gehaltenerStein.length; a++) {
                    for(int b = 0; b < gehaltenerStein[a].length; b++) {
                    //      System.out.println(spielfeld[i][o]);
                            
                    				if(gehaltenerStein[a][b] == 1) {g.drawImage(lila, 10,10, null);
      
                            	}
                            else    
                                    {if(gehaltenerStein[a][b] == 2) {g.drawImage(hellblau,  10,10, null);}
                                                   
                            else    
                                    {if(gehaltenerStein[a][b] == 3) {g.drawImage(orange,  10,10, null);}
                                           
                            else    
                                    {if(gehaltenerStein[a][b] == 4) {g.drawImage(blau, 10,10, null);}

                            else    
                                    {if(gehaltenerStein[a][b] == 5) {g.drawImage(gelb, 10,10, null);}
                                                   
                            else    
                                    {if(gehaltenerStein[a][b] == 6) {g.drawImage(grün,  10,10 ,null);}
                                           
                            else    
                                    {if(gehaltenerStein[a][b] == 7) {g.drawImage(rot,  10,10, null);}
                                                           
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


