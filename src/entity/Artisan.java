package entity;
/**
 * 技术人员表
 * @author 张文聪
 * 2018年3月26日
 *
 */
public class Artisan {
	private int id ;
	private String art_name;
	private String art_type;
	private int tech_id;
	private int salary;
	private int state;
	private int sup_id;
	private int project_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArt_name() {
		return art_name;
	}
	public void setArt_name(String art_name) {
		this.art_name = art_name;
	}
	public String getArt_type() {
		return art_type;
	}
	public void setArt_type(String art_type) {
		this.art_type = art_type;
	}
	public int getTech_id() {
		return tech_id;
	}
	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getSup_id() {
		return sup_id;
	}
	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	@Override
	public String toString() {
		return "Artisan [id=" + id + ", art_name=" + art_name + ", art_type=" + art_type + ", tech_id=" + tech_id
				+ ", salary=" + salary + ", state=" + state + ", sup_id=" + sup_id + ", project_id=" + project_id + "]";
	}
	
	
	
}
