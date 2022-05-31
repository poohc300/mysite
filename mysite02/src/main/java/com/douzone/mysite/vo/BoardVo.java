package com.douzone.mysite.vo;

public class BoardVo {
	private Long no;
	private String title;
	private String contents;
	private Long userName;
	private Long userNo;
	private String regDate;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public Long getUserName() {
		return userName;
	}
	public Long getUserNo() {
		return userNo;
	}

	public String getRegDate() {
		return regDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", contents=" + contents + ", username=" + userName
				+ ", regDate="+ regDate + "]";
	}
}
