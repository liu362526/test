package cn.enilu.flash.bean.vo.shop;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：enilu
 * @date ：Created in 2020/3/10 14:06
 */
@Data
public class WechatInfo implements Serializable {
    private String nickName;
    private String headUrl;
    private String openId;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
}
