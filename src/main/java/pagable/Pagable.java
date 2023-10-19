package pagable;

public class Pagable {
	private int page;
	private int num;
	private String orderBy;
	public Pagable(int page) {
		this(page,6,"ASC");
	}
	public Pagable(int page, String orderBy) {
		this(page,6,orderBy);
	}
	public Pagable(int page, int num, String orderBy) {
		super();
		this.page = page;
		this.num = num;
		this.orderBy = orderBy;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
