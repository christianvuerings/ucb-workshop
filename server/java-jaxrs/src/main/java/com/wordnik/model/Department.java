package com.wordnik.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class Department {
  private String EmplID = null;
  private String DeptId = null;
  private String DeptDesc = null;
  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getDeptId() {
    return DeptId;
  }
  public void setDeptId(String DeptId) {
    this.DeptId = DeptId;
  }

  @ApiModelProperty(value="", required=true)
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

