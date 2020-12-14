package com.soheejjang.board.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.soheejjang.board.service.BoardDVO;
import com.soheejjang.board.service.impl.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardServiceImpl;
	
	 /**
	 * 게시판 조회
	 * @param boardVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/board/boardList.do")
	public String boardList(@ModelAttribute("boardDVO")BoardDVO boardDVO, Model model) throws Exception{
		List<BoardDVO> list = boardServiceImpl.selectBoardList(boardDVO);
		
		model.addAttribute("list", list);
		
		return "/board/boardList";
	}
	/**
     * 글쓰기 폼
     * @return
     * @throws Exception
     */
	
	@RequestMapping(value="/board/writeForm.do")
	public String writeBoardForm() throws Exception{
		return "board/writeForm"; 
	}
	
	 /**
     * 게시글 등록
     * @param boardVO
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping(value="/board/write.do")
	public String write(@ModelAttribute("boardDVO") BoardDVO boardDVO, Model model)throws Exception{
		boardServiceImpl.insertBoard(boardDVO);
		
		return "redirect:/board/boardList.do"; 
	}
	
	/**
     * 게시글 조회
     * @param boardVO
     * @param model
     * @param request
     * @return
     * @throws Exception
     */
	@RequestMapping(value="/board/viewContent.do")
	public String viewForm(@ModelAttribute("boardDVO") BoardDVO boardDVO, Model model, HttpServletRequest requet)throws Exception{
		int no = Integer.parseInt(requet.getParameter("no"));
		/* int no = Integer.parseInt(request.getParameter("no")); */
		boardDVO.setNo(no);
		
		BoardDVO resultDVO = boardServiceImpl.selectBoardByNo(boardDVO);
		
		model.addAttribute("result", resultDVO);
		
		return "board/reviewForm";
		
	}
	
	/**
     * 게시글 수정
     * @param boardVO
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping(value="/board/updateboard.do")
	public String updateBoard(@ModelAttribute("boardDVO") BoardDVO boardDVO, Model model)throws Exception{
		try {
			boardServiceImpl.updateBoard(boardDVO);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/board/boardList.do";
	}
	
}
