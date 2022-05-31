package com.douzone.mysite.web.mvc.replycomment;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mysite.repository.ReplyCommentRepository;
import com.douzone.mysite.vo.ReplyCommentVo;
import com.douzone.web.mvc.Action;
import com.douzone.web.util.WebUtil;

public class UpdateFormAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		ReplyCommentVo vo = new ReplyCommentVo();
		vo.setTitle(title);
		vo.setContents(contents);
		
		new ReplyCommentRepository().update(vo);
		WebUtil.forward(request, response, "replycomment/updateform");
	}
}
