package com.wordnik.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class Email {
  private String EmplID = null;
  private String EmailType = null;
  private String EmailAddress = null;
  private String PrefEmailFlag = null;
  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmailType() {
    return EmailType;
  }
  public void setEmailType(String EmailType) {
    this.EmailType = EmailType;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmailAddress() {
    return EmailAddress;
  }
  public void setEmailAddress(String EmailAddress) {
    this.EmailAddress = EmailAddress;
  }

  @ApiModelProperty(value="", required=true)
  public String getPrefEmailFlag() {
    return PrefEmailFlag;
  }
  public void setPrefEmailFlag(String PrefEmailFlag) {
    this.PrefEmailFlag = PrefEmailFlag;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  EmailType: ").append(EmailType).append("\n");
    sb.append("  EmailAddress: ").append(EmailAddress).append("\n");
    sb.append("  PrefEmailFlag: ").append(PrefEmailFlag).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

