package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * <p>Title: AE02</p>
 * <p>Description: 打赏表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AE02 {
    private String aeb001;

    private String aeb002;

    private String aca001;

    private String aeb004;

    private String aeb005;

    private BigDecimal aeb006;

    private Date aeb007;
    /**
   	 * Description:打赏表，打赏ID
   	 */
    public String getAeb001() {
        return aeb001;
    }
    /**
   	 * Description:打赏表，打赏ID
   	 */
    public void setAeb001(String aeb001) {
        this.aeb001 = aeb001 == null ? null : aeb001.trim();
    }
    /**
   	 * Description:打赏表，打赏人ID
   	 */
    public String getAeb002() {
        return aeb002;
    }
    /**
   	 * Description:打赏表，打赏人ID
   	 */
    public void setAeb002(String aeb002) {
        this.aeb002 = aeb002 == null ? null : aeb002.trim();
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
   	 * Description:打赏表，作家ID
   	 */
    public String getAeb004() {
        return aeb004;
    }
    /**
   	 * Description:打赏表，作家ID
   	 */
    public void setAeb004(String aeb004) {
        this.aeb004 = aeb004 == null ? null : aeb004.trim();
    }
    /**
   	 * Description:打赏表，打赏类型(打赏小说，打赏作家)
   	 */
    public String getAeb005() {
        return aeb005;
    }
    /**
   	 * Description:打赏表，打赏类型(打赏小说，打赏作家)
   	 */
    public void setAeb005(String aeb005) {
        this.aeb005 = aeb005 == null ? null : aeb005.trim();
    }
    /**
   	 * Description:打赏表，打赏金额
   	 */
    public BigDecimal getAeb006() {
        return aeb006;
    }
    /**
   	 * Description:打赏表，打赏金额
   	 */
    public void setAeb006(BigDecimal aeb006) {
        this.aeb006 = aeb006;
    }
    /**
   	 * Description:打赏表，创建日期
   	 */
    public Date getAeb007() {
        return aeb007;
    }
    /**
   	 * Description:打赏表，创建日期
   	 */
    public void setAeb007(Date aeb007) {
        this.aeb007 = aeb007;
    }
}