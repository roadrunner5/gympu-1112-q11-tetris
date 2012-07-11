package de.gympu.q11.tetris.view;

import java.io.File;

import javax.sound.sampled.*;
 
public class Musik {
    private Clip clip;
    private boolean status;
    
    public static void main(String[] args) {
        Musik sound = new Musik();
        System.out.println("initialized");
        sound.play();
        System.out.println("finished");
    }
    
    public Musik() {
    	status = false;
        try {
           
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("Tetris.wav"));
            AudioFormat format = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format, ((int) ais.getFrameLength() * format.getFrameSize()));
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(1.0F);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void play() {
        if (status == true) {
        	clip.stop();
        	status = false;
        }
        else {
        	status = true;
        	clip.start();
        	clip.loop(-1);
        }
    }
    
    }
