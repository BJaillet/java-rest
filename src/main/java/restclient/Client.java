package restclient;

import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nom;
	private String email;
	private String password;
	private Integer age;
	private Date dateInscription;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", email=" + email
				+ ", password=" + password + ", age=" + age
				+ ", dateInscription=" + dateInscription + "]";
	}
	
}
