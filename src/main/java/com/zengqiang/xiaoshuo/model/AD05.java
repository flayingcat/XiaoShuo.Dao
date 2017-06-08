package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AD05</p>
 * <p>Description: 小说标签小说Map</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AD05 {
    private String ade001;

    private String ade002;

    private String aca001;

    private String aaa001;

    private Date ade003;

    private Date ade004;
    
    
	/**
   	 * Description:小说标签小说Map表，ID
   	 */
    public String getAde001() {
        return ade001;
    }
    /**
   	 * Description:小说标签小说Map表，ID
   	 */
    public void setAde001(String ade001) {
        this.ade001 = ade001 == null ? null : ade001.trim();
    }
    /**
   	 * Description:小说标签小说Map表，标签ID
   	 */
    public String getAde002() {
        return ade002;
    }
    /**
   	 * Description:小说标签小说Map表，标签ID
   	 */
    public void setAde002(String ade002) {
        this.ade002 = ade002 == null ? null : ade002.trim();
    }
    /**
   	 * Description:小说标签小说Map表，小说ID
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:小说标签小说Map表，小说ID
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:小说标签小说Map表，创建人ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:小说标签小说Map表，创建人ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:小说标签小说Map表，创建时间
   	 */
    public Date getAde003() {
        return ade003;
    }
    /**
   	 * Description:小说标签小说Map表，创建时间
   	 */
    public void setAde003(Date ade003) {
        this.ade003 = ade003;
    }
    /**
   	 * Description:小说标签小说Map表，更新时间
   	 */
    public Date getAde004() {
        return ade004;
    }
    /**
   	 * Description:小说标签小说Map表，更新时间
   	 */
    public void setAde004(Date ade004) {
        this.ade004 = ade004;
    }
}