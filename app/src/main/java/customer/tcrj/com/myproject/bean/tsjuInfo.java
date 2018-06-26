package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/11.
 */

public class tsjuInfo implements Serializable{

    private String stat;
    /**
     * PageSize : 1
     * PageIndex : 1
     * TotalItemCount : 2
     * TotalPageCount : 2
     * Data : [{"TSQYInfo":{"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""},"TSCPInfo":{"SCDWInfo":{},"SYDWInfo":{},"SYRInfo":{},"ZJCPID":294,"FL":"曳引与强制驱动电梯","BM":"DT001","MC":"一号电梯","GGXH":"1212","SCDW":"13","SYDW":"11","LX":"特种设备","SYZT":"停用","SYR":"2","SYDZ":"","Lng":"","Lat":""},"TSID":1,"TSLX":"举报","QYID":13,"BT":"电梯总是出故障","NR":"电梯隔三查无就出事","XM":"小米","LXDH":"15204155586","SFZH":"610524198904155586","SLR":"张局","SLSJ":"2018-06-21","BLR":"张局","BLSJ":"2018-06-20","BLJG":"已经找相关厂家进行更换","SBDeptID":1}]
     */

    private int PageSize;
    private int PageIndex;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

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


    public static class DataBean implements Serializable{
        /**
         * TSQYInfo : {"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""}
         * TSCPInfo : {"SCDWInfo":{},"SYDWInfo":{},"SYRInfo":{},"ZJCPID":294,"FL":"曳引与强制驱动电梯","BM":"DT001","MC":"一号电梯","GGXH":"1212","SCDW":"13","SYDW":"11","LX":"特种设备","SYZT":"停用","SYR":"2","SYDZ":"","Lng":"","Lat":""}
         * TSID : 1
         * TSLX : 举报
         * QYID : 13
         * BT : 电梯总是出故障
         * NR : 电梯隔三查无就出事
         * XM : 小米
         * LXDH : 15204155586
         * SFZH : 610524198904155586
         * SLR : 张局
         * SLSJ : 2018-06-21
         * BLR : 张局
         * BLSJ : 2018-06-20
         * BLJG : 已经找相关厂家进行更换
         * SBDeptID : 1
         */

        private TSQYInfoBean TSQYInfo;
        private TSCPInfoBean TSCPInfo;
        private int TSID;
        private String TSLX;
        private int QYID;
        private String BT;
        private String NR;
        private String XM;
        private String LXDH;
        private String SFZH;
        private String SLR;
        private String SLSJ;
        private String BLR;
        private String BLSJ;
        private String BLJG;
        private int SBDeptID;

        public TSQYInfoBean getTSQYInfo() {
            return TSQYInfo;
        }

        public void setTSQYInfo(TSQYInfoBean TSQYInfo) {
            this.TSQYInfo = TSQYInfo;
        }

        public TSCPInfoBean getTSCPInfo() {
            return TSCPInfo;
        }

        public void setTSCPInfo(TSCPInfoBean TSCPInfo) {
            this.TSCPInfo = TSCPInfo;
        }

        public int getTSID() {
            return TSID;
        }

        public void setTSID(int TSID) {
            this.TSID = TSID;
        }

        public String getTSLX() {
            return TSLX;
        }

        public void setTSLX(String TSLX) {
            this.TSLX = TSLX;
        }

        public int getQYID() {
            return QYID;
        }

        public void setQYID(int QYID) {
            this.QYID = QYID;
        }

        public String getBT() {
            return BT;
        }

        public void setBT(String BT) {
            this.BT = BT;
        }

        public String getNR() {
            return NR;
        }

        public void setNR(String NR) {
            this.NR = NR;
        }

        public String getXM() {
            return XM;
        }

        public void setXM(String XM) {
            this.XM = XM;
        }

        public String getLXDH() {
            return LXDH;
        }

        public void setLXDH(String LXDH) {
            this.LXDH = LXDH;
        }

        public String getSFZH() {
            return SFZH;
        }

        public void setSFZH(String SFZH) {
            this.SFZH = SFZH;
        }

        public String getSLR() {
            return SLR;
        }

        public void setSLR(String SLR) {
            this.SLR = SLR;
        }

        public String getSLSJ() {
            return SLSJ;
        }

        public void setSLSJ(String SLSJ) {
            this.SLSJ = SLSJ;
        }

        public String getBLR() {
            return BLR;
        }

        public void setBLR(String BLR) {
            this.BLR = BLR;
        }

        public String getBLSJ() {
            return BLSJ;
        }

        public void setBLSJ(String BLSJ) {
            this.BLSJ = BLSJ;
        }

        public String getBLJG() {
            return BLJG;
        }

        public void setBLJG(String BLJG) {
            this.BLJG = BLJG;
        }

        public int getSBDeptID() {
            return SBDeptID;
        }

