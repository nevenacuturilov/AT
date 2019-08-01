package models;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ACLPoruka {
	
	public enum Performative {
        ACCEPT_PROPOSAL,
        AGREE,
        CANCEL,
        CALL_FOR_PROPOSAL,
        CONFIRM,
        DISCONFIRM,
        FAILURE,
        INFORM,
        INFORM_IF,
        INFORM_REF,
        NOT_UNDERSTOOD,
        PROPOSE,
        QUERY_IF,
        QUERY_REF,
        REFUSE,
        REJECT_PROPOSAL,
        REQUEST,
        REQUEST_WHEN,
        REQUEST_WHENEVER,
        SUBSCRIBE,
        PROXY,
        PROPAGATE,
        UNKNOWN,
    }
	
	@Id
    @GeneratedValue
    private Integer id;
	
	private Performative performative;
	private AID sender;
	private AID[] receivers;
	private AID replyTo;
	private String content;
	private Object contentObj;
	private HashMap<String, Object> userArgs;
	private String language;
	private String encoding;
	private String ontology;
	private String protocol;
	private String conversationId;
	private String replyWith;
	private String InReplyTo;
	private Long replyBy;
	
	public ACLPoruka() {
	}
	
	public ACLPoruka(AID sender, AID[] receivers) {
		//super();
		this.sender = sender;
		this.receivers = receivers;
	}
	
	//full konstruktor??

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Performative getPerformative() {
		return performative;
	}

	public void setPerformative(Performative performative) {
		this.performative = performative;
	}

	public AID getSender() {
		return sender;
	}

	public void setSender(AID sender) {
		this.sender = sender;
	}

	public AID[] getReceivers() {
		return receivers;
	}

	public void setReceivers(AID[] receivers) {
		this.receivers = receivers;
	}

	public AID getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(AID replyTo) {
		this.replyTo = replyTo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Object getContentObj() {
		return contentObj;
	}

	public void setContentObjt(Object contentObj) {
		this.contentObj = contentObj;
	}

	public HashMap<String, Object> getUserArgs() {
		return userArgs;
	}

	public void setUserArgs(HashMap<String, Object> userArgs) {
		this.userArgs = userArgs;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getOntology() {
		return ontology;
	}

	public void setOntology(String ontology) {
		this.ontology = ontology;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getReplyWith() {
		return replyWith;
	}

	public void setReplyWith(String replyWith) {
		this.replyWith = replyWith;
	}

	public String getInReplyTo() {
		return InReplyTo;
	}

	public void setInReplyTo(String inReplyTo) {
		InReplyTo = inReplyTo;
	}

	public Long getReplyBy() {
		return replyBy;
	}

	public void setReplyBy(Long replyBy) {
		this.replyBy = replyBy;
	}
	
}
