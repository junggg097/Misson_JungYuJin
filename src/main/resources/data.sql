-- 게시판 더미 데이터
INSERT INTO board(name)
VALUES ('자유 게시판');
INSERT INTO board(name)
VALUES ('개발 게시판');
INSERT INTO board(name)
VALUES ('일상 게시판');
INSERT INTO board(name)
VALUES ('사건 사고 게시판');


-- 게시글 더미 데이터
INSERT INTO Article(board_id, title, content, writer, password)
VALUES (1, '자유롭게', '자유로웡~~~', '유진', '1111');
INSERT INTO article(board_id, title, content, writer, password)
VALUES (2, 'SPRING BOOT 프로젝트 .. ', '살짝 어려운 거 같기도 하고 ,, 댓글은 잘 못하겠고 ,,', '유진', '1111');
INSERT INTO article(board_id, title, content, writer, password)
VALUES (3, '불금이당 ', '불금엔 술  .. . ..', '유진', '1111');
INSERT INTO article(board_id, title, content, writer, password)
VALUES (4, '삐용삐용', '사건 사고다 !!!!', '유진', '1111');