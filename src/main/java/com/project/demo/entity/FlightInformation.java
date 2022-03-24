package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *航班信息：(FlightInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FlightInformation")
public class FlightInformation implements Serializable {

    //FlightInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_information_id")
    private Integer flight_information_id;
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
   // 航班图片
   @Basic
    private String flight_picture;
   // 航班描述
   @Basic
    private String flight_description;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
