package customer.tcrj.com.myproject.net;

/**
 * desc:
 * author: Will .
 * date: 2017/9/2 .
 */
public class ApiConstants {

//  private static final String URLROOT = "http://192.168.20.121:9090/";
    private static final String URLROOT = "http://192.168.20.21:8891/";
    /**
     * 字典信息列表
     */
    public static final String zdlistApi = URLROOT+"Mobile/GetBaseData?Key=";
    /**
     * 登录
     */
    public static final String loginApi = URLROOT+"GetKey";

    /**
     * 修改密码
     */
    public static final String mdifyPswApi = URLROOT+"PWD?Key=";

    /**
     * 通知信息列表
     */
    public static final String tzlistApi = URLROOT+"Mobile/GetTZGG?Key=";

    /**
     * 类型信息列表
     */
    public static final String lxlistApi = URLROOT+"Mobile/GetBaseData?Key=";

    /**
     * 企业信息列表
     */
    public static final String qylistApi = URLROOT+"Mobile/GetQY?Key=";

    /**
     * 检验检测信息列表
     */
    public static final String jclistApi = URLROOT+"Mobile/GetJCPage?Key=";

    /**
     * 党建信息列表
     */
    public static final String djlistApi = URLROOT+"Mobile/GetDJDT?Key=";

    /**
     * 个人信息列表
     */
    public static final String grlistApi = URLROOT+"Mobile/GetGR?Key=";


    /**
     * 检验产品信息列表
     */
    public static final String jycplistApi = URLROOT+"Mobile/GetCP?Key=";


    /**
     * 计量器具信息列表
     */
    public static final String qjlistApi = URLROOT+"Mobile/GetQJ?Key=";

    /**
     * 特种设备信息列表
     */
    public static final String sblistApi = URLROOT+"Mobile/GetSB?Key=";

    /**
     * 生产标准信息列表
     */
    public static final String scbzlistApi = URLROOT+"Mobile/GetBZ?Key=";


    /**
     * 证书管理信息列表
     */
    public static final String zslistApi = URLROOT+"Mobile/GetZS?Key=";


    /**
     * 法律法规信息列表
     */
    public static final String flfglistApi = URLROOT+"Mobile/GetFLFG?Key=";
    /**
     * 行政审批流程列表
     */
    public static final String xzsplclistApi = URLROOT+"Mobile/GetSPLC?Key=";


    /**
     * 行政审批信息列表
     */
    public static final String xzsplistApi = URLROOT+"Mobile/GetXZSP?Key=";
    /**
     * 行政执法信息列表
     */
    public static final String xzzflistApi = URLROOT+"Mobile/GetXZZF?Key=";
    /**
     * 行政执法流程列表
     */
    public static final String xzzflclistApi = URLROOT+"Mobile/GetZFLC?Key=";
    /**
     * 企业诚信信息列表
     */
    public static final String qycxlistApi = URLROOT+"Mobile/GetCXMD?Key=";

    /**
     *
     * GetCXRY?Key
     */
    public static final String qyrylistApi = URLROOT+"Mobile/GetCXRY?Key=";

    /**
     * 投诉举报信息列表
     */
    public static final String tsjblistApi = URLROOT+"Mobile/GetTSJB?Key=";
}
