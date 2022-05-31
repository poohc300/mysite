package com.douzone.mysite.vo;

public class ReplyCommentVo {

	private Long no;
	private String contents;
	private Long commentNo;
	private Long userNo;
	private String userName;
	private Long depth;
	private String regDate;
	public Long getNo() {
		return no;
	}
	public String getContents() {
		return contents;
	}
	public Long getCommentNo() {
		return commentNo;
	}
	public Long getUserNo() {
		return userNo;
	}
	public String getUserName() {
		return userName;
	}
	public Long getDepth() {
		return depth;
	}
	
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setCommentNo(Long commentNo) {
		this.commentNo = commentNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}

}
