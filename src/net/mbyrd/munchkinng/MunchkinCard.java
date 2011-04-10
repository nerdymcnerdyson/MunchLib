package net.mbyrd.munchkinng;

public class MunchkinCard {
	int id;
	String picture; //base64 encoded pngs? locally stored for webclients?
	String name;
	String text;
	int edition;
	
	public MunchkinCard(int id, String picture, String name, String text,
			int edition) {
		super();
		this.id = id;
		this.picture = picture;
		this.name = name;
		this.text = text;
		this.edition = edition;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
}
