package com.wordnik.model;

import java.util.*;
import com.wordnik.model.Person;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class PersonList {
  private List<Person> Person = new ArrayList<Person>();
  @ApiModelProperty(value="", required=true)
  public List<Person> getPerson() {
    return Person;
  }
  public void setPerson(List<Person> Person) {
    this.Person = Person;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonList {\n");
    sb.append("  Person: ").append(Person).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

