package cn.enilu.flash.bean.entity.promotion;

import cn.enilu.flash.bean.entity.BaseEntity;
import cn.enilu.flash.bean.entity.cms.Article;
import cn.enilu.flash.bean.entity.shop.Goods;
import cn.enilu.flash.utils.Lists;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

/**
 * @author ：enilu
 * @date ：Created in 1/8/2020 8:10 PM
 */
@Data
@Entity(name="t_promotion_topic")
@Table(appliesTo = "t_promotion_topic",comment = "专题")
@EntityListeners(AuditingEntityListener.class)
public class Topic  extends BaseEntity {
    @Column(columnDefinition = "VARCHAR(64) COMMENT '标题'")
    private String title;
    @Column(name="id_article",columnDefinition = "BIGINT COMMENT '专题文章'")
    private Long idArticle;
    @JoinColumn(name="id_article", insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;
    @Column(name="id_goods_list",columnDefinition = "VARCHAR(64) COMMENT '商品id列表'")
    private String idGoodsList;
    @Column(columnDefinition = "BIGINT COMMENT '阅读量'")
    private Long pv=0L;
    @Column(columnDefinition = "TINYINT COMMENT '是否禁用'")
    private boolean disabled=false;
    @Transient
    private List<Goods> goodsList = Lists.newArrayList();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getIdGoodsList() {
		return idGoodsList;
	}
	public void setIdGoodsList(String idGoodsList) {
		this.idGoodsList = idGoodsList;
	}
	public Long getPv() {
		return pv;
	}
	public void setPv(Long pv) {
		this.pv = pv;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

}
