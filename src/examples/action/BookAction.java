
package examples.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import examples.service.BookService;

/**
 * @author taedium
 * 
 */

public class BookAction extends Action{

    @Resource
    BookService bookService;
	
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
    	
		String category = req.getParameter("category");
		
		req.setAttribute("result", bookService.searchBook(category));
		
		return mapping.findForward("success") ;
	}
}
