package library;

public class Book {
	private int bid;
	private String bname, author;
	private int quantity;
	private int issuedQuantity = 0;

	public int getIssuedQuantity() {
		return issuedQuantity;
	}

	public void setIssuedQuantity(int issuedQuantity) {
		this.issuedQuantity = issuedQuantity;
	}

	public Book(int bid, String bname, String author, int quantity) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.quantity = quantity;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", quantity=" + quantity
				+ ", issuedQuantity=" + issuedQuantity + "]";
	}

}
