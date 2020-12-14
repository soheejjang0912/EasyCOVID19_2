package com.soheejjang.board.service.mapper;

import java.util.List;

import com.soheejjang.board.service.BoardDVO;


public interface BoardMapper {

    // 게시물 리스트 조회
    public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception;
    
    // 게시물 등록
    public void insertBoard(BoardDVO boardDVO) throws Exception;
    
    // 게시물 수정
    public void updateBoard(BoardDVO boardDVO) throws Exception;
    
    // 게시물 삭제
    public void deleteBoard(BoardDVO boardDVO) throws Exception;
 
    // 게시물 조회
    public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception;
    
}