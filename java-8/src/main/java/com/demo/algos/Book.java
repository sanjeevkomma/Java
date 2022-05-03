package com.demo.algos;

public class Book {

	private int id;
	private String name;

	Book(int id , String name) {

		this.id = id;
		this.name = name;

	}


	@Override
	public boolean equals(Object obj) {

		if( this == obj )
			
			return true;

		if( obj == null || obj.getClass() != this.getClass() )

			return false;

		final Book book = (Book) obj;

		return ( book.id == this.id && book.name == this.name  );
	}


/*	@Override
	public int hashCode() {

		return this.id;
	}*/



}
