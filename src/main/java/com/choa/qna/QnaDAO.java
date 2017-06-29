package com.choa.qna;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="QnaMapper.";
	
	
	public int write(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.insert(namespace+"write", map);
		int result = (Integer)map.get("result");
		System.out.println(result);
		return 0;
	}
	
	public int update(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.selectOne(namespace+"update", qnaDTO);
		int result = (Integer)map.get("result");
		System.out.println(result);
		return result;
	}
	
	public int reply(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.insert(namespace+"reply", qnaDTO);
		int result = (Integer)map.get("result");
		System.out.println(result);
		return result;
	}

}
