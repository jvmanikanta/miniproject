package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;

public class BookImp implements BookInter {
	
	List<Book> bookList = new ArrayList<>();

	public BookImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookList.add(book);

	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(bookList,(book1, book2) -> {
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws AuthorNotFoundException {
		List<Book> bookByAuthor = bookList
		.stream()  
		.filter((x) -> x.getAuthor().equals(author))
		//.sorted()
		.collect(Collectors.toList());
		
		if(!bookByAuthor.isEmpty()) {
			return bookByAuthor;
		}
		else {
			throw new AuthorNotFoundException("Author Not Found");
		}
	}

	@Override
	public List<Book> getBookByCategory(String category) throws CategoryNotFoundException {
		List<Book> bookByCategory = bookList.stream()
		.filter((x) ->x.getCategory().equals(category))
		.collect(Collectors.toList());
		if(!bookByCategory.isEmpty()) {
			return bookByCategory;
		}
		else {
			throw new CategoryNotFoundException("Category Not Found");
		}
	}
	
	@Override
	public List<Book> getBookById(int id) throws IdNotFoundException{
		List<Book> bookById = bookList.stream()
				.filter((x) ->x.getBookId() == (id))
				.collect(Collectors.toList());
				if(!bookById.isEmpty()) {
					return bookById;
				}
				else {
					throw new IdNotFoundException("Category Not Found");
				}
			}

}
