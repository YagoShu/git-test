package com.yago.git;

import com.yago.git.utils.EnumUtil;

public class GitTest {

  public static void main(String[] args) throws Exception {
    String state = "9";
    String s = EnumUtil.registrationTpyeInvoke(state);
    String state2 = "0" + state;
    String s1 = EnumUtil.appointmentPeriodEnumInvoke(state2);
    System.out.println(s);
    System.out.println(s1);
  }
}