        public void setSBDeptID(int SBDeptID) {
            this.SBDeptID = SBDeptID;
        }

        public static class TSQYInfoBean implements Serializable{
            /**
             * QYID : 13
             * TYSHXYDM : 610524198904155576
             * ZT : 营业
             * ZZJGDM : 123456789
             * QYMC : test企业
             * ZCDZ : 陕西西安
             * ZCDZXZQHDM : 232
             * ZCDZYZBM : 710000
             * SCJYDZ : 西安长安区
             * SCJYDZXZQHDM : 610528
             * FDDBRXM : 小梁
             * FDCBRZJLX : 身份证
             * FDDBRZJHM : 610524198904155586
             * JYFW : 所有
             * ZCZJ : 1000
             * CLRQ : 2015-05-28
             * DJGLBMMC : 工商局
             * DHHM : 029-8752683
             * WZ : http://192.168.20.21:8890/ZhiJian/QY#id=27
             * JYQXZI : 2022-06-24
             * JYQXZHI : 2022-06-06
             * ZXJG : 机构1
             * ZXYY : 原因
             * ZXRQ : 2018-06-14
             * SHZT : 2
             * YY :
             * BZ :
             */

            private int QYID;
            private String TYSHXYDM;
            private String ZT;
            private String ZZJGDM;
            private String QYMC;
            private String ZCDZ;
            private String ZCDZXZQHDM;
            private String ZCDZYZBM;
            private String SCJYDZ;
            private String SCJYDZXZQHDM;
            private String FDDBRXM;
            private String FDCBRZJLX;
            private String FDDBRZJHM;
            private String JYFW;
            private String ZCZJ;
            private String CLRQ;
            private String DJGLBMMC;
            private String DHHM;
            private String WZ;
            private String JYQXZI;
            private String JYQXZHI;
            private String ZXJG;
            private String ZXYY;
            private String ZXRQ;
            private int SHZT;
            private String YY;
            private String BZ;

            public int getQYID() {
                return QYID;
            }

            public void setQYID(int QYID) {
                this.QYID = QYID;
            }

            public String getTYSHXYDM() {
                return TYSHXYDM;
            }

            public void setTYSHXYDM(String TYSHXYDM) {
                this.TYSHXYDM = TYSHXYDM;
            }

            public String getZT() {
                return ZT;
            }

            public void setZT(String ZT) {
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

            public String getZCDZ() {
                return ZCDZ;
            }

            public void setZCDZ(String ZCDZ) {
                this.ZCDZ = ZCDZ;
            }

            public String getZCDZXZQHDM() {
                return ZCDZXZQHDM;
            }

            public void setZCDZXZQHDM(String ZCDZXZQHDM) {
                this.ZCDZXZQHDM = ZCDZXZQHDM;
            }

            public String getZCDZYZBM() {
                return ZCDZYZBM;
            }

            public void setZCDZYZBM(String ZCDZYZBM) {
                this.ZCDZYZBM = ZCDZYZBM;
            }

            public String getSCJYDZ() {
                return SCJYDZ;
            }

            public void setSCJYDZ(String SCJYDZ) {
                this.SCJYDZ = SCJYDZ;
            }

            public String getSCJYDZXZQHDM() {
                return SCJYDZXZQHDM;
            }

            public void setSCJYDZXZQHDM(String SCJYDZXZQHDM) {
                this.SCJYDZXZQHDM = SCJYDZXZQHDM;
            }

            public String getFDDBRXM() {
                return FDDBRXM;
            }

            public void setFDDBRXM(String FDDBRXM) {
                this.FDDBRXM = FDDBRXM;
            }

            public String getFDCBRZJLX() {
                return FDCBRZJLX;
            }

            public void setFDCBRZJLX(String FDCBRZJLX) {
                this.FDCBRZJLX = FDCBRZJLX;
            }

            public String getFDDBRZJHM() {
                return FDDBRZJHM;
            }

            public void setFDDBRZJHM(String FDDBRZJHM) {
                this.FDDBRZJHM = FDDBRZJHM;
            }

            public String getJYFW() {
                return JYFW;
            }

            public void setJYFW(String JYFW) {
                this.JYFW = JYFW;
            }

            public String getZCZJ() {
                return ZCZJ;
            }

            public void setZCZJ(String ZCZJ) {
                this.ZCZJ = ZCZJ;
            }

            public String getCLRQ() {
                return CLRQ;
            }

            public void setCLRQ(String CLRQ) {
                this.CLRQ = CLRQ;
            }

            public String getDJGLBMMC() {
                return DJGLBMMC;
            }

            public void setDJGLBMMC(String DJGLBMMC) {
                this.DJGLBMMC = DJGLBMMC;
            }

            public String getDHHM() {
                return DHHM;
            }

            public void setDHHM(String DHHM) {
                this.DHHM = DHHM;
            }

            public String getWZ() {
                return WZ;
            }

            public void setWZ(String WZ) {
                this.WZ = WZ;
            }

            public String getJYQXZI() {
                return JYQXZI;
            }

            public void setJYQXZI(String JYQXZI) {
                this.JYQXZI = JYQXZI;
            }

            public String getJYQXZHI() {
                return JYQXZHI;
            }

            public void setJYQXZHI(String JYQXZHI) {
                this.JYQXZHI = JYQXZHI;
            }

            public String getZXJG() {
                return ZXJG;
            }

            public void setZXJG(String ZXJG) {
                this.ZXJG = ZXJG;
            }

            public String getZXYY() {
                return ZXYY;
            }

            public void setZXYY(String ZXYY) {
                this.ZXYY = ZXYY;
            }

            public String getZXRQ() {
                return ZXRQ;
            }

            public void setZXRQ(String ZXRQ) {
                this.ZXRQ = ZXRQ;
            }

            public int getSHZT() {
                return SHZT;
            }

            public void setSHZT(int SHZT) {
                this.SHZT = SHZT;
            }

            public String getYY() {
                return YY;
            }

            public void setYY(String YY) {
                this.YY = YY;
            }

            public String getBZ() {
                return BZ;
            }

            public void setBZ(String BZ) {
                this.BZ = BZ;
            }
        }

