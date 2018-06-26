package customer.tcrj.com.myproject.bean;

import java.io.Serializable;

/**
 * Created by leict on 2018/4/3.
 */

public class loginInfo  implements Serializable{


    /**
     * stat : 1
     * msg : 操作成功
     * result : {"Key":"f080db9e77","BeyondDate":"2018-02-08 16:48:43"}
     */

    private int stat;
    private String msg;
    private ResultBean result;

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "loginInfo{" +
                "stat=" + stat +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }

    public static class ResultBean {
        /**
         * Key : f080db9e77
         * BeyondDate : 2018-02-08 16:48:43
         */

        private String Key;
        private String BeyondDate;

        public String getKey() {
            return Key;
        }

        public void setKey(String Key) {
            this.Key = Key;
        }

        public String getBeyondDate() {
            return BeyondDate;
        }

        public void setBeyondDate(String BeyondDate) {
            this.BeyondDate = BeyondDate;
        }
    }
}
