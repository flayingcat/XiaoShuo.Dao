package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AD02</p>
 * <p>Description: 作家社区用户Map</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AD02 {
    private String adb001;

    private String acf001;

    private String aaa001;

    private Date adb002;
    /**
   	 * Description:作家社区用户Map表，ID
   	 */
    public String getAdb001() {
        return adb001;
    }
    /**
   	 * Description:作家社区用户Map表，ID
   	 */
    public void setAdb001(String adb001) {
        this.adb001 = adb001 == null ? null : adb001.trim();
    }
    /**
   	 * Description:作家社区用户Map表，作家社区ID
   	 */
    public String getAcf001() {
        return acf001;
    }
    /**
   	 * Description:作家社区用户Map表，作家社区ID
   	 */
    public void setAcf001(String acf001) {
        this.acf001 = acf001 == null ? null : acf001.trim();
    }
    /**
   	 * Description:作家社区用户Map表，作家ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:作家社区用户Map表，作家ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:作家社区用户Map表，加入时间
   	 */
    public Date getAdb002() {
        return adb002;
    }
    /**
   	 * Description:作家社区用户Map表，加入时间
   	 */
    public void setAdb002(Date adb002) {
        this.adb002 = adb002;
    }
}