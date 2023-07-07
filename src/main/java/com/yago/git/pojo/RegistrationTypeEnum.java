package com.yago.git.pojo;


import com.yago.git.service.DescribeService;

/**
 * @author yagoshu
 * 挂号类别 枚举
 */
public enum RegistrationTypeEnum implements DescribeService {
    ONE("1") {
        public String describle() {
            return "一般医师号";
        }
    },
    TWO("2") {
        public String describle() {
            return "主治医师号";
        }
    },
    THREE("3") {
        public String describle() {
            return "副主任医师号";
        }
    },
    FOUR("4") {
        public String describle() {
            return "主任医师号";
        }
    },
    FIVE("5") {
        public String describle() {
            return "国家级著名专家号";
        }
    },
    SIX("6") {
        public String describle() {
            return "省级著名专家号";
        }
    },
    SEVEN("7") {
        public String describle() {
            return "互联网复诊号";
        }
    },
    ENGIHT("8") {
        public String describle() {
            return "国医大师号";
        }
    },
    NINE("9") {
        public String describle() {
            return "其他号";
        }
    };

    private final String numString;

    RegistrationTypeEnum(String num) {
        this.numString = num;
    }

    public String getNumString() {
        return numString;
    }
}
