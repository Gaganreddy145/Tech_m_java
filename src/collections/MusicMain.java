package collections;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicLibrary ml = new MusicLibrary();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter id: ");
			int id = sc.nextInt();
			System.out.print("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
			ml.addSong(new Song(id, name));

		}
		ml.displayInventory();
		System.out.println(ml.playRandom());

	}

}
