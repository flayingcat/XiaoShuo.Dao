package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AE05</p>
 * <p>Description: 微博表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AE05 {
    private String aef001;

    private String aaa001;

    private Date aef002;

    private Date aef003;

    private String aba005;

    private String aef004;

    private String aef005;
    /**
   	 * Description:微博表，微博ID
   	 */
    public String getAef001() {
        return aef001;
    }
    /**
   	 * Description:微博表，微博ID
   	 */
    public void setAef001(String aef001) {
        this.aef001 = aef001 == null ? null : aef001.trim();
    }
    /**
   	 * Description:微博表，发表人ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:微博表，发表人ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:微博表，创建日期
   	 */
    public Date getAef002() {
        return aef002;
    }
    /**
   	 * Description:微博表，创建日期
   	 */
    public void setAef002(Date aef002) {
        this.aef002 = aef002;
    }
    /**
   	 * Description:微博表，更新日期
   	 */
    public Date getAef003() {
        return aef003;
    }
    /**
   	 * Description:微博表，更新日期
   	 */
    public void setAef003(Date aef003) {
        this.aef003 = aef003;
    }
    /**
   	 * Description:微博表，删除标志
   	 */
    public String getAba005() {
        return aba005;
    }
    /**
   	 * Description:微博表，删除标志
   	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
    /**
   	 * Description:微博表，微博范围ID
   	 */
    public String getAef004() {
        return aef004;
    }
    /**
   	 * Description:微博表，微博范围ID
   	 */
    public void setAef004(String aef004) {
        this.aef004 = aef004 == null ? null : aef004.trim();
    }
    /**
   	 * Description:微博表，微博内容
   	 */
    public String getAef005() {
        return aef005;
    }
    /**
   	 * Description:微博表，微博内容
   	 */
    public void setAef005(String aef005) {
        this.aef005 = aef005 == null ? null : aef005.trim();
    }
}