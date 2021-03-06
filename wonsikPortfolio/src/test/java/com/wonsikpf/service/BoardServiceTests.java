//package com.wonsikpf.service;
//
//import static org.junit.Assert.assertNotNull;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.wonsikpf.domain.BoardVO;
//
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
//public class BoardServiceTests {
//	
//	@Setter(onMethod_ = {@Autowired })
//	private BoardService service;
//	
//	@Test
//	public void testExist() {
//		
//		log.info(service);
//		assertNotNull(service);
//	}
//
//
//	@Test
//	public void testRegister() {
//		
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("Test Title2");;
//		board.setContent("Test Content 2");
//		board.setWriter("Test Writer2");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물 번호: " + board.getBno());
//	}
//}