package examples.action.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import examples.service.BookService;

public class BookActionImpl extends Action {
	Logger logger = Logger.getLogger(getClass());
	
	@Resource
	BookService bookService;
	
//	public void setBookService(BookService bookService) {
//		this.bookService = bookService;
//	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
	
		String category = req.getParameter("category");
		
		req.setAttribute("result", bookService.searchBook(category));
		
		return mapping.findForward("success") ;
	}
}
