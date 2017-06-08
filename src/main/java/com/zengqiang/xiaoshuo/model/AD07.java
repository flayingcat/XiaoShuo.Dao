package com.zengqiang.xiaoshuo.model;

import java.util.Date;
/**
 * 
 * <p>Title: AD07</p>
 * <p>Description: 角色菜单Map</p>
 * <p>Company: </p> 
 * @author Administrator
 * @date 2017年3月28日
 */
public class AD07 {
    private String adg001;

    private String abh001;

    private String abg001;

    private String adg002;

    private Date adg003;

    private String adg004;

    private Date adg005;

    private String aba005;
    /**
   	 * Description:角色权限Map表，ID
   	 */
    public String getAdg001() {
        return adg001;
    }
    /**
   	 * Description:角色权限Map表，ID
   	 */
    public void setAdg001(String adg001) {
        this.adg001 = adg001 == null ? null : adg001.trim();
    }
    /**
   	 * Description:角色权限Map表，角色ID
   	 */
    public String getAbh001() {
        return abh001;
    }
    /**
   	 * Description:角色权限Map表，角色ID
   	 */
    public void setAbh001(String abh001) {
        this.abh001 = abh001 == null ? null : abh001.trim();
    }
    /**
   	 * Description:角色权限Map表，菜单ID
   	 */
    public String getAbg001() {
        return abg001;
    }
    /**
   	 * Description:角色权限Map表，菜单ID
   	 */
    public void setAbg001(String abg001) {
        this.abg001 = abg001 == null ? null : abg001.trim();
    }
    /**
   	 * Description:角色权限Map表，创建人ID
   	 */
    public String getAdg002() {
        return adg002;
    }
    /**
   	 * Description:角色权限Map表，创建人ID
   	 */
    public void setAdg002(String adg002) {
        this.adg002 = adg002 == null ? null : adg002.trim();
    }
    /**
   	 * Description:角色权限Map表，创建时间
   	 */
    public Date getAdg003() {
        return adg003;
    }
    /**
   	 * Description:角色权限Map表，创建时间
   	 */
    public void setAdg003(Date adg003) {
        this.adg003 = adg003;
    }
    /**
   	 * Description:角色权限Map表，更新人ID
   	 */
    public String getAdg004() {
        return adg004;
    }
    /**
   	 * Description:角色权限Map表，更新人ID
   	 */
    public void setAdg004(String adg004) {
        this.adg004 = adg004 == null ? null : adg004.trim();
    }
    /**
   	 * Description:角色权限Map表，更新时间
   	 */
    public Date getAdg005() {
        return adg005;
    }
    /**
   	 * Description:角色权限Map表，更新时间
   	 */
    public void setAdg005(Date adg005) {
        this.adg005 = adg005;
    }
    /**
   	 * Description:角色权限Map表，删除标记
   	 */
    public String getAba005() {
        return aba005;
    }
    /**
   	 * Description:角色权限Map表，删除标记
   	 */
    public void setAba005(String aba005) {
        this.aba005 = aba005 == null ? null : aba005.trim();
    }
	@Override
	public String toString() {
		return "AD07 [adg001=" + adg001 + ", abh001=" + abh001 + ", abg001="
				+ abg001 + ", adg002=" + adg002 + ", adg003=" + adg003
				+ ", adg004=" + adg004 + ", adg005=" + adg005 + ", aba005="
				+ aba005 + "]";
	}
    
    
    
    
}