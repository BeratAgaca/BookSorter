package BookSorter;

 

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Book implements Comparable<Book>{
	private String bookName;
	private Integer pageNumber;
	private String authorName;
	private LocalDate releaseDate;
	public Book(String bookName, Integer pageNumber, String authorName, LocalDate releaseDate ) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.releaseDate = releaseDate;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	@Override
	public int compareTo(Book o) {
		return getBookName().compareTo(o.getBookName());
	}
	
}
class Main{
	
	public static void main(String[] args) {
		
		Book book2 = new Book("Kara Delikler", 500, "Stephen Hawking", LocalDate.of(2017, Month.APRIL, 1));
		Book book3 = new Book("Kelebekler Ve İnsanlar", 300, "Üstün Dökmen", LocalDate.of(2017, Month.MAY, 2));
		Book book4 = new Book("İpek Sabahlık-Bir Suat Derviş Romanı", 1000, "Osman Balcıgil", LocalDate.of(2019, Month.OCTOBER, 3));
		Book book5 = new Book("İnce Memed 1", 140, "Yaşar Kemal", LocalDate.of(2007, Month.JUNE, 25));
		Book book1 = new Book("Var Mısın?", 320, "Doğan Cüceloğlu", LocalDate.of(2021, Month.AUGUST, 10));
		
		
		Set<Book> books = new TreeSet<>(new Comparator<Book>() {
			 @Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getPageNumber().compareTo(o2.getPageNumber());
			}
		});
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		 
		
		for(Book book : books) {
			System.out.println("BOOK NAME : "+ book.getBookName() + " ---  PAGE NUMBER : "+ book.getPageNumber());
		}
		
	}
	
}
