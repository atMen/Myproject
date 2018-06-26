package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class peopleInfo implements Serializable{

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
    /**
     * PageIndex : 1
     * PageSize : 4
     * TotalItemCount : 1
     * TotalPageCount : 1
     * Data : [{"ID":1,"XM":"郝彬彬","CYM":"大侠","XB":"1","CSNY":"2018-04-02T00:00:00","JG":"朔州","XL":"专家","BYYX":"山西理工","SXZY":"健身","ZZMM":"团员","ZJH":"321321321321","ZJZL":"99","SJH":"123456789","YXDZ":"377044411@qq.com","JZDZ":"阿士大夫","ZPLJ":null,"ZRRZT":0,"BZ":"我是备注","IsExamine":false,"CreateStaffID":1,"CreateTime":"2018-04-09T15:50:51.4","UpdateStaffID":null,"UpdateTime":null}]
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

    public static class DataBean implements Serializable{
        /**
         * ID : 1
         * XM : 郝彬彬
         * CYM : 大侠
         * XB : 1
         * CSNY : 2018-04-02T00:00:00
         * JG : 朔州
         * XL : 专家
         * BYYX : 山西理工
         * SXZY : 健身
         * ZZMM : 团员
         * ZJH : 321321321321
         * ZJZL : 99
         * SJH : 123456789
         * YXDZ : 377044411@qq.com
         * JZDZ : 阿士大夫
         * ZPLJ : null
         * ZRRZT : 0
         * BZ : 我是备注
         * IsExamine : false
         * CreateStaffID : 1
         * CreateTime : 2018-04-09T15:50:51.4
         * UpdateStaffID : null
         * UpdateTime : null
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
        private Object ZPLJ;
        private int ZRRZT;
        private String BZ;
        private boolean IsExamine;
        private int CreateStaffID;
        private String CreateTime;
        private Object UpdateStaffID;
        private Object UpdateTime;

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

        public Object getZPLJ() {
            return ZPLJ;
        }

        public void setZPLJ(Object ZPLJ) {
            this.ZPLJ = ZPLJ;
        }

        public int getZRRZT() {
            return ZRRZT;
        }

        public void setZRRZT(int ZRRZT) {
            this.ZRRZT = ZRRZT;
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
