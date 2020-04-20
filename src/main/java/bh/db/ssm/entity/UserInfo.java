package bh.db.ssm.entity;


import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {

	private Integer uid;
	private String trueName;
	private Integer sex;
	private Integer age;
	private String phone;
	private String email;
	private String birthday;
	private Integer state;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public UserInfo() {
	}

	public UserInfo(Integer uid, String trueName, Integer sex, Integer age, String phone, String email, String birthday, Integer state) {
		this.uid = uid;
		this.trueName = trueName;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"uid=" + uid +
				", trueName='" + trueName + '\'' +
				", sex=" + sex +
				", age=" + age +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", birthday=" + birthday +
				", state=" + state +
				'}';
	}
}
