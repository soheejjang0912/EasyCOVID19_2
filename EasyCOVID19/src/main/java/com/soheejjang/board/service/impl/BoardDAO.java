package com.soheejjang.board.service.impl;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;

public interface BoardDAO {

	 /**
     * �Խù� ����Ʈ ��ȸ
     * @param boardVO
     * @return
     * @throws Exception
     */
    List<BoardDVO> selectBoardList(BoardDVO boardVO) throws Exception;
 
    /**
     * �Խù� ���
     * @param boardVO
     * @throws Exception
     */
    void insertBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * �Խù� ����
     * @param boardVO
     * @throws Exception
     */
    void updateBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * �Խù� ����
     * @param boardVO
     * @throws Exception
     */
    void deleteBoard(BoardDVO boardVO) throws Exception;
 
    /**
     * �Խù� ��ȸ
     * @param boardVO
     * @return
     * @throws Exception
     */
    BoardDVO selectBoardByNo(BoardDVO boardVO) throws Exception;
}
