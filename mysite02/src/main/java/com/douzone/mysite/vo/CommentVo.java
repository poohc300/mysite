package com.douzone.mysite.vo;

public class CommentVo {

	private Long no;
	private String contents;
	private Long userNo;
	private String userName;
	private Long boardNo;
	private String regDate;
	public Long getNo() {
		return no;
	}
	public String getContents() {
		return contents;
	}
	public Long getUserNo() {
		return userNo;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUserName() {
		return userName;
	}
	public Long getBoardNo() {
		return boardNo;
	}

	public void setNo(Long no) {
		this.no = no;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setBoardNo(Long boardNo) {
		this.boardNo = boardNo;
	}

}
