package com.yago.git.pojo;

import com.yago.git.service.DescribeService;

/**
 * @author yagoshu 预约时段 枚举
 */
public enum AppointmentPeriodEnum implements DescribeService {
  ONE("01") {
    public String describle() {
      return "07:00—07:29";
    }
  },
  TWO("02") {
    public String describle() {
      return "07:30—07:59";
    }
  },
  THREE("03") {
    public String describle() {
      return "08:00—08:29";
    }
  },
  FOUR("04") {
    public String describle() {
      return "08:30—08:59";
    }
  },
  FIVE("05") {
    public String describle() {
      return "09:00—09:29";
    }
  },
  SIX("06") {
    public String describle() {
      return "09:30—09:59";
    }
  },
  SEVEN("07") {
    public String describle() {
      return "10:00—10:29";
    }
  },
  EIGHT("08") {
    public String describle() {
      return "10:30—10:59";
    }
  },
  NINE("09") {
    public String describle() {
      return "11:00—11:29";
    }
  },
  TEN("10") {
    public String describle() {
      return "11:30—11:59";
    }
  },
  ENLEVEN("11") {
    public String describle() {
      return "12:00—12:29";
    }
  },
  TWELVE("12") {
    public String describle() {
      return "12:30—12:59";
    }
  },
  THIRTEEN("13") {
    public String describle() {
      return "13:00—13:29";
    }
  },
  FOURTEEN("14") {
    public String describle() {
      return "13:30—13:59";
    }
  },
  FIFTEEN("15") {
    public String describle() {
      return "14:00—14:29";
    }
  },
  SIXTEEN("16") {
    public String describle() {
      return "14:30—14:59";
    }
  },
  SEVENTEEN("17") {
    public String describle() {
      return "15:00—15:29";
    }
  },
  EIGHTEEN("18") {
    public String describle() {
      return "15:30—15:59";
    }
  },
  NINETEEN("19") {
    public String describle() {
      return "16:00—16:29";
    }
  },
  TWENTY("20") {
    public String describle() {
      return "16:30—16:59";
    }
  },
  TWENTYONE("21") {
    public String describle() {
      return "17:00—17:29";
    }
  },
  TWENTYTWO("22") {
    public String describle() {
      return "17:30—17:59";
    }
  },
  TWENTYTHREE("23") {
    public String describle() {
      return "18:00—18:29";
    }
  },
  TWENTYFOUR("24") {
    public String describle() {
      return "18:30—18:59";
    }
  },
  TWENTYFIVE("25") {
    public String describle() {
      return "19:00—19:29";
    }
  },
  TWENTYSIX("26") {
    public String describle() {
      return "19:30—19:59";
    }
  },
  NINETYNINE("99") {
    public String describle() {
      return "其他时段就诊";
    }
  };

  private final String numString;

  AppointmentPeriodEnum(String numString) {
    this.numString = numString;
  }

  public String getNumString() {
    return numString;
  }
}
