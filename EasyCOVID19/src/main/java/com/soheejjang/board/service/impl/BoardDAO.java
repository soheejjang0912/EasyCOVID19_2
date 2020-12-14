package com.soheejjang.board.service.impl;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;

public interface BoardDAO {

	 /**
     * 게시물 리스트 조회
     * @param boardVO
     * @return
     * @throws Exception
     */
    List<BoardDVO> selectBoardList(BoardDVO boardVO) throws Exception;
 
    /**
     * 게시물 등록
     * @param boardVO
     * @throws Exception
     */
    void insertBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * 게시물 수정
     * @param boardVO
     * @throws Exception
     */
    void updateBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * 게시물 삭제
     * @param boardVO
     * @throws Exception
     */
    void deleteBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * 게시물 조회
     * @param boardVO
     * @return
     * @throws Exception
     */
    BoardDVO selectBoardByNo(BoardDVO boardVO) throws Exception;
}
