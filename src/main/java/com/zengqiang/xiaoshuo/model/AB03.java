package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AB03</p>
 * <p>Description: 小说分类</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */


public class AB03 {
    private String id;

    private String pid;
    
    private BigDecimal abc003;

    private String aba005;

    private String abc004;

    private String abc005;

    private String abc006;

    private Date abc007;

    private String abc008;

    private Date abc009;
    
    private BigDecimal abc010;
    
    private List<AB03> children;
    
    /**
	 * Description:小说分类排序序列
	 */
    public BigDecimal getAbc010() {
		return abc010;
	}
    /**
	 * Description:小说分类排序序列
	 */
	public void setAbc010(BigDecimal abc010) {
		this.abc010 = abc010;
	}
	/**
	 * Description:小说分类孩子节点
	 */
    public List<AB03> getChildren() {
		return children;
	}
    /**
	 * Description:小说分类孩子节点
	 */
	public void setChildren(List<AB03> children) {
		this.children = children;
	}
	/**
	 * Description:小说分类表分类ID
	 */
    public String getId() {
        return id;
    }
    /**
	 * Description:小说分类表分类ID
	 */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    /**
	 * Description:小说分类表上级ID
	 */
    public String getPid() {
        return pid;
    }
    /**
	 * Description:小说分类表上级ID
	 */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
    /**
	 * Description:小说分类表等级
	 */
    public BigDecimal getAbc003() {
        return abc003;
    }
    /**
	 * Description:小说分类表等级
	 */
    public void setAbc003(BigDecimal abc003) {
        this.abc003 = abc003;
    }
    /**
	 * Description:小说分类表删除标记
	 */
    public String getAba005() {
        return aba005;
    }
    /**
	 * Description:小说分类表删除标记
	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
    /**
	 * Description:小说分类表分类名称
	 */
    public String getAbc004() {
        return abc004;
    }
    /**
	 * Description:小说分类表分类名称
	 */
    public void setAbc004(String abc004) {
        this.abc004 = abc004 == null ? null : abc004.trim();
    }
    /**
	 * Description:小说分类表小说描述
	 */
    public String getAbc005() {
        return abc005;
    }
    /**
	 * Description:小说分类表小说描述
	 */
    public void setAbc005(String abc005) {
        this.abc005 = abc005 == null ? null : abc005.trim();
    }
    /**
	 * Description:小说分类表创建人编码
	 */
    public String getAbc006() {
        return abc006;
    }
    /**
	 * Description:小说分类表创建人编码
	 */
    public void setAbc006(String abc006) {
        this.abc006 = abc006 == null ? null : abc006.trim();
    }
    /**
	 * Description:小说分类表创建时间
	 */
    public Date getAbc007() {
        return abc007;
    }
    /**
	 * Description:小说分类表创建时间
	 */
    public void setAbc007(Date abc007) {
        this.abc007 = abc007;
    }
    /**
	 * Description:小说分类表更新人编码
	 */
    public String getAbc008() {
        return abc008;
    }
    /**
	 * Description:小说分类表更新人编码
	 */
    public void setAbc008(String abc008) {
        this.abc008 = abc008 == null ? null : abc008.trim();
    }
    /**
	 * Description:小说分类表更新时间
	 */
    public Date getAbc009() {
        return abc009;
    }
    /**
	 * Description:小说分类表更新时间
	 */
    public void setAbc009(Date abc009) {
        this.abc009 = abc009;
    }
}