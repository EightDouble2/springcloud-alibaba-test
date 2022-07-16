package com.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order")
public class Order {

    @TableId
    private Long id;
    private Long userId;
    private String userName;
    private Long productId;
    private String productName;
    private Double productPrice;
    private Integer quantity;
}
