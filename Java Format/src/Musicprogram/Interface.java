package Musicprogram;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interface implements ActionListener {

	// Creates the window
	JFrame frame;
	// Creates the windows container.
	JPanel panel;
	// Create four sound buttons.
	JButton fluteBtn = new JButton("Flute");
	JButton drumBtn = new JButton("Drum");
	JButton guitarBtn = new JButton("Guitar");
	JButton pianoBtn = new JButton("Piano");
	// Saving the manual in a string.
	String manual = "How to use it:\n1. Use the left-click on your mouse on any of the buttons to play the named sound.\n2. To exit the program simply left-click the cross in the upper-right corner of the program.";

	public Interface() {

		// Creates frame and container.
		frame = new JFrame();
		panel = new JPanel();

		// Sets the borders, layout and adds the buttons.
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(3, 2));
		panel.add(fluteBtn);
		panel.add(drumBtn);
		panel.add(guitarBtn);
		panel.add(pianoBtn);
		
		// Gives buttons actionListeners and sound-files.
		fluteBtn.addActionListener((ActionListener) this);
	    fluteBtn.setActionCommand("flute.wav");
	    
		drumBtn.addActionListener((ActionListener) this);
		drumBtn.setActionCommand("drums.wav");
	    
		guitarBtn.addActionListener((ActionListener) this);
		guitarBtn.setActionCommand("guitar.wav");
	    
		pianoBtn.addActionListener((ActionListener) this);
		pianoBtn.setActionCommand("piano.wav");
	    
	    // Centers frame content.
		frame.add(panel, BorderLayout.CENTER);
		// Exits program on close.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Sets title.
		frame.setTitle("Musicbox");
		// Auto resizing/scaling.
		frame.pack();
		// Set size and visibility.
		frame.setSize(350, 350);
		frame.setVisible(true);
		// Opens info-box with manual at the start of the program.
		JOptionPane.showMessageDialog(frame, manual);

	}

	// Uses SoundPlayer method to play correct sound on click. 
	@Override
	public void actionPerformed(ActionEvent e) {		
		String data = e.getActionCommand();
		SoundPlayer sound = new SoundPlayer();	
		sound.playMusic(data);
	}

}