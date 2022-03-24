package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *订单信息：(OrderInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderInformation")
public class OrderInformation implements Serializable {

    //OrderInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_information_id")
    private Integer order_information_id;
   // 航空公司
   @Basic
    private String airline_company;
   // 航班号
   @Basic
    private String flight_number;
   // 出发城市
   @Basic
    private String departure_city;
   // 抵达城市
   @Basic
    private String arrive_in_the_city;
   // 出发时间
   @Basic
    private String departure_time;
   // 抵达时间
   @Basic
    private String arrival_time;
   // 票价
   @Basic
    private Integer ticket_price;
   // 订票人
   @Basic
    private Integer booker;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;
	// 选座状态
	@Basic
	private String seat;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
