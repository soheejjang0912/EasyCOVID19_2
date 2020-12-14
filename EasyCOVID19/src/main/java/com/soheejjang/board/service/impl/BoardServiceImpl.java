package com.soheejjang.board.service.impl;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.soheejjang.board.service.BoardDVO;
 
@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService{
    
    @Autowired
    private BoardDAO boardDAOService;
    
    @Override
    public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception {
        List<BoardDVO> list = null;
        list = boardDAOService.selectBoardList(boardDVO);
        return list;
    }
 
    @Override
    public void insertBoard(BoardDVO boardDVO) throws Exception {
        boardDAOService.insertBoard(boardDVO);
    }
 
    @Override
    public void updateBoard(BoardDVO boardDVO) throws Exception {
        boardDAOService.updateBoard(boardDVO);
    }
 
    @Override
    public void deleteBoard(BoardDVO boardDVO) throws Exception {
        boardDAOService.deleteBoard(boardDVO);
    }
 
    @Override
    public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception {
        
    	BoardDVO resultDVO = boardDAOService.selectBoardByNo(boardDVO);
        
        return resultDVO; 
    }
 
}
 
