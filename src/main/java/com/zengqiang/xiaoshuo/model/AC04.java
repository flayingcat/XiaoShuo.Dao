package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AC04</p>
 * <p>Description: 订阅(这儿自动交费)</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC04 {
    private String acd001;

    private String aaa001;

    private String aca001;

    private String acd002;

    private Date acd004;

    private String acd003;
    /**
   	 * Description:订阅表，读者ID
   	 */
    public String getAcd001() {
        return acd001;
    }
    /**
   	 * Description:订阅表，读者ID
   	 */
    public void setAcd001(String acd001) {
        this.acd001 = acd001 == null ? null : acd001.trim();
    }
    /**
   	 * Description:订阅表，小说ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:订阅表，小说ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:订阅表，订阅Key
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:订阅表，订阅Key
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:订阅表，订阅缴费状态(0:会员订阅方式，1：其它方式)
   	 */
    public String getAcd002() {
        return acd002;
    }
    /**
   	 * Description:订阅表，订阅缴费状态(0:会员订阅方式，1：其它方式)
   	 */
    public void setAcd002(String acd002) {
        this.acd002 = acd002 == null ? null : acd002.trim();
    }
    /**
   	 * Description:订阅表，创建时间
   	 */
    public Date getAcd004() {
        return acd004;
    }
    /**
   	 * Description:订阅表，创建时间
   	 */
    public void setAcd004(Date acd004) {
        this.acd004 = acd004;
    }
    /**
   	 * Description:订阅表，订阅章节列表
   	 */
    public String getAcd003() {
        return acd003;
    }
    /**
   	 * Description:订阅表，订阅章节列表
   	 */
    public void setAcd003(String acd003) {
        this.acd003 = acd003 == null ? null : acd003.trim();
    }
}