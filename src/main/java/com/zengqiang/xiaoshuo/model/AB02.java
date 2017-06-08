package com.zengqiang.xiaoshuo.model;

import java.util.List;

/**
 * 
 * <p>Title: AB02</p>
 * <p>Description: 地区表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月27日
 */
public class AB02 {
    private String id;

    private String pid;

    private Short abb003;

    private String abb004;

    private List<AB02> children;
    /**
	 * Description:地区表地区ID
	 */
    public String getId() {
        return id;
    }
    /**
	 * Description:地区表地区ID
	 */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    /**
	 * Description:地区表上级地区ID
	 */
    public String getPid() {
        return pid;
    }
    /**
	 * Description:地区表上级地区ID
	 */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
    /**
	 * Description:地区表等级
	 */
    public Short getAbb003() {
        return abb003;
    }
    /**
	 * Description:地区表等级
	 */
    public void setAbb003(Short abb003) {
        this.abb003 = abb003;
    }
    /**
	 * Description:地区表地区名字
	 */
    public String getAbb004() {
        return abb004;
    }
    /**
	 * Description:地区表地区名字
	 */
    public void setAbb004(String abb004) {
        this.abb004 = abb004 == null ? null : abb004.trim();
    }
    /**
	 * Description:地区表孩子
	 */
	public List<AB02> getChildren() {
		return children;
	}
	/**
	 * Description:地区表孩子
	 */
	public void setChildren(List<AB02> children) {
		this.children = children;
	}
    
    
}