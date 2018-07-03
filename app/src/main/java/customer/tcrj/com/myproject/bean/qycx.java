package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/10.
 */

public class qycx implements Serializable{

    /**
     * PageIndex : 1
     * PageSize : 1
     * TotalItemCount : 1
     * TotalPageCount : 1
     * Data : [{"ID":1,"QYID":271,"QyName":null,"SXLY":1,"SXLYName":"A级纳税人","LRWH":"123123","LRRQ":"2018-04-04T00:00:00","LRSY":"按错","RDJG":"测试机关","YCRQ":"2018-05-01T00:00:00","YCYY":"  爱仕达多","YCJDJG":"撒地","GSQX":"2018-04-04T00:00:00","LX":1,"Qyxx":{"Qyxxbg":null,"QYID":271,"TYSHXYDM":null,"ZT":null,"ZZJGDM":"DM0000053","QYMC":"QYMC0053","ZCDZ":null,"ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":null,"FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":null,"ZCZJ":null,"CLRQ":null,"DJGLBMMC":null,"DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-10T16:56:32.99","UpdateStaffID":null,"UpdateTime":null}}]
     */
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

    private String stat;
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
         * ID : 1
         * QYID : 271
         * QyName : null
         * SXLY : 1
         * SXLYName : A级纳税人
         * LRWH : 123123
         * LRRQ : 2018-04-04T00:00:00
         * LRSY : 按错
         * RDJG : 测试机关
         * YCRQ : 2018-05-01T00:00:00
         * YCYY :   爱仕达多
         * YCJDJG : 撒地
         * GSQX : 2018-04-04T00:00:00
         * LX : 1
         * Qyxx : {"Qyxxbg":null,"QYID":271,"TYSHXYDM":null,"ZT":null,"ZZJGDM":"DM0000053","QYMC":"QYMC0053","ZCDZ":null,"ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":null,"FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":null,"ZCZJ":null,"CLRQ":null,"DJGLBMMC":null,"DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-10T16:56:32.99","UpdateStaffID":null,"UpdateTime":null}
         */

        private int ID;
        private int QYID;
        private Object QyName;
        private int SXLY;

        public String getMC() {
            return MC;
        }

        public void setMC(String MC) {
            this.MC = MC;
        }

        private String MC;
        private String WHBH;
        private String PDRQ;

        public String getWHBH() {
            return WHBH;
        }

        public void setWHBH(String WHBH) {
            this.WHBH = WHBH;
        }

        public String getPDRQ() {
            return PDRQ;
        }

        public void setPDRQ(String PDRQ) {
            this.PDRQ = PDRQ;
        }

        public String getPDDW() {
            return PDDW;
        }

        public void setPDDW(String PDDW) {
            this.PDDW = PDDW;
        }

        public String getDFBM() {
            return DFBM;
        }

        public void setDFBM(String DFBM) {
            this.DFBM = DFBM;
        }

        public String getRYSXNR() {
            return RYSXNR;
        }

        public void setRYSXNR(String RYSXNR) {
            this.RYSXNR = RYSXNR;
        }

        private String PDDW;
        private String DFBM;
        private String RYSXNR;
        private String LRWH;
        private String LRRQ;
        private String LRSY;
        private String RDJG;
        private String YCRQ;
        private String YCYY;
        private String YCJDJG;

        public String getJCLB() {
            return JCLB;
        }

        public void setJCLB(String JCLB) {
            this.JCLB = JCLB;
        }

        private String JCLB;
        private String GSQX;
        private int LX;
        private QyxxBean Qyxx;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getQYID() {
            return QYID;
        }

        public void setQYID(int QYID) {
            this.QYID = QYID;
        }

        public Object getQyName() {
            return QyName;
        }

        public void setQyName(Object QyName) {
            this.QyName = QyName;
        }

        public int getSXLY() {
            return SXLY;
        }

        public void setSXLY(int SXLY) {
            this.SXLY = SXLY;
        }


        public String getLRWH() {
            return LRWH;
        }

        public void setLRWH(String LRWH) {
            this.LRWH = LRWH;
        }

        public String getLRRQ() {
            return LRRQ;
        }

        public void setLRRQ(String LRRQ) {
            this.LRRQ = LRRQ;
        }

