package com.douzone.mysite.web.mvc.board;

import com.douzone.mysite.web.mvc.guestbook.AddAction;
import com.douzone.mysite.web.mvc.guestbook.DeleteAction;
import com.douzone.mysite.web.mvc.guestbook.DeleteFormAction;
import com.douzone.mysite.web.mvc.guestbook.IndexAction;
import com.douzone.web.mvc.Action;
import com.douzone.web.mvc.ActionFactory;

public class BoardActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("delete".equals(actionName)) {
			action = new DeleteAction();
		} else if("deleteform".equals(actionName)) {
			action = new DeleteFormAction();
		} else if("add".equals(actionName)) {
			action = new AddAction();
		} else if("updateform".equals(actionName)) {
			action = new UpdateFormAction();
		} else {
			action = new IndexAction();
		}
		
		return action;
	}
}