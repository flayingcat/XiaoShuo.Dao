package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AD01</p>
 * <p>Description: 群组用户Map</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AD01 {
    private String ada001;

    private String acg001;

    private String aaa001;

    private Date ada002;
    /**
   	 * Description:群组用户Map表，ID
   	 */
    public String getAda001() {
        return ada001;
    }
    /**
   	 * Description:群组用户Map表，ID
   	 */
    public void setAda001(String ada001) {
        this.ada001 = ada001 == null ? null : ada001.trim();
    }
    /**
   	 * Description:群组用户Map表，群组ID
   	 */
    public String getAcg001() {
        return acg001;
    }
    /**
   	 * Description:群组用户Map表，群组ID
   	 */
    public void setAcg001(String acg001) {
        this.acg001 = acg001 == null ? null : acg001.trim();
    }
    /**
   	 * Description:群组用户Map表，用户ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:群组用户Map表，用户ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:群组用户Map表，加入时间
   	 */
    public Date getAda002() {
        return ada002;
    }
    /**
   	 * Description:群组用户Map表，加入时间
   	 */
    public void setAda002(Date ada002) {
        this.ada002 = ada002;
    }
}