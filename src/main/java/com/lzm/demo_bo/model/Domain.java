package com.lzm.demo_bo.model;

/**
 * @author 爱不留
 * @date 2018年5月18日 下午2:15:20
 **/
public class Domain {

	private String id;
	private String cc;
	private Integer kind;
	private String domain;
	private Long ln;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Integer getKind() {
		return kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Long getLn() {
		return ln;
	}

	public void setLn(Long ln) {
		this.ln = ln;
	}

}
