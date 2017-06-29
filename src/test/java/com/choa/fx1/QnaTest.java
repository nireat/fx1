package com.choa.fx1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.qna.QnaDAO;
import com.choa.qna.QnaDTO;

public class QnaTest extends MyAbstractTestUnit {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void test() throws Exception{
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setNum(74);
		qnaDTO.setTitle("re");
		qnaDTO.setContents("re");
		assertEquals(1, qnaDAO.reply(qnaDTO));
		
		System.out.println("Reply Test");
		
	}

}
