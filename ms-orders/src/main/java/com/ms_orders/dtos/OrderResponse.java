package com.ms_orders.dtos;

import java.util.List;

public record OrderResponse (Long id, String orderNumber, List<OrderItemsResponse> orderItems){
}
