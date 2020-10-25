package com.study.pms.domain;

import java.sql.Date;

public class Board {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Date registeredDate;
	private int viewCount;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

}
