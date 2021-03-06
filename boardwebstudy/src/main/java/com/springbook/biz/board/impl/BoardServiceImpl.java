package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAOJPA boardDAO;
//    private BoardDAOMybatis boardDAO;
//    private BoardDAO boardDAO;

//    private BoardDAO boardDAO;

//    private BoardDAOSpring boardDAO;


    @Override
    public void insertBoard(BoardVO vo) {
//        if (vo.getSeq() == 0) {
//            throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//        }
//        boardDAO.insertBoard(vo);
        boardDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {
        boardDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
        boardDAO.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        return boardDAO.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBordList(BoardVO vo) {
        return boardDAO.getBoardList(vo);
    }
}
