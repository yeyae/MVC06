package com.globalin.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	// dual 은 오라클에서 제공하는 더미 테이블
	@Select("select sysdate from dual")
	public String getTime();

	public String getTime2();
}
