package com.springbook.view.board;

import com.springbook.biz.board.BoardListVO;
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAOMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/dataTransform.do")
    @ResponseBody
    public BoardListVO dataTransform_XML(BoardVO vo) {
        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardService.getBordList(vo);
        BoardListVO boardListVO = new BoardListVO();
        boardListVO.setBoardList(boardList);
        return boardListVO;
    }

    public List<BoardVO> dataTransform_JSON(BoardVO vo) {
        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardService.getBordList(vo);
        return boardList;
    }

    //글 등록
    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo) throws IOException {
        System.out.println("글 등록 처리");
        //파일 업로드 처리
        MultipartFile uploadFile = vo.getUploadFile();
        if (uploadFile.isEmpty()) {
            String fileName = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("/Users/yellowin/workspace/study/spring/springquickstart/file"+fileName));
        }

        boardService.insertBoard(vo);
        return "getBoardList.do";
    }

    public String insertBoardV2(BoardVO vo) {
        System.out.println("글 등록 처리");

        boardService.insertBoard(vo);

        return "getBoardList.do";
    }

    public String insertBoardV1(BoardVO vo) {
        System.out.println("글 등록 처리");

        BoardDAOMybatis boardDAO = new BoardDAOMybatis();
        boardDAO.insertBoard(vo);

        return "getBoardList.do";
    }

    //글 수정
    @RequestMapping("/updateBoard.do")
    public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAOMybatis boardDAO) {
        System.out.println("글 수정 처리");
        boardService.updateBoard(vo);
        return "getBoardList.do";
    }

    public String updateBoardV2(@ModelAttribute("board") BoardVO vo, BoardDAOMybatis boardDAO) {
        System.out.println("글 수정 처리");
        System.out.println("번호 = " + vo.getSeq());
        System.out.println("제목= " + vo.getTitle());
        System.out.println("작성자 = " + vo.getWriter());
        System.out.println("내용 = " + vo.getContent());
        System.out.println("등록일 = " + vo.getRegDate());
        System.out.println("조회수 = " + vo.getCnt());
        boardDAO.updateBoard(vo);
        return "getBoardList.do";
    }

    public String updateBoardV1(BoardVO vo, BoardDAOMybatis boardDAO) {
        System.out.println("글 수정 처리");
        boardDAO.updateBoard(vo);
        return "getBoardList.do";
    }

    //글 삭제
    @RequestMapping("/deleteBoard.do")
    public String deleteBoard(BoardVO vo, BoardDAOMybatis boardDAO) {
        System.out.println("글 삭제 처리");
        boardService.deleteBoard(vo);
        return "getBoardList.do";
    }

    public String deleteBoardV1(BoardVO vo, BoardDAOMybatis boardDAO) {
        System.out.println("글 삭제 처리");
        boardDAO.deleteBoard(vo);
        return "getBoardList.do";
    }

    //글 상세 조회
    @RequestMapping("/getBoard.do")
    public String getBoard(BoardVO vo, BoardDAOMybatis boardDAO, Model model) {
        System.out.println("글 상세 조회 처리");
        model.addAttribute("board", boardService.getBoard(vo));
        return "getBoard.jsp";
    }

    public String getBoardV1(BoardVO vo, BoardDAOMybatis boardDAO, Model model) {
//        mav.addObject("board", boardDAO.getBoard(vo));
//        mav.setViewName("getBoard.jsp");
//        return mav;

        model.addAttribute("board", boardDAO.getBoard(vo));
        return "getBoard.jsp";
    }

    //검색 조건 목록 설정
    @ModelAttribute("conditionMap")
    public Map<String, String> searchConditionMap() {
        Map<String, String> conditionMap = new HashMap<String, String>();
        conditionMap.put("제목", "TITLE");
        conditionMap.put("내용", "CONTENT");
        return conditionMap;
    }

    //글 목록 검색
    @RequestMapping(value = "/getBoardList.do")
    public String getBoardList(@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
            @RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
            BoardVO vo, BoardDAOMybatis boardDAO, Model model) {
        System.out.println("글 목록 검색 처리");
        //Null Check
        if (vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
        if (vo.getSearchKeyword() == null) vo.setSearchKeyword("");
        //Model 정보 저장
        model.addAttribute("boardList", boardService.getBordList(vo));
        return "getBoardList.jsp";
    }

    public String getBoardListV3(@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
            @RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
            BoardVO vo, BoardDAOMybatis boardDAO, Model model) {
        System.out.println("글 목록 검색 처리");
        model.addAttribute("boardList", boardService.getBordList(vo));
        return "getBoardList.jsp";
    }

    public String getBoardListV2(@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
            @RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
            BoardVO vo, BoardDAOMybatis boardDAO, Model model) {

        System.out.println("검색 조건 : " + condition);
        System.out.println("검색 단어 : " + keyword);

        //Model 정보 저장
        model.addAttribute("boardList", boardDAO.getBoardList(vo));
        return "getBoardList.jsp";
    }

    public ModelAndView getBoardListV1(BoardVO vo, BoardDAOMybatis boardDAO, ModelAndView mav) {
        mav.addObject("boardList", boardDAO.getBoardList(vo));
        mav.setViewName("getBoardList.jsp");
        return mav;
    }
}
