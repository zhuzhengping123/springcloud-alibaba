package com.itheima.controller;


import com.itheima.domain.Order;
import com.itheima.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//传统微服务分布式事务开发
@RestController
@Slf4j
public class OrderController5 {

    //下单
    @Autowired

    private OrderServiceImpl orderService;
    //下单
      @RequestMapping("/order/prods/{pid}")
      public Order order(@PathVariable("pid") Integer pid) {
        log.info("接收到{}号商品的下单请求,接下来调用商品微服务查询此商品信息", pid);
        return orderService.createOrder(pid);
     }
}
