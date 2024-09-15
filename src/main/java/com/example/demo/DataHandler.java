package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "ANG_BASIC_TABLE")
public class DataHandler {

    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Ensure to define the primary key
    
    @Column(name = "Names")
    private String names;

    @Column(name = "ElementType")
    private String elementType;

    @Column(name = "DefaultVal")
    private String defaultVal;

    @Column(name = "AddInfo")
    private String addInfo;

    public DataHandler() {
    }

    public DataHandler(String names, String elementType, String defaultVal, String addInfo) {
        this.names = names;
        this.elementType = elementType;
        this.defaultVal = defaultVal;
        this.addInfo = addInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getDefaultVal() {
        return defaultVal;
    }

    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }
}