        public static class TSCPInfoBean implements Serializable{
            /**
             * SCDWInfo : {}
             * SYDWInfo : {}
             * SYRInfo : {}
             * ZJCPID : 294
             * FL : 曳引与强制驱动电梯
             * BM : DT001
             * MC : 一号电梯
             * GGXH : 1212
             * SCDW : 13
             * SYDW : 11
             * LX : 特种设备
             * SYZT : 停用
             * SYR : 2
             * SYDZ :
             * Lng :
             * Lat :
             */

            private SCDWInfoBean SCDWInfo;
            private SYDWInfoBean SYDWInfo;
            private SYRInfoBean SYRInfo;
            private int ZJCPID;
            private String FL;
            private String BM;
            private String MC;
            private String GGXH;
            private String SCDW;
            private String SYDW;
            private String LX;
            private String SYZT;
            private String SYR;
            private String SYDZ;
            private String Lng;
            private String Lat;

            public SCDWInfoBean getSCDWInfo() {
                return SCDWInfo;
            }

            public void setSCDWInfo(SCDWInfoBean SCDWInfo) {
                this.SCDWInfo = SCDWInfo;
            }

            public SYDWInfoBean getSYDWInfo() {
                return SYDWInfo;
            }

            public void setSYDWInfo(SYDWInfoBean SYDWInfo) {
                this.SYDWInfo = SYDWInfo;
            }

            public SYRInfoBean getSYRInfo() {
                return SYRInfo;
            }

            public void setSYRInfo(SYRInfoBean SYRInfo) {
                this.SYRInfo = SYRInfo;
            }

            public int getZJCPID() {
                return ZJCPID;
            }

            public void setZJCPID(int ZJCPID) {
                this.ZJCPID = ZJCPID;
            }

            public String getFL() {
                return FL;
            }

            public void setFL(String FL) {
                this.FL = FL;
            }

            public String getBM() {
                return BM;
            }

            public void setBM(String BM) {
                this.BM = BM;
            }

            public String getMC() {
                return MC;
            }

            public void setMC(String MC) {
                this.MC = MC;
            }

            public String getGGXH() {
                return GGXH;
            }

            public void setGGXH(String GGXH) {
                this.GGXH = GGXH;
            }

            public String getSCDW() {
                return SCDW;
            }

            public void setSCDW(String SCDW) {
                this.SCDW = SCDW;
            }

            public String getSYDW() {
                return SYDW;
            }

            public void setSYDW(String SYDW) {
                this.SYDW = SYDW;
            }

            public String getLX() {
                return LX;
            }

            public void setLX(String LX) {
                this.LX = LX;
            }

            public String getSYZT() {
                return SYZT;
            }

            public void setSYZT(String SYZT) {
                this.SYZT = SYZT;
            }

            public String getSYR() {
                return SYR;
            }

            public void setSYR(String SYR) {
                this.SYR = SYR;
            }

            public String getSYDZ() {
                return SYDZ;
            }

            public void setSYDZ(String SYDZ) {
                this.SYDZ = SYDZ;
            }

            public String getLng() {
                return Lng;
            }

            public void setLng(String Lng) {
                this.Lng = Lng;
            }

            public String getLat() {
                return Lat;
            }

            public void setLat(String Lat) {
                this.Lat = Lat;
            }

            public static class SCDWInfoBean implements Serializable{
            }

            public static class SYDWInfoBean implements Serializable{
            }

            public static class SYRInfoBean implements Serializable{
            }
        }
    }
}
