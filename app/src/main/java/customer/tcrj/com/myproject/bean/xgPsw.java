package customer.tcrj.com.myproject.bean;

/**
 * Created by leict on 2018/4/10.
 */

public class xgPsw {

    /**
     * msg : sample string 1
     * stat : 2
     * result : {}
     */

    private String msg;
    private int stat;
    private ResultBean result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
    }
}
