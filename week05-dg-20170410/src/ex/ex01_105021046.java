package ex;
/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("CHINESE", "9789864341", 458);
		Book book2 = new Book("JAVA1", "123456789", 600);
		Book book3 = new Book("ENGLISH", "987654321", 500);
		System.out.println("------------------BOOK-----------------");
		book1.show();
		book2.show();
		book3.show();
		// System.out.printf(book1.getInfo());
		// System.out.println(book2.getInfo());
		// System.out.println(book3.getInfo());
		System.out.println("----------------------------------------");
		AudioDVD dvd1 = new AudioDVD("DVD1", "123", 100);
		AudioDVD dvd2 = new AudioDVD("DVD2", "456", 200);
		AudioDVD dvd3 = new AudioDVD("DVD3", "789", 300);
		System.out.println("-----------------AudioDVD---------------");
		dvd1.show();
		dvd2.show();
		dvd3.show();
		System.out.println("----------------------------------------");
		Stationary sta1 = new Stationary("sta1", "123", 100);
		Stationary sta2 = new Stationary("sta2", "456", 200);
		Stationary sta3 = new Stationary("sta3", "789", 300);
		System.out.println("-----------------Stationary-------------");
		sta1.show();
		sta2.show();
		sta3.show();
		System.out.println("----------------------------------------");

	}

}

abstract class staticdata {
	protected String name, id, barcode, category, description;
	protected float price;

	public staticdata(String name, String id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
		
	}

	public abstract String getName();

	public abstract String getId();

	public abstract String getBarcode();

	public abstract String getCategory();

	public abstract float getPrice();

	public abstract String getDescription();

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public void setBarcode(String barcode) {
		// TODO Auto-generated method stub
		this.barcode = barcode;

	}

	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category = category;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

interface sale {
	public String getInfo();

	public void show();
}

class Book extends staticdata implements sale {
	public Book(String name, String id, float price) {
		super(name, id, price);
		// TODO Auto-generated constructor stub
	}

	private String barcode, category, description, publisher, authors, language, isbn, publishDate;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setAuthor(String authors) {
		this.authors = authors;
	}

	public String getAuthor() {
		return authors;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getISBN() {
		return isbn;
	}

	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("書名:" + name + "\tID:" + id + "\t價錢:" + price);
		System.out.println();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return name + "\t" + id + "\t" + price;
	}

}

class AudioDVD extends staticdata implements sale {
	private String publisher, publishDate;

	public AudioDVD(String name, String id, float price) {

		super(name, id, price);
	}

	public void publisher(String publisher) {
		this.publisher = publisher;
	}

	public String publisher() {
		return publisher;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return name + "\t" + id + "\t" + price;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("DVD名字:"+name + "\tID:" + id + "\t價錢:" + price);
	}
}

class Stationary extends staticdata implements sale {
	public Stationary(String name, String id, float price) {
		super(name, id, price);
		// TODO Auto-generated constructor stub
	}

	private String vendor, length, width, height;

	public void setvendor(String vendor) {
		this.vendor = vendor;
	}

	public String getvendor() {
		return vendor;
	}

	public void setlength(String length) {
		this.length = length;
	}

	public String getlength() {
		return length;
	}

	public void setwidth(String width) {
		this.width = width;
	}

	public String getwidth() {
		return width;
	}

	public void setheight(String height) {
		this.height = height;
	}

	public String getheight() {
		return height;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return name + "\t" + id + "\t" + price;
	}

	@Override
	public void show() {
		System.out.println("名字:"+name+ "\t\tID:" + id + "\t價錢:" + price);
		// TODO Auto-generated method stub

	}
}