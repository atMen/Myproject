package customer.tcrj.com.myproject.bean;

import java.util.List;

/**
 * Created by leict on 2018/4/16.
 */

public class xzspLCInfo {//TODO：在这个类中SPXXInfo没有拿到实体结构

    /**
     * PageSize : 3
     * PageIndex : 1
     * TotalItemCount : 3
     * TotalPageCount : 1
     * Data : [{"SPXXInfo":null,"LCID":31,"SPID":11,"JDMC":"JDMC0011","JRRY":"JRRY0011","JRSJ":"2018-01-12T00:00:00","ZT":12,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0011","BLJG":"BLJG0011","BZ":null},{"SPXXInfo":null,"LCID":32,"SPID":11,"JDMC":"JDMC0275","JRRY":"JRRY0275","JRSJ":"2018-01-12T00:00:00","ZT":276,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0275","BLJG":"BLJG0275","BZ":null},{"SPXXInfo":null,"LCID":33,"SPID":11,"JDMC":"JDMC0539","JRRY":"JRRY0539","JRSJ":"2018-01-12T00:00:00","ZT":540,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0539","BLJG":"BLJG0539","BZ":null}]
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
    private int PageSize;
    private int PageIndex;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int PageIndex) {
        this.PageIndex = PageIndex;
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

    public static class DataBean {
        /**
         * SPXXInfo : null
         * LCID : 31
         * SPID : 11
         * JDMC : JDMC0011
         * JRRY : JRRY0011
         * JRSJ : 2018-01-12T00:00:00
         * ZT : 12
         * BLSJ : 2018-02-03T00:00:00
         * BLR : BLR0011
         * BLJG : BLJG0011
         * BZ : null
         */

        private Object SPXXInfo;
        private int LCID;
        private int SPID;
        private String JDMC;
        private String JRRY;
        private String JRSJ;
        private String ZT;
        private String BLSJ;
        private String BLR;
        private String BLJG;
        private Object BZ;

        public Object getSPXXInfo() {
            return SPXXInfo;
        }

        public void setSPXXInfo(Object SPXXInfo) {
            this.SPXXInfo = SPXXInfo;
        }

        public int getLCID() {
            return LCID;
        }

        public void setLCID(int LCID) {
            this.LCID = LCID;
        }

        public int getSPID() {
            return SPID;
        }

        public void setSPID(int SPID) {
            this.SPID = SPID;
        }

        public String getJDMC() {
            return JDMC;
        }

        public void setJDMC(String JDMC) {
            this.JDMC = JDMC;
        }

        public String getJRRY() {
            return JRRY;
        }

        public void setJRRY(String JRRY) {
            this.JRRY = JRRY;
        }

        public String getJRSJ() {
            return JRSJ;
        }

        public void setJRSJ(String JRSJ) {
            this.JRSJ = JRSJ;
        }

        public String getZT() {
            return ZT;
        }

        public void setZT(String ZT) {
            this.ZT = ZT;
        }

        public String getBLSJ() {
            return BLSJ;
        }

        public void setBLSJ(String BLSJ) {
            this.BLSJ = BLSJ;
        }

        public String getBLR() {
            return BLR;
        }

        public void setBLR(String BLR) {
            this.BLR = BLR;
        }

        public String getBLJG() {
            return BLJG;
        }

        public void setBLJG(String BLJG) {
            this.BLJG = BLJG;
        }

        public Object getBZ() {
            return BZ;
        }

        public void setBZ(Object BZ) {
            this.BZ = BZ;
        }
    }
}
