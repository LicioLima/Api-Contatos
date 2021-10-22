package br.com.api.contatos.dto;

import java.util.List;

public class ContactDTO {
	private List <ContactDTO> createdContactList;
	public List <ContactDTO> getCreatedConcactList(){
		return createdContactList
	}
	public void setCreatedContactList(List<ContactDTO> createdContactList) {
		this.createdContactList = createdContactList;
	}
	}
