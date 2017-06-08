package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * <p>Title: AC05</p>
 * <p>Description: 收藏</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC05 {
    private String ace001;

    private String aaa001;

    private String aca001;

    private Date ace002;

    private BigDecimal ace003;

    private String aba005;
    /**
   	 * Description:收藏表，收藏key
   	 */
    public String getAce001() {
        return ace001;
    }
    /**
   	 * Description:收藏表，收藏key
   	 */
    public void setAce001(String ace001) {
        this.ace001 = ace001 == null ? null : ace001.trim();
    }
    /**
   	 * Description:收藏表，读者ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:收藏表，读者ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:收藏表，小说ID
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:收藏表，小说ID
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:收藏表，操作时间
   	 */
    public Date getAce002() {
        return ace002;
    }
    /**
   	 * Description:收藏表，操作时间
   	 */
    public void setAce002(Date ace002) {
        this.ace002 = ace002;
    }
    /**
   	 * Description:收藏表，当前位置
   	 */
    public BigDecimal getAce003() {
        return ace003;
    }
    /**
   	 * Description:收藏表，当前位置
   	 */
    public void setAce003(BigDecimal ace003) {
        this.ace003 = ace003;
    }
    /**
   	 * Description:收藏表，删除标志
   	 */
    public String getAba005() {
        return aba005;
    }
    /**
   	 * Description:收藏表，删除标志
   	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
}