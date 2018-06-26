package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/12.
 */

public class zsInfo implements Serializable{

    /**
     * PageSize : 1
     * PageIndex : 1
     * TotalItemCount : 269
     * TotalPageCount : 269
     * Data : [{"FZJGInfo":{"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""},"CYJGInfo":{"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""},"CYRInfo":{"ID":268,"XM":"XM0262","CYM":"王小","XB":"男性","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0262","ZJZL":"营业执照","SJH":"13245678977","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":true},"SSCPInfo":{"SCDWInfo":{},"SYDWInfo":{},"SYRInfo":{},"ZJCPID":300,"FL":"电子经纬仪","BM":"412341211","MC":"电子经纬仪","GGXH":"","SCDW":"11","SYDW":"8","LX":"计量器具","SYZT":"启用","SYR":"259","SYDZ":"","Lng":"","Lat":""},"ZSID":269,"ZSBH":"5566","ZSM":"34567","ZSZ":"11","ZSLB":"","ZT":"","FZRQ":"2018-06-13","YXRQ":"2018-06-29","FZJG":"281","BZ":"11","CYJG":"13","CYR":"268","SSCP":"300"}]
     */

    private int PageSize;
    private int PageIndex;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

    /**
     * PageIndex : 1
     * PageSize : 1
     * TotalItemCount : 261
     * TotalPageCount : 261
     * Data : [{"CYJGInfo":{"Qyxxbg":null,"QYID":1,"TYSHXYDM":"91610000713578937W","ZT":null,"ZZJGDM":"713578937","QYMC":"陕西凯文机电设备有限公司","ZCDZ":"陕西省西安市经开区区泾河工业园泾渭二路","ZCDZXZQHDM":"","ZCDZYZBM":"","SCJYDZ":"","SCJYDZXZQHDM":"","FDDBRXM":"孔宪章","FDCBRZJLX":"","FDDBRZJHM":"","JYFW":"乘客电梯、载货电梯、液压电梯、自动扶梯、自动人行道、杂物电梯的安装、维修；电梯保养服务及专业技术服务；机电产品的销售及售后服务；轻工（许可项目除外）、化工产品（易制毒、危险、监控化学品等专控除外）、电梯及零配件的销售；电梯技术咨询；制冷设备的销售、安装；监控报警设备、电子产品、消防器材的销售、安装及售后服务；智能楼宇工程安装及综合布线，住宅小区弱电工程安装；装饰装修工程施工。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":"","CLRQ":null,"DJGLBMMC":"陕西省工商行政管理局","DHHM":"","WZ":"","JYQXZI":null,"JYQXZHI":null,"ZXJG":"","ZXYY":"","ZXRQ":null,"SHZT":0,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T10:47:52.787","UpdateStaffID":null,"UpdateTime":null},"CYRInfo":{"ID":1,"XM":"XM0277","CYM":null,"XB":null,"CSNY":null,"JG":null,"XL":null,"BYYX":null,"SXZY":null,"ZZMM":null,"ZJH":"ZJH0277","ZJZL":null,"SJH":"SJH0277","YXDZ":null,"JZDZ":null,"ZPLJ":null,"ZRRZT":null,"BZ":null,"IsExamine":false,"CreateStaffID":1,"CreateTime":"2018-04-11T17:17:27.117","UpdateStaffID":null,"UpdateTime":null},"FZJGInfo":{"Qyxxbg":null,"QYID":1,"TYSHXYDM":"91610000713578937W","ZT":null,"ZZJGDM":"713578937","QYMC":"陕西凯文机电设备有限公司","ZCDZ":"陕西省西安市经开区区泾河工业园泾渭二路","ZCDZXZQHDM":"","ZCDZYZBM":"","SCJYDZ":"","SCJYDZXZQHDM":"","FDDBRXM":"孔宪章","FDCBRZJLX":"","FDDBRZJHM":"","JYFW":"乘客电梯、载货电梯、液压电梯、自动扶梯、自动人行道、杂物电梯的安装、维修；电梯保养服务及专业技术服务；机电产品的销售及售后服务；轻工（许可项目除外）、化工产品（易制毒、危险、监控化学品等专控除外）、电梯及零配件的销售；电梯技术咨询；制冷设备的销售、安装；监控报警设备、电子产品、消防器材的销售、安装及售后服务；智能楼宇工程安装及综合布线，住宅小区弱电工程安装；装饰装修工程施工。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","ZCZJ":"","CLRQ":null,"DJGLBMMC":"陕西省工商行政管理局","DHHM":"","WZ":"","JYQXZI":null,"JYQXZHI":null,"ZXJG":"","ZXYY":"","ZXRQ":null,"SHZT":0,"YY":null,"CreateStaffID":1,"CreateTime":"2018-04-09T10:47:52.787","UpdateStaffID":null,"UpdateTime":null},"SSCPInfo":{"SCDWInfo":null,"SYDWInfo":null,"ZJCPID":349,"FL":null,"BM":"110001","MC":"名称0001","GGXH":null,"SCDW":null,"SYDW":null,"LX":3,"CreateStaffID":1,"CreateTime":"2018-04-11T17:18:03.703","UpdateStaffID":null,"UpdateTime":null},"ZSID":1,"ZSBH":"ZSBH0001","ZSM":"ZSM0001","ZSZ":"ZSZ0001","ZSLB":1,"ZT":"ZT0001","FZRQ":"2018-03-14T00:00:00","YXRQ":"2019-03-14T00:00:00","FZJG":1,"BZ":"BZ0001","CYJG":1,"CYR":1,"SSCP":349,"CreateStaffID":1,"CreateTime":"2018-04-11T17:18:29.69","UpdateStaffID":null,"UpdateTime":null}]
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
         * FZJGInfo : {"QYID":281,"TYSHXYDM":"232132322222221111","ZT":"营业","ZZJGDM":"123232342","QYMC":"测试企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"WIop","ZCDZYZBM":"710000","SCJYDZ":"陕西西安","SCJYDZXZQHDM":"CN","FDDBRXM":"韩乐","FDCBRZJLX":"港澳台身份证","FDDBRZJHM":"610525199204242829","JYFW":"小米","ZCZJ":"123","CLRQ":"2018-06-05","DJGLBMMC":"测试部","DHHM":"010-5699332","WZ":"http://192.168.20.21:8890/ZhiJian/QY","JYQXZI":"2018-06-04","JYQXZHI":"2018-06-28","ZXJG":"机构1","ZXYY":"1232","ZXRQ":"2018-06-05","SHZT":2,"YY":"","BZ":""}
         * CYJGInfo : {"QYID":13,"TYSHXYDM":"610524198904155576","ZT":"营业","ZZJGDM":"123456789","QYMC":"test企业","ZCDZ":"陕西西安","ZCDZXZQHDM":"232","ZCDZYZBM":"710000","SCJYDZ":"西安长安区","SCJYDZXZQHDM":"610528","FDDBRXM":"小梁","FDCBRZJLX":"身份证","FDDBRZJHM":"610524198904155586","JYFW":"所有","ZCZJ":"1000","CLRQ":"2015-05-28","DJGLBMMC":"工商局","DHHM":"029-8752683","WZ":"http://192.168.20.21:8890/ZhiJian/QY#id=27","JYQXZI":"2022-06-24","JYQXZHI":"2022-06-06","ZXJG":"机构1","ZXYY":"原因","ZXRQ":"2018-06-14","SHZT":2,"YY":"","BZ":""}
         * CYRInfo : {"ID":268,"XM":"XM0262","CYM":"王小","XB":"男性","CSNY":"","JG":"","XL":"","BYYX":"","SXZY":"","ZZMM":"","ZJH":"ZJH0262","ZJZL":"营业执照","SJH":"13245678977","YXDZ":"","JZDZ":"","ZPLJ":"","BZ":"","IsExamine":true}
         * SSCPInfo : {"SCDWInfo":{},"SYDWInfo":{},"SYRInfo":{},"ZJCPID":300,"FL":"电子经纬仪","BM":"412341211","MC":"电子经纬仪","GGXH":"","SCDW":"11","SYDW":"8","LX":"计量器具","SYZT":"启用","SYR":"259","SYDZ":"","Lng":"","Lat":""}
         * ZSID : 269
         * ZSBH : 5566
         * ZSM : 34567
         * ZSZ : 11
         * ZSLB :
         * ZT :
         * FZRQ : 2018-06-13
         * YXRQ : 2018-06-29
         * FZJG : 281
         * BZ : 11
         * CYJG : 13
         * CYR : 268
         * SSCP : 300
         */

