package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class jycpInfo implements Serializable{

    private String stat;
    /**
     * PageSize : 2
     * PageIndex : 1
     * TotalItemCount : 12
     * TotalPageCount : 6
     * Data : [{"ZJCPInfo":{"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":3,"TYSHXYDM":"91610111683862338Q","ZT":"","ZZJGDM":"683862338","QYMC":"西安市灞桥区纺织城地区开发建设有限公司","ZCDZ":"西安市灞桥区柳雪路灞桥区总部经济大楼3楼317室","ZCDZXZQHDM":"","ZCDZYZBM":"","SCJYDZ":"","SCJYDZXZQHDM":"","FDDBRXM":"白婧","FDCBRZJLX":"","FDDBRZJHM":"","JYFW":"房地产开发，土地整理，基础设施及社会事务等其他公益设施投资和管理（仅限以自有资产投资）。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":"","CLRQ":"","DJGLBMMC":"西安市工商行政管理局灞桥分局","DHHM":"","WZ":"","JYQXZI":"","JYQXZHI":"","ZXJG":"","ZXYY":"","ZXRQ":"","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":268,"XM":"XM0262","CYM":"王小","XB":"男性","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0262","ZJZL":"营业执照","SJH":"13245678977","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":true},"ZJCPID":298,"FL":"小麦种子","BM":"F17921010","MC":"大颗粒种子","GGXH":"","SCDW":"281","SYDW":"3","SYDZ":"","SYZT":"启用","LX":"质检产品"},"CPID":16,"ZJCPID":298,"SB":"","CPLY":"","SCRQ":"","PH":"","CPDJ":"1","CPSL":"","CPZT":0,"SFCKCP":false}]
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
         * ZJCPInfo : {"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":3,"TYSHXYDM":"91610111683862338Q","ZT":"","ZZJGDM":"683862338","QYMC":"西安市灞桥区纺织城地区开发建设有限公司","ZCDZ":"西安市灞桥区柳雪路灞桥区总部经济大楼3楼317室","ZCDZXZQHDM":"","ZCDZYZBM":"","SCJYDZ":"","SCJYDZXZQHDM":"","FDDBRXM":"白婧","FDCBRZJLX":"","FDDBRZJHM":"","JYFW":"房地产开发，土地整理，基础设施及社会事务等其他公益设施投资和管理（仅限以自有资产投资）。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":"","CLRQ":"","DJGLBMMC":"西安市工商行政管理局灞桥分局","DHHM":"","WZ":"","JYQXZI":"","JYQXZHI":"","ZXJG":"","ZXYY":"","ZXRQ":"","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":268,"XM":"XM0262","CYM":"王小","XB":"男性","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0262","ZJZL":"营业执照","SJH":"13245678977","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":true},"ZJCPID":298,"FL":"小麦种子","BM":"F17921010","MC":"大颗粒种子","GGXH":"","SCDW":"281","SYDW":"3","SYDZ":"","SYZT":"启用","LX":"质检产品"}
         * CPID : 16
         * ZJCPID : 298
         * SB :
         * CPLY :
         * SCRQ :
         * PH :
         * CPDJ : 1
         * CPSL :
         * CPZT : 0
         * SFCKCP : false
         */

        private ZJCPInfoBean ZJCPInfo;
        private int CPID;
        private int ZJCPID;
        private String SB;
        private String CPLY;
        private String SCRQ;
        private String PH;
        private String CPDJ;
        private String CPSL;
        private int CPZT;
        private boolean SFCKCP;

        public ZJCPInfoBean getZJCPInfo() {
            return ZJCPInfo;
        }

        public void setZJCPInfo(ZJCPInfoBean ZJCPInfo) {
            this.ZJCPInfo = ZJCPInfo;
        }

        public int getCPID() {
            return CPID;
        }

        public void setCPID(int CPID) {
            this.CPID = CPID;
        }

        public int getZJCPID() {
            return ZJCPID;
        }

        public void setZJCPID(int ZJCPID) {
            this.ZJCPID = ZJCPID;
        }

        public String getSB() {
            return SB;
        }

        public void setSB(String SB) {
            this.SB = SB;
        }

        public String getCPLY() {
            return CPLY;
        }

        public void setCPLY(String CPLY) {
            this.CPLY = CPLY;
        }

        public String getSCRQ() {
            return SCRQ;
        }

        public void setSCRQ(String SCRQ) {
            this.SCRQ = SCRQ;
        }

        public String getPH() {
            return PH;
        }

        public void setPH(String PH) {
            this.PH = PH;
        }

        public String getCPDJ() {
            return CPDJ;
        }

        public void setCPDJ(String CPDJ) {
            this.CPDJ = CPDJ;
        }

        public String getCPSL() {
            return CPSL;
        }

        public void setCPSL(String CPSL) {
            this.CPSL = CPSL;
        }

        public int getCPZT() {
            return CPZT;
        }

        public void setCPZT(int CPZT) {
            this.CPZT = CPZT;
        }

        public boolean isSFCKCP() {
            return SFCKCP;
        }

        public void setSFCKCP(boolean SFCKCP) {
            this.SFCKCP = SFCKCP;
        }

        public static class ZJCPInfoBean implements Serializable{
            /**
             * SCDWInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
             * SYDWInfo : {"QYID":3,"TYSHXYDM":"91610111683862338Q","ZT":"","ZZJGDM":"683862338","QYMC":"西安市灞桥区纺织城地区开发建设有限公司","ZCDZ":"西安市灞桥区柳雪路灞桥区总部经济大楼3楼317室","ZCDZXZQHDM":"","ZCDZYZBM":"","SCJYDZ":"","SCJYDZXZQHDM":"","FDDBRXM":"白婧","FDCBRZJLX":"","FDDBRZJHM":"","JYFW":"房地产开发，土地整理，基础设施及社会事务等其他公益设施投资和管理（仅限以自有资产投资）。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":"","CLRQ":"","DJGLBMMC":"西安市工商行政管理局灞桥分局","DHHM":"","WZ":"","JYQXZI":"","JYQXZHI":"","ZXJG":"","ZXYY":"","ZXRQ":"","SHZT":2,"YY":"","BZ":""}
             * SYRInfo : {"ID":268,"XM":"XM0262","CYM":"王小","XB":"男性","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0262","ZJZL":"营业执照","SJH":"13245678977","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":true}
             * ZJCPID : 298
             * FL : 小麦种子
             * BM : F17921010
             * MC : 大颗粒种子
             * GGXH :
             * SCDW : 281
             * SYDW : 3
             * SYDZ :
             * SYZT : 启用
             * LX : 质检产品
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
                 * QYID : 3
                 * TYSHXYDM : 91610111683862338Q
                 * ZT :
                 * ZZJGDM : 683862338
                 * QYMC : 西安市灞桥区纺织城地区开发建设有限公司
                 * ZCDZ : 西安市灞桥区柳雪路灞桥区总部经济大楼3楼317室
                 * ZCDZXZQHDM :
                 * ZCDZYZBM :
                 * SCJYDZ :
                 * SCJYDZXZQHDM :
                 * FDDBRXM : 白婧
                 * FDCBRZJLX :
                 * FDDBRZJHM :
                 * JYFW : 房地产开发，土地整理，基础设施及社会事务等其他公益设施投资和管理（仅限以自有资产投资）。（依法须经批准的项目，经相关部门批准后方可开展经营活动）
                 * ZCZJ :
                 * CLRQ :
                 * DJGLBMMC : 西安市工商行政管理局灞桥分局
                 * DHHM :
                 * WZ :
                 * JYQXZI :
                 * JYQXZHI :
                 * ZXJG :
                 * ZXYY :
                 * ZXRQ :
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
                 * ID : 268
                 * XM : XM0262
                 * CYM : 王小
                 * XB : 男性
                 * CSNY :
                 * JG :
                 * XL :
                 * BYYX :
                 * SXZY :
                 * ZZMM :
                 * ZJH : ZJH0262
                 * ZJZL : 营业执照
                 * SJH : 13245678977
                 * YXDZ :
                 * JZDZ :
                 * ZPLJ :
                 * BZ :
                 * IsExamine : true
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
