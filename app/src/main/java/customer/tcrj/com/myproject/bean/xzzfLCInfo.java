package customer.tcrj.com.myproject.bean;

import java.util.List;

/**
 * Created by leict on 2018/4/16.
 */

public class xzzfLCInfo {

    /**
     * PageSize : 3
     * PageIndex : 1
     * TotalItemCount : 3
     * TotalPageCount : 1
     * Data : [{"ZFXXInfo":null,"LCID":1582,"ZFID":264,"JDMC":"JDMC0001","JRRY":"JRRY0001","JRSJ":"2018-01-12T00:00:00","ZT":2,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0001","BLJG":"BLJG0001","BZ":null},{"ZFXXInfo":null,"LCID":1583,"ZFID":264,"JDMC":"JDMC0265","JRRY":"JRRY0265","JRSJ":"2018-01-12T00:00:00","ZT":266,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0265","BLJG":"BLJG0265","BZ":null},{"ZFXXInfo":null,"LCID":1584,"ZFID":264,"JDMC":"JDMC0529","JRRY":"JRRY0529","JRSJ":"2018-01-12T00:00:00","ZT":530,"BLSJ":"2018-02-03T00:00:00","BLR":"BLR0529","BLJG":"BLJG0529","BZ":null}]
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
         * ZFXXInfo : null
         * LCID : 1582
         * ZFID : 264
         * JDMC : JDMC0001
         * JRRY : JRRY0001
         * JRSJ : 2018-01-12T00:00:00
         * ZT : 2
         * BLSJ : 2018-02-03T00:00:00
         * BLR : BLR0001
         * BLJG : BLJG0001
         * BZ : null
         */

        private Object ZFXXInfo;
        private int LCID;
        private int ZFID;
        private String JDMC;
        private String JRRY;
        private String JRSJ;
        private String ZT;
        private String BLSJ;
        private String BLR;
        private String BLJG;
        private Object BZ;

        public Object getZFXXInfo() {
            return ZFXXInfo;
        }

        public void setZFXXInfo(Object ZFXXInfo) {
            this.ZFXXInfo = ZFXXInfo;
        }

        public int getLCID() {
            return LCID;
        }

        public void setLCID(int LCID) {
            this.LCID = LCID;
        }

        public int getZFID() {
            return ZFID;
        }

        public void setZFID(int ZFID) {
            this.ZFID = ZFID;
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
