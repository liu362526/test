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
@Table(appliesTo = "t_shop_order_item", comment = "订单明细")
@Entity(name = "t_shop_order_item")
public class OrderItem extends ShopBaseEntity {
    @Column(name = "id_order", columnDefinition = "BIGINT COMMENT '所属订单id'")
    private Long idOrder;
    @Column(name = "id_goods", columnDefinition = "BIGINT COMMENT '商品id'")
    private Long idGoods;
    @JoinColumn(name = "id_goods", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Goods goods;
    @Column(name = "id_sku", columnDefinition = "BIGINT COMMENT 'skuId'")
    private Long idSku;
    @JoinColumn(name = "id_sku", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private GoodsSku sku;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '单价'")
    private BigDecimal price;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '数量'")
    private BigDecimal count;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '合计'")
    private BigDecimal totalPrice;

    public String getTitle() {
        return idSku != null
                ? (getGoods().getName() + " " + getSku().getCodeName())
                : getGoods().getName();
    }

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
}
