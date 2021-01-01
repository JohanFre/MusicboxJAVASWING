package Musicprogram;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer {
	
	// Method for playing the music. 

	void playMusic(String musicLocation) {

		try {
			File musicPath = new File(musicLocation);

			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
		} catch (

		Exception ex) {
			ex.printStackTrace();
		}
	}
}