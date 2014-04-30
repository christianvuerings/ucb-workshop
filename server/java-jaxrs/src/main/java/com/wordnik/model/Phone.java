package com.wordnik.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class Phone {
  private String Extension = null;
  private String EmplID = null;
  private String CountryCode = null;
  private String PhoneType = null;
  private String PhoneNumber = null;
  private String PrefPhoneFlag = null;
  @ApiModelProperty(value="", required=true)
  public String getExtension() {
    return Extension;
  }
  public void setExtension(String Extension) {
    this.Extension = Extension;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getCountryCode() {
    return CountryCode;
  }
  public void setCountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
  }

  @ApiModelProperty(value="", required=true)
  public String getPhoneType() {
    return PhoneType;
  }
  public void setPhoneType(String PhoneType) {
    this.PhoneType = PhoneType;
  }

  @ApiModelProperty(value="", required=true)
  public String getPhoneNumber() {
    return PhoneNumber;
  }
  public void setPhoneNumber(String PhoneNumber) {
    this.PhoneNumber = PhoneNumber;
  }

  @ApiModelProperty(value="", required=true)
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

