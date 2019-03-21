package com.smart.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.smart.bean.ParkBean;

//停车场接口
@Repository
public interface ParkDaoInterface {
	/**
	 * 查看停车区域是否有录入系统
	 */
	public List<ParkBean> findParkByParkArea(String parkArea);
	
	/**
	 * 根据区域查询车位数量
	 */
	public int findParkNumByParkArea(String parkArea);

	/**
	 * 添加车位
	 */
	public int addParkSpace(@Param("parkArea") String parkArea,
			@Param("parkNum") int parkNum,@Param("parkState") String parkState);
	/**
	 * 修改车位状态
	 */
	public int updateParkStateByAreaAndNum(@Param("parkState") String parkState,
			@Param("parkArea") String parkArea,@Param("parkNum") int parkNum);
	/**
	 * 删除车位
	 */
	public int deleParkNumByAreaAndNum(@Param("parkArea") String parkArea,
			@Param("parkNum") int parkNum);
	/**
	 * 查询车位使用状态个数
	 */
	public int findPark(String parkState);
	/**
	 * 根据车号查找车位
	 * 
	 */
	public ParkBean findParkNumByCarNum(String carNum);
	/**
	 * 根据参数名查找公司所在的城市或者地址
	 */
	public String findCityByParanName(String paramName);
}
