package pkg_main;

import java.util.Scanner;

import pkg_Book.Book;
import pkg_Book.BookManager;
import pkg_exception.BookNotFoundException;
import pkg_exception.StudentNotFoundException;
import pkg_person.Student;
import pkg_person.StudentManager;
import pkg_transaction.BookTransactionManager;

public class Main {

	public static void main(String[] args) throws Exception {
//menu driven
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		BookManager bm = new BookManager();
		StudentManager sm = new StudentManager();
		BookTransactionManager btm = new BookTransactionManager();

		do {

			System.out.println("Enter 1 if Student\n Enter 2 if Librarian\n Enter 3 if want to exit");
			choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter your roll no=");
				int rollNo = sc.nextInt();
				try {
					Student s = sm.get(rollNo);
					if (s == null)
						throw new StudentNotFoundException();
					int stud_choice = 0;
					do {
						System.out.println(
								"Enter 1 to view All Books:\n Enter 2 to Search Book by Isbn:\n Enter 3 to list Books By subject: \n Enter 4 to issue abook \n Enter 5 to reurn a book\n Enter 99 to Exit ");

						stud_choice = sc.nextInt();
						switch (stud_choice) {
						case 1:
							System.out.println("All the books Records Are:");
							bm.viewAllBooks();
							break;
						case 2:
							System.out.println("Plese insert Isbn to search:");
							System.out.println("Enter the Isbn of the book to search=");
							int search_isbn = sc.nextInt();
							Book book = bm.searchBookByIsbn(search_isbn);
							if (book == null) {
								System.out.println("No Book Is with this Isbn");
							} else {
								System.out.println(book);
							}
							break;

						case 3:
							System.out.println("Enter the  Subject to search= ");
							sc.nextLine();
							String search_subject = sc.nextLine();
							bm.listBooksBySubject(search_subject);
							break;
						case 4:
							System.out.println("Enter the Isbn To Issue a book =");
							int issues_isbn = sc.nextInt();
							// int rollNo1 = sc.nextInt();
							book = bm.searchBookByIsbn(issues_isbn);
							try {
								if (book.getAvailable_quantity() > 0) {
									System.out.println("the book is issued by u;");
								}
							} catch (NullPointerException nse) {
								// System.out.println(nse);
								System.out.println("you not issued the book with given isbn no");

							}
							// book = bm.searchBookByIsbn(rollNo1);

							try {
								if (book == null) {
									throw new BookNotFoundException();

								}
								if (book.getAvailable_quantity() > 0) {
									if (btm.issueofBook(rollNo, issues_isbn)) {
										book.setAvailable_quantity(book.getAvailable_quantity() - 1);
										System.out.println("the quantity of book is availabale for issued a book!!!1");
									}

								} else {
									System.out.println("The Book has Been Issued..");
								}

							} catch (BookNotFoundException bnfe) {
								System.out.println(bnfe);

							} catch (NullPointerException nse) {
								System.out.println(nse);
							}
							break;
						case 5:
							System.out.println("plese enter the ISBN to return a book:");
							int return_isbn = sc.nextInt();
							book = bm.searchBookByIsbn(return_isbn);
							if (book != null) {
								if (btm.returnBook(rollNo, return_isbn)) {
									book.setAvailable_quantity(book.getAvailable_quantity() + 1);
									System.out.println("Thank you for returning the book");
								} else {
									System.out.println("Could Not Return the book");
								}
							} else {
								System.out.println("Book With this Isbn Does Not Exits... ");
							}
							break;
						case 99:
							System.out.println("thank for visiting library!!!!!");
							break;
						default:
							System.out.println("invalid choice.");
						}

					} while (stud_choice != 99);
				} catch (StudentNotFoundException snfe) {
					System.out.println(snfe);
				}
			} else if (choice == 2)// use of librarian
			{
				int lib_choice;

				do {
					System.out.println(
							"Enter 11 to view all student\n Enter 12 to print a student by roll no\n Enter 13 to register a student\nEnter 14 to Update a student\nEnter 15 delete a student");
					System.out.println(
							"Enter 21 to view all books\n Enter 22 to print a book by isbn\n Enter 23 to add new book\nEnter 24 to Update a book\nEnter 25 delete a book");
					System.out.println("Enter 31 to view all transactions:");
					System.out.println("Enter 99 to Exit");

					lib_choice = sc.nextInt();
					switch (lib_choice) {
					case 11:// view all student
						System.out.println("All Student Records:");
						sm.viewAllStudent();
						break;
					case 12:// search a student based on roll no
						System.out.println("Enter Roll Number to Fetch Student Record =");
						int get_rollNo = sc.nextInt();
						Student student = sm.get(get_rollNo);
						if (student == null) {
							System.out.println("No records found of this roll no");
						} else {
							System.out.println(student);
						}
						break;
					case 13:
						System.out.println("Enter Student Details To Add:");

						String name;
						String emailId;
						String phoneNumber;
						String address;
						String dob;
						int rollNo;
						int std;
						String division;

						// Clearing the buffer after previous inputs
						sc.nextLine(); // Clear the buffer

						// Read name (can contain spaces)
						System.out.println("Name:");
						name = sc.nextLine();

						// Read email
						System.out.println("EmailId:");
						emailId = sc.nextLine();

						// Read phone number
						System.out.println("PhoneNumber:");
						phoneNumber = sc.nextLine();

						// Read address (can contain spaces)
						System.out.println("Address:");
						address = sc.nextLine();

						// Read date of birth
						System.out.println("Dob:");
						dob = sc.nextLine();

						// Read roll number (integer)
						System.out.println("RollNo (in Integer):");
						rollNo = sc.nextInt();

						// Read standard (integer)
						System.out.println("Standard (in Integer):");
						std = sc.nextInt();

						// Clear the buffer again after the integers
						sc.nextLine(); // Consume the leftover newline

						// Read division
						System.out.println("Division:");
						division = sc.nextLine();

						// Create new Student object
						student = new Student(name, emailId, phoneNumber, address, dob, rollNo, std, division);

						// Add student to StudentManager
						sm.addAStudent(student);
						System.out.println("Student Is Added Successfully!!!!!!!");
						break;

					case 14:// update a student
						System.out.println("Enter the Roll No to Modify The record=");
						int modify_rollNo;
						modify_rollNo = sc.nextInt();
						student = sm.get(modify_rollNo);
						try {
							if (student == null)
								throw new StudentNotFoundException();

							sc.nextLine();
							System.out.println("Name=");
							name = sc.nextLine();

							System.out.println("EmailId=");
							emailId = sc.nextLine();

							System.out.println("PhoneNumber=");
							phoneNumber = sc.nextLine();

							System.out.println("Address=");
							address = sc.nextLine();
							System.out.println("Dob=");
							dob = sc.nextLine();

							System.out.println("std(In Intiger)=");
							std = sc.nextInt();

							sc.nextLine();

							System.out.println("Division=");
							division = sc.nextLine();

							sm.updateStudent(modify_rollNo, name, emailId, phoneNumber, address, dob, std, division);
							System.out.println("Student Record Is Update Suceesfully!!!!");
						} catch (StudentNotFoundException snfe) {
							System.out.println(snfe);

						}
						break;
					case 15:// Delete a student;
						System.out.println("Enter the Roll No to delete The record =");
						int delete_rollNo;
						delete_rollNo = sc.nextInt();
						if (sm.deleteStudent(delete_rollNo))
							System.out.println("Student Record is removed Susccesfully!!!");
						else
							System.out.println("No Record With Given Roll No Exists.");
						break;

					case 21:// view all books
						bm.viewAllBooks();
						break;

					case 22:// search book by isbn

						int search_isbn;
						System.out.println("Enter the Isbn No of the book to search=");
						search_isbn = sc.nextInt();
						Book book = bm.searchBookByIsbn(search_isbn);
						if (book == null) {
							System.out.println("No BooK Is with this Isbn No ,Check Again!!");
						} else {
							System.out.println(book);
						}
						break;

					case 23:// add a new book
						System.out.println("Plese Enter the All details:");
						int isbn;
						String title;
						String author;
						String publisher;
						int edition;
						String subject;
						int available_quantity;

						System.out.println("Isbn:");
						isbn = sc.nextInt();
						sc.nextLine();

						System.out.println("Title:");
						title = sc.nextLine();

						System.out.println("Author:");
						author = sc.nextLine();

						System.out.println("Publisher:");
						publisher = sc.nextLine();

						System.out.println("Edition:(Int intiger)");
						edition = sc.nextInt();
						sc.nextLine();

						System.out.println("Subject:");
						subject = sc.nextLine();

						System.out.println("Available Quantity(intiger):");
						available_quantity = sc.nextInt();
						sc.nextLine();

						book = new Book(isbn, title, author, publisher, edition, subject, available_quantity);
						bm.addABook(book);
						System.out.println("A New Book Added Succesfully!!!!!!!!");
						break;
					case 24:// update a record
						System.out.println("Plese Enter the Isbn");
						int update_isbn = sc.nextInt();

						try {
							book = bm.searchBookByIsbn(update_isbn);
							if (book == null)
								throw new BookNotFoundException();
							System.out.println("Enter Book Details To mOdify");
							sc.nextLine();

							System.out.println("Title:");
							title = sc.nextLine();

							System.out.println("Author:");
							author = sc.nextLine();

							System.out.println("Publisher:");
							publisher = sc.nextLine();

							System.out.println("Edition:");
							edition = sc.nextInt();
							sc.nextLine();

							System.out.println("Subject:");
							subject = sc.nextLine();

							System.out.println("Available Quantity:");
							available_quantity = sc.nextInt();

							bm.updateBook(update_isbn, title, author, publisher, edition, subject, available_quantity);
							System.out.println("book data updated succesfully");

						} catch (BookNotFoundException bnfe) {
							System.out.println(bnfe);
						}
						break;
					case 25:// delete book record
						System.out.println("Plese Enter the Isbn to delete a record:");
						int delete_isbn = sc.nextInt();

						try {
							book = bm.searchBookByIsbn(delete_isbn);
							if (book == null)
								throw new BookNotFoundException();
							bm.deleteBook(delete_isbn);
						} catch (BookNotFoundException bnfe) {
							System.out.println(bnfe);
						}

						break;
					case 31:// to view All transaction
						System.out.println("All The Transaction are:");
						btm.viewAllBooks();

						// btm.viewAllBooks();
						break;
					case 99:
						System.out.println("thank for visiting library");
						break;
					default:
						System.out.println("invalid choice");
					}
				} while (lib_choice != 99);

			}
		} while (choice != 3);
		sm.writeToFile();
		bm.writeToFile();
		btm.writeToFile();
		sc.close();

	}

}
