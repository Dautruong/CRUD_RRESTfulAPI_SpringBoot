package com.test.info;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="infor")
public class User {
	 	private Integer id;
	    private String name;
	    private Integer age;
		public User(Integer id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public User() {
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer getId() {
	        return id;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public void setId(Integer id) {
			this.id = id;
		}
	    
}
