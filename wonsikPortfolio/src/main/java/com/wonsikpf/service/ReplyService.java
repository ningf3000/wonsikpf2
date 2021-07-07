package com.wonsikpf.service;

import java.util.List;

import com.wonsikpf.domain.Criteria;
import com.wonsikpf.domain.ReplyPageDTO;
import com.wonsikpf.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO vo);

	public ReplyVO get(Long rno);

	public int modify(ReplyVO vo);

	public int remove(Long rno);

	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);

}
