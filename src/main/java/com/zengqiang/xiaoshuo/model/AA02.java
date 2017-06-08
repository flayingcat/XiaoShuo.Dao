package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
 * <p>Title: AA02</p>
 * <p>Description: 作者表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月27日
 */
public class AA02 {
    private String aaa001;

    private String aaa002;

    private Date aaa003;

    private String aaa004;

    private Short aaa005;

    private String aaa006;

    private Short aaa007;

    private BigDecimal aaa009;

    private String abb001;

    private String aaa010;

    private String aab010;

    private String aab011;

    private String aab012;

    private String aaa011;

    private BigDecimal aaa008;

    private String aaa012;

    private String aaa013;

    private String aaa014;

    private String aaa015;

    private String aaa016;

    private BigDecimal aaa017;

    private Date aaa018;
    /**
	 * Description:获取用户所在的群组
	 */
    private List<String> acg001List;
    /**
	 * Description:获取作家社区ID
	 */
    private List<String> acf001List;
    /**
	 * Description:获取用户的朋友
	 */
    private List<String> aaa001List;
    
    /**
	 * Description:获取用户用户所拥有的角色
	 */
    private List<String> abh001List;
    
    
    /**
	 * Description:获取用户用户所拥有的角色
	 */
    public List<String> getAbh001List() {
		return abh001List;
	}
    /**
	 * Description:设置用户所拥有的角色
	 */
	public void setAbh001List(List<String> abh001List) {
		this.abh001List = abh001List;
	}
    
