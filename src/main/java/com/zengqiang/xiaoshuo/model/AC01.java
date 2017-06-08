package com.zengqiang.xiaoshuo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AC01</p>
 * <p>Description: 小说表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC01 {
    private String aca001;

    private String aca002;

    private String aca003;

    private BigDecimal aca004;

    private Date aca005;

    private String aca006;

    private String aba005;

    private BigDecimal aca008;

    private BigDecimal aca009;

    private BigDecimal aca010;

    private String aca011;

    private String aca012;

    private String aca013;

    private String aca014;

    private String aca015;

    private String aca021;

    private String aca016;

    private String aaa001;

    private String aca017;

    private String aca018;
    
    private String aca019;
    
    private String aca020;
    
    private String aca022;
    
    private String aca023;
    
    private String aca024;
    
    
    private Date aca025;
    
    
    /**
   	 * Description:小说表，最近更新日期
   	 */
    public Date getAca025() {
		return aca025;
	}
    /**
   	 * Description:小说表，最近更新日期
   	 */
	public void setAca025(Date aca025) {
		this.aca025 = aca025;
	}
	private List<String> ade002List;
    
    private List<AC10> ac10List;
    
    
    /**
   	 * Description:小说表，小说类型性别所属
   	 */
    public String getAca022() {
		return aca022;
	}
    /**
   	 * Description:小说表，小说类型性别所属
   	 */
	public void setAca022(String aca022) {
		this.aca022 = aca022;
	}
	/**
   	 * Description:小说表，最近更新章节名称
   	 */
	public String getAca023() {
		return aca023;
	}
	/**
   	 * Description:小说表，最近更新章节名称
   	 */
	public void setAca023(String aca023) {
		this.aca023 = aca023;
	}
	/**
   	 * Description:小说表，最近更新章节ID
   	 */
	public String getAca024() {
		return aca024;
	}
	/**
   	 * Description:小说表，最近更新章节ID
   	 */
	public void setAca024(String aca024) {
		this.aca024 = aca024;
	}
	/**
   	 * Description:小说表，小说章节
   	 */
    public List<AC10> getAc10List() {
		return ac10List;
	}
    /**
   	 * Description:小说表，小说章节
   	 */
	public void setAc10List(List<AC10> ac10List) {
		this.ac10List = ac10List;
	}
	/**
   	 * Description:小说表，小说收费状态名称
   	 */
	public String getAca020() {
		return aca020;
	}
	/**
   	 * Description:小说表，小说收费状态名称
   	 */
	public void setAca020(String aca020) {
		this.aca020 = aca020;
	}
	/**
   	 * Description:小说表，小说类型名称
   	 */
    public String getAca019() {
		return aca019;
	}
    /**
   	 * Description:小说表，小说类型名称
   	 */
	public void setAca019(String aca019) {
		this.aca019 = aca019;
	}
	/**
   	 * Description:小说表，作家名称
   	 */
    public String getAca018() {
		return aca018;
	}
    /**
   	 * Description:小说表，作家名称
   	 */
	public void setAca018(String aca018) {
		this.aca018 = aca018;
	}
	/**
   	 * Description:小说表，小说标签ID
   	 */
    public List<String> getAde002List() {
		return ade002List;
	}
    /**
   	 * Description:小说表，小说标签ID
   	 */
	public void setAde002List(List<String> ade002List) {
		this.ade002List = ade002List;
	}
	/**
   	 * Description:小说表，小说ID
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:小说表，小说ID
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:小说表，小说名称
   	 */
    public String getAca002() {
        return aca002;
    }
    /**
   	 * Description:小说表，小说名称
   	 */
    public void setAca002(String aca002) {
        this.aca002 = aca002 == null ? null : aca002.trim();
    }
    /**
   	 * Description:小说表，小说类别ID(里面是混合的，里面包括了热血他们)
   	 */
    public String getAca003() {
        return aca003;
    }
    /**
   	 * Description:小说表，小说类别ID(里面是混合的，里面包括了热血他们)
   	 */
    public void setAca003(String aca003) {
        this.aca003 = aca003 == null ? null : aca003.trim();
    }
    /**
   	 * Description:小说表，小说大小
   	 */
    public BigDecimal getAca004() {
        return aca004;
    }
    /**
   	 * Description:小说表，小说大小
   	 */
    public void setAca004(BigDecimal aca004) {
        this.aca004 = aca004 ;
    }
    /**
   	 * Description:小说表，最近更新时间
   	 */
    public Date getAca005() {
        return aca005;
    }
    /**
   	 * Description:小说表，最近更新时间
   	 */
    public void setAca005(Date aca005) {
        this.aca005 = aca005;
    }
    /**
   	 * Description:小说表，作者ID
   	 */
    public String getAca006() {
        return aca006;
    }
    /**
   	 * Description:小说表，作者ID
   	 */
    public void setAca006(String aca006) {
        this.aca006 = aca006 == null ? null : aca006.trim();
    }
    /**
   	 * Description:小说表，删除标记
   	 */
    public String getAba005() {
        return aba005;
    }
    /**
   	 * Description:小说表，删除标记
   	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
    /**
   	 * Description:小说表，小说评分
   	 */
    public BigDecimal getAca008() {
        return aca008;
    }
    /**
   	 * Description:小说表，小说评分
   	 */
    public void setAca008(BigDecimal aca008) {
        this.aca008 = aca008;
    }
    /**
   	 * Description:小说表，订阅量
   	 */
    public BigDecimal getAca009() {
        return aca009;
    }
    /**
   	 * Description:小说表，订阅量
   	 */
    public void setAca009(BigDecimal aca009) {
        this.aca009 = aca009;
    }
    /**
   	 * Description:小说表，搜索量
   	 */
    public BigDecimal getAca010() {
        return aca010;
    }
    /**
   	 * Description:小说表，搜索量
   	 */
    public void setAca010(BigDecimal aca010) {
        this.aca010 = aca010;
    }
    /**
   	 * Description:小说表，小说本地地址
   	 */
    public String getAca011() {
        return aca011;
    }
    /**
   	 * Description:小说表，小说本地地址
   	 */
    public void setAca011(String aca011) {
        this.aca011 = aca011 == null ? null : aca011.trim();
    }
    /**
   	 * Description:小说表，小说简介
   	 */
    public String getAca012() {
        return aca012;
    }
    /**
   	 * Description:小说表，小说简介
   	 */
    public void setAca012(String aca012) {
        this.aca012 = aca012 == null ? null : aca012.trim();
    }
    /**
   	 * Description:小说表，小说状态ID
   	 */
    public String getAca013() {
        return aca013;
    }
    /**
   	 * Description:小说表，小说状态ID
   	 */
    public void setAca013(String aca013) {
        this.aca013 = aca013 == null ? null : aca013.trim();
    }
    /**
   	 * Description:小说表，收费状态ID
   	 */
    public String getAca014() {
        return aca014;
    }
    /**
   	 * Description:小说表，收费状态ID
   	 */
    public void setAca014(String aca014) {
        this.aca014 = aca014 == null ? null : aca014.trim();
    }
    /**
   	 * Description:小说表，小说来源地址(ID)
   	 */
    public String getAca015() {
        return aca015;
    }
    /**
   	 * Description:小说表，小说来源地址(ID)
   	 */
    public void setAca015(String aca015) {
        this.aca015 = aca015 == null ? null : aca015.trim();
    }
    /**
   	 * Description:小说表，小说收费标准ID
   	 */
    public String getAca021() {
        return aca021;
    }
    /**
   	 * Description:小说表，小说收费标准ID
   	 */
    public void setAca021(String aca021) {
        this.aca021 = aca021 == null ? null : aca021.trim();
    }
    /**
   	 * Description:小说表，小说授权类型
   	 */
    public String getAca016() {
        return aca016;
    }
    /**
   	 * Description:小说表，小说授权类型
   	 */
    public void setAca016(String aca016) {
        this.aca016 = aca016 == null ? null : aca016.trim();
    }
    /**
   	 * Description:小说表，上传者ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:小说表，上传者ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:小说表，头像
   	 */
    public String getAca017() {
        return aca017;
    }
    /**
   	 * Description:小说表，头像
   	 */
    public void setAca017(String aca017) {
        this.aca017 = aca017 == null ? null : aca017.trim();
    }
	@Override
	public String toString() {
		return "AC01 [aca001=" + aca001 + ", aca002=" + aca002 + ", aca003="
				+ aca003 + ", aca004=" + aca004 + ", aca005=" + aca005
				+ ", aca006=" + aca006 + ", aba005=" + aba005 + ", aca008="
				+ aca008 + ", aca009=" + aca009 + ", aca010=" + aca010
				+ ", aca011=" + aca011 + ", aca012=" + aca012 + ", aca013="
				+ aca013 + ", aca014=" + aca014 + ", aca015=" + aca015
				+ ", aca021=" + aca021 + ", aca016=" + aca016 + ", aaa001="
				+ aaa001 + ", aca017=" + aca017 + ", aca018=" + aca018
				+ ", aca019=" + aca019 + ", ade002List=" + ade002List + "]";
	}
	
    
    
}