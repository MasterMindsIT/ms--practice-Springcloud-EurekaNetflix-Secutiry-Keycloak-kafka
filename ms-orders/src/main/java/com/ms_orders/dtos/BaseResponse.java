package com.ms_orders.dtos;

public record BaseResponse (String[] errorMessages){
    public boolean hasErrors() {
        return errorMessages != null && errorMessages.length > 0;
    }
}