    /**
	 * Description:获取用户的朋友
	 */
    public List<String> getAaa001List() {
		return aaa001List;
	}
    /**
	 * Description:设置用户的朋友
	 */
	public void setAaa001List(List<String> aaa001List) {
		this.aaa001List = aaa001List;
	}
	/**
	 * Description:获取作家社区ID
	 */
    public List<String> getAcf001List() {
		return acf001List;
	}
    /**
	 * Description:设置作家社区ID
	 */
	public void setAcf001List(List<String> acf001List) {
		this.acf001List = acf001List;
	}
	/**
	 * Description:获取用户所在的群组
	 */
    public List<String> getAcg001List() {
		return acg001List;
	}
    /**
	 * Description:设置用户所有群组
	 */
	public void setAcg001List(List<String> acg001List) {
		this.acg001List = acg001List;
	}
    /**
	 * Description:作者ID
	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
	 * Description:作者ID
	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
	 * Description:作者密码
	 */
    public String getAaa002() {
        return aaa002;
    }
    /**
	 * Description:作者密码
	 */
    public void setAaa002(String aaa002) {
        this.aaa002 = aaa002 == null ? null : aaa002.trim();
    }
    /**
	 * Description:作者上次登录时间
	 */
    public Date getAaa003() {
        return aaa003;
    }
    /**
	 * Description:作者上次登录时间
	 */
    public void setAaa003(Date aaa003) {
        this.aaa003 = aaa003;
    }
    /**
	 * Description:作者昵称
	 */
    public String getAaa004() {
        return aaa004;
    }
    /**
	 * Description:作者昵称
	 */
    public void setAaa004(String aaa004) {
        this.aaa004 = aaa004 == null ? null : aaa004.trim();
    }
    /**
	 * Description:作者等级
	 */
    public Short getAaa005() {
        return aaa005;
    }
    /**
	 * Description:作者等级
	 */
    public void setAaa005(Short aaa005) {
        this.aaa005 = aaa005;
    }
    /**
	 * Description:作者消息地址
	 */
    public String getAaa006() {
        return aaa006;
    }
    /**
	 * Description:作者消息地址
	 */
    public void setAaa006(String aaa006) {
        this.aaa006 = aaa006 == null ? null : aaa006.trim();
    }
    /**
	 * Description:作者消息条数
	 */
    public Short getAaa007() {
        return aaa007;
    }
    /**
	 * Description:作者消息条数
	 */
    public void setAaa007(Short aaa007) {
        this.aaa007 = aaa007;
    }
    /**
	 * Description:作者读者币
	 */
    public BigDecimal getAaa009() {
        return aaa009;
    }
    /**
	 * Description:作者读者币
	 */
    public void setAaa009(BigDecimal aaa009) {
        this.aaa009 = aaa009;
    }
    /**
	 * Description:作者上次登录地区ID
	 */
    public String getAbb001() {
        return abb001;
    }
    /**
	 * Description:作者上次登录地区ID
	 */
    public void setAbb001(String abb001) {
        this.abb001 = abb001 == null ? null : abb001.trim();
    }
    /**
	 * Description:作者性别ID
	 */
    public String getAaa010() {
        return aaa010;
    }
    /**
	 * Description:作者性别ID
	 */
    public void setAaa010(String aaa010) {
        this.aaa010 = aaa010 == null ? null : aaa010.trim();
    }
    /**
	 * Description:作者所在城市ID
	 */
    public String getAab010() {
        return aab010;
    }
    /**
	 * Description:作者所在城市ID
	 */
    public void setAab010(String aab010) {
        this.aab010 = aab010 == null ? null : aab010.trim();
    }
    /**
	 * Description:作者真实姓名
	 */
    public String getAab011() {
        return aab011;
    }
    /**
	 * Description:作者真实姓名
	 */
    public void setAab011(String aab011) {
        this.aab011 = aab011 == null ? null : aab011.trim();
    }
    /**
	 * Description:作者作家简介
	 */
    public String getAab012() {
        return aab012;
    }
    /**
	 * Description:作者作家简介
	 */
    public void setAab012(String aab012) {
        this.aab012 = aab012 == null ? null : aab012.trim();
    }
    /**
	 * Description:作者状态(0:离线，1：上线)
	 */
    public String getAaa011() {
        return aaa011;
    }
    /**
	 * Description:作者状态(0:离线，1：上线)
	 */
    public void setAaa011(String aaa011) {
        this.aaa011 = aaa011 == null ? null : aaa011.trim();
    }
    /**
	 * Description:作者会员等级
	 */
    public BigDecimal getAaa008() {
        return aaa008;
    }
    /**
	 * Description:作者会员等级
	 */
    public void setAaa008(BigDecimal aaa008) {
        this.aaa008 = aaa008;
    }
    /**
	 * Description:作者签约状态
	 */
    public String getAaa012() {
        return aaa012;
    }
    /**
	 * Description:作者签约状态
	 */
    public void setAaa012(String aaa012) {
        this.aaa012 = aaa012 == null ? null : aaa012.trim();
    }
    /**
	 * Description:作者头像ID
	 */
    public String getAaa013() {
        return aaa013;
    }
    /**
	 * Description:作者头像ID
	 */
    public void setAaa013(String aaa013) {
        this.aaa013 = aaa013 == null ? null : aaa013.trim();
    }
    /**
	 * Description:作者开户银行ID
	 */
    public String getAaa014() {
        return aaa014;
    }
    /**
	 * Description:作者开户银行ID
	 */
    public void setAaa014(String aaa014) {
        this.aaa014 = aaa014 == null ? null : aaa014.trim();
    }
    /**
	 * Description:作者开户银行类型ID
	 */
    public String getAaa015() {
        return aaa015;
    }
    /**
	 * Description:作者开户银行类型ID
	 */
    public void setAaa015(String aaa015) {
        this.aaa015 = aaa015 == null ? null : aaa015.trim();
    }
    /**
	 * Description:作者开户银行全称
	 */
    public String getAaa016() {
        return aaa016;
    }
    /**
	 * Description:作者开户银行全称
	 */
    public void setAaa016(String aaa016) {
        this.aaa016 = aaa016 == null ? null : aaa016.trim();
    }
    /**
	 * Description:作者推荐票数
	 */
    public BigDecimal getAaa017() {
        return aaa017;
    }
    /**
	 * Description:作者推荐票数
	 */
    public void setAaa017(BigDecimal aaa017) {
        this.aaa017 = aaa017;
    }
    /**
	 * Description:作者创建时间
	 */
    public Date getAaa018() {
        return aaa018;
    }
    /**
	 * Description:作者创建时间
	 */
    public void setAaa018(Date aaa018) {
        this.aaa018 = aaa018;
    }
}