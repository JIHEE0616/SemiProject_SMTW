package com.smtw.qna.model.service;

import static com.smtw.common.JDBCTemplate.close;
import static com.smtw.common.JDBCTemplate.commit;
import static com.smtw.common.JDBCTemplate.getConnection;
import static com.smtw.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.smtw.qna.model.dao.QnaCommentsDao;
import com.smtw.qna.model.vo.QnaComments;

public class QnaCommentsService {
	
	private QnaCommentsDao dao=new QnaCommentsDao();
	
	public List<QnaComments> selectQnaComments(int qnaNo){
		Connection conn=getConnection();
		List<QnaComments> list=dao.selectQnaComments(conn,qnaNo);
		close(conn);
		return list;
	}
	
	public int deleteQnaComment(int qnaNo, int qcNo) {
		Connection conn=getConnection();
		int result=dao.deleteQnaComment(conn,qnaNo,qcNo);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
}
