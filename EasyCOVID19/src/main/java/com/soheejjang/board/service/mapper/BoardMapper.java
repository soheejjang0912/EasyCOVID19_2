package com.soheejjang.board.service.mapper;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;


public interface BoardMapper {

    // �Խù� ����Ʈ ��ȸ
    public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception;
    
    // �Խù� ���
    public void insertBoard(BoardDVO boardDVO) throws Exception;
    
    // �Խù� ����
    public void updateBoard(BoardDVO boardDVO) throws Exception;
    
    // �Խù� ����
    public void deleteBoard(BoardDVO boardDVO) throws Exception;
 
    // �Խù� ��ȸ
    public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception;
    
}