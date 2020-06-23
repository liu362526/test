package cn.enilu.flash.bean.entity.cms;

import cn.enilu.flash.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name="t_cms_banner")
@Table(appliesTo = "t_cms_banner",comment = "文章")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Banner extends BaseEntity {
    @Column(columnDefinition = "VARCHAR(128) COMMENT '点击banner跳转到url'")
    private String url;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '标题'")
    @NotBlank(message = "标题不能为空")
    private String title;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '类型'")
    @NotBlank(message = "类型不能为空")
    private String type;
    @Column(columnDefinition = "VARCHAR(64) COMMENT 'banner图id'")
    private String idFile;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '界面'")
    private String page;
    @Column(columnDefinition = "VARCHAR(128) COMMENT '参数'")
    private String param;
    @Column(columnDefinition = "BIGINT COMMENT ''")
	@NotNull(message = "id不能为空")
    private String id;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIdFile() {
		return idFile;
	}
	public void setIdFile(String idFile) {
		this.idFile = idFile;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
}
