package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AE04</p>
 * <p>Description: 最近阅读表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AE04 {
    private String aed001;

    private String aaa001;

    private String aca001;

    private Date aed002;

    private Date aed003;
    /**
   	 * Description:最近阅读表，最近阅读表ＩＤ
   	 */
    public String getAed001() {
        return aed001;
    }
    /**
   	 * Description:最近阅读表，最近阅读表ＩＤ
   	 */
    public void setAed001(String aed001) {
        this.aed001 = aed001 == null ? null : aed001.trim();
    }
    /**
   	 * Description:最近阅读表，读者ＩＤ
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:最近阅读表，读者ＩＤ
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:最近阅读表，小说ＩＤ
   	 */
    public String getAca001() {
        return aca001;
    }
    /**
   	 * Description:最近阅读表，小说ＩＤ
   	 */
    public void setAca001(String aca001) {
        this.aca001 = aca001 == null ? null : aca001.trim();
    }
    /**
   	 * Description:最近阅读表，创建日期
   	 */
    public Date getAed002() {
        return aed002;
    }
    /**
   	 * Description:最近阅读表，创建日期
   	 */
    public void setAed002(Date aed002) {
        this.aed002 = aed002;
    }
    /**
   	 * Description:最近阅读表，更新日期
   	 */
    public Date getAed003() {
        return aed003;
    }
    /**
   	 * Description:最近阅读表，更新日期
   	 */
    public void setAed003(Date aed003) {
        this.aed003 = aed003;
    }
}