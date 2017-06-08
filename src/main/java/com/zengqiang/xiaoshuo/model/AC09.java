package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AC09</p>
 * <p>Description: 操作历史表</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AC09 {
    private String aci001;

    private String aaa001;

    private String aci002;

    private String aci003;

    private String aci004;

    private Date aci005;

    private String aci006;

    private String aci007;

    private String aci008;
    /**
   	 * Description:操作历史表，操作历史主键ID
   	 */
    public String getAci001() {
        return aci001;
    }
    /**
   	 * Description:操作历史表，操作历史主键ID
   	 */
    public void setAci001(String aci001) {
        this.aci001 = aci001 == null ? null : aci001.trim();
    }
    /**
   	 * Description:操作历史表，操作用户ID
   	 */
    public String getAaa001() {
        return aaa001;
    }
    /**
   	 * Description:操作历史表，操作用户ID
   	 */
    public void setAaa001(String aaa001) {
        this.aaa001 = aaa001 == null ? null : aaa001.trim();
    }
    /**
   	 * Description:操作历史表，操作用户IP地址
   	 */
    public String getAci002() {
        return aci002;
    }
    /**
   	 * Description:操作历史表，操作用户IP地址
   	 */
    public void setAci002(String aci002) {
        this.aci002 = aci002 == null ? null : aci002.trim();
    }
    /**
   	 * Description:操作历史表，操作用户所属范围(操作权限)
   	 */
    public String getAci003() {
        return aci003;
    }
    /**
   	 * Description:操作历史表，操作用户所属范围(操作权限)
   	 */
    public void setAci003(String aci003) {
        this.aci003 = aci003 == null ? null : aci003.trim();
    }
    /**
   	 * Description:操作历史表，操作类型(0:更新，1:删除，6:新增)
   	 */
    public String getAci004() {
        return aci004;
    }
    /**
   	 * Description:操作历史表，操作类型(0:更新，1:删除，6:新增)
   	 */
    public void setAci004(String aci004) {
        this.aci004 = aci004 == null ? null : aci004.trim();
    }
    /**
   	 * Description:操作历史表，操作时间
   	 */
    public Date getAci005() {
        return aci005;
    }
    /**
   	 * Description:操作历史表，操作时间
   	 */
    public void setAci005(Date aci005) {
        this.aci005 = aci005;
    }
    /**
   	 * Description:操作历史表，操作表
   	 */
    public String getAci006() {
        return aci006;
    }
    /**
   	 * Description:操作历史表，操作表
   	 */
    public void setAci006(String aci006) {
        this.aci006 = aci006 == null ? null : aci006.trim();
    }
    /**
   	 * Description:操作历史表，是否使用恢复(更新数据不能恢复)
   	 */
    public String getAci007() {
        return aci007;
    }
    /**
   	 * Description:操作历史表，是否使用恢复(更新数据不能恢复)
   	 */
    public void setAci007(String aci007) {
        this.aci007 = aci007 == null ? null : aci007.trim();
    }
    /**
   	 * Description:操作历史表，操作行ID
   	 */
    public String getAci008() {
        return aci008;
    }
    /**
   	 * Description:操作历史表，操作行ID
   	 */
    public void setAci008(String aci008) {
        this.aci008 = aci008 == null ? null : aci008.trim();
    }
}