package examples.service.impl;

import java.util.List;

import javax.annotation.Resource;

import examples.dao.BookDao;
import examples.service.BookService;

public class BookServiceImpl implements BookService {

	@Resource
	private BookDao bookDao;
	

	@Override
	public List searchBook(String category) {
		// TODO Auto-generated method stub
		System.out.print("bookDao = null:" +(bookDao==null));
		return bookDao.findByCategory(category);
	}

}
