//package com.springbook.view.board;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class GetBoardController {
//
//    @RequestMapping("/updateBoard.do")
//    public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//        mav.addObject("board", boardDAO.getBoard(vo));
//        mav.setViewName("getBoard.jsp");
//        return mav;
//    }
////    @Override
////    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
////        //1. 검색할 게시글 번호 추출
////        String seq = request.getParameter("seq");
////
////        //2.DB 연동 처리
////        BoardVO vo = new BoardVO();
////        vo.setSeq(Integer.parseInt(seq));
////
////        BoardDAO boardDAO = new BoardDAO();
////        BoardVO board = boardDAO.getBoard(vo);
////
//////        //3. 검색 결괄르 세션에 저장하고 상세 화면으로 이동한다.
//////        HttpSession session = request.getSession();
//////        session.setAttribute("board", board);
//////        return "getBoard";
////
////        //3.검색 결과와 화면 정보를 ModelAndView 에 저장하여 리턴한다.
////        ModelAndView mav = new ModelAndView();
////        mav.addObject("board", board);
////        mav.setViewName("getBoard.jsp");
//////        mav.setViewName("getBoard");
////        return mav;
////    }
//}