        private FZJGInfoBean FZJGInfo;
        private CYJGInfoBean CYJGInfo;
        private CYRInfoBean CYRInfo;
        private SSCPInfoBean SSCPInfo;
        private int ZSID;
        private String ZSBH;
        private String ZSM;
        private String ZSZ;
        private String ZSLB;
        private String ZT;
        private String FZRQ;
        private String YXRQ;
        private String FZJG;
        private String BZ;
        private String CYJG;
        private String CYR;
        private String SSCP;

        public FZJGInfoBean getFZJGInfo() {
            return FZJGInfo;
        }

        public void setFZJGInfo(FZJGInfoBean FZJGInfo) {
            this.FZJGInfo = FZJGInfo;
        }

        public CYJGInfoBean getCYJGInfo() {
            return CYJGInfo;
        }

        public void setCYJGInfo(CYJGInfoBean CYJGInfo) {
            this.CYJGInfo = CYJGInfo;
        }

        public CYRInfoBean getCYRInfo() {
            return CYRInfo;
        }

        public void setCYRInfo(CYRInfoBean CYRInfo) {
            this.CYRInfo = CYRInfo;
        }

        public SSCPInfoBean getSSCPInfo() {
            return SSCPInfo;
        }

        public void setSSCPInfo(SSCPInfoBean SSCPInfo) {
            this.SSCPInfo = SSCPInfo;
        }

