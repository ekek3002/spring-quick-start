package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BordServiceClient {
    public static void main(String[] args) {
        //1.Spring 컨테이너를 구동한다.
        AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

        //2.Spring 컨테이너로부터 BordServiceImpl 객체를 Lookup한다.
        BoardService boardService = (BoardService) container.getBean("boardService");

        //3.글 등록 기능 테스트
        BoardVO vo = new BoardVO();
        vo.setTitle("임시제목");
        vo.setWriter("홍길동");
        vo.setContent("임시내용.........!!!!");
        boardService.insertBoard(vo);

        //4.글 목록 검색 기능 테스트
        List<BoardVO> bordList = boardService.getBordList(vo);
        for (BoardVO boardVO : bordList) {
            System.out.println("boardVO = " + boardVO.toString());
        }
        //5.Spring 컨테이너 종료
        container.close();
    }
}
