package com.multilevel.treelist;

import java.util.List;

/**
 * Created by leict on 2018/4/11.
 */

public class bean {

    /**
     * PageIndex : 1
     * PageSize : 157
     * TotalItemCount : 157
     * TotalPageCount : 157
     * Data : [{"ID":371,"PID":35,"DataCode":"1000","Name":"锅炉","lvl":2,"Path":".35."},{"ID":372,"PID":371,"DataCode":"1100","Name":"承压蒸汽锅炉","lvl":3,"Path":".35.371."},{"ID":373,"PID":371,"DataCode":"1200","Name":"承压热水锅炉","lvl":3,"Path":".35.371."},{"ID":374,"PID":371,"DataCode":"1300","Name":"有机热载体锅炉","lvl":3,"Path":".35.371."},{"ID":375,"PID":374,"DataCode":"1310","Name":"有机热载体气相炉","lvl":4,"Path":".35.371.374."},{"ID":376,"PID":374,"DataCode":"1320","Name":"有机热载体液相炉","lvl":4,"Path":".35.371.374."},{"ID":377,"PID":35,"DataCode":"2000","Name":"压力容器","lvl":2,"Path":".35."},{"ID":378,"PID":377,"DataCode":"2100","Name":"固定式压力容器","lvl":3,"Path":".35.377."},{"ID":379,"PID":378,"DataCode":"2110","Name":"超高压容器","lvl":4,"Path":".35.377.378."},{"ID":380,"PID":378,"DataCode":"2130","Name":"第三类压力容器","lvl":4,"Path":".35.377.378."},{"ID":381,"PID":378,"DataCode":"2150","Name":"第二类压力容器","lvl":4,"Path":".35.377.378."},{"ID":382,"PID":378,"DataCode":"2170","Name":"第一类压力容器","lvl":4,"Path":".35.377.378."},{"ID":383,"PID":377,"DataCode":"2200","Name":"移动式压力容器","lvl":3,"Path":".35.377."},{"ID":384,"PID":383,"DataCode":"2210","Name":"铁路罐车","lvl":4,"Path":".35.377.383."},{"ID":385,"PID":383,"DataCode":"2220","Name":"汽车罐车","lvl":4,"Path":".35.377.383."},{"ID":386,"PID":383,"DataCode":"2230","Name":"长管拖车","lvl":4,"Path":".35.377.383."},{"ID":387,"PID":383,"DataCode":"2240","Name":"罐式集装箱","lvl":4,"Path":".35.377.383."},{"ID":388,"PID":383,"DataCode":"2250","Name":"管束式集装箱","lvl":4,"Path":".35.377.383."},{"ID":389,"PID":377,"DataCode":"2300","Name":"气瓶","lvl":3,"Path":".35.377."},{"ID":390,"PID":389,"DataCode":"2310","Name":"无缝气瓶","lvl":4,"Path":".35.377.389."},{"ID":391,"PID":389,"DataCode":"2320","Name":"焊接气瓶","lvl":4,"Path":".35.377.389."},{"ID":392,"PID":389,"DataCode":"23T0","Name":"特种气瓶（内装填料气瓶、纤维缠绕气瓶、低温绝热气瓶）","lvl":4,"Path":".35.377.389."},{"ID":393,"PID":377,"DataCode":"2400","Name":"氧舱","lvl":3,"Path":".35.377."},{"ID":394,"PID":393,"DataCode":"2410","Name":"医用氧舱","lvl":4,"Path":".35.377.393."},{"ID":395,"PID":393,"DataCode":"2420","Name":"高气压舱","lvl":4,"Path":".35.377.393."},{"ID":396,"PID":35,"DataCode":"8000","Name":"压力管道","lvl":2,"Path":".35."},{"ID":397,"PID":396,"DataCode":"8100","Name":"长输管道","lvl":3,"Path":".35.396."},{"ID":398,"PID":397,"DataCode":"8110","Name":"输油管道","lvl":4,"Path":".35.396.397."},{"ID":399,"PID":397,"DataCode":"8120","Name":"输气管道","lvl":4,"Path":".35.396.397."},{"ID":400,"PID":396,"DataCode":"8200","Name":"公用管道","lvl":3,"Path":".35.396."},{"ID":401,"PID":400,"DataCode":"8210","Name":"燃气管道","lvl":4,"Path":".35.396.400."},{"ID":402,"PID":400,"DataCode":"8220","Name":"热力管道","lvl":4,"Path":".35.396.400."},{"ID":403,"PID":396,"DataCode":"8300","Name":"工业管道","lvl":3,"Path":".35.396."},{"ID":404,"PID":403,"DataCode":"8310","Name":"工艺管道","lvl":4,"Path":".35.396.403."},{"ID":405,"PID":403,"DataCode":"8320","Name":"动力管道","lvl":4,"Path":".35.396.403."},{"ID":406,"PID":403,"DataCode":"8330","Name":"制冷管道","lvl":4,"Path":".35.396.403."},{"ID":407,"PID":35,"DataCode":"7000","Name":"压力管道元件","lvl":2,"Path":".35."},{"ID":408,"PID":407,"DataCode":"7100","Name":"压力管道管子","lvl":3,"Path":".35.407."},{"ID":409,"PID":408,"DataCode":"7110","Name":"无缝钢管","lvl":4,"Path":".35.407.408."},{"ID":410,"PID":408,"DataCode":"7120","Name":"焊接钢管","lvl":4,"Path":".35.407.408."},{"ID":411,"PID":408,"DataCode":"7130","Name":"有色金属管","lvl":4,"Path":".35.407.408."},{"ID":412,"PID":408,"DataCode":"7140","Name":"球墨铸铁管","lvl":4,"Path":".35.407.408."},{"ID":413,"PID":408,"DataCode":"7150","Name":"复合管","lvl":4,"Path":".35.407.408."},{"ID":414,"PID":408,"DataCode":"71F0","Name":"非金属材料管","lvl":4,"Path":".35.407.408."},{"ID":415,"PID":407,"DataCode":"7200","Name":"压力管道管件","lvl":3,"Path":".35.407."},{"ID":416,"PID":415,"DataCode":"7210","Name":"金属阀门","lvl":4,"Path":".35.407.415."},{"ID":417,"PID":415,"DataCode":"7220","Name":"非金属阀门","lvl":4,"Path":".35.407.415."},{"ID":418,"PID":415,"DataCode":"7230","Name":"特种阀门","lvl":4,"Path":".35.407.415."},{"ID":419,"PID":415,"DataCode":"7270","Name":"复合管件","lvl":4,"Path":".35.407.415."},{"ID":420,"PID":415,"DataCode":"72F0","Name":"非金属管件","lvl":4,"Path":".35.407.415."},{"ID":421,"PID":407,"DataCode":"7300","Name":"压力管道阀门","lvl":3,"Path":".35.407."},{"ID":422,"PID":421,"DataCode":"7320","Name":"金属阀门","lvl":4,"Path":".35.407.421."},{"ID":423,"PID":421,"DataCode":"73F0","Name":"非金属阀门","lvl":4,"Path":".35.407.421."},{"ID":424,"PID":421,"DataCode":"73T0","Name":"特种阀门","lvl":4,"Path":".35.407.421."},{"ID":425,"PID":407,"DataCode":"7400","Name":"压力管道法兰","lvl":3,"Path":".35.407."},{"ID":426,"PID":425,"DataCode":"7410","Name":"钢制锻造法兰","lvl":4,"Path":".35.407.425."},{"ID":427,"PID":425,"DataCode":"7420","Name":"非金属法兰","lvl":4,"Path":".35.407.425."},{"ID":428,"PID":407,"DataCode":"7500","Name":"补偿器","lvl":3,"Path":".35.407."},{"ID":429,"PID":428,"DataCode":"7510","Name":"金属波纹膨胀节","lvl":4,"Path":".35.407.428."},{"ID":430,"PID":428,"DataCode":"7530","Name":"旋转补偿器","lvl":4,"Path":".35.407.428."},{"ID":431,"PID":428,"DataCode":"75F0","Name":"非金属膨胀节","lvl":4,"Path":".35.407.428."},{"ID":432,"PID":407,"DataCode":"7700","Name":"压力管道密封元件","lvl":3,"Path":".35.407."},{"ID":433,"PID":432,"DataCode":"7710","Name":"金属密封元件","lvl":4,"Path":".35.407.432."},{"ID":434,"PID":432,"DataCode":"77F0","Name":"非金属密封元件","lvl":4,"Path":".35.407.432."},{"ID":435,"PID":407,"DataCode":"7T00","Name":"压力管道特种元件","lvl":3,"Path":".35.407."},{"ID":436,"PID":435,"DataCode":"7T10","Name":"防腐管道元件","lvl":4,"Path":".35.407.435."},{"ID":437,"PID":435,"DataCode":"7TZ0","Name":"元件组合装置","lvl":4,"Path":".35.407.435."},{"ID":438,"PID":35,"DataCode":"3000","Name":"电梯","lvl":2,"Path":".35."},{"ID":439,"PID":438,"DataCode":"3100","Name":"曳引与强制驱动电梯","lvl":3,"Path":".35.438."},{"ID":440,"PID":439,"DataCode":"3110","Name":"曳引驱动乘客电梯","lvl":4,"Path":".35.438.439."},{"ID":441,"PID":439,"DataCode":"3120","Name":"曳引驱动载货电梯","lvl":4,"Path":".35.438.439."},{"ID":442,"PID":439,"DataCode":"3130","Name":"强制驱动载货电梯","lvl":4,"Path":".35.438.439."},{"ID":443,"PID":438,"DataCode":"3200","Name":"液压驱动电梯","lvl":3,"Path":".35.438."},{"ID":444,"PID":443,"DataCode":"3210","Name":"液压乘客电梯","lvl":4,"Path":".35.438.443."},{"ID":445,"PID":443,"DataCode":"3220","Name":"液压载货电梯","lvl":4,"Path":".35.438.443."},{"ID":446,"PID":438,"DataCode":"3300","Name":"自动扶梯与自动人行道","lvl":3,"Path":".35.438."},{"ID":447,"PID":446,"DataCode":"3310","Name":"自动扶梯","lvl":4,"Path":".35.438.446."},{"ID":448,"PID":446,"DataCode":"3320","Name":"自动人行道","lvl":4,"Path":".35.438.446."},{"ID":449,"PID":438,"DataCode":"3400","Name":"其它类型电梯","lvl":3,"Path":".35.438."},{"ID":450,"PID":449,"DataCode":"3410","Name":"防爆电梯","lvl":4,"Path":".35.438.449."},{"ID":451,"PID":449,"DataCode":"3420","Name":"消防员电梯","lvl":4,"Path":".35.438.449."},{"ID":452,"PID":449,"DataCode":"3430","Name":"杂物电梯","lvl":4,"Path":".35.438.449."},{"ID":453,"PID":35,"DataCode":"4000","Name":"起重机械","lvl":2,"Path":".35."},{"ID":454,"PID":453,"DataCode":"4100","Name":"桥式起重机","lvl":3,"Path":".35.453."},{"ID":455,"PID":454,"DataCode":"4110","Name":"通用桥式起重机","lvl":4,"Path":".35.453.454."},{"ID":456,"PID":454,"DataCode":"4130","Name":"防爆桥式起重机","lvl":4,"Path":".35.453.454."},{"ID":457,"PID":454,"DataCode":"4140","Name":"绝缘桥式起重机","lvl":4,"Path":".35.453.454."},{"ID":458,"PID":454,"DataCode":"4150","Name":"冶金桥式起重机","lvl":4,"Path":".35.453.454."},{"ID":459,"PID":454,"DataCode":"4170","Name":"电动单梁起重机","lvl":4,"Path":".35.453.454."},{"ID":460,"PID":454,"DataCode":"4190","Name":"电动葫芦桥式起重机","lvl":4,"Path":".35.453.454."},{"ID":461,"PID":453,"DataCode":"4200","Name":"门式起重机","lvl":3,"Path":".35.453."},{"ID":462,"PID":461,"DataCode":"4210","Name":"通用门式起重机","lvl":4,"Path":".35.453.461."},{"ID":463,"PID":461,"DataCode":"4220","Name":"防爆门式起重机","lvl":4,"Path":".35.453.461."},{"ID":464,"PID":461,"DataCode":"4230","Name":"轨道式集装箱门式起重机","lvl":4,"Path":".35.453.461."},{"ID":465,"PID":461,"DataCode":"4240","Name":"轮胎式集装箱门式起重机","lvl":4,"Path":".35.453.461."},{"ID":466,"PID":461,"DataCode":"4250","Name":"岸边集装箱起重机","lvl":4,"Path":".35.453.461."},{"ID":467,"PID":461,"DataCode":"4260","Name":"造船门式起重机","lvl":4,"Path":".35.453.461."},{"ID":468,"PID":461,"DataCode":"4270","Name":"电动葫芦门式起重机","lvl":4,"Path":".35.453.461."},{"ID":469,"PID":461,"DataCode":"4280","Name":"装卸桥","lvl":4,"Path":".35.453.461."},{"ID":470,"PID":461,"DataCode":"4290","Name":"架桥机","lvl":4,"Path":".35.453.461."},{"ID":471,"PID":453,"DataCode":"4300","Name":"塔式起重机","lvl":3,"Path":".35.453."},{"ID":472,"PID":471,"DataCode":"4310","Name":"普通塔式起重机","lvl":4,"Path":".35.453.471."},{"ID":473,"PID":471,"DataCode":"4320","Name":"电站塔式起重机","lvl":4,"Path":".35.453.471."},{"ID":474,"PID":453,"DataCode":"4400","Name":"流动式起重机","lvl":3,"Path":".35.453."},{"ID":475,"PID":474,"DataCode":"4410","Name":"轮胎起重机","lvl":4,"Path":".35.453.474."},{"ID":476,"PID":474,"DataCode":"4420","Name":"履带起重机","lvl":4,"Path":".35.453.474."},{"ID":477,"PID":474,"DataCode":"4440","Name":"集装箱正面吊运起重机","lvl":4,"Path":".35.453.474."},{"ID":478,"PID":474,"DataCode":"4450","Name":"铁路起重机","lvl":4,"Path":".35.453.474."},{"ID":479,"PID":453,"DataCode":"4700","Name":"门座式起重机","lvl":3,"Path":".35.453."},{"ID":480,"PID":479,"DataCode":"4710","Name":"门座起重机","lvl":4,"Path":".35.453.479."},{"ID":481,"PID":479,"DataCode":"4760","Name":"固定式起重机","lvl":4,"Path":".35.453.479."},{"ID":482,"PID":453,"DataCode":"4800","Name":"升降机","lvl":3,"Path":".35.453."},{"ID":483,"PID":482,"DataCode":"4860","Name":"施工升降机","lvl":4,"Path":".35.453.482."},{"ID":484,"PID":482,"DataCode":"4870","Name":"简易升降机","lvl":4,"Path":".35.453.482."},{"ID":485,"PID":453,"DataCode":"4900","Name":"缆索式起重机","lvl":3,"Path":".35.453."},{"ID":486,"PID":453,"DataCode":"4A00","Name":"桅杆式起重机","lvl":3,"Path":".35.453."},{"ID":487,"PID":453,"DataCode":"4D00","Name":"机械式停车设备","lvl":3,"Path":".35.453."},{"ID":488,"PID":35,"DataCode":"9000","Name":"客运索道","lvl":2,"Path":".35."},{"ID":489,"PID":488,"DataCode":"9100","Name":"客运架空索道","lvl":3,"Path":".35.488."},{"ID":490,"PID":489,"DataCode":"9110","Name":"往复式客运架空索道","lvl":4,"Path":".35.488.489."},{"ID":491,"PID":489,"DataCode":"9120","Name":"循环式客运架空索道","lvl":4,"Path":".35.488.489."},{"ID":492,"PID":488,"DataCode":"9200","Name":"客运缆车","lvl":3,"Path":".35.488."},{"ID":493,"PID":492,"DataCode":"9210","Name":"往复式客运缆车","lvl":4,"Path":".35.488.492."},{"ID":494,"PID":492,"DataCode":"9220","Name":"循环式客运缆车","lvl":4,"Path":".35.488.492."},{"ID":495,"PID":488,"DataCode":"9300","Name":"客运拖牵索道","lvl":3,"Path":".35.488."},{"ID":496,"PID":495,"DataCode":"9310","Name":"低位客运拖牵索道","lvl":4,"Path":".35.488.495."},{"ID":497,"PID":495,"DataCode":"9320","Name":"高位客运拖牵索道","lvl":4,"Path":".35.488.495."},{"ID":498,"PID":35,"DataCode":"6000","Name":"大型游乐设施","lvl":2,"Path":".35."},{"ID":499,"PID":498,"DataCode":"6100","Name":"观览车类","lvl":3,"Path":".35.498."},{"ID":500,"PID":498,"DataCode":"6200","Name":"滑行车类","lvl":3,"Path":".35.498."},{"ID":501,"PID":498,"DataCode":"6300","Name":"架空游览车类","lvl":3,"Path":".35.498."},{"ID":502,"PID":498,"DataCode":"6400","Name":"陀螺类","lvl":3,"Path":".35.498."},{"ID":503,"PID":498,"DataCode":"6500","Name":"飞行塔类","lvl":3,"Path":".35.498."},{"ID":504,"PID":498,"DataCode":"6600","Name":"转马类","lvl":3,"Path":".35.498."},{"ID":505,"PID":498,"DataCode":"6700","Name":"自控飞机类","lvl":3,"Path":".35.498."},{"ID":506,"PID":498,"DataCode":"6800","Name":"赛车类","lvl":3,"Path":".35.498."},{"ID":507,"PID":498,"DataCode":"6900","Name":"小火车类","lvl":3,"Path":".35.498."},{"ID":508,"PID":498,"DataCode":"6A00","Name":"碰碰车类","lvl":3,"Path":".35.498."},{"ID":509,"PID":498,"DataCode":"6B00","Name":"滑道类","lvl":3,"Path":".35.498."},{"ID":510,"PID":498,"DataCode":"6D00","Name":"水上游乐设施","lvl":3,"Path":".35.498."},{"ID":511,"PID":510,"DataCode":"6D10","Name":"峡谷漂流系列","lvl":4,"Path":".35.498.510."},{"ID":512,"PID":510,"DataCode":"6D20","Name":"水滑梯系列","lvl":4,"Path":".35.498.510."},{"ID":513,"PID":510,"DataCode":"6D40","Name":"碰碰船系列","lvl":4,"Path":".35.498.510."},{"ID":514,"PID":498,"DataCode":"6E00","Name":"无动力游乐设施","lvl":3,"Path":".35.498."},{"ID":515,"PID":514,"DataCode":"6E10","Name":"蹦极系列","lvl":4,"Path":".35.498.514."},{"ID":516,"PID":514,"DataCode":"6E40","Name":"滑索系列","lvl":4,"Path":".35.498.514."},{"ID":517,"PID":514,"DataCode":"6E50","Name":"空中飞人系列","lvl":4,"Path":".35.498.514."},{"ID":518,"PID":514,"DataCode":"6E60","Name":"系留式观光气球系列","lvl":4,"Path":".35.498.514."},{"ID":519,"PID":35,"DataCode":"5000","Name":"场（厂）内专用机动车辆","lvl":2,"Path":".35."},{"ID":520,"PID":519,"DataCode":"5100","Name":"机动工业车辆","lvl":3,"Path":".35.519."},{"ID":521,"PID":520,"DataCode":"5110","Name":"叉车","lvl":4,"Path":".35.519.520."},{"ID":522,"PID":519,"DataCode":"5200","Name":"非公路用旅游观光车辆","lvl":3,"Path":".35.519."},{"ID":523,"PID":35,"DataCode":"F000","Name":"安全附件","lvl":2,"Path":".35."},{"ID":524,"PID":421,"DataCode":"7310","Name":"安全阀","lvl":4,"Path":".35.407.421."},{"ID":525,"PID":523,"DataCode":"F220","Name":"爆破片装置","lvl":4,"Path":".35.523."},{"ID":526,"PID":523,"DataCode":"F230","Name":"紧急切断阀","lvl":4,"Path":".35.523."},{"ID":527,"PID":523,"DataCode":"F260","Name":"气瓶阀门","lvl":4,"Path":".35.523."}]
     */
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
    private int PageIndex;
    private int PageSize;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<Node> Data;

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

    public List<Node> getData() {
        return Data;
    }

    public void setData(List<Node> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * ID : 371
         * PID : 35
         * DataCode : 1000
         * Name : 锅炉
         * lvl : 2
         * Path : .35.
         */

        private int ID;
        private int PID;
        private String DataCode;
        private String Name;
        private int lvl;
        private String Path;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getPID() {
            return PID;
        }

        public void setPID(int PID) {
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
