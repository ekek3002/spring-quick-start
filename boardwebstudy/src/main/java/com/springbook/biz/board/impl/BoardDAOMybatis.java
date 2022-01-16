package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public class BoardDAOMybatis /*extends SqlSessionDaoSupport*/ {
//    @Autowired
//    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }

    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertBoard(BoardVO vo) {
        System.out.println("===> Mybatis로 insertBoard() 기능 처리");
        mybatis.insert("BoardDAO.insertBoard", vo);
    }

    public void updateBoard(BoardVO vo) {
        System.out.println("===> Mybatis로 updateBoard() 기능 처리");
        mybatis.update("BoardDAO.updateBoard", vo);
    }

    public void deleteBoard(BoardVO vo) {
        System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
        mybatis.delete("BoardDAO.deleteBoard", vo);
    }

    public BoardVO getBoard(BoardVO vo) {
        System.out.println("===> Mybatis로 getBoard() 기능 처리");
        return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
    }

    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("===> Mybatis로 getBoardList() 기능 처리");
//        if (vo.getSearchCondition().equals("TITLE")) {
//            return mybatis.selectList("BoardDAO.getBoardList_T", vo);
//        } else if (vo.getSearchCondition().equals("CONTENT")) {
//            return mybatis.selectList("BoardDAO.getBoardList_C", vo);
//        }
//        return null;
        return mybatis.selectList("BoardDAO.getBoardList", vo);

    }
}
