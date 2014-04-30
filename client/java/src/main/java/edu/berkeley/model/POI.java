package edu.berkeley.model;

import java.util.Date;
public class POI {
  private String Description = null;
  private Date EffectiveDate = null;
  private String EmplID = null;
  private String EffectiveStatus = null;
  private Date ExpectedEndDate = null;
  private String pOIType = null;
  public String getDescription() {
    return Description;
  }
  public void setDescription(String Description) {
    this.Description = Description;
  }

  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public String getEffectiveStatus() {
    return EffectiveStatus;
  }
  public void setEffectiveStatus(String EffectiveStatus) {
    this.EffectiveStatus = EffectiveStatus;
  }

  public Date getExpectedEndDate() {
    return ExpectedEndDate;
  }
  public void setExpectedEndDate(Date ExpectedEndDate) {
    this.ExpectedEndDate = ExpectedEndDate;
  }

  public String getPOIType() {
    return pOIType;
  }
  public void setPOIType(String pOIType) {
    this.pOIType = pOIType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class POI {\n");
    sb.append("  Description: ").append(Description).append("\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  EffectiveStatus: ").append(EffectiveStatus).append("\n");
    sb.append("  ExpectedEndDate: ").append(ExpectedEndDate).append("\n");
    sb.append("  pOIType: ").append(pOIType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

