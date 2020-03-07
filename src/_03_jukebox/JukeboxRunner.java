package _03_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.SwingUtilities;


public class JukeboxRunner {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
		Jukebox jb = new Jukebox();
		Song yes = new Song("kkcrusin.mp3");
		jb.run();
		yes.play();
		
	}
}
