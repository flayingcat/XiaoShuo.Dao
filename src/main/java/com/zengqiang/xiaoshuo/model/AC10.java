package com.zengqiang.xiaoshuo.model;


import java.util.Date;
import java.util.List;
/**
 * 
 * <p>Title: AC10</p>
 * <p>Description: 分卷信息</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC10 {
    private String acj001;

    private String aca001;

    private String acj002;

    private Long acj003;

    private Date acj004;

    private Date acj005;

    private String acj006;
    
    private List<AC11> ac11List;
    
    /**
   	 * Description:分卷信息表，章节信息
   	 */
    public List<AC11> getAc11List() {
		return ac11List;
	}
    /**
   	 * Description:分卷信息表，章节信息
   	 */
	public void setAc11List(List<AC11> ac11List) {
		this.ac11List = ac11List;
	}
	/**
   	 * Description:分卷信息表，分卷ID
   	 */
    public String getAcj001() {
        return acj001;
    }
    /**
   	 * Description:分卷信息表，分卷ID
   	 */
    public void setAcj001(String acj001) {
        this.acj001 = acj001 == null ? null : acj001.trim();
    }
    /**
   	 * Description:分卷信息表，小说ID
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:分卷信息表，小说ID
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:分卷信息表，分卷名字
   	 */
    public String getAcj002() {
        return acj002;
    }
    /**
   	 * Description:分卷信息表，分卷名字
   	 */
    public void setAcj002(String acj002) {
        this.acj002 = acj002 == null ? null : acj002.trim();
    }
    /**
   	 * Description:分卷信息表，分卷编号
   	 */
    public Long getAcj003() {
        return acj003;
    }
    /**
   	 * Description:分卷信息表，分卷编号
   	 */
    public void setAcj003(Long acj003) {
        this.acj003 = acj003;
    }
    /**
   	 * Description:分卷信息表，创建日期
   	 */
    public Date getAcj004() {
        return acj004;
    }
    /**
   	 * Description:分卷信息表，创建日期
   	 */
    public void setAcj004(Date acj004) {
        this.acj004 = acj004;
    }
    /**
   	 * Description:分卷信息表，修改日期
   	 */
    public Date getAcj005() {
        return acj005;
    }
    /**
   	 * Description:分卷信息表，修改日期
   	 */
    public void setAcj005(Date acj005) {
        this.acj005 = acj005;
    }
    /**
   	 * Description:分卷信息表，收费标志
   	 */
    public String getAcj006() {
        return acj006;
    }
    /**
   	 * Description:分卷信息表，收费标志
   	 */
    public void setAcj006(String acj006) {
        this.acj006 = acj006 == null ? null : acj006.trim();
    }
	@Override
	public String toString() {
		return "AC10 [acj001=" + acj001 + ", aca001=" + aca001 + ", acj002="
				+ acj002 + ", acj003=" + acj003 + ", acj004=" + acj004
				+ ", acj005=" + acj005 + ", acj006=" + acj006 + "]";
	}
    
    
}