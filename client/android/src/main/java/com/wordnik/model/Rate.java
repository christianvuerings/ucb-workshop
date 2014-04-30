package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {
  @JsonProperty("code")
  private String code = null;
  @JsonProperty("Amount")
  private String Amount = null;
  @JsonProperty("OffAboveScale")
  private String OffAboveScale = null;
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  public String getAmount() {
    return Amount;
  }
  public void setAmount(String Amount) {
    this.Amount = Amount;
  }

  public String getOffAboveScale() {
    return OffAboveScale;
  }
  public void setOffAboveScale(String OffAboveScale) {
    this.OffAboveScale = OffAboveScale;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  Amount: ").append(Amount).append("\n");
    sb.append("  OffAboveScale: ").append(OffAboveScale).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

