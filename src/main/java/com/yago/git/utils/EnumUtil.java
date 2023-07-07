package com.yago.git.utils;

import com.yago.git.pojo.AppointmentPeriodEnum;
import com.yago.git.pojo.RegistrationTypeEnum;

/**
 * @author yagoshu
 * */
public class EnumUtil {

    /*
    * @param state 挂号类别编码
    * @return 挂号类别编码所对应的名称
    * @exception 非法编码直接抛异常
    * */
    public static String registrationTpyeInvoke(String state) throws Exception {
        String value = null;
        for (RegistrationTypeEnum registrationType : RegistrationTypeEnum.values()) {
            if (registrationType.getNumString().equals(state)) {
                value = registrationType.describle();
            }
        }
        if (value == null) {
            throw new Exception("非法 挂号类别代码");
        }
        return value;
    }

    /*
     * @param state 预约时段编码
     * @result 预约时段编码所对应的名称
     * @exception 非法编码直接抛异常
     * */
    public static String appointmentPeriodEnumInvoke(String state) throws Exception {
        String value = null;
        for (AppointmentPeriodEnum appointmentPeriod : AppointmentPeriodEnum.values()) {
            if (appointmentPeriod.getNumString().equals(state)) {
                value = appointmentPeriod.describle();
            }
        }
        if (value == null) {
            throw new Exception("非法 预约时段代码");
        }
        return value;
    }
}
