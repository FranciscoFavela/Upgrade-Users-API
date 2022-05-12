package com.example.basic.Entities;

import javax.persistence.*;

import lombok.*;
import org.hibernate.envers.Audited;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "tbl_profiles")
public class Profile extends Base {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "idprofile")
	private int idprofile;
	@Column(name = "profile")
	private String profile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
