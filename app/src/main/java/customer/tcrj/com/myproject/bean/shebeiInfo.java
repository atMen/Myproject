package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class shebeiInfo implements Serializable{

    /**
     * PageSize : 1
     * PageIndex : 1
     * TotalItemCount : 5
     * TotalPageCount : 5
     * Data : [{"ZJCPInfo":{"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false},"ZJCPID":302,"FL":"承压热水锅炉","BM":"4566","MC":"测试null数据","GGXH":"","SCDW":"281","SYDW":"13","SYDZ":"","SYZT":"启用","LX":"特种设备"},"SBID":7,"ZJCPID":302,"SBSL":"","SBM":"","SJSYNX":"","SGDWMC":"","AZRQ":"","ZZRQ":"","ZZXKZBH":"","SBJB":"","JDZQ":"","SFQJ":false,"SFZJ":false,"ZQ":"","YXQ":"","SFNJ":false,"SFQJHC":false,"SFWDXKH":false,"XCJCRQ":"","YWJK":true}]
     */

    private int PageSize;
    private int PageIndex;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

    /**
     * PageIndex : 1
     * PageSize : 1
     * TotalItemCount : 2
     * TotalPageCount : 2
     * Data : [{"ZJCPInfo":{"SCDWInfo":{"Qyxxbg":null,"QYID":11,"TYSHXYDM":"916101045569704677","ZT":null,"ZZJGDM":"556970467","QYMC":"西安裕丰太白酒品牌营运有限公司","ZCDZ":"西安市高新区高新路旺座现代城H座2903室","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"张吉焕","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"许可经营项目：预包装食品的批发兼零售（许可证有效期至2016年5月16日）。(以上经营范围凡涉及国家有专项专营规定的从其规定)","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"西安市工商行政管理局莲湖分局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"Lng":108.897326173134,"Lat":34.2206605378612,"BZ":null,"CreateStaffID":1,"CreateTime":"2018-04-09T10:47:52.79","UpdateStaffID":1,"UpdateTime":"2018-04-17T15:54:37.723"},"SYDWInfo":{"Qyxxbg":null,"QYID":8,"TYSHXYDM":"916100006679905671","ZT":null,"ZZJGDM":"667990567","QYMC":"陕西环通标准锅炉有限公司","ZCDZ":"陕西省西咸新区泾河新城泾阳工业密集区泾永路23号","ZCDZXZQHDM":null,"ZCDZYZBM":null,"SCJYDZ":null,"SCJYDZXZQHDM":null,"FDDBRXM":"杭小玲","FDCBRZJLX":null,"FDDBRZJHM":null,"JYFW":"A级锅炉、B级锅炉、D级压力容器的制造、销售、安装、维修、化学清洗、进出口贸易；制造各种罐和容器；城市集中供热工程及供热管网的设计、施工、安装；节能减排改造服务；环保机械设备的设计、生产、安装。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":null,"CLRQ":null,"DJGLBMMC":"西咸新区工商行政管理局泾河新城分局","DHHM":null,"WZ":null,"JYQXZI":null,"JYQXZHI":null,"ZXJG":null,"ZXYY":null,"ZXRQ":null,"SHZT":2,"YY":null,"Lng":108.916268741423,"Lat":34.5450470146997,"BZ":null,"CreateStaffID":1,"CreateTime":"2018-04-09T10:47:52.79","UpdateStaffID":1,"UpdateTime":"2018-04-17T15:54:23.12"},"SYRInfo":null,"ZJCPID":5,"FL":372,"BM":"CYZQ001","MC":"承压蒸汽锅炉产品","GGXH":"CYZQ","SCDW":11,"SYDW":8,"LX":1,"CreateStaffID":1,"CreateTime":"2018-05-28T16:19:02.623","UpdateStaffID":1,"UpdateTime":"2018-05-28T16:22:42.903","SYZT":"有效","SYR":null,"SYDZ":"陕西长安区","Lng":null,"Lat":null},"SBID":2,"ZJCPID":5,"SBSL":"500","SBM":"001001","SJSYNX":"20","SGDWMC":"高新热力公司","AZRQ":"2018-05-29T00:00:00","ZZRQ":"2016-05-28T00:00:00","ZZXKZBH":"XKZ001","SBJB":"特级","JDZQ":null,"SFQJ":false,"SFZJ":false,"ZQ":null,"YXQ":null,"SFNJ":false,"SFQJHC":false,"SFWDXKH":false,"XCJCRQ":null,"YWJK":true}]
     */
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
         * ZJCPInfo : {"SCDWInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"SYDWInfo":{"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""},"SYRInfo":{"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false},"ZJCPID":302,"FL":"承压热水锅炉","BM":"4566","MC":"测试null数据","GGXH":"","SCDW":"281","SYDW":"13","SYDZ":"","SYZT":"启用","LX":"特种设备"}
         * SBID : 7
         * ZJCPID : 302
         * SBSL :
         * SBM :
         * SJSYNX :
         * SGDWMC :
         * AZRQ :
         * ZZRQ :
         * ZZXKZBH :
         * SBJB :
         * JDZQ :
         * SFQJ : false
         * SFZJ : false
         * ZQ :
         * YXQ :
         * SFNJ : false
         * SFQJHC : false
         * SFWDXKH : false
         * XCJCRQ :
         * YWJK : true
         */

        private ZJCPInfoBean ZJCPInfo;
        private int SBID;
        private int ZJCPID;
        private String SBSL;
        private String SBM;
        private String SJSYNX;
        private String SGDWMC;
        private String AZRQ;
        private String ZZRQ;
        private String ZZXKZBH;
        private String SBJB;
        private String JDZQ;
        private boolean SFQJ;
        private boolean SFZJ;
        private String ZQ;
        private String YXQ;
        private boolean SFNJ;
        private boolean SFQJHC;
        private boolean SFWDXKH;
        private String XCJCRQ;
        private boolean YWJK;

        public ZJCPInfoBean getZJCPInfo() {
            return ZJCPInfo;
        }

        public void setZJCPInfo(ZJCPInfoBean ZJCPInfo) {
            this.ZJCPInfo = ZJCPInfo;
        }

        public int getSBID() {
            return SBID;
        }

        public void setSBID(int SBID) {
            this.SBID = SBID;
        }

        public int getZJCPID() {
            return ZJCPID;
        }

        public void setZJCPID(int ZJCPID) {
            this.ZJCPID = ZJCPID;
        }

        public String getSBSL() {
            return SBSL;
        }

        public void setSBSL(String SBSL) {
            this.SBSL = SBSL;
        }

        public String getSBM() {
            return SBM;
        }

        public void setSBM(String SBM) {
            this.SBM = SBM;
        }

        public String getSJSYNX() {
            return SJSYNX;
        }

        public void setSJSYNX(String SJSYNX) {
            this.SJSYNX = SJSYNX;
        }

        public String getSGDWMC() {
            return SGDWMC;
        }

        public void setSGDWMC(String SGDWMC) {
            this.SGDWMC = SGDWMC;
        }

        public String getAZRQ() {
            return AZRQ;
        }

        public void setAZRQ(String AZRQ) {
            this.AZRQ = AZRQ;
        }

        public String getZZRQ() {
            return ZZRQ;
        }

        public void setZZRQ(String ZZRQ) {
            this.ZZRQ = ZZRQ;
        }

        public String getZZXKZBH() {
            return ZZXKZBH;
        }

        public void setZZXKZBH(String ZZXKZBH) {
            this.ZZXKZBH = ZZXKZBH;
        }

        public String getSBJB() {
            return SBJB;
        }

        public void setSBJB(String SBJB) {
            this.SBJB = SBJB;
        }

        public String getJDZQ() {
            return JDZQ;
        }

        public void setJDZQ(String JDZQ) {
            this.JDZQ = JDZQ;
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

        public boolean isYWJK() {
            return YWJK;
        }

        public void setYWJK(boolean YWJK) {
            this.YWJK = YWJK;
        }

        public static class ZJCPInfoBean implements Serializable{
            /**
             * SCDWInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
             * SYDWInfo : {"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""}
             * SYRInfo : {"ID":267,"XM":"XM0261","CYM":"测试","XB":"男性","CSNY":"2018-06-12","JG":"陕西渭南","XL":"本科","BYYX":"清华","SXZY":"计算机","ZZMM":"团员","ZJH":"ZJH0261","ZJZL":"身份证","SJH":"13892313367","YXDZ":"hanle@163.com","JZDZ":"陕西西安","ZPLJ":"/UploadedFiles/201806/01/0928234739.png","BZ":"无备注","IsExamine":false}
             * ZJCPID : 302
             * FL : 承压热水锅炉
             * BM : 4566
             * MC : 测试null数据
             * GGXH :
             * SCDW : 281
             * SYDW : 13
             * SYDZ :
             * SYZT : 启用
             * LX : 特种设备
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
