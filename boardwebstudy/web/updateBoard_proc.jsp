<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    //1.사용자 입력 정보 추출
    request.setCharacterEncoding("UTF-8");
    String title   = request.getParameter("title");
    String content = request.getParameter("content");
    String seq     = request.getParameter("seq");

    //2.DB 연동 처리
    BoardVO vo = new BoardVO();
    vo.setSeq(Integer.parseInt(seq));
    vo.setTitle(title);
    vo.setContent(content);

    BoardDAO boardDAO = new BoardDAO();
    boardDAO.updateBoard(vo);

    //3.화면 네비게이션
    response.sendRedirect("getBoardList_V1.jsp");
%>