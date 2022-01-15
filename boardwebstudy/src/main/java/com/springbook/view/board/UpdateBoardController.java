package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateBoardController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        //1. 사용자 입력 정보 추출
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String seq = request.getParameter("seq");

        //2.DB 연동 처리
        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setContent(content);
        vo.setSeq(Integer.parseInt(seq));

        BoardDAO board = new BoardDAO();
        board.updateBoard(vo);

        //3. 회면 네비게이션
//        return "getBoardList.do";
        ModelAndView mav = new ModelAndView();
//        mav.setViewName("getBoardList.do");
        mav.setViewName("redirect:getBoardList.do");
        return mav;
    }
}
