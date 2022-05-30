package com.douzone.mysite.vo;

public class BoardVo {
	private Long no;
	private String title;
	private String contents;
	private Long g_no;
	private Long userName;
	private String userNo;
	private Long depth;
	private String createdAt;
	
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
	public Long getUserName() {
		return userName;
	}
	public String getUserNo() {
		return userNo;
	}
	public Long getDepth() {
		return depth;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public Long getG_no() {
		return g_no;
	}
	public void setG_no(Long g_no) {
		this.g_no = g_no;
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
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", contents=" + contents + ", username=" + userName
				+ ", depth=" + depth + " , createdAt="+ createdAt + "]";
	}
}
