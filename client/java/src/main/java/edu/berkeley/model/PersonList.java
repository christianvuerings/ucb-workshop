package edu.berkeley.model;

import java.util.*;
import edu.berkeley.model.Person;
public class PersonList {
  private List<Person> Person = new ArrayList<Person>();
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

