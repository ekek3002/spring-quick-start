//package com.springbook.view.board;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class GetBoardListController {
//
//    @RequestMapping(value = "/getBoardList.do")
//    public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//        mav.addObject("boardList", boardDAO.getBoardList(vo));
//        mav.setViewName("getBoardList.jsp");
//        return mav;
//    }
////    @Override
////    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
////        //1.사용자 입력 정보 추출(검색 기능은 나중에 구현
////        //2. DB 연동 처리
////        BoardVO vo = new BoardVO();
////        BoardDAO boardDAO = new BoardDAO();
////        List<BoardVO> boardList = boardDAO.getBoardList(vo);
////
////        //3.검색 결과를 세션에 저장하고 목록 화면으로 이동한다.
//////        HttpSession session = request.getSession();
//////        session.setAttribute("boardList", boardList);
//////        return "getBoardList";
////
////        //3.검색 결과와 화면 정보를 ModelAndView 에 저장하여 리턴한다.
////        ModelAndView mav = new ModelAndView();
////        mav.addObject("boardList", boardList);
////        mav.setViewName("getBoardList.jsp");
//////        mav.setViewName("getBoardList");
////        return mav;
////    }
//}
