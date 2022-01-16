package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.util.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOMybatis {
    //JBDC 관련 변수
    private SqlSession mybatis;

    public BoardDAOMybatis() {
        mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
    }

    //글등록
    public void insertBoard(BoardVO vo) {
        mybatis.insert("BoardDAO.insertBoard", vo);
        mybatis.commit();
    }

    //글 수정
    public void updateBoard(BoardVO vo) {
        mybatis.insert("BoardDAO.updateBoard", vo);
        mybatis.commit();
    }


    //글 삭제
    public void deleteBoard(BoardVO vo) {
        mybatis.insert("BoardDAO.deleteBoard", vo);
        mybatis.commit();
    }

    //글 상세 조회
    public BoardVO getBoard(BoardVO vo) {
        return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
    }

    //글 목록 조회
    public List<BoardVO> getBoardList(BoardVO vo) {
        return mybatis.selectList("BoardDAO.getBoardList", vo);
    }
}
