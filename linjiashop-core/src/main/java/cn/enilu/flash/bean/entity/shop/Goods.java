package cn.enilu.flash.bean.entity.shop;

import cn.enilu.flash.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * @author ：enilu
 * @date ：Created in 2019/10/29 17:39
 */
@Data
@Table(appliesTo = "t_shop_goods",comment = "商品")
@Entity(name="t_shop_goods")
@EntityListeners(AuditingEntityListener.class)
public class Goods extends BaseEntity {
    @NotBlank(message = "商品名称不能为空")
    @Column(columnDefinition = "VARCHAR(32) COMMENT '名称'")
    private String name;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '小图'")
    private String pic;
    @Column(columnDefinition = "VARCHAR(512) COMMENT '大图相册列表,以逗号分隔'")
    private String  gallery;
    @Column(name="id_category",columnDefinition = "BIGINT COMMENT '类别id'")
    private Long idCategory;
    @JoinColumn(name="id_category", insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @Column(columnDefinition = "VARCHAR(255) COMMENT '产品简介'")
    @NotBlank(message = "商品简介不能为空")
    private String descript;
    @Column(columnDefinition = "TEXT COMMENT '产品详情'")
    private String detail;
    /**
     * 如果商品是多规格，则存所有库存之和
     */
    @Column(columnDefinition = "INT COMMENT '库存数量'")
    private Integer stock=0;
    /**
     * 如果商品是多规格，则存最低价
     */
    @Column(columnDefinition = "VARCHAR(16) COMMENT '价格'")
    private BigDecimal price;
    @Column(columnDefinition = "tinyint COMMENT '是否删除'")
    private Boolean isDelete= false;
    @Column(columnDefinition = "tinyint COMMENT '是否上架'")
    private Boolean isOnSale = false;
    @Column(columnDefinition = "tinyint COMMENT '是否新品推荐'")
    private Boolean isNew = false;
    @Column(columnDefinition = "tinyint COMMENT '是否人气商品'")
    private Boolean isHot = false;
    @Column(name="like_num",columnDefinition = "INT COMMENT '收藏数'")
    private Integer likeNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getGallery() {
		return gallery;
	}
	public void setGallery(String gallery) {
		this.gallery = gallery;
	}
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Boolean getIsOnSale() {
		return isOnSale;
	}
	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}
	public Boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	public Boolean getIsHot() {
		return isHot;
	}
	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}
	public Integer getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

}
