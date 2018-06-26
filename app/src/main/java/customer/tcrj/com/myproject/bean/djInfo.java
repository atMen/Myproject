package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/11.
 */

public class djInfo implements Serializable{

    /**
     * PageIndex : 5
     * PageSize : 4
     * TotalItemCount : 2
     * TotalPageCount : 1
     * Data : [{"DTID":2,"MC":"标题","LBID":1,"LBName":"会议","SJ":"2018-04-11T17:00:46.63","DD":"地点","RY":"人员","ZY":"摘要","DJDT":null},{"DTID":1,"MC":"标题","LBID":2,"LBName":"学习","SJ":"2018-04-11T00:00:00","DD":"地点","RY":"人员","ZY":null,"DJDT":null}]
     */
    private String stat;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
    private int PageIndex;
    private int PageSize;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int PageIndex) {
        this.PageIndex = PageIndex;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }

    public int getTotalItemCount() {
        return TotalItemCount;
    }

    public void setTotalItemCount(int TotalItemCount) {
        this.TotalItemCount = TotalItemCount;
    }

    public int getTotalPageCount() {
        return TotalPageCount;
    }

    public void setTotalPageCount(int TotalPageCount) {
        this.TotalPageCount = TotalPageCount;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean implements Serializable{
        /**
         * DTID : 2
         * MC : 标题
         * LBID : 1
         * LBName : 会议
         * SJ : 2018-04-11T17:00:46.63
         * DD : 地点
         * RY : 人员
         * ZY : 摘要
         * DJDT : null
         */

        private int DTID;
        private String MC;

        public String getNR() {
            return NR;
        }

        public void setNR(String NR) {
            this.NR = NR;
        }

        private String NR;
        private int LBID;
        private String LBName;
        private String SJ;
        private String DD;
        private String RY;
        private String ZY;
        private Object DJDT;

        public int getDTID() {
            return DTID;
        }

        public void setDTID(int DTID) {
            this.DTID = DTID;
        }

        public String getMC() {
            return MC;
        }

        public void setMC(String MC) {
            this.MC = MC;
        }

        public int getLBID() {
            return LBID;
        }

        public void setLBID(int LBID) {
            this.LBID = LBID;
        }

        public String getLBName() {
            return LBName;
        }

        public void setLBName(String LBName) {
            this.LBName = LBName;
        }

        public String getSJ() {
            return SJ;
        }

        public void setSJ(String SJ) {
            this.SJ = SJ;
        }

        public String getDD() {
            return DD;
        }

        public void setDD(String DD) {
            this.DD = DD;
        }

        public String getRY() {
            return RY;
        }

        public void setRY(String RY) {
            this.RY = RY;
        }

        public String getZY() {
            return ZY;
        }

        public void setZY(String ZY) {
            this.ZY = ZY;
        }

        public Object getDJDT() {
            return DJDT;
        }

        public void setDJDT(Object DJDT) {
            this.DJDT = DJDT;
        }
    }
}
