//package com.springbook.view.board;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class DeleteBoardController {
//
//    @RequestMapping("/deleteBoard.do")
//    public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//        boardDAO.deleteBoard(vo);
//        return "getBoardList.do";
//    }
////    @Override
////    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
////        //1.사용자 입력 정보 추출
////        String seq = request.getParameter("seq");
////
////        //2.DB 연동 처리
////        BoardVO vo = new BoardVO();
////        vo.setSeq(Integer.parseInt(seq));
////
////        BoardDAO board = new BoardDAO();
////        board.deleteBoard(vo);
////
////        //3. 화면 네비게이션
//////        return "getBoardList";
////        ModelAndView mav = new ModelAndView();
//////        mav.setViewName("getBoardList.do");
////        mav.setViewName("redirect:getBoardList.do");
////        return mav;
////    }
//}
