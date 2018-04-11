/**
 * FpMgrAction.java
 */
package controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Artisan;
import entity.SupAndTech;
import entity.Supplier;
import service.FpMgrService;

/**
 * @author SGY
 * @date 2018年3月27日
 * 供应商管理控制层
 */
@Controller
public class FpMgrAction {
	@Resource
	private FpMgrService fpMgrService;
	private static final int workhour = 120;//假设一个项目预计工作时间是120小时，换成成天为5天
	/**
	 * 返回所有供应商
	 * @return
	 */
	@ResponseBody
	@RequestMapping("searchAllSupp.action")
	public List<Supplier> searchAllSupp(){
		
		return fpMgrService.searchAll();
	}
	/**
	 * 根据供应商id返回所有技术类型
	 * @param supid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("searchTechBySupId.action")
	public List<Supplier> searchTechBySupId(int supid){
		return fpMgrService.searchBySupId(supid);
	}
	/**
	 * 根据供应商id和技术类型id返回所有技术人员
	 * @param supid
	 * @param techid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("searchArtBySupidAndTech.action")
	public List<Artisan> searchArtBySupidAndTech(int supid,int techid){
		return fpMgrService.searchBySupIdAndTechid(supid, techid);
	}
	/**
	 * 增加供应商
	 * @param fpName
	 */
	@ResponseBody
	@RequestMapping("addFP.action")
	public int addFP(String fpName){
		fpMgrService.addFp(fpName);
		return 1;
	}
	/**
	 * 根据供应商增加技术类型
	 * @return
	 */
	@ResponseBody
	@RequestMapping("addTech.action")
	public SupAndTech addTech(String fpName,String techName){
		return fpMgrService.addTech(fpName,techName);
	}
	/**
	 * 根据供应商、技术类型添加技术人员
	 */
	@ResponseBody
	@RequestMapping("addengineer.action")
	public Artisan addEngineer(String fpName,String techName,String artName,String level){
		return fpMgrService.addEngin(fpName, techName, artName, level);
	}
	@ResponseBody
	@RequestMapping("updateArtState.action")
	public int updateArtState(int art_id){
		boolean flag = fpMgrService.updateArtState(art_id);
		if(flag){
			return 1;
		}else{
			return -1;
		}
	}
	/**
	 * 根据技术类型id查询对应的技术人员
	 * @param tech_id
	 * @return List<Artisan>
	 */
	@ResponseBody
	@RequestMapping("findArtisanByTech.action")
	public List<Artisan> findArtisanByTech(int tech_id){
		return fpMgrService.findArtisanByTech(tech_id);		
	}
	/**
	 * 根据项目名称查询所做该项目的技术人员
	 * @param projectName
	 * @return List<Artisan>
	 */
	@ResponseBody
	@RequestMapping("findArtByProjectName.action")
	public List<Artisan> findArtByProjectName(String projectName){
		return fpMgrService.findArtByProjectName(projectName);		
	}
	/**
	 * 删除供应商相关信息
	 */
	@ResponseBody
	@RequestMapping("delEnginner")
	public int delEnginner(int supId,int techId,int id){
		boolean flag = fpMgrService.delEngin(supId, techId, id);
		if(flag){
			return 1;
		}else{
			return -1;
		}
	}
	/**
	 * 查询工程师的工作流程
	 * @return String
	 */
	@ResponseBody
	@RequestMapping("calWorkFlow.action")
	public List<Integer> calWorkFlow(int art_id){
		System.out.println("计算时间操作");
		List<Integer> listhour = fpMgrService.calWorkFlow(art_id);
//		List<Double> speed = new LinkedList<Double>();
//		for(int i=0;i<listhour.size();i++){
//			double d = listhour.get(i);
//			speed.add(d);
//		}
		System.out.println(listhour.size());
		return listhour;
	}
}
