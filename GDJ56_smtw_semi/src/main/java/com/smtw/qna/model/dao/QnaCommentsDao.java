package com.smtw.qna.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.smtw.common.JDBCTemplate.*;
import com.smtw.qna.model.vo.QnaComments;

public class QnaCommentsDao {
	
	private Properties sql=new Properties();
	
	public QnaCommentsDao() {
		String path=QnaDao.class.getResource("/sql/qna/qnaComments_sql.properties").getPath();
		try {
			sql.load(new FileReader(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//해당 게시글의 댓글 출력
	public List<QnaComments> selectQnaComments(Connection conn,int qnaNo){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<QnaComments> list=new ArrayList();
		
		try {
			pstmt=conn.prepareStatement(sql.getProperty("selectQnaComments"));
			pstmt.setInt(1, qnaNo);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(getQnaComments(rs));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	//댓글삭제
	public int deleteQnaComment(Connection conn, int qnaNo, int qcNo) {
		PreparedStatement pstmt=null;
		int result=0;
		
		try {
			pstmt=conn.prepareStatement(sql.getProperty("deleteQnaComment"));
			pstmt.setInt(1, qnaNo);
			pstmt.setInt(2, qcNo);
			
			result=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}return result;
	}
	
	
	
	
	
	
	
	
	private QnaComments getQnaComments(ResultSet rs)throws SQLException{
		return QnaComments.builder()
				.qnaCoNo(rs.getInt("qnaco_no"))
				.qcContents(rs.getString("qc_contents"))
				.enrollDate(rs.getDate("enroll_date"))
				.qnaNo2(rs.getInt("qna_no2"))
				.memberId(rs.getString("member_id"))
				.build();
	}
	
}
