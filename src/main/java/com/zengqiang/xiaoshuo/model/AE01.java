package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AE01</p>
 * <p>Description: 关注表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AE01 {
    private String aea001;

    private String aea002;

    private String aea003;

    private String aea004;

    private Date aea005;

    private String aba005;
    /**
   	 * Description:关注表，关注ID
   	 */
    public String getAea001() {
        return aea001;
    }
    /**
   	 * Description:关注表，关注ID
   	 */
    public void setAea001(String aea001) {
        this.aea001 = aea001 == null ? null : aea001.trim();
    }
    /**
   	 * Description:关注表，关注类型Id
   	 */
    public String getAea002() {
        return aea002;
    }
    /**
   	 * Description:关注表，关注类型Id
   	 */
    public void setAea002(String aea002) {
        this.aea002 = aea002 == null ? null : aea002.trim();
    }
    /**
   	 * Description:关注表，关注者ID
   	 */
    public String getAea003() {
        return aea003;
    }
    /**
   	 * Description:关注表，关注者ID
   	 */
    public void setAea003(String aea003) {
        this.aea003 = aea003 == null ? null : aea003.trim();
    }
    /**
   	 * Description:关注表，被关注者ID
   	 */
    public String getAea004() {
        return aea004;
    }
    /**
   	 * Description:关注表，被关注者ID
   	 */
    public void setAea004(String aea004) {
        this.aea004 = aea004 == null ? null : aea004.trim();
    }
    /**
   	 * Description:关注表，创建时间
   	 */
    public Date getAea005() {
        return aea005;
    }
    /**
   	 * Description:关注表，创建时间
   	 */
    public void setAea005(Date aea005) {
        this.aea005 = aea005;
    }
    /**
   	 * Description:关注表，删除标志
   	 */
    public String getAba005() {
        return aba005;
    }
    /**
   	 * Description:关注表，删除标志
   	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
}