        public String getLRSY() {
            return LRSY;
        }

        public void setLRSY(String LRSY) {
            this.LRSY = LRSY;
        }

        public String getRDJG() {
            return RDJG;
        }

        public void setRDJG(String RDJG) {
            this.RDJG = RDJG;
        }

        public String getYCRQ() {
            return YCRQ;
        }

        public void setYCRQ(String YCRQ) {
            this.YCRQ = YCRQ;
        }

        public String getYCYY() {
            return YCYY;
        }

        public void setYCYY(String YCYY) {
            this.YCYY = YCYY;
        }

        public String getYCJDJG() {
            return YCJDJG;
        }

        public void setYCJDJG(String YCJDJG) {
            this.YCJDJG = YCJDJG;
        }

        public String getGSQX() {
            return GSQX;
        }

        public void setGSQX(String GSQX) {
            this.GSQX = GSQX;
        }

        public int getLX() {
            return LX;
        }

        public void setLX(int LX) {
            this.LX = LX;
        }

        public QyxxBean getQyxx() {
            return Qyxx;
        }

        public void setQyxx(QyxxBean Qyxx) {
            this.Qyxx = Qyxx;
        }

        public static class QyxxBean implements Serializable{
            /**
             * Qyxxbg : null
             * QYID : 271
             * TYSHXYDM : null
             * ZT : null
             * ZZJGDM : DM0000053
             * QYMC : QYMC0053
             * ZCDZ : null
             * ZCDZXZQHDM : null
             * ZCDZYZBM : null
             * SCJYDZ : null
             * SCJYDZXZQHDM : null
             * FDDBRXM : null
             * FDCBRZJLX : null
             * FDDBRZJHM : null
             * JYFW : null
             * ZCZJ : null
             * CLRQ : null
             * DJGLBMMC : null
             * DHHM : null
             * WZ : null
             * JYQXZI : null
             * JYQXZHI : null
             * ZXJG : null
             * ZXYY : null
             * ZXRQ : null
             * SHZT : 2
             * YY : null
             * CreateStaffID : 1
             * CreateTime : 2018-04-10T16:56:32.99
             * UpdateStaffID : null
             * UpdateTime : null
             */

            private Object Qyxxbg;
            private int QYID;
            private Object TYSHXYDM;
            private Object ZT;
            private String ZZJGDM;
            private String QYMC;
            private Object ZCDZ;
            private Object ZCDZXZQHDM;
            private Object ZCDZYZBM;
            private Object SCJYDZ;
            private Object SCJYDZXZQHDM;
            private Object FDDBRXM;
            private Object FDCBRZJLX;
            private Object FDDBRZJHM;
            private Object JYFW;
            private Object ZCZJ;
            private Object CLRQ;
            private Object DJGLBMMC;
            private Object DHHM;
            private Object WZ;
            private Object JYQXZI;
            private Object JYQXZHI;
            private Object ZXJG;
            private Object ZXYY;
            private Object ZXRQ;
            private int SHZT;
            private Object YY;
            private int CreateStaffID;
            private String CreateTime;
            private Object UpdateStaffID;
            private Object UpdateTime;

            public Object getQyxxbg() {
                return Qyxxbg;
            }

            public void setQyxxbg(Object Qyxxbg) {
                this.Qyxxbg = Qyxxbg;
            }

            public int getQYID() {
                return QYID;
            }

            public void setQYID(int QYID) {
                this.QYID = QYID;
            }

            public Object getTYSHXYDM() {
                return TYSHXYDM;
            }

            public void setTYSHXYDM(Object TYSHXYDM) {
                this.TYSHXYDM = TYSHXYDM;
            }

            public Object getZT() {
                return ZT;
            }

            public void setZT(Object ZT) {
                this.ZT = ZT;
            }

            public String getZZJGDM() {
                return ZZJGDM;
            }

            public void setZZJGDM(String ZZJGDM) {
                this.ZZJGDM = ZZJGDM;
            }

            public String getQYMC() {
                return QYMC;
            }

            public void setQYMC(String QYMC) {
                this.QYMC = QYMC;
            }

            public Object getZCDZ() {
                return ZCDZ;
            }

            public void setZCDZ(Object ZCDZ) {
                this.ZCDZ = ZCDZ;
            }

