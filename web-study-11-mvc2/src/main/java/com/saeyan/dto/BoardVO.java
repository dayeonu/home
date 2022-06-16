package com.saeyan.dto;

/*create table board(
	    num number(5) primary key,
	    pass varchar2(30),
	    name varchar2(30),
	    email varchar2(30),
	    title varchar2(50),
	    content varchar2(1000),
	    readcount number(4) default 0,
	    writedate date default sysdate 
*/

import java.sql.Timestamp;
import lombok.Data;

@Data
public class BoardVO {
	private Integer num; //int, integer 널값 처리가 달라
	private String name;
	private String email;
	private String pass;
	private String title;
	private String content;
	private Integer readcount;
	private Timestamp writedate; //현재 시간 구하기 
}
