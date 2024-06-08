Book Store Application
This is a Book Store web application developed using Spring Boot, Thymeleaf, and Bootstrap. The application allows users to register new books, view available books, add books to their personal collection, and edit book details.
Table of Contents
Technologies Used
Features
Setup and Installation
Usage
Project Structure
Thymeleaf Templates
Controller
Contributing
License
Technologies Used
Java
Spring Boot
Thymeleaf
Bootstrap
Maven
Features
Home page with navigation
Register new books
View available books
Add books to personal collection
Edit book details
Setup and Installation
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/book-store.git
cd book-store
Build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
Open the application in your browser:

Navigate to http://localhost:8080

Usage
Home Page
The home page provides navigation links to different parts of the application:

Home
Available Books
My Books
New Book Register
Register New Book
To register a new book, navigate to New Book Register and fill out the form with the book's name, author, and price. Submit the form to save the book.

View Available Books
Navigate to Available Books to view a list of all available books. From here, you can add books to your personal collection by clicking the Add To My Book button.

My Books
Navigate to My Books to view your personal collection of books.

Edit Book
To edit a book's details, navigate to Available Books and click on the Edit button next to the book you want to edit. This will take you to the edit form where you can update the book's information.

Project Structure
arduino
Copy code
book-store/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bookStore/
│   │   │           ├── Controller/
│   │   │           │   └── BookController.java
│   │   │           ├── entity/
│   │   │           │   ├── Book.java
│   │   │           │   └── MyBookList.java
│   │   │           ├── service/
│   │   │           │   ├── BookService.java
│   │   │           │   └── MyBookListService.java
│   │   │           └── BookStoreApplication.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── home.html
│   │   │   │   ├── bookRegister.html
│   │   │   │   ├── avaliableBooks.html
│   │   │   │   └── bookEdit.html
│   │   │   ├── application.properties
│   │   │   └── static/
│   │   │       └── css/
│   │   │           └── styles.css
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── bookStore/
│   │               └── BookStoreApplicationTests.java
├── pom.xml
└── README.md



