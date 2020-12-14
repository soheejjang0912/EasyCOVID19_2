package com.soheejjang.board.service.impl;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;
 
public interface BoardService {
 
    /**
     * �Խù� ����Ʈ ��ȸ
     * @param boardVO
     * @return
     * @throws Exception
     */
    public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception;
    
    /**
     * �Խù� �ۼ�
     * @param boardVO
     * @throws Exception
     */
    public void insertBoard(BoardDVO boardDVO) throws Exception;
    
    /**
     * �Խù� ����
     * @param boardVO
     * @throws Exception
     */
    public void updateBoard(BoardDVO boardDVO) throws Exception;
    
    /**
     * �Խù� ����
     * @param boardVO
     * @throws Exception
     */
    public void deleteBoard(BoardDVO boardDVO) throws Exception;
 
    /**
     * �Խñ� ��ȸ
     * @param boardVO
     * @return
     * @throws Exception
     */
    public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception;
}
 