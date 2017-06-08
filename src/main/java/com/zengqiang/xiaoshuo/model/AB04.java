package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AB04</p>
 * <p>Description: 操作失败历史表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AB04 {
    private String abd001;

    private String aaa001;

    private String abd002;

    private String aci003;

    private String aci004;

    private Date abd005;

    private String abd006;

    private String abd007;

    private String abd008;

    private String abd009;
    /**
	 * Description:操作失败表操作失败主键ID
	 */
    public String getAbd001() {
        return abd001;
    }
    /**
	 * Description:操作失败表操作失败主键ID
	 */
    public void setAbd001(String abd001) {
        this.abd001 = abd001 == null ? null : abd001.trim();
    }
    /**
	 * Description:操作失败操作用户ID
	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
	 * Description:操作失败操作用户ID
	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
	 * Description:操作失败操作用户IP地址
	 */
    public String getAbd002() {
        return abd002;
    }
    /**
	 * Description:操作失败操作用户IP地址
	 */
    public void setAbd002(String abd002) {
        this.abd002 = abd002 == null ? null : abd002.trim();
    }
    /**
	 * Description:操作失败操作用户所属范围(操作权限)
	 */
    public String getAci003() {
        return aci003;
    }
    /**
	 * Description:操作失败操作用户所属范围(操作权限)
	 */
    public void setAci003(String aci003) {
        this.aci003 = aci003 == null ? null : aci003.trim();
    }
    /**
	 * Description:操作失败操作类型
	 */
    public String getAci004() {
        return aci004;
    }
    /**
	 * Description:操作失败操作类型
	 */
    public void setAci004(String aci004) {
        this.aci004 = aci004 == null ? null : aci004.trim();
    }
    /**
	 * Description:操作失败操作时间
	 */
    public Date getAbd005() {
        return abd005;
    }
    /**
	 * Description:操作失败操作时间
	 */
    public void setAbd005(Date abd005) {
        this.abd005 = abd005;
    }
    /**
	 * Description:操作失败操作表
	 */
    public String getAbd006() {
        return abd006;
    }
    /**
	 * Description:操作失败操作表
	 */
    public void setAbd006(String abd006) {
        this.abd006 = abd006 == null ? null : abd006.trim();
    }
    /**
	 * Description:操作失败失败位置(记录oracle方向失败，还是用户验证失败)
	 */
    public String getAbd007() {
        return abd007;
    }
    /**
	 * Description:操作失败失败位置(记录oracle方向失败，还是用户验证失败)
	 */
    public void setAbd007(String abd007) {
        this.abd007 = abd007 == null ? null : abd007.trim();
    }
    /**
	 * Description:操作失败操作行ID
	 */
    public String getAbd008() {
        return abd008;
    }
    /**
	 * Description:操作失败操作行ID
	 */
    public void setAbd008(String abd008) {
        this.abd008 = abd008 == null ? null : abd008.trim();
    }
    /**
	 * Description:操作失败失败来源系统
	 */
    public String getAbd009() {
        return abd009;
    }
    /**
	 * Description:操作失败失败来源系统
	 */
    public void setAbd009(String abd009) {
        this.abd009 = abd009 == null ? null : abd009.trim();
    }
}