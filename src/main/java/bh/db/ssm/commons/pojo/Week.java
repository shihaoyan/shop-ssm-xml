package bh.db.ssm.commons.pojo;

/**
 * @author 石皓岩
 * @create 2019-11-14-20:59
 * 描述：定义一个周对象，我把数据抽象了出来，这样的话，将来我想要为每一天赋值直接传一个泛型就行了
 */
public class Week<T> {

	/**
	 * 周一
	 */
	private T monday;
	/**
	 * 周二
	 */
	private T tuesday;
	/**
	 * 周三
	 */
	private T wednesday;
	/**
	 * 周四
	 */
	private T thursday;
	/**
	 * 周五
	 */
	private T friday;
	/**
	 * 周六
	 */
	private T saturday;
	/**
	 * 周日
	 */
	private T sunday;

	public T getMonday() {
		return monday;
	}

	public void setMonday(T monday) {
		this.monday = monday;
	}

	public T getTuesday() {
		return tuesday;
	}

	public void setTuesday(T tuesday) {
		this.tuesday = tuesday;
	}

	public T getWednesday() {
		return wednesday;
	}

	public void setWednesday(T wednesday) {
		this.wednesday = wednesday;
	}

	public T getThursday() {
		return thursday;
	}

	public void setThursday(T thursday) {
		this.thursday = thursday;
	}

	public T getFriday() {
		return friday;
	}

	public void setFriday(T friday) {
		this.friday = friday;
	}

	public T getSaturday() {
		return saturday;
	}

	public void setSaturday(T saturday) {
		this.saturday = saturday;
	}

	public T getSunday() {
		return sunday;
	}

	public void setSunday(T sunday) {
		this.sunday = sunday;
	}

	public Week(T monday, T tuesday, T wednesday, T thursday, T friday, T saturday, T sunday) {
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}

	public Week() {
	}
}