            public Object getZCDZXZQHDM() {
                return ZCDZXZQHDM;
            }

            public void setZCDZXZQHDM(Object ZCDZXZQHDM) {
                this.ZCDZXZQHDM = ZCDZXZQHDM;
            }

            public Object getZCDZYZBM() {
                return ZCDZYZBM;
            }

            public void setZCDZYZBM(Object ZCDZYZBM) {
                this.ZCDZYZBM = ZCDZYZBM;
            }

            public Object getSCJYDZ() {
                return SCJYDZ;
            }

            public void setSCJYDZ(Object SCJYDZ) {
                this.SCJYDZ = SCJYDZ;
            }

            public Object getSCJYDZXZQHDM() {
                return SCJYDZXZQHDM;
            }

            public void setSCJYDZXZQHDM(Object SCJYDZXZQHDM) {
                this.SCJYDZXZQHDM = SCJYDZXZQHDM;
            }

            public Object getFDDBRXM() {
                return FDDBRXM;
            }

            public void setFDDBRXM(Object FDDBRXM) {
                this.FDDBRXM = FDDBRXM;
            }

            public Object getFDCBRZJLX() {
                return FDCBRZJLX;
            }

            public void setFDCBRZJLX(Object FDCBRZJLX) {
                this.FDCBRZJLX = FDCBRZJLX;
            }

            public Object getFDDBRZJHM() {
                return FDDBRZJHM;
            }

            public void setFDDBRZJHM(Object FDDBRZJHM) {
                this.FDDBRZJHM = FDDBRZJHM;
            }

            public Object getJYFW() {
                return JYFW;
            }

            public void setJYFW(Object JYFW) {
                this.JYFW = JYFW;
            }

            public Object getZCZJ() {
                return ZCZJ;
            }

            public void setZCZJ(Object ZCZJ) {
                this.ZCZJ = ZCZJ;
            }

            public Object getCLRQ() {
                return CLRQ;
            }

            public void setCLRQ(Object CLRQ) {
                this.CLRQ = CLRQ;
            }

            public Object getDJGLBMMC() {
                return DJGLBMMC;
            }

            public void setDJGLBMMC(Object DJGLBMMC) {
                this.DJGLBMMC = DJGLBMMC;
            }

            public Object getDHHM() {
                return DHHM;
            }

            public void setDHHM(Object DHHM) {
                this.DHHM = DHHM;
            }

            public Object getWZ() {
                return WZ;
            }

            public void setWZ(Object WZ) {
                this.WZ = WZ;
            }

            public Object getJYQXZI() {
                return JYQXZI;
            }

            public void setJYQXZI(Object JYQXZI) {
                this.JYQXZI = JYQXZI;
            }

            public Object getJYQXZHI() {
                return JYQXZHI;
            }

            public void setJYQXZHI(Object JYQXZHI) {
                this.JYQXZHI = JYQXZHI;
            }

            public Object getZXJG() {
                return ZXJG;
            }

            public void setZXJG(Object ZXJG) {
                this.ZXJG = ZXJG;
            }

            public Object getZXYY() {
                return ZXYY;
            }

            public void setZXYY(Object ZXYY) {
                this.ZXYY = ZXYY;
            }

            public Object getZXRQ() {
                return ZXRQ;
            }

            public void setZXRQ(Object ZXRQ) {
                this.ZXRQ = ZXRQ;
            }

            public int getSHZT() {
                return SHZT;
            }

            public void setSHZT(int SHZT) {
                this.SHZT = SHZT;
            }

            public Object getYY() {
                return YY;
            }

            public void setYY(Object YY) {
                this.YY = YY;
            }

            public int getCreateStaffID() {
                return CreateStaffID;
            }

            public void setCreateStaffID(int CreateStaffID) {
                this.CreateStaffID = CreateStaffID;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public Object getUpdateStaffID() {
                return UpdateStaffID;
            }

            public void setUpdateStaffID(Object UpdateStaffID) {
                this.UpdateStaffID = UpdateStaffID;
            }

            public Object getUpdateTime() {
                return UpdateTime;
            }

            public void setUpdateTime(Object UpdateTime) {
                this.UpdateTime = UpdateTime;
            }
        }
    }
}
