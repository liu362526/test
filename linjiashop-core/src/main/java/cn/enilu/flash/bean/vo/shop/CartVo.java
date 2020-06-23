package cn.enilu.flash.bean.vo.shop;

import lombok.Data;

/**
 * @author ：enilu
 * @date ：Created in 12/13/2019 2:50 PM
 */
@Data
public class CartVo {
    private Long idGoods;
    private Integer count;
    private Long idSku;
    private Long idUser;
	public Long getIdGoods() {
		return idGoods;
	}
	public void setIdGoods(Long idGoods) {
		this.idGoods = idGoods;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Long getIdSku() {
		return idSku;
	}
	public void setIdSku(Long idSku) {
		this.idSku = idSku;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

}
