package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class AgentType {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String module;
	
	public AgentType() {
	}
	
	public AgentType(String name, String module) {
		//super();
		this.name = name;
		this.module = module;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModule() {
		return module;
	}


	public void setModule(String module) {
		this.module = module;
	}
	
}
