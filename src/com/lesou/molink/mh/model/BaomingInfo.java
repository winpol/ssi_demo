package com.lesou.molink.mh.model;

public class BaomingInfo {
    private Integer id;
    
    private String cname;
    
    private String cemail;
    
    private String cmobile;
    
    private int csex;
    
    private String ccompany;

    private String caddress;
    
    private String cremark;
    
    private int flag;
    
    
    public BaomingInfo(){
    }
    
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail == null ? null : cemail.trim();
	}

	public String getCmobile() {
		return cmobile;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile == null ? null :cmobile.trim();
	}

	public int getCsex() {
		return csex;
	}

	public void setCsex(int csex) {
		this.csex = csex;
	}

	public String getCcompany() {
		return ccompany;
	}

	public void setCcompany(String ccompany) {
		this.ccompany = ccompany == null ? null : ccompany.trim();
	}

	public String getCremark() {
		return cremark;
	}

	public void setCremark(String cremark) {
		this.cremark = cremark == null ? null : cremark.trim();
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}