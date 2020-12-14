package com.soheejjang.board.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soheejjang.board.service.BoardDVO;
import com.soheejjang.board.service.mapper.BoardMapper;

@Service("boardDAOService")
public class BoardDAOService implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardDVO> selectBoardList(BoardDVO boardDVO) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.selectBoardList(boardDVO);
	}
	
	public void insertBoard(BoardDVO boardDVO) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.insertBoard(boardDVO);
	}
	
	public void updateBoard(BoardDVO boardDVO) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.updateBoard(boardDVO);
	}
	
	public void deleteBoard(BoardDVO boardDVO) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.deleteBoard(boardDVO);
	}

	@Override
	public BoardDVO selectBoardByNo(BoardDVO boardDVO) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.selectBoardByNo(boardDVO);
	} 
	
}
