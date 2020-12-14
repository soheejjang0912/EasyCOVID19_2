package com.soheejjang.board.service.impl;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;
 
public interface BoardService {
 
    /**
     * 게시물 리스트 조회
     * @param boardVO
     * @return
     * @throws Exception
     */
    public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception;
    
    /**
     * 게시물 작성
     * @param boardVO
     * @throws Exception
     */
    public void insertBoard(BoardDVO boardDVO) throws Exception;
    
    /**
     * 게시물 수정
     * @param boardVO
     * @throws Exception
     */
    public void updateBoard(BoardDVO boardDVO) throws Exception;
    
    /**
     * 게시물 삭제
     * @param boardVO
     * @throws Exception
     */
    public void deleteBoard(BoardDVO boardDVO) throws Exception;
 
    /**
     * 게시글 조회
     * @param boardVO
     * @return
     * @throws Exception
     */
    public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception;
}
 