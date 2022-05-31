package com.douzone.mysite.web.mvc.replycomment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.repository.ReplyCommentRepository;
import com.douzone.mysite.vo.ReplyCommentVo;
import com.douzone.web.mvc.Action;
import com.douzone.web.util.WebUtil;

public class DeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		
		ReplyCommentVo vo = new ReplyCommentVo();
		vo.setNo(Long.parseLong(no));
		
		new ReplyCommentRepository().delete(vo);
		WebUtil.redirect(request, response, request.getContextPath() + "/replycomment");
	}
}
