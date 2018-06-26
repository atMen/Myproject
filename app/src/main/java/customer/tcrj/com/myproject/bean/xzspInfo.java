package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/10.
 */

public class xzspInfo implements Serializable{


    /**
     * PageSize : 1
     * PageIndex : 1
     * TotalItemCount : 264
     * TotalPageCount : 264
     * Data : [{"SQDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"XKDWInfo":{"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""},"SQRInfo":{"ID":5,"XM":"XM0181","CYM":"","XB":"","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0181","ZJZL":"","SJH":"SJH0181","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":false},"SPID":3,"SLDH":"SLDH0003","SXBM":"SXBM0003","SXMC":"SXMC0003","SQDW":"281","SQR":"5","SLSJ":"2018-03-15","SLR":"SLR0003","DQZT":"正常","BJZT":"收件","BJSJ":"2018-06-29","SQFS":"外系统移交","XZXKJDWSH":"XZXKJDWSH0003","XMMC":"XMMC0003","SPLB":"","XKNR":"XKNR0003","XKJDRQ":"2018-01-31","XKJZRQ":"2018-03-15","XKDW":"13","DFBM":"100003","BZ":"所有的审批"}]
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

    private String stat;

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
         * SQDWInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
         * XKDWInfo : {"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""}
         * SQRInfo : {"ID":5,"XM":"XM0181","CYM":"","XB":"","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0181","ZJZL":"","SJH":"SJH0181","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":false}
         * SPID : 3
         * SLDH : SLDH0003
         * SXBM : SXBM0003
         * SXMC : SXMC0003
         * SQDW : 281
         * SQR : 5
         * SLSJ : 2018-03-15
         * SLR : SLR0003
         * DQZT : 正常
         * BJZT : 收件
         * BJSJ : 2018-06-29
         * SQFS : 外系统移交
         * XZXKJDWSH : XZXKJDWSH0003
         * XMMC : XMMC0003
         * SPLB :
         * XKNR : XKNR0003
         * XKJDRQ : 2018-01-31
         * XKJZRQ : 2018-03-15
         * XKDW : 13
         * DFBM : 100003
         * BZ : 所有的审批
         */

        private SQDWInfoBean SQDWInfo;
        private XKDWInfoBean XKDWInfo;
        private SQRInfoBean SQRInfo;
        private int SPID;
        private String SLDH;
        private String SXBM;
        private String SXMC;
        private String SQDW;
        private String SQR;
        private String SLSJ;
        private String SLR;
        private String DQZT;
        private String BJZT;
        private String BJSJ;
        private String SQFS;
        private String XZXKJDWSH;
        private String XMMC;
        private String SPLB;
        private String XKNR;
        private String XKJDRQ;
        private String XKJZRQ;
        private String XKDW;
        private String DFBM;
        private String BZ;

        public SQDWInfoBean getSQDWInfo() {
            return SQDWInfo;
        }

        public void setSQDWInfo(SQDWInfoBean SQDWInfo) {
            this.SQDWInfo = SQDWInfo;
        }

        public XKDWInfoBean getXKDWInfo() {
            return XKDWInfo;
        }

        public void setXKDWInfo(XKDWInfoBean XKDWInfo) {
            this.XKDWInfo = XKDWInfo;
        }

        public SQRInfoBean getSQRInfo() {
            return SQRInfo;
        }

        public void setSQRInfo(SQRInfoBean SQRInfo) {
            this.SQRInfo = SQRInfo;
        }

        public int getSPID() {
            return SPID;
        }

        public void setSPID(int SPID) {
            this.SPID = SPID;
        }

        public String getSLDH() {
            return SLDH;
        }

        public void setSLDH(String SLDH) {
            this.SLDH = SLDH;
        }

        public String getSXBM() {
            return SXBM;
        }

        public void setSXBM(String SXBM) {
            this.SXBM = SXBM;
        }

        public String getSXMC() {
            return SXMC;
        }

        public void setSXMC(String SXMC) {
            this.SXMC = SXMC;
        }

        public String getSQDW() {
            return SQDW;
        }

        public void setSQDW(String SQDW) {
            this.SQDW = SQDW;
        }

        public String getSQR() {
            return SQR;
        }

        public void setSQR(String SQR) {
            this.SQR = SQR;
        }

        public String getSLSJ() {
            return SLSJ;
        }

        public void setSLSJ(String SLSJ) {
            this.SLSJ = SLSJ;
        }

        public String getSLR() {
            return SLR;
        }

        public void setSLR(String SLR) {
            this.SLR = SLR;
        }

        public String getDQZT() {
            return DQZT;
        }

        public void setDQZT(String DQZT) {
            this.DQZT = DQZT;
        }

        public String getBJZT() {
            return BJZT;
        }

        public void setBJZT(String BJZT) {
            this.BJZT = BJZT;
        }

        public String getBJSJ() {
            return BJSJ;
        }

        public void setBJSJ(String BJSJ) {
            this.BJSJ = BJSJ;
        }

        public String getSQFS() {
            return SQFS;
        }

        public void setSQFS(String SQFS) {
            this.SQFS = SQFS;
        }

        public String getXZXKJDWSH() {
            return XZXKJDWSH;
        }

        public void setXZXKJDWSH(String XZXKJDWSH) {
            this.XZXKJDWSH = XZXKJDWSH;
        }

