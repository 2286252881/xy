package zh.sys.util.result;

/**
 * 提交结果类型
 * @author Administrator
 *
 */
public class SubmitResultInfo {

	public SubmitResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}
	//结果信息
	private ResultInfo resultInfo;

	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

}