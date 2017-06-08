package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AB07</p>
 * <p>Description: 系统菜单（主菜单）</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AB07{
    private String id;

    private String pid;   //这个是abg002

    private String abg003;

    private String abg004;

    private String abg005;

    private String abg006;

    private BigDecimal abg007;

    private String abg009;

    private Date abg010;

    private String abg011;

    private Date abg012;

    private String aba005;

    private String abg013;

    private String abg014;

    private String abg015;

    private String abg008;

    private List<String> children;
    
    
    /**
	 * Description:系统菜单（主菜单）菜单被那些用户拥有
	 */
    public List<String> getChildren() {
		return children;
	}
    /**
	 * Description:系统菜单（主菜单）菜单被那些用户拥有
	 */
	public void setChildren(List<String> children) {
		this.children = children;
	}
	/**
	 * Description:系统菜单（主菜单）菜单ID abg001
	 */
    public String getId() {
        return id;
    }
    /**
	 * Description:系统菜单（主菜单）菜单ID  abg001
	 */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    /**
	 * Description:系统菜单（主菜单）父菜单ID   abg002
	 */
    public String getPid() {
        return pid;
    }
    /**
	 * Description:系统菜单（主菜单）父菜单ID   abg002
	 */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
    /**
	 * Description:系统菜单（主菜单）菜单名
	 */
    public String getAbg003() {
        return abg003;
    }
    /**
	 * Description:系统菜单（主菜单）菜单名
	 */
    public void setAbg003(String abg003) {
        this.abg003 = abg003 == null ? null : abg003.trim();
    }
    /**
	 * Description:系统菜单（主菜单）URL地址
	 */
    public String getAbg004() {
        return abg004;
    }
    /**
	 * Description:系统菜单（主菜单）URL地址
	 */
    public void setAbg004(String abg004) {
        this.abg004 = abg004 == null ? null : abg004.trim();
    }
    /**
	 * Description:系统菜单（主菜单）图标Class
	 */
    public String getAbg005() {
        return abg005;
    }
    /**
	 * Description:系统菜单（主菜单）图标Class
	 */
    public void setAbg005(String abg005) {
        this.abg005 = abg005 == null ? null : abg005.trim();
    }
    /**
	 * Description:系统菜单（主菜单）图标URL
	 */
    public String getAbg006() {
        return abg006;
    }
    /**
	 * Description:系统菜单（主菜单）图标URL
	 */
    public void setAbg006(String abg006) {
        this.abg006 = abg006 == null ? null : abg006.trim();
    }
    /**
	 * Description:系统菜单（主菜单）菜单序号
	 */
    public BigDecimal getAbg007() {
        return abg007;
    }
    /**
	 * Description:系统菜单（主菜单）菜单序号
	 */
    public void setAbg007(BigDecimal abg007) {
        this.abg007 = abg007;
    }
    /**
	 * Description:系统菜单（主菜单）创建人code
	 */
    public String getAbg009() {
        return abg009;
    }
    /**
	 * Description:系统菜单（主菜单）创建人code
	 */
    public void setAbg009(String abg009) {
        this.abg009 = abg009 == null ? null : abg009.trim();
    }
    /**
	 * Description:系统菜单（主菜单）创建时间
	 */
    public Date getAbg010() {
        return abg010;
    }
    /**
	 * Description:系统菜单（主菜单）创建时间
	 */
    public void setAbg010(Date abg010) {
        this.abg010 = abg010;
    }
    /**
	 * Description:系统菜单（主菜单）更新人code
	 */
    public String getAbg011() {
        return abg011;
    }
    /**
	 * Description:系统菜单（主菜单）更新人code
	 */
    public void setAbg011(String abg011) {
        this.abg011 = abg011 == null ? null : abg011.trim();
    }
    /**
	 * Description:系统菜单（主菜单）更新时间
	 */
    public Date getAbg012() {
        return abg012;
    }
    /**
	 * Description:系统菜单（主菜单）更新时间
	 */
    public void setAbg012(Date abg012) {
        this.abg012 = abg012;
    }
    /**
	 * Description:系统菜单（主菜单）删除标志
	 */
    public String getAba005() {
        return aba005;
    }
    /**
	 * Description:系统菜单（主菜单）删除标志
	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
    /**
	 * Description:系统菜单（主菜单）是否隐藏
	 */
    public String getAbg013() {
        return abg013;
    }
    /**
	 * Description:系统菜单（主菜单）是否隐藏
	 */
    public void setAbg013(String abg013) {
        this.abg013 = abg013 == null ? null : abg013.trim();
    }
    /**
	 * Description:系统菜单（主菜单）系统编码
	 */
    public String getAbg014() {
        return abg014;
    }
    /**
	 * Description:系统菜单（主菜单）系统编码
	 */
    public void setAbg014(String abg014) {
        this.abg014 = abg014 == null ? null : abg014.trim();
    }
    /**
	 * Description:系统菜单（主菜单）系统名称
	 */
    public String getAbg015() {
        return abg015;
    }
    /**
	 * Description:系统菜单（主菜单）系统名称
	 */
    public void setAbg015(String abg015) {
        this.abg015 = abg015 == null ? null : abg015.trim();
    }
    /**
	 * Description:系统菜单（主菜单）描述
	 */
    public String getAbg008() {
        return abg008;
    }
    /**
	 * Description:系统菜单（主菜单）描述
	 */
    public void setAbg008(String abg008) {
        this.abg008 = abg008 == null ? null : abg008.trim();
    }
	@Override
	public String toString() {
		return "AB07 [id=" + id + ", pid=" + pid + ", abg003=" + abg003
				+ ", abg004=" + abg004 + ", abg005=" + abg005 + ", abg006="
				+ abg006 + ", abg007=" + abg007 + ", abg009=" + abg009
				+ ", abg010=" + abg010 + ", abg011=" + abg011 + ", abg012="
				+ abg012 + ", aba005=" + aba005 + ", abg013=" + abg013
				+ ", abg014=" + abg014 + ", abg015=" + abg015 + ", abg008="
				+ abg008 + ", children=" + children + "]";
	}
    
    
    
}