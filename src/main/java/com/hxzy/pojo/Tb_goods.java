package com.hxzy.pojo;

public class Tb_goods {
    private Integer id;

    private String name;

    private String spec;

    private String unit;

    private Float price;

    private String producer;

    private Boolean ifdel;
    
    private String providername;

    @Override
	public String toString() {
		return "Tb_goods [id=" + id + ", name=" + name + ", spec=" + spec + ", unit=" + unit + ", price=" + price
				+ ", producer=" + producer + ", ifdel=" + ifdel + ", providername=" + providername + "]";
	}

	public String getProvidername() {
		return providername;
	}

	public void setProvidername(String providername) {
		this.providername = providername;
	}

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

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public Boolean getIfdel() {
        return ifdel;
    }

    public void setIfdel(Boolean ifdel) {
        this.ifdel = ifdel;
    }
}