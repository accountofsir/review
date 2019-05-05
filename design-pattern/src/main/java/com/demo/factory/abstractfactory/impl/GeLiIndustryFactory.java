package com.demo.factory.abstractfactory.impl;

import com.demo.factory.abstractfactory.AirConditioning;
import com.demo.factory.abstractfactory.IIndustryFactory;
import com.demo.factory.abstractfactory.Icebox;
import com.demo.factory.abstractfactory.WaterHeater;
import com.demo.factory.abstractfactory.product.GeLi_AirConditioning;
import com.demo.factory.abstractfactory.product.GeLi_Icebox;
import com.demo.factory.abstractfactory.product.GeLi_WaterHeater;

public class GeLiIndustryFactory implements IIndustryFactory {
    @Override
    public Icebox createIcebox() {
        return new GeLi_Icebox();
    }
    @Override
    public AirConditioning createAirCondition() {
        return new GeLi_AirConditioning();
    }
    @Override
    public WaterHeater createWaterHeater() {
        return new GeLi_WaterHeater();
    }
}
