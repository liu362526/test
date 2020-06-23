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

@Entity(name="t_cms_channel")
@Table(appliesTo = "t_cms_channel",comment = "文章栏目")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Channel extends BaseEntity {
	@Column(columnDefinition = "BIGINT COMMENT ''")
	@NotNull(message = "id不能为空")
    private Long id;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '名称'")
    @NotBlank(message = "名称不能为空")
    private String name;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '编码'")
    @NotBlank(message = "编码不能为空")
    private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
