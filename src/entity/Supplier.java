package entity;

import java.util.List;

/**
 * 供应商表对应实体类
 * @Supplier.java
 * @author 谭加益
 * @time 2018年3月26日下午5:11:38
 */
public class Supplier {
	private int id;//供应商表id
	private String supperlier_name;//供应商名称
	
	private List<Project> project;

	/**
	 * 技术类型
	 */
	private List<Tech> techs;
	
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupperlier_name() {
		return supperlier_name;
	}
	public void setSupperlier_name(String supperlier_name) {
		this.supperlier_name = supperlier_name;
	}
	public Supplier(int id, String supperlier_name) {
		super();
		this.id = id;
		this.supperlier_name = supperlier_name;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Tech> getTechs() {
		return techs;
	}
	public void setTechs(List<Tech> techs) {
		this.techs = techs;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", supperlier_name=" + supperlier_name + ", techs=" + techs + "]";
	}


}
