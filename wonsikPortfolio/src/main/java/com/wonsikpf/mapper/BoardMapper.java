package com.wonsikpf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.wonsikpf.domain.BoardAttachVO;
import com.wonsikpf.domain.BoardVO;
import com.wonsikpf.domain.Criteria;

public interface BoardMapper {

	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);

	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
	
	public List<BoardAttachVO> findByBno(Long bno);

}
 