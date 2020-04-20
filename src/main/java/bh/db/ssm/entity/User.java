package bh.db.ssm.entity;

import java.io.Serializable;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:47
 */
public class User implements Serializable {

	private Integer id;

	private String username;

	private String password;

	private UserInfo userInfo;

	private String createData;

	private String updateData;

	//用户状态 1为使用  0为不使用
	private Integer state;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateData() {
		return createData;
	}

	public void setCreateData(String createData) {
		this.createData = createData;
	}

	public String getUpdateData() {
		return updateData;
	}

	public void setUpdateData(String updateData) {
		this.updateData = updateData;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public User(Integer id, String username, String password, String createData, String updateData, UserInfo userInfo, Integer state) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.createData = createData;
		this.updateData = updateData;
		this.userInfo = userInfo;
		this.state = state;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", createData='" + createData + '\'' +
				", updateData='" + updateData + '\'' +
				", userInfo=" + userInfo +
				", state=" + state +
				'}';
	}
}
