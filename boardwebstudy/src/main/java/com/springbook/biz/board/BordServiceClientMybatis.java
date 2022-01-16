package com.springbook.biz.board;

import com.springbook.biz.board.impl.BoardDAOMybatis;

import java.util.List;

public class BordServiceClientMybatis {
    public static void main(String[] args) {
        BoardDAOMybatis boardDAO = new BoardDAOMybatis();

        BoardVO vo = new BoardVO();
        vo.setTitle("mybatis 제목");
        vo.setWriter("홍길동");
        vo.setContent("mybatis 내용입니다.......");
        boardDAO.insertBoard(vo);

        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardDAO.getBoardList(vo);
        for (BoardVO boardVO : boardList) {
            System.out.println("boardVO = " + boardVO);
        }
    }
}
