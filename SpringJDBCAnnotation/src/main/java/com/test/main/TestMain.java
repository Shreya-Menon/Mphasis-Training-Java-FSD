package com.test.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.BookDao;
import com.test.model.Book;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(DBConfig.class);
		BookDao dao=ctx.getBean(BookDao.class);
		Book book=new Book();
		book.setB_id(107);
		book.setB_name("as");
		book.setB_author("af");
		book.setB_price(756);
		//dao.saveBooks(book);
		//dao.updateBooks(book);
		dao.deleteBook(book);
		System.out.println("done");
	}

}
