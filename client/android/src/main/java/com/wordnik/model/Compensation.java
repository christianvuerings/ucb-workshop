package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.wordnik.model.Pay;
public class Compensation {
  @JsonProperty("HourlyRate")
  private String HourlyRate = null;
  @JsonProperty("MonthlyRate")
  private String MonthlyRate = null;
  @JsonProperty("AnnualRate")
  private String AnnualRate = null;
  @JsonProperty("Pay")
  private Pay Pay = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  public String getHourlyRate() {
    return HourlyRate;
  }
  public void setHourlyRate(String HourlyRate) {
    this.HourlyRate = HourlyRate;
  }

  public String getMonthlyRate() {
    return MonthlyRate;
  }
  public void setMonthlyRate(String MonthlyRate) {
    this.MonthlyRate = MonthlyRate;
  }

  public String getAnnualRate() {
    return AnnualRate;
  }
  public void setAnnualRate(String AnnualRate) {
    this.AnnualRate = AnnualRate;
  }

  public Pay getPay() {
    return Pay;
  }
  public void setPay(Pay Pay) {
    this.Pay = Pay;
  }

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

