package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AC07</p>
 * <p>Description: 群组</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC07 {
    private String acg001;

    private String acg002;

    private BigDecimal acg003;

    private String acg004;

    private BigDecimal acg005;

    private String acg006;

    private Date acg007;

    private String acg008;
    
    private List<String> aaa001List;
    
    
    /**
   	 * Description:群组表，群里面的用户
   	 */
    public List<String> getAaa001List() {
		return aaa001List;
	}
    /**
   	 * Description:群组表，群里面的用户
   	 */
	public void setAaa001List(List<String> aaa001List) {
		this.aaa001List = aaa001List;
	}
	/**
   	 * Description:群组表，群ID
   	 */
    public String getAcg001() {
        return acg001;
    }
    /**
   	 * Description:群组表，群ID
   	 */
    public void setAcg001(String acg001) {
        this.acg001 = acg001 == null ? null : acg001.trim();
    }
    /**
   	 * Description:群组表，群类型
   	 */
    public String getAcg002() {
        return acg002;
    }
    /**
   	 * Description:群组表，群类型
   	 */
    public void setAcg002(String acg002) {
        this.acg002 = acg002 == null ? null : acg002.trim();
    }
    /**
   	 * Description:群组表，群当前总的人数
   	 */
    public BigDecimal getAcg003() {
        return acg003;
    }
    /**
   	 * Description:群组表，群当前总的人数
   	 */
    public void setAcg003(BigDecimal acg003) {
        this.acg003 = acg003;
    }
    /**
   	 * Description:群组表，聊天记录本地文件
   	 */
    public String getAcg004() {
        return acg004;
    }
    /**
   	 * Description:群组表，聊天记录本地文件
   	 */
    public void setAcg004(String acg004) {
        this.acg004 = acg004 == null ? null : acg004.trim();
    }
    /**
   	 * Description:群组表，群最大总人数
   	 */
    public BigDecimal getAcg005() {
        return acg005;
    }
    /**
   	 * Description:群组表，群最大总人数
   	 */
    public void setAcg005(BigDecimal acg005) {
        this.acg005 = acg005;
    }
    /**
   	 * Description:群组表，头像ID
   	 */
    public String getAcg006() {
        return acg006;
    }
    /**
   	 * Description:群组表，头像ID
   	 */
    public void setAcg006(String acg006) {
        this.acg006 = acg006 == null ? null : acg006.trim();
    }
    /**
   	 * Description:群组表，创建时间
   	 */
    public Date getAcg007() {
        return acg007;
    }
    /**
   	 * Description:群组表，创建时间
   	 */
    public void setAcg007(Date acg007) {
        this.acg007 = acg007;
    }
    /**
   	 * Description:群组表，创建人
   	 */
    public String getAcg008() {
        return acg008;
    }
    /**
   	 * Description:群组表，创建人
   	 */
    public void setAcg008(String acg008) {
        this.acg008 = acg008 == null ? null : acg008.trim();
    }
}