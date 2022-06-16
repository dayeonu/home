desc board;

select * from movie;

create table board(
    num number(5) primary key,
    pass varchar2(30),
    name varchar2(30),
    email varchar2(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate );

create sequence board_seq start with 1 increment by 1;

insert into board(num, name, email, pass, title, content)
values(board_seq.nextval, '¼ºÀ±Á¤','pinksung@nate.com','1234','Ã¹¹æ¹®','¹İ°©½À´Ï´Ù');
insert into board(num, name, email, pass, title, content)
values(board_seq.nextval, '¼ºÀ±Á¤','pinksung@nate.com','1234','±è¹ä','¸ÀÀÖ¾î¿ä');
insert into board(num, name, email, pass, title, content)
values(board_seq.nextval, 'Àü¼öºó','raccon@nate.com','3333','°íµî¾Ö','ÀÏ½ÄÀÔ´Ï´Ù');
insert into board(num, name, email, pass, title, content)
values(board_seq.nextval, 'Àü¿øÁö','one@nate.com','1111','°¹°ñ¸¶À»','µÅÁö»ï°ã»ìÀÌ ¸ÀÀÖ½À´Ï´Ù');
commit;

insert into board(num, name, email, pass, title, content)
values(board_seq.nextval, 'À¯´Ù¿¬', '12@naver.com', 1234, '¾È³ç', 'mvcÆĞÅÏ2¾ß');
    
    
select * from board;