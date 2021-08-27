package com.bookapp.main;

import java.util.Scanner;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.service.BookImp;
import com.bookapp.service.BookInter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInter bookInter = new BookImp();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			Book b = new Book();
			System.out.println("Enter title");
			String title = sc.nextLine();
			b.setTitle(title);
			System.out.println("Enter Author");
			String author = sc.nextLine();
			b.setAuthor(author);
			System.out.println("Enter Price");
			int price = sc.nextInt();
			b.setPrice(price);
			System.out.println("Enter id");
			int id = sc.nextInt();
			b.setBookId(id);
			sc.nextLine();
			System.out.println("enter Category");
			String category = sc.nextLine();
			b.setCategory(category); 
			bookInter.addBook(b);
		}
		System.out.println(bookInter.getAllBooks());
		System.out.println();
		System.out.println("*******************************************************************************************");
		System.out.println("filter by author/category/id");
		String filterInput = sc.nextLine();
		switch(filterInput) {
		case "author":
			try {
				System.out.println("enter author");
				String author = sc.nextLine();
				System.out.println(bookInter.getBookByAuthor(author));
			} catch (AuthorNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case "category":
			try {
				System.out.println("enter category");
				String category = sc.nextLine();
				System.out.println(bookInter.getBookByCategory(category));
			} catch (CategoryNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case "id":
			try {
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println(bookInter.getBookById(id));
			}catch(IdNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		
		default:
			System.out.println("Invalid filter input");
		}

	}

}
