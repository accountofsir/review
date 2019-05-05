package com.demo.factory.abstractfactory;

public interface IIndustryFactory {
    Icebox createIcebox();
    AirConditioning createAirCondition();
    WaterHeater createWaterHeater();
}
