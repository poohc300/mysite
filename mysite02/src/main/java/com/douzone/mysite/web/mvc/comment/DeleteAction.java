package com.douzone.mysite.web.mvc.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.repository.CommentRepository;
import com.douzone.mysite.vo.CommentVo;
import com.douzone.web.mvc.Action;
import com.douzone.web.util.WebUtil;

public class DeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		
		CommentVo vo = new CommentVo();
		vo.setNo(Long.parseLong(no));
		
		new CommentRepository().delete(vo);
		WebUtil.redirect(request, response, request.getContextPath() + "/comment");
	}
}