        public int getZSID() {
            return ZSID;
        }

        public void setZSID(int ZSID) {
            this.ZSID = ZSID;
        }

        public String getZSBH() {
            return ZSBH;
        }

        public void setZSBH(String ZSBH) {
            this.ZSBH = ZSBH;
        }

        public String getZSM() {
            return ZSM;
        }

        public void setZSM(String ZSM) {
            this.ZSM = ZSM;
        }

        public String getZSZ() {
            return ZSZ;
        }

        public void setZSZ(String ZSZ) {
            this.ZSZ = ZSZ;
        }

        public String getZSLB() {
            return ZSLB;
        }

        public void setZSLB(String ZSLB) {
            this.ZSLB = ZSLB;
        }

        public String getZT() {
            return ZT;
        }

        public void setZT(String ZT) {
            this.ZT = ZT;
        }

        public String getFZRQ() {
            return FZRQ;
        }

        public void setFZRQ(String FZRQ) {
            this.FZRQ = FZRQ;
        }

        public String getYXRQ() {
            return YXRQ;
        }

        public void setYXRQ(String YXRQ) {
            this.YXRQ = YXRQ;
        }

        public String getFZJG() {
            return FZJG;
        }

        public void setFZJG(String FZJG) {
            this.FZJG = FZJG;
        }

        public String getBZ() {
            return BZ;
        }

        public void setBZ(String BZ) {
            this.BZ = BZ;
        }

        public String getCYJG() {
            return CYJG;
        }

        public void setCYJG(String CYJG) {
            this.CYJG = CYJG;
        }

        public String getCYR() {
            return CYR;
        }

        public void setCYR(String CYR) {
            this.CYR = CYR;
        }

        public String getSSCP() {
            return SSCP;
        }

        public void setSSCP(String SSCP) {
            this.SSCP = SSCP;
        }

        public static class FZJGInfoBean implements Serializable{
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

        public static class CYJGInfoBean implements Serializable{
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

        public static class CYRInfoBean implements Serializable{
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

        public static class SSCPInfoBean implements Serializable{
            /**
             * SCDWInfo : {}
             * SYDWInfo : {}
             * SYRInfo : {}
             * ZJCPID : 300
             * FL : 电子经纬仪
             * BM : 412341211
             * MC : 电子经纬仪
             * GGXH :
             * SCDW : 11
             * SYDW : 8
             * LX : 计量器具
             * SYZT : 启用
             * SYR : 259
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
