 package com.bookStore.Controller;

import java.util.List;

import org.aspectj.bridge.context.PinpointingMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {

	@Autowired
	private BookService services;
	
	@Autowired
	private MyBookListService myBookListService;
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister()
	{
		return "bookRegister";
	}
	
	@GetMapping("/avaliable_books")
	public ModelAndView avalaibleBooks()
	{
		List<Book>list=services.getAllBooks();
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("bookList");
		//modelAndView.addObject("book",list);
		return new ModelAndView("avaliableBooks","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b)
	{
		services.save(b);
		return "redirect:/avaliable_books";
	}
	
	@GetMapping("/my_Books")
	public String getMyBooks(Model model) {
		List<MyBookList> list=myBookListService.getAllMyBooks();
		model.addAttribute("book", list);
		return "myBooks";
	}
	
	@RequestMapping("/myList/{id}")
	public String getMyList(@PathVariable("id")int id)
	{
		Book b=services.getBookById(id);
		MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		myBookListService.saveMyBooks(mb);
		return "redirect:/my_Books";
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id")int id,Model model)
	{
		Book b =services.getBookById(id);
		model.addAttribute("book",b);
		return "bookEdit";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id")int id)
	{
		services.deleteById(id);
		return "redirect:/avaliable_books";
	}
	
}
