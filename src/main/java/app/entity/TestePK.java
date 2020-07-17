package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class TestePK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.math.BigDecimal doublelegal;

  /**
   * Construtor
   * @generated
   */
  public TestePK(){
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public TestePK setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém doublelegal
   * return doublelegal
   * @generated
   */
  public java.math.BigDecimal getDoublelegal(){
    return this.doublelegal;
  }

  /**
   * Define doublelegal
   * @param doublelegal doublelegal
   * @generated
   */
  public TestePK setDoublelegal(java.math.BigDecimal doublelegal){
    this.doublelegal = doublelegal;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
TestePK object = (TestePK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (doublelegal != null ? !doublelegal.equals(object.doublelegal) : object.doublelegal != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((doublelegal == null) ? 0 : doublelegal.hashCode());
    return result;
  }

}
