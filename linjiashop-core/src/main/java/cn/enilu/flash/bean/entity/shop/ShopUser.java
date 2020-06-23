package cn.enilu.flash.bean.entity.shop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ：enilu
 * @date ：Created in 2019/10/29 17:41
 */
@Data
@Table(appliesTo = "t_shop_user",comment = "用户")
@Entity(name="t_shop_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ShopUser  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @CreatedDate
    @Column(columnDefinition="DATETIME COMMENT '注册时间'")
    private Date createTime;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '手机号'")
    private String mobile;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '密码盐'")
    private String salt;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '密码'")
    private String password;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '昵称'")
    private String nickName;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '头像'")
    private String avatar;
    @Column(columnDefinition = "VARCHAR(18) COMMENT '性别:male;female'")
    private String gender;
    @Column(columnDefinition = "DATETIME COMMENT '最后登陆时间'")
    private Date lastLoginTime;
    @Column(columnDefinition = "VARCHAR(64) comment '微信OpenID'")
    private String wechatOpenId;
    @Column(columnDefinition = "VARCHAR(32) comment '微信昵称'")
    private String wechatNickName;
    @Column(columnDefinition = "VARCHAR(256) comment '微信头像'")
    private String wechatHeadImgUrl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getWechatOpenId() {
		return wechatOpenId;
	}
	public void setWechatOpenId(String wechatOpenId) {
		this.wechatOpenId = wechatOpenId;
	}
	public String getWechatNickName() {
		return wechatNickName;
	}
	public void setWechatNickName(String wechatNickName) {
		this.wechatNickName = wechatNickName;
	}
	public String getWechatHeadImgUrl() {
		return wechatHeadImgUrl;
	}
	public void setWechatHeadImgUrl(String wechatHeadImgUrl) {
		this.wechatHeadImgUrl = wechatHeadImgUrl;
	}

}
