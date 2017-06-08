package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AE03</p>
 * <p>Description: 书架</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AE03 {
    private String aec001;

    private String aaa001;

    private String aca001;

    private Date aec002;

    private Date aec003;

    private String aec004;
    /**
   	 * Description:打赏表，书架ID
   	 */
    public String getAec001() {
        return aec001;
    }
    /**
   	 * Description:打赏表，书架ID
   	 */
    public void setAec001(String aec001) {
        this.aec001 = aec001 == null ? null : aec001.trim();
    }
    /**
   	 * Description:打赏表，读者ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:打赏表，读者ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:打赏表，小说ID
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:打赏表，小说ID
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:打赏表，创建时间
   	 */
    public Date getAec002() {
        return aec002;
    }
    /**
   	 * Description:打赏表，创建时间
   	 */
    public void setAec002(Date aec002) {
        this.aec002 = aec002;
    }
    /**
   	 * Description:打赏表，上次阅读时间
   	 */
    public Date getAec003() {
        return aec003;
    }
    /**
   	 * Description:打赏表，上次阅读时间
   	 */
    public void setAec003(Date aec003) {
        this.aec003 = aec003;
    }
    /**
   	 * Description:打赏表，上次阅读位置
   	 */
    public String getAec004() {
        return aec004;
    }
    /**
   	 * Description:打赏表，上次阅读位置
   	 */
    public void setAec004(String aec004) {
        this.aec004 = aec004 == null ? null : aec004.trim();
    }
}