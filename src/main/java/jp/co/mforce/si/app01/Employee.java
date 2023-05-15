package jp.co.mforce.si.app01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private long id;

	private String code;

	private String email;

	private String firstName;

	private String lastName;
}
