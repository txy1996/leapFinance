package service;

import java.util.List;

import entity.Artisan;
import entity.Tech;
import entity.Project;
import entity.Role;
import entity.Supplier;
import entity.TechVo;

public interface TechService {

	// 查找供应商名称
	TechVo findBySupplier();
	
	// 查找技术类型根据供应商名称
	TechVo findTechBySupplierId(Supplier su);

	// 查询员工数目
	TechVo findArtisanByTechIdAndSupIdAndCount(Artisan at);

	// 查询具体的员工
	List<Artisan> findArtisanByTechIdAndSupIdANDState(Artisan at);
	//查询所有技术类型
	public List<Tech> findAllTech(String projectName);

	// 修改项目表，员工表，供应关系表，工作流表
	TechVo updateArtisanAndWorkflowAndProjectAndSup_techAdd(Artisan at, Project pr);
	//点击模式重置 根据项目 id 项目表供应商外键为0，工程师总数为0，供应商外键为0，
	//人员表 根据项目 id 全部为技术表ID为0，项目id为0状态为1
	//工作流程表根据项目id 删除
	void updateMode(Project pr);
	/**
	 * 查询项目库
	 * @param at
	 * @return
	 */
	List<Project> findProject(Role rl);

}
