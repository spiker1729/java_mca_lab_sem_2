import java.util.Scanner;

public class book {
	String name;
	String author;
	String content;
	int id;
	int pagenos;
	Page page[];

	book(String name, String author, int id, int pagenos) {
		this.name = name;
		this.author = author;
		this.id = id;
		this.pagenos = pagenos;
		page = new Page[pagenos];
	}

	public int GetIdNo() {
		return id;

	}

	public String GetBookName() {

		return name;
	}

	public String GetAuthorname() {

		return author;
	}

	public Page[] page() {

		return page;
	}

	public void setpage(Page[] pages) {
		this.page = pages;
	}

}