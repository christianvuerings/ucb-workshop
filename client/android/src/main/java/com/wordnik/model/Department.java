package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("DeptId")
  private String DeptId = null;
  @JsonProperty("DeptDesc")
  private String DeptDesc = null;
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public String getDeptId() {
    return DeptId;
  }
  public void setDeptId(String DeptId) {
    this.DeptId = DeptId;
  }

  public String getDeptDesc() {
    return DeptDesc;
  }
  public void setDeptDesc(String DeptDesc) {
    this.DeptDesc = DeptDesc;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  DeptId: ").append(DeptId).append("\n");
    sb.append("  DeptDesc: ").append(DeptDesc).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

