package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TESTE
* @generated
*/
@Entity
@IdClass(TestePK.class)
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Teste")
public class Teste implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Id
    @Column(name = "doublelegal", nullable = true, insertable=true, updatable=true)
        private java.math.BigDecimal doublelegal;

    /**
    * @generated
    */
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateFo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dateFo;

    /**
    * @generated
    */
    @Column(name = "numerox", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numerox;

    /**
    * @generated
    */
    @Column(name = "verdOrFal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean verdOrFal;

    /**
    * Construtor
    * @generated
    */
    public Teste(){
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
    public Teste setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    
    public java.lang.String getName(){
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Teste setName(java.lang.String name){
        this.name = name;
        return this;
    }
    /**
    * Obtém dateFo
    * return dateFo
    * @generated
    */
    
    public java.util.Date getDateFo(){
        return this.dateFo;
    }

    /**
    * Define dateFo
    * @param dateFo dateFo
    * @generated
    */
    public Teste setDateFo(java.util.Date dateFo){
        this.dateFo = dateFo;
        return this;
    }
    /**
    * Obtém numerox
    * return numerox
    * @generated
    */
    
    public java.lang.Integer getNumerox(){
        return this.numerox;
    }

    /**
    * Define numerox
    * @param numerox numerox
    * @generated
    */
    public Teste setNumerox(java.lang.Integer numerox){
        this.numerox = numerox;
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
    public Teste setDoublelegal(java.math.BigDecimal doublelegal){
        this.doublelegal = doublelegal;
        return this;
    }
    /**
    * Obtém verdOrFal
    * return verdOrFal
    * @generated
    */
    
    public java.lang.Boolean getVerdOrFal(){
        return this.verdOrFal;
    }

    /**
    * Define verdOrFal
    * @param verdOrFal verdOrFal
    * @generated
    */
    public Teste setVerdOrFal(java.lang.Boolean verdOrFal){
        this.verdOrFal = verdOrFal;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Teste object = (Teste)obj;
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