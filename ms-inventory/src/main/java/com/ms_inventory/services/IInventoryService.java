package com.ms_inventory.services;

import com.ms_inventory.dtos.BaseResponse;
import com.ms_inventory.dtos.OrderItemRequest;

import java.util.List;

public interface IInventoryService {
    public boolean isInStock(String sku);
    public BaseResponse areInStock(List<OrderItemRequest> orderItems);
}
