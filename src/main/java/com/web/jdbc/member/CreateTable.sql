CREATE TABLE Member(
    id integer primary key generated always as identity, -- 主鍵
    username varchar(50) not null, 
    password varchar(50) not null, 
    email varchar(50) not null, 
    pass boolean not null, -- email 通過驗證
    code varchar(50) not null, -- 認證編碼
    passts timestamp, -- email 通過驗證時間
    priority integer, -- 權限
    ts timestamp default current_timestamp -- 建檔時間
);