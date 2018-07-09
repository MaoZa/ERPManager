package com.hxzy.pojo;

public class Tb_user {
    private Integer id;

    private String name;

    private String pwd;

    private Boolean setinstorage;

    private Boolean setoutstorage;

    private Boolean setdeal;

    private Boolean setquery;

    private Boolean setbasic;

    private Boolean setsys;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Boolean getSetinstorage() {
        return setinstorage;
    }

    public void setSetinstorage(Boolean setinstorage) {
        this.setinstorage = setinstorage;
    }

    public Boolean getSetoutstorage() {
        return setoutstorage;
    }

    public void setSetoutstorage(Boolean setoutstorage) {
        this.setoutstorage = setoutstorage;
    }

    public Boolean getSetdeal() {
        return setdeal;
    }

    public void setSetdeal(Boolean setdeal) {
        this.setdeal = setdeal;
    }

    public Boolean getSetquery() {
        return setquery;
    }

    public void setSetquery(Boolean setquery) {
        this.setquery = setquery;
    }

    public Boolean getSetbasic() {
        return setbasic;
    }

    public void setSetbasic(Boolean setbasic) {
        this.setbasic = setbasic;
    }

    public Boolean getSetsys() {
        return setsys;
    }

    public void setSetsys(Boolean setsys) {
        this.setsys = setsys;
    }
}