package edu.berkeley.model;

import java.util.Date;
import java.util.*;
import edu.berkeley.model.Name;
import edu.berkeley.model.Department;
import edu.berkeley.model.Job;
import edu.berkeley.model.Email;
import edu.berkeley.model.Phone;
import edu.berkeley.model.Address;
import edu.berkeley.model.Identifier;
import edu.berkeley.model.POI;
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

