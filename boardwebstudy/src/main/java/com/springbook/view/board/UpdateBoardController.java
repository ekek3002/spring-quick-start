//package com.springbook.view.board;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class UpdateBoardController {
//
//    @RequestMapping("/updateBoard.do")
//    public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//        boardDAO.updateBoard(vo);
//        return "getBoardList.do";
//    }
////    @Override
////    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
////        //1. 사용자 입력 정보 추출
////        String title = request.getParameter("title");
////        String content = request.getParameter("content");
////        String seq = request.getParameter("seq");
////
////        //2.DB 연동 처리
////        BoardVO vo = new BoardVO();
////        vo.setTitle(title);
////        vo.setContent(content);
////        vo.setSeq(Integer.parseInt(seq));
////
////        BoardDAO board = new BoardDAO();
////        board.updateBoard(vo);
////
////        //3. 회면 네비게이션
//////        return "getBoardList.do";
////        ModelAndView mav = new ModelAndView();
//////        mav.setViewName("getBoardList.do");
////        mav.setViewName("redirect:getBoardList.do");
////        return mav;
////    }
//}
