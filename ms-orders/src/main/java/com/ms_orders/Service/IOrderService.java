package com.ms_orders.Service;

import com.ms_orders.dtos.OrderRequest;
import com.ms_orders.dtos.OrderResponse;

import java.util.List;

public interface IOrderService {
    public void placeOrder(OrderRequest orderRequest);
    public List<OrderResponse> getAllOrders();
}
