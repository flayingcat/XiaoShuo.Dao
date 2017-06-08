package com.zengqiang.xiaoshuo.model;


import java.util.Date;
/**
 * 
 * <p>Title: AC11</p>
 * <p>Description: 章节表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC11 {
    private String ack001;

    private String acj001;

    private String ack002;

    private Date ack003;

    private Long ack004;

    private Date ack005;

    private String ack006;

    private String ack007;
    
    private String ack008;
    
    
    /**
   	 * Description:章节表表，小说ID
   	 */
    public String getAck008() {
		return ack008;
	}
    /**
   	 * Description:章节表表，小说ＩＤ
   	 */
	public void setAck008(String ack008) {
		this.ack008 = ack008;
	}
	/**
   	 * Description:章节表表，章节ＩＤ
   	 */
    public String getAck001() {
        return ack001;
    }
    /**
   	 * Description:章节表表，章节ＩＤ
   	 */
    public void setAck001(String ack001) {
        this.ack001 = ack001 == null ? null : ack001.trim();
    }
    /**
   	 * Description:章节表表，分卷ＩＤ
   	 */
    public String getAcj001() {
        return acj001;
    }
    /**
   	 * Description:章节表表，分卷ＩＤ
   	 */
    public void setAcj001(String acj001) {
        this.acj001 = acj001 == null ? null : acj001.trim();
    }
    /**
   	 * Description:章节表表，章节名字
   	 */
    public String getAck002() {
        return ack002;
    }
    /**
   	 * Description:章节表表，章节名字
   	 */
    public void setAck002(String ack002) {
        this.ack002 = ack002 == null ? null : ack002.trim();
    }
    /**
   	 * Description:章节表表，创建日期
   	 */
    public Date getAck003() {
        return ack003;
    }
    /**
   	 * Description:章节表表，创建日期
   	 */
    public void setAck003(Date ack003) {
        this.ack003 = ack003;
    }
    /**
   	 * Description:章节表表，章节字数
   	 */
    public Long getAck004() {
        return ack004;
    }
    /**
   	 * Description:章节表表，章节字数
   	 */
    public void setAck004(Long ack004) {
        this.ack004 = ack004;
    }
    /**
   	 * Description:章节表表，修改日期
   	 */
    public Date getAck005() {
        return ack005;
    }
    /**
   	 * Description:章节表表，修改日期
   	 */
    public void setAck005(Date ack005) {
        this.ack005 = ack005;
    }
    /**
   	 * Description:章节表表，小说章节地址
   	 */
    public String getAck006() {
        return ack006;
    }
    /**
   	 * Description:章节表表，小说章节地址
   	 */
    public void setAck006(String ack006) {
        this.ack006 = ack006 == null ? null : ack006.trim();
    }
    /**
   	 * Description:章节表表，收费标志
   	 */
    public String getAck007() {
        return ack007;
    }
    /**
   	 * Description:章节表表，收费标志
   	 */
    public void setAck007(String ack007) {
        this.ack007 = ack007 == null ? null : ack007.trim();
    }
	@Override
	public String toString() {
		return "AC11 [ack001=" + ack001 + ", acj001=" + acj001 + ", ack002="
				+ ack002 + ", ack003=" + ack003 + ", ack004=" + ack004
				+ ", ack005=" + ack005 + ", ack006=" + ack006 + ", ack007="
				+ ack007 + "]";
	}
    
    
}