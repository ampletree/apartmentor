package com.kh.apartmentor.parking.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.apartmentor.common.model.vo.PageInfo;
import com.kh.apartmentor.common.model.vo.Reserve;
import com.kh.apartmentor.parking.model.dao.RegoCarDao;
import com.kh.apartmentor.parking.model.vo.Parking;

@Service
public class RegoCarService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private RegoCarDao regoCarDao;
	
	
	public int insertRegoCar(Parking p){
		return regoCarDao.insertRegoCar(sqlSession, p);
	}
	
	public ArrayList<Parking> selectRegoCarList(int userNo){
		return regoCarDao.selectRegoCarList(sqlSession, userNo);
	}
	
	public int deleteRegoCar(String carNo){
		return regoCarDao.deleteRegoCar(sqlSession, carNo);
	}
	
	//-------------- 관리자 -----------------------
	public int adminRegoCarListCount(String category) {
		int result = regoCarDao.adminRegoCarListCount(sqlSession, category);
		System.out.println(result);
		return result;
	}
	
	public ArrayList<Parking> adminRegoCarList(String category, PageInfo pi){
		return regoCarDao.adminRegoCarList(sqlSession, category, pi);
	}
	
	public int appRegoCar(String carNo){
		return regoCarDao.appRegoCar(sqlSession, carNo);
	}
	
	
	
	
	
}
