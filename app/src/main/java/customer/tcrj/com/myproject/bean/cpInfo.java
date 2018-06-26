package customer.tcrj.com.myproject.bean;

import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class cpInfo {

    /**
     * PageIndex : 1
     * PageSize : 4
     * TotalItemCount : 1
     * TotalPageCount : 1
     * Data : [{"ZJCPInfo":{"SCDWInfo":{"Qyxxbg":null,"QYID":10,"TYSHXYDM":"916101137974878635","ZT":null,"ZZJGDM":"797487863","QYMC":"西安交通信息投资营运有限公司","ZCDZ":"陕西省西安市雁塔区含光南路218号西安交通信息大厦五楼501室","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"赵倩","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"许可经营项目：第二类增值电信业务中的信息服务业务（不含固定网电话信息服务和互联网信息服务）。（依法须经批准的项目，经相关部门批准后方可开展经营活动） 一般经营项目：交通信息化项目技术开发；交通信息网络系统的设计、建设和运营服务；计算机信息系统集成及应用软件开发；智能卡产品的开发、应用；楼宇自动化及计算机网络布线；电子产品、通讯设备、办公设备的技术开发、技术服务、销售；交通综合信息的咨询服务；广告的设计、制作、代理、发布。(依法须经批准的项目，经相关部门批准后方可开展经营活动)","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"西安市工商行政管理局雁塔分局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null},"SYDWInfo":{"Qyxxbg":null,"QYID":9,"TYSHXYDM":"91610721MA6YN1410G","ZT":null,"ZZJGDM":"MA6YN1410","QYMC":"汉中市万合商业营运管理有限公司","ZCDZ":"陕西省南郑县大河坎镇圣水路蓝岸名邸裕华园26#101号","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"王嵘","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"商业营销策划及广告制作、品牌代理、商业经营管理、商业招商招租、商业布局规划**（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"南郑县工商行政管理局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null},"ZJCPID":3,"FL":558,"BM":"456789","MC":"测试","GGXH":"456654","SCDW":10,"SYDW":9,"LX":3,"CreateStaffID":1,"CreateTime":"2018-04-09T15:47:04.44","UpdateStaffID":null,"UpdateTime":null},"CPID":1,"ZJCPID":3,"SB":"阿斯蒂","CPLY":"火星","SCRQ":"2018-04-04T00:00:00","PH":"1111222333","CPDJ":"s","CPSL":"11","CPZT":0,"SFCKCP":true}]
     */

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

    public static class DataBean {
        /**
         * ZJCPInfo : {"SCDWInfo":{"Qyxxbg":null,"QYID":10,"TYSHXYDM":"916101137974878635","ZT":null,"ZZJGDM":"797487863","QYMC":"西安交通信息投资营运有限公司","ZCDZ":"陕西省西安市雁塔区含光南路218号西安交通信息大厦五楼501室","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"赵倩","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"许可经营项目：第二类增值电信业务中的信息服务业务（不含固定网电话信息服务和互联网信息服务）。（依法须经批准的项目，经相关部门批准后方可开展经营活动） 一般经营项目：交通信息化项目技术开发；交通信息网络系统的设计、建设和运营服务；计算机信息系统集成及应用软件开发；智能卡产品的开发、应用；楼宇自动化及计算机网络布线；电子产品、通讯设备、办公设备的技术开发、技术服务、销售；交通综合信息的咨询服务；广告的设计、制作、代理、发布。(依法须经批准的项目，经相关部门批准后方可开展经营活动)","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"西安市工商行政管理局雁塔分局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null},"SYDWInfo":{"Qyxxbg":null,"QYID":9,"TYSHXYDM":"91610721MA6YN1410G","ZT":null,"ZZJGDM":"MA6YN1410","QYMC":"汉中市万合商业营运管理有限公司","ZCDZ":"陕西省南郑县大河坎镇圣水路蓝岸名邸裕华园26#101号","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"王嵘","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"商业营销策划及广告制作、品牌代理、商业经营管理、商业招商招租、商业布局规划**（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"南郑县工商行政管理局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null},"ZJCPID":3,"FL":558,"BM":"456789","MC":"测试","GGXH":"456654","SCDW":10,"SYDW":9,"LX":3,"CreateStaffID":1,"CreateTime":"2018-04-09T15:47:04.44","UpdateStaffID":null,"UpdateTime":null}
         * CPID : 1
         * ZJCPID : 3
         * SB : 阿斯蒂
         * CPLY : 火星
         * SCRQ : 2018-04-04T00:00:00
         * PH : 1111222333
         * CPDJ : s
         * CPSL : 11
         * CPZT : 0
         * SFCKCP : true
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

        public static class ZJCPInfoBean {
            /**
             * SCDWInfo : {"Qyxxbg":null,"QYID":10,"TYSHXYDM":"916101137974878635","ZT":null,"ZZJGDM":"797487863","QYMC":"西安交通信息投资营运有限公司","ZCDZ":"陕西省西安市雁塔区含光南路218号西安交通信息大厦五楼501室","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"赵倩","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"许可经营项目：第二类增值电信业务中的信息服务业务（不含固定网电话信息服务和互联网信息服务）。（依法须经批准的项目，经相关部门批准后方可开展经营活动） 一般经营项目：交通信息化项目技术开发；交通信息网络系统的设计、建设和运营服务；计算机信息系统集成及应用软件开发；智能卡产品的开发、应用；楼宇自动化及计算机网络布线；电子产品、通讯设备、办公设备的技术开发、技术服务、销售；交通综合信息的咨询服务；广告的设计、制作、代理、发布。(依法须经批准的项目，经相关部门批准后方可开展经营活动)","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"西安市工商行政管理局雁塔分局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null}
             * SYDWInfo : {"Qyxxbg":null,"QYID":9,"TYSHXYDM":"91610721MA6YN1410G","ZT":null,"ZZJGDM":"MA6YN1410","QYMC":"汉中市万合商业营运管理有限公司","ZCDZ":"陕西省南郑县大河坎镇圣水路蓝岸名邸裕华园26#101号","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"王嵘","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"商业营销策划及广告制作、品牌代理、商业经营管理、商业招商招租、商业布局规划**（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"南郑县工商行政管理局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T09:45:59.47","UpdateStaffID":null,"UpdateTime":null}
             * ZJCPID : 3
             * FL : 558
             * BM : 456789
             * MC : 测试
             * GGXH : 456654
             * SCDW : 10
             * SYDW : 9
             * LX : 3
             * CreateStaffID : 1
             * CreateTime : 2018-04-09T15:47:04.44
             * UpdateStaffID : null
             * UpdateTime : null
             */

            private SCDWInfoBean SCDWInfo;
            private SYDWInfoBean SYDWInfo;
            private int ZJCPID;
            private int FL;
            private String BM;
            private String MC;
            private String GGXH;
            private int SCDW;
            private int SYDW;
            private int LX;
            private int CreateStaffID;
            private String CreateTime;
            private Object UpdateStaffID;
            private Object UpdateTime;

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

            public int getZJCPID() {
                return ZJCPID;
            }

            public void setZJCPID(int ZJCPID) {
                this.ZJCPID = ZJCPID;
            }

            public int getFL() {
                return FL;
            }

            public void setFL(int FL) {
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

            public int getSCDW() {
                return SCDW;
            }

            public void setSCDW(int SCDW) {
                this.SCDW = SCDW;
            }

            public int getSYDW() {
                return SYDW;
            }

            public void setSYDW(int SYDW) {
                this.SYDW = SYDW;
            }

            public int getLX() {
                return LX;
            }

            public void setLX(int LX) {
                this.LX = LX;
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

            public static class SCDWInfoBean {
                /**
                 * Qyxxbg : null
                 * QYID : 10
                 * TYSHXYDM : 916101137974878635
                 * ZT : null
                 * ZZJGDM : 797487863
                 * QYMC : 西安交通信息投资营运有限公司
                 * ZCDZ : 陕西省西安市雁塔区含光南路218号西安交通信息大厦五楼501室
                 * ZCDZXZQHDM : null
                 * ZCDZYZBM : null
                 * SCJYDZ : null
                 * SCJYDZXZQHDM : null
                 * FDDBRXM : 赵倩
                 * FDCBRZJLX : null
                 * FDDBRZJHM : null
                 * JYFW : 许可经营项目：第二类增值电信业务中的信息服务业务（不含固定网电话信息服务和互联网信息服务）。（依法须经批准的项目，经相关部门批准后方可开展经营活动） 一般经营项目：交通信息化项目技术开发；交通信息网络系统的设计、建设和运营服务；计算机信息系统集成及应用软件开发；智能卡产品的开发、应用；楼宇自动化及计算机网络布线；电子产品、通讯设备、办公设备的技术开发、技术服务、销售；交通综合信息的咨询服务；广告的设计、制作、代理、发布。(依法须经批准的项目，经相关部门批准后方可开展经营活动)
                 * ZCZJ : null
                 * CLRQ : null
                 * DJGLBMMC : 西安市工商行政管理局雁塔分局
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
                 * CreateTime : 2018-04-09T09:45:59.47
                 * UpdateStaffID : null
                 * UpdateTime : null
                 */

                private Object Qyxxbg;
                private int QYID;
                private String TYSHXYDM;
                private Object ZT;
                private String ZZJGDM;
                private String QYMC;
                private String ZCDZ;
                private Object ZCDZXZQHDM;
                private Object ZCDZYZBM;
                private Object SCJYDZ;
                private Object SCJYDZXZQHDM;
                private String FDDBRXM;
                private Object FDCBRZJLX;
                private Object FDDBRZJHM;
                private String JYFW;
                private Object ZCZJ;
                private Object CLRQ;
                private String DJGLBMMC;
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

                public String getTYSHXYDM() {
                    return TYSHXYDM;
                }

                public void setTYSHXYDM(String TYSHXYDM) {
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

                public String getZCDZ() {
                    return ZCDZ;
                }

                public void setZCDZ(String ZCDZ) {
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

                public String getFDDBRXM() {
                    return FDDBRXM;
                }

                public void setFDDBRXM(String FDDBRXM) {
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

                public String getJYFW() {
                    return JYFW;
                }

                public void setJYFW(String JYFW) {
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

                public String getDJGLBMMC() {
                    return DJGLBMMC;
                }

                public void setDJGLBMMC(String DJGLBMMC) {
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

            public static class SYDWInfoBean {
                /**
                 * Qyxxbg : null
                 * QYID : 9
                 * TYSHXYDM : 91610721MA6YN1410G
                 * ZT : null
                 * ZZJGDM : MA6YN1410
                 * QYMC : 汉中市万合商业营运管理有限公司
                 * ZCDZ : 陕西省南郑县大河坎镇圣水路蓝岸名邸裕华园26#101号
                 * ZCDZXZQHDM : null
                 * ZCDZYZBM : null
                 * SCJYDZ : null
                 * SCJYDZXZQHDM : null
                 * FDDBRXM : 王嵘
                 * FDCBRZJLX : null
                 * FDDBRZJHM : null
                 * JYFW : 商业营销策划及广告制作、品牌代理、商业经营管理、商业招商招租、商业布局规划**（依法须经批准的项目，经相关部门批准后方可开展经营活动）
                 * ZCZJ : null
                 * CLRQ : null
                 * DJGLBMMC : 南郑县工商行政管理局
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
                 * CreateTime : 2018-04-09T09:45:59.47
                 * UpdateStaffID : null
                 * UpdateTime : null
                 */

                private Object Qyxxbg;
                private int QYID;
                private String TYSHXYDM;
                private Object ZT;
                private String ZZJGDM;
                private String QYMC;
                private String ZCDZ;
                private Object ZCDZXZQHDM;
                private Object ZCDZYZBM;
                private Object SCJYDZ;
                private Object SCJYDZXZQHDM;
                private String FDDBRXM;
                private Object FDCBRZJLX;
                private Object FDDBRZJHM;
                private String JYFW;
                private Object ZCZJ;
                private Object CLRQ;
                private String DJGLBMMC;
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

                public String getTYSHXYDM() {
                    return TYSHXYDM;
                }

                public void setTYSHXYDM(String TYSHXYDM) {
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

                public String getZCDZ() {
                    return ZCDZ;
                }

                public void setZCDZ(String ZCDZ) {
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

                public String getFDDBRXM() {
                    return FDDBRXM;
                }

                public void setFDDBRXM(String FDDBRXM) {
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

                public String getJYFW() {
                    return JYFW;
                }

                public void setJYFW(String JYFW) {
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

                public String getDJGLBMMC() {
                    return DJGLBMMC;
                }

                public void setDJGLBMMC(String DJGLBMMC) {
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
}
