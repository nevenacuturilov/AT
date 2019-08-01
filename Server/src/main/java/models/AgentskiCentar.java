package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgentskiCentar {
	
	@Id
    @GeneratedValue
    private Integer id;
	
	private String alias;
	private String address;
	
	public AgentskiCentar() {
	}
	
	public AgentskiCentar(String alias, String address) {
		//super();
		this.alias = alias;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	

}
