package com.wordnik.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class Address {
  private String AddressType = null;
  private String State = null;
  private String EmplID = null;
  private String Address1 = null;
  private String Address2 = null;
  private String Address3 = null;
  private String City = null;
  private String PostCode = null;
  private String CountryCode = null;
  @ApiModelProperty(value="", required=true)
  public String getAddressType() {
    return AddressType;
  }
  public void setAddressType(String AddressType) {
    this.AddressType = AddressType;
  }

  @ApiModelProperty(value="", required=true)
  public String getState() {
    return State;
  }
  public void setState(String State) {
    this.State = State;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getAddress1() {
    return Address1;
  }
  public void setAddress1(String Address1) {
    this.Address1 = Address1;
  }

  @ApiModelProperty(value="", required=true)
  public String getAddress2() {
    return Address2;
  }
  public void setAddress2(String Address2) {
    this.Address2 = Address2;
  }

  @ApiModelProperty(value="", required=true)
  public String getAddress3() {
    return Address3;
  }
  public void setAddress3(String Address3) {
    this.Address3 = Address3;
  }

  @ApiModelProperty(value="", required=true)
  public String getCity() {
    return City;
  }
  public void setCity(String City) {
    this.City = City;
  }

  @ApiModelProperty(value="", required=true)
  public String getPostCode() {
    return PostCode;
  }
  public void setPostCode(String PostCode) {
    this.PostCode = PostCode;
  }

  @ApiModelProperty(value="", required=true)
  public String getCountryCode() {
    return CountryCode;
  }
  public void setCountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("  AddressType: ").append(AddressType).append("\n");
    sb.append("  State: ").append(State).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  Address1: ").append(Address1).append("\n");
    sb.append("  Address2: ").append(Address2).append("\n");
    sb.append("  Address3: ").append(Address3).append("\n");
    sb.append("  City: ").append(City).append("\n");
    sb.append("  PostCode: ").append(PostCode).append("\n");
    sb.append("  CountryCode: ").append(CountryCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

