package bh.db.ssm.commons.pojo;

/**
 * @author 石皓岩
 * @create 2019-11-14-20:55
 * 描述：
 */
public class Statistics {

	/**
	 * 一星期内，每天新增加的人数
	 */
	private Week<Integer> persons;
	/**
	 * 一周之内的PV量
	 */
	private Week<Integer> pv;
	/**
	 * 一周之内UV量
	 */
	private Week<Integer> uv;
	/**
	 * 图片服务器使用量
	 */
	private	Double fileServerQuantity;

	public Week<Integer> getPersons() {
		return persons;
	}

	public void setPersons(Week<Integer> persons) {
		this.persons = persons;
	}

	public Week<Integer> getPv() {
		return pv;
	}

	public void setPv(Week<Integer> pv) {
		this.pv = pv;
	}

	public Week<Integer> getUv() {
		return uv;
	}

	public void setUv(Week<Integer> uv) {
		this.uv = uv;
	}

	public Double getFileServerQuantity() {
		return fileServerQuantity;
	}

	public void setFileServerQuantity(Double fileServerQuantity) {
		this.fileServerQuantity = fileServerQuantity;
	}

	@Override
	public String toString() {
		return "Statistics{" +
				"persons=" + persons +
				", pv=" + pv +
				", uv=" + uv +
				", fileServerQuantity=" + fileServerQuantity +
				'}';
	}

	public Statistics(Week<Integer> persons, Week<Integer> pv, Week<Integer> uv, Double fileServerQuantity) {
		this.persons = persons;
		this.pv = pv;
		this.uv = uv;
		this.fileServerQuantity = fileServerQuantity;
	}

	public Statistics() {
	}
}
