package customer.tcrj.com.myproject.bean;

import java.util.List;

/**
 * Created by leict on 2018/4/13.
 */

public class sweetInfo {
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
    /**
     * PageIndex : 1
     * PageSize : 5
     * TotalItemCount : 5
     * TotalPageCount : 5
     * Data : [{"ID":"2","PID":"1","DataCode":"1","Name":"营业","lvl":2,"Path":".1."},{"ID":"3","PID":"1","DataCode":"2","Name":"停业","lvl":2,"Path":".1."},{"ID":"4","PID":"1","DataCode":"3","Name":"关闭","lvl":2,"Path":".1."},{"ID":"5","PID":"1","DataCode":"4","Name":"筹建","lvl":2,"Path":".1."},{"ID":"6","PID":"1","DataCode":"5","Name":"其他","lvl":2,"Path":".1."}]
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
         * ID : 2
         * PID : 1
         * DataCode : 1
         * Name : 营业
         * lvl : 2
         * Path : .1.
         */

        private String ID;
        private String PID;
        private String DataCode;
        private String Name;
        private int lvl;
        private String Path;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getPID() {
            return PID;
        }

        public void setPID(String PID) {
            this.PID = PID;
        }

        public String getDataCode() {
            return DataCode;
        }

        public void setDataCode(String DataCode) {
            this.DataCode = DataCode;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getLvl() {
            return lvl;
        }

        public void setLvl(int lvl) {
            this.lvl = lvl;
        }

        public String getPath() {
            return Path;
        }

        public void setPath(String Path) {
            this.Path = Path;
        }
    }
}
