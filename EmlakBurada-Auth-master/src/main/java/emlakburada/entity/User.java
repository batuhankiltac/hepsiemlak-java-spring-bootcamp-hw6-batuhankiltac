package emlakburada.entity;

import emlakburada.entity.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {

	@Id
	private Integer id;
	private String email;
	private String password;

	@Enumerated(EnumType.STRING)
	private UserType userType;

}