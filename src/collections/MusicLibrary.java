package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
	private List<Song> songs;

	MusicLibrary() {
		songs = new ArrayList<>();
	}

	public void addSong(Song s) {
		songs.add(s);
	}

	public Song playRandom() {
		Random rand = new Random();
		int index = rand.nextInt(songs.size());
		return songs.get(index);
	}

	public void removeSong(int id) {
		int index = -1;
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("No Song found with id: " + id);
		} else {
			songs.remove(index);

		}
	}

	public void displayInventory() {
		for (Song s : songs) {
			System.out.println(s);
		}
	}

}
