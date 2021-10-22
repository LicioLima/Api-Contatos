package br.com.api.contatos.model.request;

import br.com.api.contatos.dto.AddressDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactRequestModel {
	private String name;
	private AddressDTO address;
	private String phone;
	private String email;
	private String birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
