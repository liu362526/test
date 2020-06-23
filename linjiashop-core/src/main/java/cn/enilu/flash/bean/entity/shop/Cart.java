package cn.enilu.flash.bean.entity.shop;

import cn.enilu.flash.bean.entity.ShopBaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author ：enilu
 * @date ：Created in 2019/10/29 17:40
 */
@Data
@Table(appliesTo = "t_shop_cart",comment = "购物车")
@Entity(name="t_shop_cart")
public class Cart extends ShopBaseEntity {
    @Column(name="id_user",columnDefinition = "BIGINT COMMENT '用户id'")
    private Long idUser;
    @JoinColumn(name="id_user", insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private ShopUser user;
    @Column(name="id_goods",columnDefinition = "BIGINT COMMENT '商品id'")
    private Long idGoods;
    @JoinColumn(name="id_goods", insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Goods goods;
    @Column(name="id_sku",columnDefinition = "BIGINT COMMENT 'skuId'")
    private Long idSku;
    @JoinColumn(name="id_sku", insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private GoodsSku sku;
    @Column(columnDefinition = "varchar(16) COMMENT '数量'")
    private BigDecimal count;
    @Transient
    private BigDecimal price;
    public BigDecimal getPrice(){
        if(idSku!=null){
            return sku.getPrice();
        }
        return goods.getPrice();
    }
    public String getTitle(){
        return idSku!=null?getGoods().getName()+" "+getSku().getCodeName():getGoods().getName();
    }
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public ShopUser getUser() {
		return user;
	}
	public void setUser(ShopUser user) {
		this.user = user;
	}
	public Long getIdGoods() {
		return idGoods;
	}
	public void setIdGoods(Long idGoods) {
		this.idGoods = idGoods;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Long getIdSku() {
		return idSku;
	}
	public void setIdSku(Long idSku) {
		this.idSku = idSku;
	}
	public GoodsSku getSku() {
		return sku;
	}
	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
