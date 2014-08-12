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
		  List books;
		
//		String PATH = "examples/dao/BookDao.dicon";
//		S2Container container = S2ContainerFactory.create(PATH);
//        container.init();
//        try {
//            // 通常の検索
//            BookDao dao = (BookDao) container.getComponent(BookDao.class);
//            books = dao.findByCategory(category);
//
//        } finally {
//            container.destroy();
//        }
		System.out.print("bookDao = null:" +(bookDao==null));
		return bookDao.findByCategory(category);
	}

}
