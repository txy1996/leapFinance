/**
 * SupAndTech.java
 */
package entity;


/**
 * @author SGY
 * @date 2018年3月26日
 * 供应商技术关系表实体表
 */
public class SupAndTech {
	private int id;
	private int sup_id;//供应商id
	private int tech_id;//技术id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public SupAndTech() {
		super();
	}
	
	public int getSup_id() {
		return sup_id;
	}
	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}
	public int getTech_id() {
		return tech_id;
	}
	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}

}
