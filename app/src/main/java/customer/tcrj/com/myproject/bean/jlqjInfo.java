package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class jlqjInfo implements Serializable{


    private String stat;
    private String msg;
    /**
     * PageSize : 1
     * PageIndex : 1
     * TotalItemCount : 4
     * TotalPageCount : 4
     * Data : [{"ZJCPInfo":{"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false},"ZJCPID":300,"FL":"电子经纬仪","BM":"412341211","MC":"电子经纬仪","GGXH":"","SCDW":"281","SYDW":"281","SYDZ":"","SYZT":"启用","LX":"计量器具"},"QJID":4,"ZJCPID":300,"TXM":"","CCBH":"","JDZQ":"","BZ":"","ZT":"","SFJK":true,"CLFW":"","BQDD":"","SFQJ":true,"SFZJ":true,"ZQ":"","YXQ":"","SFNJ":true,"SFQJHC":true,"SFWDXKH":true,"XCJCRQ":"","KSRQ":"","JSRQ":""}]
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
         * ZJCPInfo : {"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false},"ZJCPID":300,"FL":"电子经纬仪","BM":"412341211","MC":"电子经纬仪","GGXH":"","SCDW":"281","SYDW":"281","SYDZ":"","SYZT":"启用","LX":"计量器具"}
         * QJID : 4
         * ZJCPID : 300
         * TXM :
         * CCBH :
         * JDZQ :
         * BZ :
         * ZT :
         * SFJK : true
         * CLFW :
         * BQDD :
         * SFQJ : true
         * SFZJ : true
         * ZQ :
         * YXQ :
         * SFNJ : true
         * SFQJHC : true
         * SFWDXKH : true
         * XCJCRQ :
         * KSRQ :
         * JSRQ :
         */

        private ZJCPInfoBean ZJCPInfo;
        private int QJID;
        private int ZJCPID;
        private String TXM;
        private String CCBH;
        private String JDZQ;
        private String BZ;
        private String ZT;
        private boolean SFJK;
        private String CLFW;
        private String BQDD;
        private boolean SFQJ;
        private boolean SFZJ;
        private String ZQ;
        private String YXQ;
        private boolean SFNJ;
        private boolean SFQJHC;
        private boolean SFWDXKH;
        private String XCJCRQ;
        private String KSRQ;
        private String JSRQ;

        public ZJCPInfoBean getZJCPInfo() {
            return ZJCPInfo;
        }

        public void setZJCPInfo(ZJCPInfoBean ZJCPInfo) {
            this.ZJCPInfo = ZJCPInfo;
        }

        public int getQJID() {
            return QJID;
        }

        public void setQJID(int QJID) {
            this.QJID = QJID;
        }

        public int getZJCPID() {
            return ZJCPID;
        }

        public void setZJCPID(int ZJCPID) {
            this.ZJCPID = ZJCPID;
        }

        public String getTXM() {
            return TXM;
        }

        public void setTXM(String TXM) {
            this.TXM = TXM;
        }

        public String getCCBH() {
            return CCBH;
        }

        public void setCCBH(String CCBH) {
            this.CCBH = CCBH;
        }

        public String getJDZQ() {
            return JDZQ;
        }

        public void setJDZQ(String JDZQ) {
            this.JDZQ = JDZQ;
        }

        public String getBZ() {
            return BZ;
        }

        public void setBZ(String BZ) {
            this.BZ = BZ;
        }

        public String getZT() {
            return ZT;
        }

        public void setZT(String ZT) {
            this.ZT = ZT;
        }

        public boolean isSFJK() {
            return SFJK;
        }

        public void setSFJK(boolean SFJK) {
            this.SFJK = SFJK;
        }

        public String getCLFW() {
            return CLFW;
        }

        public void setCLFW(String CLFW) {
            this.CLFW = CLFW;
        }

        public String getBQDD() {
            return BQDD;
        }

        public void setBQDD(String BQDD) {
            this.BQDD = BQDD;
        }

        public boolean isSFQJ() {
            return SFQJ;
        }

        public void setSFQJ(boolean SFQJ) {
            this.SFQJ = SFQJ;
        }

        public boolean isSFZJ() {
            return SFZJ;
        }

        public void setSFZJ(boolean SFZJ) {
            this.SFZJ = SFZJ;
        }

        public String getZQ() {
            return ZQ;
        }

        public void setZQ(String ZQ) {
            this.ZQ = ZQ;
        }

        public String getYXQ() {
            return YXQ;
        }

        public void setYXQ(String YXQ) {
            this.YXQ = YXQ;
        }

        public boolean isSFNJ() {
            return SFNJ;
        }

        public void setSFNJ(boolean SFNJ) {
            this.SFNJ = SFNJ;
        }

        public boolean isSFQJHC() {
            return SFQJHC;
        }

        public void setSFQJHC(boolean SFQJHC) {
            this.SFQJHC = SFQJHC;
        }

        public boolean isSFWDXKH() {
            return SFWDXKH;
        }

        public void setSFWDXKH(boolean SFWDXKH) {
            this.SFWDXKH = SFWDXKH;
        }

        public String getXCJCRQ() {
            return XCJCRQ;
        }

        public void setXCJCRQ(String XCJCRQ) {
            this.XCJCRQ = XCJCRQ;
        }

        public String getKSRQ() {
            return KSRQ;
        }

        public void setKSRQ(String KSRQ) {
            this.KSRQ = KSRQ;
        }

        public String getJSRQ() {
            return JSRQ;
        }

        public void setJSRQ(String JSRQ) {
            this.JSRQ = JSRQ;
        }

        public static class ZJCPInfoBean implements Serializable{
            /**
             * SCDWInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
             * SYDWInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
             * SYRInfo : {"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false}
             * ZJCPID : 300
             * FL : 电子经纬仪
             * BM : 412341211
             * MC : 电子经纬仪
             * GGXH :
             * SCDW : 281
             * SYDW : 281
             * SYDZ :
             * SYZT : 启用
             * LX : 计量器具
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
            private String SYDZ;
            private String SYZT;
            private String LX;

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

            public String getSYDZ() {
                return SYDZ;
            }

            public void setSYDZ(String SYDZ) {
                this.SYDZ = SYDZ;
            }

            public String getSYZT() {
                return SYZT;
            }

            public void setSYZT(String SYZT) {
                this.SYZT = SYZT;
            }

            public String getLX() {
                return LX;
            }

            public void setLX(String LX) {
                this.LX = LX;
            }

            public static class SCDWInfoBean implements Serializable{
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

            public static class SYDWInfoBean implements Serializable{
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

            public static class SYRInfoBean implements Serializable{
                /**
                 * ID : 267
                 * XM : XM0261
                 * CYM : 测试
                 * XB : 男性
                 * CSNY : 2018-06-12
                 * JG : 陕西渭南
                 * XL : 本科
                 * BYYX : 清华
                 * SXZY : 计算机
                 * ZZMM : 团员
                 * ZJH : ZJH0261
                 * ZJZL : 身份证
                 * SJH : 13892313367
                 * YXDZ : hanle@163.com
                 * JZDZ : 陕西西安
                 * ZPLJ : /UploadedFiles/201806/01/0928234739.png
                 * BZ : 无备注
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
}
