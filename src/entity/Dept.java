package entity;

import java.util.List;

/**
 * 
 * @author 部门表 陈光辉
 * @date2018年3月26日下午3:25:38
 *
 */
public class Dept {

	private int id; // 部门表ID
	private String dept_name; // 部门名称
	private String Abbreviation;// 部门简称

	private int available;

//	一个部门对应多个项目，一对多关系
	private List<Project> project;
	

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

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getAbbreviation() {
		return Abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		Abbreviation = abbreviation;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", dept_name=" + dept_name + ", Abbreviation=" + Abbreviation + ", available="
				+ available + ", project=" + project + "]";
	}

}
