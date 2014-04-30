package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class Person {
  @JsonProperty("Address")
  private List<Address> Address = new ArrayList<Address>();
  @JsonProperty("Name")
  private List<Name> Name = new ArrayList<Name>();
  @JsonProperty("Identifier")
  private Identifier Identifier = null;
  @JsonProperty("Email")
  private List<Email> Email = new ArrayList<Email>();
  @JsonProperty("EffectiveDate")
  private Date EffectiveDate = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("EmplType")
  private String EmplType = null;
  @JsonProperty("EffectiveStatus")
  private String EffectiveStatus = null;
  @JsonProperty("BusinessTitle")
  private String BusinessTitle = null;
  @JsonProperty("HomeDept")
  private String HomeDept = null;
  @JsonProperty("Department")
  private List<Department> Department = new ArrayList<Department>();
  @JsonProperty("Phone")
  private List<Phone> Phone = new ArrayList<Phone>();
  @JsonProperty("Job")
  private List<Job> Job = new ArrayList<Job>();
  @JsonProperty("pOI")
  private POI pOI = null;
  public List<Address> getAddress() {
    return Address;
  }
  public void setAddress(List<Address> Address) {
    this.Address = Address;
  }

  public List<Name> getName() {
    return Name;
  }
  public void setName(List<Name> Name) {
    this.Name = Name;
  }

  public Identifier getIdentifier() {
    return Identifier;
  }
  public void setIdentifier(Identifier Identifier) {
    this.Identifier = Identifier;
  }

  public List<Email> getEmail() {
    return Email;
  }
  public void setEmail(List<Email> Email) {
    this.Email = Email;
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

  public String getEmplType() {
    return EmplType;
  }
  public void setEmplType(String EmplType) {
    this.EmplType = EmplType;
  }

  public String getEffectiveStatus() {
    return EffectiveStatus;
  }
  public void setEffectiveStatus(String EffectiveStatus) {
    this.EffectiveStatus = EffectiveStatus;
  }

  public String getBusinessTitle() {
    return BusinessTitle;
  }
  public void setBusinessTitle(String BusinessTitle) {
    this.BusinessTitle = BusinessTitle;
  }

  public String getHomeDept() {
    return HomeDept;
  }
  public void setHomeDept(String HomeDept) {
    this.HomeDept = HomeDept;
  }

  public List<Department> getDepartment() {
    return Department;
  }
  public void setDepartment(List<Department> Department) {
    this.Department = Department;
  }

  public List<Phone> getPhone() {
    return Phone;
  }
  public void setPhone(List<Phone> Phone) {
    this.Phone = Phone;
  }

  public List<Job> getJob() {
    return Job;
  }
  public void setJob(List<Job> Job) {
    this.Job = Job;
  }

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

