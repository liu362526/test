package cn.enilu.flash.bean.entity.shop;

import cn.enilu.flash.bean.entity.ShopBaseEntity;
import cn.enilu.flash.bean.entity.system.Express;
import cn.enilu.flash.bean.enumeration.shop.OrderEnum;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ：enilu
 * @date ：Created in 2019/10/29 17:40
 */
@Data
@Table(appliesTo = "t_shop_order",comment = "订单")
@Entity(name="t_shop_order")
public class Order extends ShopBaseEntity {
	@Column(name="id",columnDefinition = "BIGINT COMMENT 'id'")
    private Long id;
    @Column(name="id_user",columnDefinition = "BIGINT COMMENT '用户id'")
    private Long idUser;
    @JoinColumn(name="id_user", referencedColumnName="id",insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private ShopUser user;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '订单号'")
    private String orderSn;
    /**
     * @see OrderEnum.OrderStatusEnum
     */
    @Column(columnDefinition = "INT COMMENT '状态'")
    private Integer status;
    @Column(name="id_address",columnDefinition = "BIGINT COMMENT '收货信息'")
    private Long idAddress;
    @JoinColumn(name="id_address",  referencedColumnName="id",insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_order")
    private List<OrderItem> items;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '订单备注'")
    private String message;
    @Column(columnDefinition = "VARCHAR(256) COMMENT '管理员备注'")
    private String adminMessage;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '配送费用'")
    private BigDecimal shippingAmount;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '交易金额'")
    private BigDecimal tradeAmount;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '总金额'")
    private BigDecimal totalPrice;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '优惠券抵扣金额'")
    private BigDecimal couponPrice;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '实付金额'")
    private BigDecimal realPrice;
    @Column(columnDefinition = "DATETIME COMMENT '出库时间'")
    private Date shippingTime;
    @Column(name="id_express",columnDefinition = "BIGINT COMMENT '快递公司'")
    private Long idExpress;
    @JoinColumn(name="id_express",  referencedColumnName="id",insertable = false, updatable = false,foreignKey = @ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.LAZY)
    private Express express;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '快递单号'")
    private String shippingSn;
    @Column(columnDefinition = "DATETIME COMMENT '确认收货时间'")
    private Date confirmReceivingTime;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '实付类型:alipay,wechat'")
    private String payType;
    @Column(columnDefinition = "INT COMMENT '支付状态1:未付款;2:已付款,3:支付中'")
    private Integer payStatus;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '支付流水号'")
    private String payId;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '支付成功时间'")
    private Date payTime;


    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatusName(){
        if(status!=null) {
            return OrderEnum.get(status).getValue();
        }
        return null;
    }
    public String getPayStatusName(){
        if(payStatus!=null) {
            return OrderEnum.getPayStatus(payStatus).getValue();
        }
        return null;
    }
    public String getPayTypeName(){
        if(payType!=null) {
            return OrderEnum.get(payType).getValue();
        }
        return null;
    }

    public Boolean hasPayed(){
        return OrderEnum.PayStatusEnum.UN_SEND.getId().equals(payStatus);
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
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAdminMessage() {
		return adminMessage;
	}
	public void setAdminMessage(String adminMessage) {
		this.adminMessage = adminMessage;
	}
	public BigDecimal getShippingAmount() {
		return shippingAmount;
	}
	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
	}
	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}
	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public BigDecimal getCouponPrice() {
		return couponPrice;
	}
	public void setCouponPrice(BigDecimal couponPrice) {
		this.couponPrice = couponPrice;
	}
	public BigDecimal getRealPrice() {
		return realPrice;
	}
	public void setRealPrice(BigDecimal realPrice) {
		this.realPrice = realPrice;
	}
	public Date getShippingTime() {
		return shippingTime;
	}
	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}
	public Long getIdExpress() {
		return idExpress;
	}
	public void setIdExpress(Long idExpress) {
		this.idExpress = idExpress;
	}
	public Express getExpress() {
		return express;
	}
	public void setExpress(Express express) {
		this.express = express;
	}
	public String getShippingSn() {
		return shippingSn;
	}
	public void setShippingSn(String shippingSn) {
		this.shippingSn = shippingSn;
	}
	public Date getConfirmReceivingTime() {
		return confirmReceivingTime;
	}
	public void setConfirmReceivingTime(Date confirmReceivingTime) {
		this.confirmReceivingTime = confirmReceivingTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
}
