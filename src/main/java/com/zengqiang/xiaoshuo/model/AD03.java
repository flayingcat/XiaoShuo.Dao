package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AD03</p>
 * <p>Description: 好友表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AD03 {
    private String adc001;

    private String adc002;

    private String adc003;

    private Date adc004;

    private String adc005;
    /**
   	 * Description:小说表，ID
   	 */
    public String getAdc001() {
        return adc001;
    }
    /**
   	 * Description:小说表，ID
   	 */
    public void setAdc001(String adc001) {
        this.adc001 = adc001 == null ? null : adc001.trim();
    }
    /**
   	 * Description:小说表，申请人ID
   	 */
    public String getAdc002() {
        return adc002;
    }
    /**
   	 * Description:小说表，申请人ID
   	 */
    public void setAdc002(String adc002) {
        this.adc002 = adc002 == null ? null : adc002.trim();
    }
    /**
   	 * Description:小说表，对象用户ID
   	 */
    public String getAdc003() {
        return adc003;
    }
    /**
   	 * Description:小说表，对象用户ID
   	 */
    public void setAdc003(String adc003) {
        this.adc003 = adc003 == null ? null : adc003.trim();
    }
    /**
   	 * Description:小说表，加入时间
   	 */
    public Date getAdc004() {
        return adc004;
    }
    /**
   	 * Description:小说表，加入时间
   	 */
    public void setAdc004(Date adc004) {
        this.adc004 = adc004;
    }
    /**
   	 * Description:小说表，好友类型
   	 */
    public String getAdc005() {
        return adc005;
    }
    /**
   	 * Description:小说表，好友类型
   	 */
    public void setAdc005(String adc005) {
        this.adc005 = adc005 == null ? null : adc005.trim();
    }
}