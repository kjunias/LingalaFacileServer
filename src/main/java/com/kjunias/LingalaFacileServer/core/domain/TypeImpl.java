package com.kjunias.LingalaFacileServer.core.domain;

public class TypeImpl implements Type {
	String type;
	
	public TypeImpl(String type) {
		super();
		this.type = type;
	}

	@Override
	public String getType() {
		return this.type;
	}

}
