package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * <p>Title: AA01</p>
 * <p>Description: 读者表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月27日
 */
public class AA01 {
	
	/**
	 * Description:读者ID
	 */
    private String aaa001;
    /**
	 * Description:读者密码
	 */
    private String aaa002;
    /**
	 * Description:读者上次登录时间
	 */
    private Date aaa003;
    /**
	 * Description:读者昵称
	 */
    private String aaa004;
    /**
	 * Description:读者等级
	 */
    private Short aaa005;
    /**
	 * Description:读者消息地址
	 */
    private String aaa006;
    /**
	 * Description:读者消息条数
	 */
    private Short aaa007;
    /**
	 * Description:读者会员等级
	 */
    private Short aaa008;
    /**
	 * Description:读者读书币
	 */
    private BigDecimal aaa009;
    /**
	 * Description:读者上次登录地区ID
	 */
    private String abb001;
    /**
	 * Description:读者性别ID
	 */
    private String aaa010;
    /**
	 * Description:读者状态
	 */
    private String aaa011;
    /**
	 * Description:读者真实姓名
	 */
    private String aab011;
    /**
	 * Description:读者推荐票数
	 */
    private Long aaa012;
    /**
	 * Description:读者创建时间
	 */
    private Date aaa013;
    
    private String aaa014;
    
    private String aaa015;
    
    /**
	 * Description:头像URL
	 */
    public String getAaa014() {
		return aaa014;
	}
    /**
	 * Description:头像URL
	 */
	public void setAaa014(String aaa014) {
		this.aaa014 = aaa014;
	}
	/**
	 * Description:个人描述
	 */
	public String getAaa015() {
		return aaa015;
	}
	/**
	 * Description:个人描述
	 */
	public void setAaa015(String aaa015) {
		this.aaa015 = aaa015;
	}
	/**
	 * Description:获取用户所在的群组
	 */
    private List<String> acg001List;
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
     * 
     * @Description: 获取用户ID
     * @param   
     * @return String  
     * @throws 
     * @author yokoboy
     * @date 2017年3月27日
     */
    public String getAaa001() {
        return aaa001;
    }
    /**
	 * Description:设置读者ID
	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
	 * Description:获取读者密码
	 */
    public String getAaa002() {
        return aaa002;
    }
    /**
	 * Description:设置读者密码
	 */
    public void setAaa002(String aaa002) {
        this.aaa002 = aaa002 == null ? null : aaa002.trim();
    }
    /**
	 * Description:获取读者上次登录时间
	 */
    public Date getAaa003() {
        return aaa003;
    }
    /**
	 * Description:设置读者上次登录时间
	 */
    public void setAaa003(Date aaa003) {
        this.aaa003 = aaa003;
    }
    /**
	 * Description:获取读者昵称
	 */
    public String getAaa004() {
        return aaa004;
    }
    /**
	 * Description:设置读者昵称
	 */
    public void setAaa004(String aaa004) {
        this.aaa004 = aaa004 == null ? null : aaa004.trim();
    }
    /**
	 * Description:获取读者等级
	 */
    public Short getAaa005() {
        return aaa005;
    }
    /**
	 * Description:设置读者等级
	 */
    public void setAaa005(Short aaa005) {
        this.aaa005 = aaa005;
    }
    /**
	 * Description:获取读者消息地址
	 */
    public String getAaa006() {
        return aaa006;
    }
    /**
	 * Description:设置读者消息地址
	 */
    public void setAaa006(String aaa006) {
        this.aaa006 = aaa006 == null ? null : aaa006.trim();
    }
    /**
	 * Description:获取读者消息条数
	 */
    public Short getAaa007() {
        return aaa007;
    }
    /**
	 * Description:设置读者消息条数
	 */
    public void setAaa007(Short aaa007) {
        this.aaa007 = aaa007;
    }
    /**
	 * Description:设置读者会员等级
	 */
    public Short getAaa008() {
        return aaa008;
    }
    /**
	 * Description:设置读者会员等级
	 */
    public void setAaa008(Short aaa008) {
        this.aaa008 = aaa008;
    }
    /**
	 * Description:获取读者读书币
	 */
    public BigDecimal getAaa009() {
        return aaa009;
    }
    /**
	 * Description:设置读者读书币
	 */
    public void setAaa009(BigDecimal aaa009) {
        this.aaa009 = aaa009;
    }
    /**
	 * Description:设置读者上次登录地区ID
	 */
    public String getAbb001() {
        return abb001;
    }
    /**
	 * Description:设置读者上次登录地区ID
	 */
    public void setAbb001(String abb001) {
        this.abb001 = abb001 == null ? null : abb001.trim();
    }
    /**
	 * Description:获取读者性别ID
	 */
    public String getAaa010() {
        return aaa010;
    }
    /**
	 * Description:设置读者性别ID
	 */
    public void setAaa010(String aaa010) {
        this.aaa010 = aaa010 == null ? null : aaa010.trim();
    }
    /**
	 * Description:获取读者状态(0:离线，1：上线)
	 */
    public String getAaa011() {
        return aaa011;
    }
    /**
	 * Description:读者状态(0:离线，1：上线)
	 */
    public void setAaa011(String aaa011) {
        this.aaa011 = aaa011 == null ? null : aaa011.trim();
    }
    /**
	 * Description:获取读者真实姓名
	 */
    public String getAab011() {
        return aab011;
    }
    /**
	 * Description:读者真实姓名
	 */
    public void setAab011(String aab011) {
        this.aab011 = aab011 == null ? null : aab011.trim();
    }
    /**
	 * Description:获取读者推荐票数
	 */
    public Long getAaa012() {
        return aaa012;
    }
    /**
	 * Description:设置读者推荐票数
	 */
    public void setAaa012(Long aaa012) {
        this.aaa012 = aaa012;
    }
    /**
	 * Description:读取读者创建时间
	 */
    public Date getAaa013() {
        return aaa013;
    }
    /**
	 * Description:设置读者创建时间
	 */
    public void setAaa013(Date aaa013) {
        this.aaa013 = aaa013;
    }
	@Override
	public String toString() {
		return "AA01 []";
	}
    
}