        public String getXMMC() {
            return XMMC;
        }

        public void setXMMC(String XMMC) {
            this.XMMC = XMMC;
        }

        public String getSPLB() {
            return SPLB;
        }

        public void setSPLB(String SPLB) {
            this.SPLB = SPLB;
        }

        public String getXKNR() {
            return XKNR;
        }

        public void setXKNR(String XKNR) {
            this.XKNR = XKNR;
        }

        public String getXKJDRQ() {
            return XKJDRQ;
        }

        public void setXKJDRQ(String XKJDRQ) {
            this.XKJDRQ = XKJDRQ;
        }

        public String getXKJZRQ() {
            return XKJZRQ;
        }

        public void setXKJZRQ(String XKJZRQ) {
            this.XKJZRQ = XKJZRQ;
        }

        public String getXKDW() {
            return XKDW;
        }

        public void setXKDW(String XKDW) {
            this.XKDW = XKDW;
        }

        public String getDFBM() {
            return DFBM;
        }

        public void setDFBM(String DFBM) {
            this.DFBM = DFBM;
        }

        public String getBZ() {
            return BZ;
        }

        public void setBZ(String BZ) {
            this.BZ = BZ;
        }

        public static class SQDWInfoBean implements Serializable{
            /**
             * QYID : 281
             * TYSHXYDM : 232132322222221111
             * ZT : 营业
             * ZZJGDM : 123232342
             * QYMC : 测试企业
             * ZCDZ : 陕西西安
             * ZCDZXZQHDM : WIop
             * ZCDZYZBM : 710000
             * SCJYDZ : 陕西西安
             * SCJYDZXZQHDM : CN
             * FDDBRXM : 韩乐
             * FDCBRZJLX : 港澳台身份证
             * FDDBRZJHM : 610525199204242829
             * JYFW : 小米
             * ZCZJ : 123
             * CLRQ : 2018-06-05
             * DJGLBMMC : 测试部
             * DHHM : 010-5699332
             * WZ : http://192.168.20.21:8890/ZhiJian/QY
             * JYQXZI : 2018-06-04
             * JYQXZHI : 2018-06-28
             * ZXJG : 机构1
             * ZXYY : 1232
             * ZXRQ : 2018-06-05
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

        public static class XKDWInfoBean implements Serializable{
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

        public static class SQRInfoBean implements Serializable{
            /**
             * ID : 5
             * XM : XM0181
             * CYM :
             * XB :
             * CSNY :
             * JG :
             * XL :
             * BYYX :
             * SXZY :
             * ZZMM :
             * ZJH : ZJH0181
             * ZJZL :
             * SJH : SJH0181
             * YXDZ :
             * JZDZ :
             * ZPLJ :
             * BZ :
             * IsExamine : false
             */

            private int ID;
            private String XM;
            private String CYM;
            private String XB;
            private String CSNY;
            private String JG;
            private String XL;
            private String BYYX;
            private String SXZY;
            private String ZZMM;
            private String ZJH;
            private String ZJZL;
            private String SJH;
            private String YXDZ;
            private String JZDZ;
            private String ZPLJ;
            private String BZ;
            private boolean IsExamine;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getCYM() {
                return CYM;
            }

            public void setCYM(String CYM) {
                this.CYM = CYM;
            }

            public String getXB() {
                return XB;
            }

            public void setXB(String XB) {
                this.XB = XB;
            }

            public String getCSNY() {
                return CSNY;
            }

            public void setCSNY(String CSNY) {
                this.CSNY = CSNY;
            }

            public String getJG() {
                return JG;
            }

            public void setJG(String JG) {
                this.JG = JG;
            }

            public String getXL() {
                return XL;
            }

            public void setXL(String XL) {
                this.XL = XL;
            }

            public String getBYYX() {
                return BYYX;
            }

            public void setBYYX(String BYYX) {
                this.BYYX = BYYX;
            }

            public String getSXZY() {
                return SXZY;
            }

            public void setSXZY(String SXZY) {
                this.SXZY = SXZY;
            }

            public String getZZMM() {
                return ZZMM;
            }

            public void setZZMM(String ZZMM) {
                this.ZZMM = ZZMM;
            }

            public String getZJH() {
                return ZJH;
            }

            public void setZJH(String ZJH) {
                this.ZJH = ZJH;
            }

            public String getZJZL() {
                return ZJZL;
            }

            public void setZJZL(String ZJZL) {
                this.ZJZL = ZJZL;
            }

            public String getSJH() {
                return SJH;
            }

            public void setSJH(String SJH) {
                this.SJH = SJH;
            }

            public String getYXDZ() {
                return YXDZ;
            }

            public void setYXDZ(String YXDZ) {
                this.YXDZ = YXDZ;
            }

            public String getJZDZ() {
                return JZDZ;
            }

            public void setJZDZ(String JZDZ) {
                this.JZDZ = JZDZ;
            }

            public String getZPLJ() {
                return ZPLJ;
            }

            public void setZPLJ(String ZPLJ) {
                this.ZPLJ = ZPLJ;
            }

            public String getBZ() {
                return BZ;
            }

            public void setBZ(String BZ) {
                this.BZ = BZ;
            }

            public boolean isIsExamine() {
                return IsExamine;
            }

            public void setIsExamine(boolean IsExamine) {
                this.IsExamine = IsExamine;
            }
        }
    }
}
