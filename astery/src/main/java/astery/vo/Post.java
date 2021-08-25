package astery.vo;

import java.util.Date;

public class Post {
	private int postNum;
	private int usercode;
	private String picture;
	private String content;
	private Date postDate;
	private char groupChk;
	
	
	public int getPostNum() {
		return postNum;
	}
	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}
	public int getUsercode() {
		return usercode;
	}
	public void setUsercode(int usercode) {
		this.usercode = usercode;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public char getGroupChk() {
		return groupChk;
	}
	public void setGroupChk(char groupChk) {
		this.groupChk = groupChk;
	}
}
