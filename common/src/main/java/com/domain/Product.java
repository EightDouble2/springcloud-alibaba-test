package com.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("product")
public class Product {

    @TableId
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
}
