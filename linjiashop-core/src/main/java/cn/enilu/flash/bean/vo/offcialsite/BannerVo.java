package cn.enilu.flash.bean.vo.offcialsite;

import lombok.Data;

import java.util.List;

@Data
public class BannerVo {
    public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public List<cn.enilu.flash.bean.entity.cms.Banner> getList() {
		return list;
	}
	public void setList(List<cn.enilu.flash.bean.entity.cms.Banner> list) {
		this.list = list;
	}
	private Integer index = 0;
    private List<cn.enilu.flash.bean.entity.cms.Banner> list;

}
