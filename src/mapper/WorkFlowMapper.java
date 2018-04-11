package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Project;
import entity.WorkFlow;
/**
 * 工作流程功能接口方法
 * @WorkFlowMapper.java
 * @author 谭加益
 * @time 2018年3月26日下午7:11:08
 */
public interface WorkFlowMapper {
	/**
	 * 查询开始时间
	 * @return String
	 */
	public List<WorkFlow> findStartTime(@Param(value="art_id")int art_id);
	/**
	 * 查询结束时间
	 * @return String
	 */
	public List<WorkFlow> findEndTime(@Param(value="art_id")int art_id);
	/**
	 * 点击开始按钮，将开始时间保存在数据库中
	 * @param startTime void
	 */
	public void saveStartTime(@Param(value="starttime")String startTime,@Param(value="art_id")int art_id,@Param(value="project_id")int project);
	/**
	 * 点击暂停按钮，将当前点击时间更新到数据库中区
	 * @param endTime
	 * @param art_id void
	 */
	public void updateEndTime(@Param(value="endtime")String endTime,@Param(value="art_id")int art_id);
	/**
	 * 在获取到了当前时间同时，计算出当前条数据时间差存入数据库中
	 * @param titalTime
	 * @param art_id void
	 */
	public void updateTitalTime(@Param(value="titaltime")int titalTime,@Param(value="art_id")int art_id);
	/**
	 * 点击开始按钮，保存时间和项目和技术人员
	 */
	public void insertStratTimeAndProjectAndArt(WorkFlow wf);
	/**
	 * 删除流程表
	 * @param pr
	 */
	public void deleteFlow(Project pr);
}
