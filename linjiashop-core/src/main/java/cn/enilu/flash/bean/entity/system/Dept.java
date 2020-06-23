package cn.enilu.flash.bean.entity.system;

import cn.enilu.flash.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotBlank;

/**
 * Created  on 2018/4/2 0002.
 *
 * @author enilu
 */
@Entity(name="t_sys_dept")
@Table(appliesTo = "t_sys_dept",comment = "部门")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Dept extends BaseEntity {
    @Column
    private Integer num;
    @Column
    private Long pid;
    @Column
    private String pids;
    @Column
    @NotBlank(message = "部门简称不能为空")
    private String simplename;
    @Column
    @NotBlank(message = "部门全称不能为空")
    private String fullname;
    @Column
    private String tips;
    @Column
    private Integer version;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPids() {
		return pids;
	}
	public void setPids(String pids) {
		this.pids = pids;
	}
	public String getSimplename() {
		return simplename;
	}
	public void setSimplename(String simplename) {
		this.simplename = simplename;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
}
