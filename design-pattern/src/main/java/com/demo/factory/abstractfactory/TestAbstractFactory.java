package com.demo.factory.abstractfactory;

import com.demo.factory.abstractfactory.impl.GeLiIndustryFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Slf4j
public class TestAbstractFactory {

    public static void main(String[] args) {
        GeLiIndustryFactory geLiIndustryFactory = new GeLiIndustryFactory();
        AirConditioning airCondition = geLiIndustryFactory.createAirCondition();
        log.info(airCondition.toString());
    }
}
