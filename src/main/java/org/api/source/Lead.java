package org.api.source;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="lead")
public class Lead implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		

	   @SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="lead_id_seq", name="lead_id_seq")
	   @GeneratedValue(generator="lead_id_seq", strategy=GenerationType.SEQUENCE)
	   @Id
	   @Column(name="id")
	   private int id;
	   
	   @Column(name = "first_name")
	   private String first_name;
		
	   @Column(name = "last_name")
	   private String last_name;
	   
	   @Column(name = "pesel")
	   private String pesel;
	   
	   @Column(name = "id_statusu")
	   private int id_statusu;
	   
	   @Column(name = "ammount")
	   private Double ammount;
	   

	  
	   
	   public int getId() {
		    return id;
	   }
	   
		public void setId(int id) {
			this.id = id;
		}
		
	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}


	

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public int getIdstatusu() {
		return id_statusu;
	}

	public void setIdstatusu(int id_statusu) {
		this.id_statusu = id_statusu;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

}
