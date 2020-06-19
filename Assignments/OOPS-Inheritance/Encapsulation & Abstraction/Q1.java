Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details
=========================================================================================

import java.io.*;
import java.util.*;

class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	public String toString() {
		return name+" ("+gender+") at "+email;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private double qtyInStock;
	
	Book(String name,Author author,double price,double qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qtyInStock;
	}
	public void setQty(double qty) {
		this.qtyInStock = qty;
	}
	
	public String toString() {
		return name +" by "+ author.getName();
	}	
}

public class E1{
	public static void main(String args[]) {
		Author auth = new Author("RajHans","github.com/RajHans01",'m');
		System.out.print("Author: ");
		System.out.println(auth);
		Book book = new Book("Java for dummies",auth,99.9,100);
		System.out.print("Book: ");
		System.out.println(book);
		book.setPrice(88);
		System.out.print("Price: ");
		System.out.println(book.getPrice());
	}
}
