package service;

import java.util.List;

import entity.Project;

public interface ProjectService {
	/**
	 * 根据角色查询所有项目信息
	 * @param role_id
	 * @return List<Project>
	 */
	public List<Project> findProject(int role_id);
	/**
	 * 根据项目名称，修改当前项目的项目经理
	 * @param projectName
	 * @param projectMgr void
	 */
	public void updateProjectMgr(String projectMgr,String projectName);
	/**
	 * 根据项目id查询技术人员
	 * @param id
	 * @return
	 */
	public List<Project> findArtByProid(int id);
}