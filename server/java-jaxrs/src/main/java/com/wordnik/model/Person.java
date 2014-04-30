package com.wordnik.model;

import java.util.Date;
import java.util.*;
import com.wordnik.model.Name;
import com.wordnik.model.Department;
import com.wordnik.model.Job;
import com.wordnik.model.Email;
import com.wordnik.model.Phone;
import com.wordnik.model.Address;
import com.wordnik.model.Identifier;
import com.wordnik.model.POI;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Person {
  private List<Address> Address = new ArrayList<Address>();
  private List<Name> Name = new ArrayList<Name>();
  private Identifier Identifier = null;
  private List<Email> Email = new ArrayList<Email>();
  private Date EffectiveDate = null;
  private String EmplID = null;
  private String EmplType = null;
  private String EffectiveStatus = null;
  private String BusinessTitle = null;
  private String HomeDept = null;
  private List<Department> Department = new ArrayList<Department>();
  private List<Phone> Phone = new ArrayList<Phone>();
  private List<Job> Job = new ArrayList<Job>();
  private POI pOI = null;
  @ApiModelProperty(value="", required=true)
  public List<Address> getAddress() {
    return Address;
  }
  public void setAddress(List<Address> Address) {
    this.Address = Address;
  }

  @ApiModelProperty(value="", required=true)
  public List<Name> getName() {
    return Name;
  }
  public void setName(List<Name> Name) {
    this.Name = Name;
  }

  @ApiModelProperty(value="", required=true)
  public Identifier getIdentifier() {
    return Identifier;
  }
  public void setIdentifier(Identifier Identifier) {
    this.Identifier = Identifier;
  }

  @ApiModelProperty(value="", required=true)
  public List<Email> getEmail() {
    return Email;
  }
  public void setEmail(List<Email> Email) {
    this.Email = Email;
  }

  @ApiModelProperty(value="", required=true)
  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplType() {
    return EmplType;
  }
  public void setEmplType(String EmplType) {
    this.EmplType = EmplType;
  }

  @ApiModelProperty(value="", required=true)
  public String getEffectiveStatus() {
    return EffectiveStatus;
  }
  public void setEffectiveStatus(String EffectiveStatus) {
    this.EffectiveStatus = EffectiveStatus;
  }

  @ApiModelProperty(value="", required=true)
  public String getBusinessTitle() {
    return BusinessTitle;
  }
  public void setBusinessTitle(String BusinessTitle) {
    this.BusinessTitle = BusinessTitle;
  }

  @ApiModelProperty(value="", required=true)
  public String getHomeDept() {
    return HomeDept;
  }
  public void setHomeDept(String HomeDept) {
    this.HomeDept = HomeDept;
  }

  @ApiModelProperty(value="", required=true)
  public List<Department> getDepartment() {
    return Department;
  }
  public void setDepartment(List<Department> Department) {
    this.Department = Department;
  }

  @ApiModelProperty(value="", required=true)
  public List<Phone> getPhone() {
    return Phone;
  }
  public void setPhone(List<Phone> Phone) {
    this.Phone = Phone;
  }

  @ApiModelProperty(value="", required=true)
  public List<Job> getJob() {
    return Job;
  }
  public void setJob(List<Job> Job) {
    this.Job = Job;
  }

  @ApiModelProperty(value="")
  public POI getPOI() {
    return pOI;
  }
  public void setPOI(POI pOI) {
    this.pOI = pOI;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("  Address: ").append(Address).append("\n");
    sb.append("  Name: ").append(Name).append("\n");
    sb.append("  Identifier: ").append(Identifier).append("\n");
    sb.append("  Email: ").append(Email).append("\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  EmplType: ").append(EmplType).append("\n");
    sb.append("  EffectiveStatus: ").append(EffectiveStatus).append("\n");
    sb.append("  BusinessTitle: ").append(BusinessTitle).append("\n");
    sb.append("  HomeDept: ").append(HomeDept).append("\n");
    sb.append("  Department: ").append(Department).append("\n");
    sb.append("  Phone: ").append(Phone).append("\n");
    sb.append("  Job: ").append(Job).append("\n");
    sb.append("  pOI: ").append(pOI).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

