package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agent {
	

	@Id
    @GeneratedValue
	private AID id;
	
	//da li za id staviti id iz AID?
	
	public Agent() {
	}

	/*public Agent(AID id) {
		//super();
		this.id = id;
	}*/

	public AID getId() {
		return id;
	}

	public void setId(AID id) {
		this.id = id;
	}

}
