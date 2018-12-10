/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocks.imsofa.jpasample2;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lendle
 */
@Entity
@Table(name = "Bars")
public class Bar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "addr")
    private String addr;
    @Column(name = "license")
    private String license;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bar")
    private List<Employee> employeeList;

    public Bar() {
    }

    public Bar(String name) {
        this.name = name;
    }

    public Bar(String name, String addr, String license) {
        this.name = name;
        this.addr = addr;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bar)) {
            return false;
        }
        Bar other = (Bar) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rocks.imsofa.jpasample2.Bars[ name=" + name + " ]";
    }
    
}
