package bh.db.ssm.entity;


import java.io.Serializable;

public class Member implements Serializable {

	private Long id;
	private String memberName;
	private String password;
	private Integer sex;
	private String phone;
	private String address;
	private String shoppingAddress;
	private String createDate;
	private String updateDate;
	private Integer state;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShoppingAddress() {
		return shoppingAddress;
	}

	public void setShoppingAddress(String shoppingAddress) {
		this.shoppingAddress = shoppingAddress;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Member{" +
				"id=" + id +
				", memberName='" + memberName + '\'' +
				", password='" + password + '\'' +
				", sex=" + sex +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", shoppingAddress='" + shoppingAddress + '\'' +
				", createDate='" + createDate + '\'' +
				", updateDate='" + updateDate + '\'' +
				", state=" + state +
				'}';
	}

	public Member(Long id, String memberName, String password, Integer sex, String phone, String address, String shoppingAddress, String createDate, String updateDate, Integer state) {
		this.id = id;
		this.memberName = memberName;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.shoppingAddress = shoppingAddress;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.state = state;
	}

	public Member() {
	}
}
