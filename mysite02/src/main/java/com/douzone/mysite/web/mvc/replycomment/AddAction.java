package com.douzone.mysite.web.mvc.replycomment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.repository.ReplyCommentRepository;
import com.douzone.mysite.vo.ReplyCommentVo;
import com.douzone.web.mvc.Action;
import com.douzone.web.util.WebUtil;

public class AddAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String contents = request.getParameter("contents");
		Long commentNo = request.getParameter("commentNo");
		Long depth = request.getParameter("depth");

		ReplyCommentVo vo = new ReplyCommentVo();
		vo.setContents(contents);
		vo.setCommentNo(commentNo);
		vo.setDepth(depth);
		
		new ReplyCommentRepository().insert(vo);
		WebUtil.redirect(request, response, request.getContextPath() + "/replycomment");
	}
}
