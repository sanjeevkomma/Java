package com.demo.algos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.algos.model.Book;

public class Equals_HashCode {

	public static void main(String[] args) {

		Book b1 = new Book(1, "abc");

		Book b2 = new Book(1, "abc");

		if( b1.hashCode() == b2.hashCode() ) {

			if( b1.equals(b2) )

				System.out.println("Both Objects are equal. ");

			else

				System.out.println("Both Objects are not equal. ");

		}

		else System.out.println("Both Objects are not equal. "); 

		Set<Book> books = new HashSet<Book>();

		books.add(b1);

		books.add(b2);

		System.out.println(books.contains(b2));
		
		System.out.println("size : " + books.size());

		System.out.println("book.hashCode():  " + b1.hashCode()

		+ "  book2.hashCode():" + b2.hashCode());

	} 




}
