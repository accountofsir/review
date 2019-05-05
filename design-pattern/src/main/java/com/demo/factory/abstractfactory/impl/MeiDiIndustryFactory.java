package com.demo.factory.abstractfactory.impl;

import com.demo.factory.abstractfactory.AirConditioning;
import com.demo.factory.abstractfactory.IIndustryFactory;
import com.demo.factory.abstractfactory.Icebox;
import com.demo.factory.abstractfactory.WaterHeater;
import com.demo.factory.abstractfactory.product.MeiDi_AirConditioning;
import com.demo.factory.abstractfactory.product.MeiDi_Icebox;
import com.demo.factory.abstractfactory.product.MeiDi_WaterHeater;

public class MeiDiIndustryFactory implements IIndustryFactory {
    @Override
    public Icebox createIcebox() {
        return new MeiDi_Icebox();
    }

    @Override
    public AirConditioning createAirCondition() {
        return new MeiDi_AirConditioning();
    }

    @Override
    public WaterHeater createWaterHeater() {
        return new MeiDi_WaterHeater();
    }
}
