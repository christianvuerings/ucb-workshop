package com.wordnik.model;

import com.wordnik.model.Pay;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Compensation {
  private String HourlyRate = null;
  private String MonthlyRate = null;
  private String AnnualRate = null;
  private Pay Pay = null;
  private String EmplID = null;
  @ApiModelProperty(value="", required=true)
  public String getHourlyRate() {
    return HourlyRate;
  }
  public void setHourlyRate(String HourlyRate) {
    this.HourlyRate = HourlyRate;
  }

  @ApiModelProperty(value="", required=true)
  public String getMonthlyRate() {
    return MonthlyRate;
  }
  public void setMonthlyRate(String MonthlyRate) {
    this.MonthlyRate = MonthlyRate;
  }

  @ApiModelProperty(value="", required=true)
  public String getAnnualRate() {
    return AnnualRate;
  }
  public void setAnnualRate(String AnnualRate) {
    this.AnnualRate = AnnualRate;
  }

  @ApiModelProperty(value="", required=true)
  public Pay getPay() {
    return Pay;
  }
  public void setPay(Pay Pay) {
    this.Pay = Pay;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compensation {\n");
    sb.append("  HourlyRate: ").append(HourlyRate).append("\n");
    sb.append("  MonthlyRate: ").append(MonthlyRate).append("\n");
    sb.append("  AnnualRate: ").append(AnnualRate).append("\n");
    sb.append("  Pay: ").append(Pay).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

