package bh.db.ssm.commons.pojo;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-17-19:16
 * 描述：分页返回数据
 */
public class PageResult {

	/**
	 * 当前页数
	 */
	private Integer pageNum;

	/**
	 * 每页显示的总条数
	 */
	private Integer rows;

	/**
	 * 总记录数
	 */
	private Long totals;

	/**
	 * 总页数
	 */
	private Integer pages;

	/**
	 * 封装的数据
	 */
	private List data;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Long getTotals() {
		return totals;
	}

	public void setTotals(Long totals) {
		this.totals = totals;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PageResult{" +
				"pageNum=" + pageNum +
				", rows=" + rows +
				", totals=" + totals +
				", pages=" + pages +
				", data=" + data +
				'}';
	}

	public PageResult() {
	}
}
