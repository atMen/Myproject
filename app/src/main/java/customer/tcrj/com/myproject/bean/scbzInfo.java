package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/10.
 */

public class scbzInfo implements Serializable{

    /**
     * PageIndex : 4
     * PageSize : 3
     * TotalItemCount : 2
     * TotalPageCount : 1
     * Data : [{"BZID":1,"BZMC":"测试","BZBM":"123321","BZ":"<p><img src=\"/uploadedfiles/ueuploads/image/20180409/6365888524149218285672945.png\" title=\"ic_launcher.png\" alt=\"ic_launcher.png\"/>阿茶山村<\/p>","PublishTime":"2018-04-10T00:00:00","Status":1,"StatusName":"启用"}]
     */

    private int PageIndex;
    private int PageSize;
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

    private String stat;
    private String msg;

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
         * BZID : 1
         * BZMC : 测试
         * BZBM : 123321
         * BZ : <p><img src="/uploadedfiles/ueuploads/image/20180409/6365888524149218285672945.png" title="ic_launcher.png" alt="ic_launcher.png"/>阿茶山村</p>
         * PublishTime : 2018-04-10T00:00:00
         * Status : 1
         * StatusName : 启用
         */

        private int BZID;
        private String BZMC;
        private String BZBM;
        private String BZ;
        private String PublishTime;
        private int Status;
        private String StatusName;

        public int getBZID() {
            return BZID;
        }

        public void setBZID(int BZID) {
            this.BZID = BZID;
        }

        public String getBZMC() {
            return BZMC;
        }

        public void setBZMC(String BZMC) {
            this.BZMC = BZMC;
        }

        public String getBZBM() {
            return BZBM;
        }

        public void setBZBM(String BZBM) {
            this.BZBM = BZBM;
        }

        public String getBZ() {
            return BZ;
        }

        public void setBZ(String BZ) {
            this.BZ = BZ;
        }

        public String getPublishTime() {
            return PublishTime;
        }

        public void setPublishTime(String PublishTime) {
            this.PublishTime = PublishTime;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public String getStatusName() {
            return StatusName;
        }

        public void setStatusName(String StatusName) {
            this.StatusName = StatusName;
        }
    }
}
