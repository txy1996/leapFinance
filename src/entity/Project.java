package entity;

import java.util.List;

/**
 * 
 * @author 项目表 陈光辉
 * @date2018年3月26日下午3:25:38
 */
public class Project {
	private int id;// 项目表ID
	private String project_name;// 项目名称
	private String project_time;// 创建时间
	private String stage;// 项目阶段
	private int amount;// 项目金额
	private int dept_id;// 部门ID
	private String product_mgr;// 产品经理
	private String project_mgr;// 项目经理
	private String art_mgr;// 技术经理
	private String mode;// 模式类型
	private int supplier_id;// 供应商ID
	private int senior_engineer=0;// 高级工程师
	private int middle_engineer=0;// 中级工程师
	private int primary_engineer=0;// 初级工程师
	
	private Dept dept;
	private Supplier supplier;
	private List<Artisan> arts;
		
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supperlier) {
		this.supplier = supperlier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_time() {
		return project_time;
	}
	public void setProject_time(String project_time) {
		this.project_time = project_time;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getProduct_mgr() {
		return product_mgr;
	}
	public void setProduct_mgr(String product_mgr) {
		this.product_mgr = product_mgr;
	}
	public String getProject_mgr() {
		return project_mgr;
	}
	public void setProject_mgr(String project_mgr) {
		this.project_mgr = project_mgr;
	}
	public String getArt_mgr() {
		return art_mgr;
	}
	public void setArt_mgr(String art_mgr) {
		this.art_mgr = art_mgr;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getSenior_engineer() {
		return senior_engineer;
	}
	public void setSenior_engineer(int senior_engineer) {
		this.senior_engineer = senior_engineer;
	}
	public int getMiddle_engineer() {
		return middle_engineer;
	}
	public void setMiddle_engineer(int middle_engineer) {
		this.middle_engineer = middle_engineer;
	}
	public int getPrimary_engineer() {
		return primary_engineer;
	}
	public void setPrimary_engineer(int primary_engineer) {
		this.primary_engineer = primary_engineer;
	}
	public List<Artisan> getArts() {
		return arts;
	}
	public void setArts(List<Artisan> arts) {
		this.arts = arts;
	}

	
	
	
}
