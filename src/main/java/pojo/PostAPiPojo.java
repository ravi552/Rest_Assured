package pojo;

public class PostAPiPojo {
	
	private int id;
	private String title;
	private String author;
	public PostAPiPojo(int id, String title, String author) {
  		this.id = id;
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "PostAPiPojo [id=" + this.id + ", title=" + this.title + ", author=" + this.author + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
