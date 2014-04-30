package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Phone {
  @JsonProperty("Extension")
  private String Extension = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("CountryCode")
  private String CountryCode = null;
  @JsonProperty("PhoneType")
  private String PhoneType = null;
  @JsonProperty("PhoneNumber")
  private String PhoneNumber = null;
  @JsonProperty("PrefPhoneFlag")
  private String PrefPhoneFlag = null;
  public String getExtension() {
    return Extension;
  }
  public void setExtension(String Extension) {
    this.Extension = Extension;
  }

  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public String getCountryCode() {
    return CountryCode;
  }
  public void setCountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
  }

  public String getPhoneType() {
    return PhoneType;
  }
  public void setPhoneType(String PhoneType) {
    this.PhoneType = PhoneType;
  }

  public String getPhoneNumber() {
    return PhoneNumber;
  }
  public void setPhoneNumber(String PhoneNumber) {
    this.PhoneNumber = PhoneNumber;
  }

  public String getPrefPhoneFlag() {
    return PrefPhoneFlag;
  }
  public void setPrefPhoneFlag(String PrefPhoneFlag) {
    this.PrefPhoneFlag = PrefPhoneFlag;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("  Extension: ").append(Extension).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  CountryCode: ").append(CountryCode).append("\n");
    sb.append("  PhoneType: ").append(PhoneType).append("\n");
    sb.append("  PhoneNumber: ").append(PhoneNumber).append("\n");
    sb.append("  PrefPhoneFlag: ").append(PrefPhoneFlag).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

