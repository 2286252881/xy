package zh.sys.util.result;

import java.util.List;

/**
 * 数据查询列表结果
 */
public class LayPageResultInfo<T> {
	private List<T> obj;
	private int count;

	public List<T> getObj() {
		return obj;
	}

	public void setObj(List<T> obj) {
		this.obj = obj;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public LayPageResultInfo(List<T> obj, int count) {
		this.obj = obj;
		this.count = count;
	}

	public LayPageResultInfo() {

	}

}