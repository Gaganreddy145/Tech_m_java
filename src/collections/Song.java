package collections;

public class Song {
	private int id;
	private String name;

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + "]";
	}

	public Song(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
