package com.thaiwan.converters;

import com.thaiwan.domain.Bus;
import com.thaiwan.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Tanya on 31.01.2017.
 */
@Component
public class IdToBusConverter implements Converter<String, Bus> {
    @Autowired
    private BusService busService;

    public IdToBusConverter() {
    }

    public IdToBusConverter(BusService busService) {
        this.busService = busService;
    }

    public Bus convert(String id) {
        try {
            return busService.findBus(Integer.valueOf(id));
        } catch (NumberFormatException e) {
            return null;
        }
    }


}
