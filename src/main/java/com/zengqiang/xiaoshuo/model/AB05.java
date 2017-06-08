package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AB05</p>
 * <p>Description: 码值表父表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AB05 {
    private String abe001;

    private String abe002;

    private String abe003;

    private BigDecimal abe005;

    private String abe006;

    private Date abe007;

    private Date abe008;

    private String abe009;

    private String abe004;
    
    private String pid = "#";
    
    private List<AB05> children;
    /**
	 * Description:码值表父表码之Key
	 */
    public String getAbe001() {
        return abe001;
    }
    /**
	 * Description:码值表父表码之Key
	 */
    public void setAbe001(String abe001) {
        this.abe001 = abe001 == null ? null : abe001.trim();
    }
    /**
	 * Description:码值表父表码表类型
	 */
    public String getAbe002() {
        return abe002;
    }
    /**
	 * Description:码值表父表码表类型
	 */
    public void setAbe002(String abe002) {
        this.abe002 = abe002 == null ? null : abe002.trim();
    }
    /**
	 * Description:码值表父表码表名称
	 */
    public String getAbe003() {
        return abe003;
    }
    /**
	 * Description:码值表父表码表名称
	 */
    public void setAbe003(String abe003) {
        this.abe003 = abe003 == null ? null : abe003.trim();
    }
    /**
	 * Description:码值表序号
	 */
    public BigDecimal getAbe005() {
        return abe005;
    }
    /**
	 * Description:码值表序号
	 */
    public void setAbe005(BigDecimal abe005) {
        this.abe005 = abe005;
    }
    /**
	 * Description:码值表创建人
	 */
    public String getAbe006() {
        return abe006;
    }
    /**
	 * Description:码值表创建人
	 */
    public void setAbe006(String abe006) {
        this.abe006 = abe006 == null ? null : abe006.trim();
    }
    /**
	 * Description:码值表创建时间
	 */
    public Date getAbe007() {
        return abe007;
    }
    /**
	 * Description:码值表创建时间
	 */
    public void setAbe007(Date abe007) {
        this.abe007 = abe007;
    }
    /**
	 * Description:码值表更新时间
	 */
    public Date getAbe008() {
        return abe008;
    }
    /**
	 * Description:码值表更新时间
	 */
    public void setAbe008(Date abe008) {
        this.abe008 = abe008;
    }
    /**
	 * Description:码值表更新人
	 */
    public String getAbe009() {
        return abe009;
    }
    /**
	 * Description:码值表更新人
	 */
    public void setAbe009(String abe009) {
        this.abe009 = abe009 == null ? null : abe009.trim();
    }
    /**
	 * Description:码值表描述
	 */
    public String getAbe004() {
        return abe004;
    }
    /**
	 * Description:码值表描述
	 */
    public void setAbe004(String abe004) {
        this.abe004 = abe004 == null ? null : abe004.trim();
    }
    /**
     * 码值父表 的父Id编码
    * @Title: getPid  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @return    设定文件  
    * @return String    返回类型  
    * @throws
     */
	public String getPid() {
		return pid;
	}
	 /**
     * 码值父表 的父Id编码
    * @Title: getPid  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @return    设定文件  
    * @return String    返回类型  
    * @throws
     */
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public List<AB05> getChildren() {
		return children;
	}
	public void setChildren(List<AB05> children) {
		this.children = children;
	}
    
    
}