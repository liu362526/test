package cn.enilu.flash.bean.entity.shop;

import cn.enilu.flash.bean.entity.ShopBaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;

/**
 * @author ：enilu
 * @date ：Created in 1/21/2020 11:13 AM
 */
@Data
@Entity(name="t_shop_favorite")
@Table(appliesTo = "t_shop_favorite",comment = "用户收藏")
public class Favorite extends ShopBaseEntity {
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
}
