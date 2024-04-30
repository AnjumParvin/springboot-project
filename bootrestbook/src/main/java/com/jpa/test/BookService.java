package com.jpa.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BookService {
	@Autowired
	private  BookRepository bookRepository; 
//private static List<Book> list=new ArrayList<>();
//static {
	//list.add(new Book(143,"JAVA Complete Reference","Herbert Schildt"));
	//list.add(new Book(12993,"C++","publish learnqoch"));
	//list.add(new Book(1283,"MYSQL","publish learnqoch"));
	//list.add(new Book(1723,"REACTJS","publish learnqoch"));
	//list.add(new Book(123,"JAVASCRIPT","publish learnqoch"));
	//list.add(new Book(12003,"JAVA Complete Reference","IOC"));
	//list.add(new Book(18323,"JAVA Complete Reference3","MSG"));
	//list.add(new Book(12673,"C#","LQA"));
	//list.add(new Book(12873,"JAVASCRIPT","xyz"));
	//list.add(new Book(145323,"SWIFT","xBz"));
//}

	//GET all books
	
	public List<Book> getAllBooks()
	{
		List<Book>list=(List<Book>) this.bookRepository.findAll();
		return list;
	}
	//Get single book by id
	public Book  getBookById(int id) {
		Book book=null;
		try {
		//book=list.stream().filter(e->e.getId()==id).findFirst().get();
this.bookRepository.findById(id);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return book;	
	}
	//Adding the Book
	public Book addBook(Book b)
{
	Book result =bookRepository.save(b);
	return result;
		
		}
	//delete book
	public void deleteBook(int bid) {
	//list=list.stream().filter(book->book.getId()!=bid).
			//collect(Collectors.toList());
bookRepository.deleteById(bid);
		//if(book.getId()!=bid) {
	//return true;
	//}else {
		//return false;
	//}

}
	
//update book
	public void updateBook(Book book,int bookId) {
		
		
		//list.stream().map(b->{
			//if(b.getId()==bookId) {
				//b.setTitle(book.getTitle());
				//b.setAuthor(book.getAuthor());
			//}
			
		//return b;
		//}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
	}
	
	
}