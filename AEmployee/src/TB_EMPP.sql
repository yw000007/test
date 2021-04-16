drop table TB_EMPP
CASCADE CONSTRAINTS;

select * from TB_EMPP;

CREATE TABLE TB_EMPP(
    ID varchar2(12) NOT NULL, --아이디
    NAME varchar2(16) NOT NULL, -- 이름
    PHONE varchar2(13) NOT NULL, -- 전화번호
    DEPT varchar2(50) NOT NULL, -- 부서
    CONSTRAINT pk_member PRIMARY KEY(id)  
)
