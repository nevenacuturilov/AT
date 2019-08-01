package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AID {

	@Id
    @GeneratedValue
    private Integer id;
	
	private String name;
	private AgentskiCentar host;
	private AgentType type;
	
	public AID() {
	}
	
	public AID(String name, AgentskiCentar host, AgentType type) {
		//super();
		this.name = name;
		this.host = host;
		this.type = type;
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

	public AgentskiCentar getHost() {
		return host;
	}

	public void setHost(AgentskiCentar host) {
		this.host = host;
	}

	public AgentType getType() {
		return type;
	}

	public void setType(AgentType type) {
		this.type = type;
	}
	
}
