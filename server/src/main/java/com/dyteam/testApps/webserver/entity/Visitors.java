package com.dyteam.testApps.webserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "visitors")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(Include.NON_NULL)
public class Visitors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @NotNull
    private String gender;

    @Column(name = "mobile")
    @NotNull
    private String mobile;

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "aadhar")
    @NotNull
    private String aadhar;

    @Column(name = "voterId")
    @NotNull
    private String voterId;

    @Column(name = "purpose")
    @NotNull
    private String purpose;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "assemblyConstituency")
    @NotNull
    private String assemblyConstituency;

    @Column(name = "ward")
    @NotNull
    private String ward;

    @Column(name = "booth")
    @NotNull
    private String booth;

    @Column(name = "locality")
    @NotNull
    private String locality;

    @Column(name = "sublocality")
    @NotNull
    private String sublocality;

    public Visitors() {
    }

    public Visitors(Long id, String name, @NotNull String gender, @NotNull String mobile, @NotNull String address,
            @NotNull String aadhar, @NotNull String voterId, @NotNull String purpose, @NotNull String title,
            @NotNull String description, @NotNull String assemblyConstituency, @NotNull String ward,
            @NotNull String booth, @NotNull String locality, @NotNull String sublocality) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.aadhar = aadhar;
        this.voterId = voterId;
        this.purpose = purpose;
        this.title = title;
        this.description = description;
        this.assemblyConstituency = assemblyConstituency;
        this.ward = ward;
        this.booth = booth;
        this.locality = locality;
        this.sublocality = sublocality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssemblyConstituency() {
        return assemblyConstituency;
    }

    public void setAssemblyConstituency(String assemblyConstituency) {
        this.assemblyConstituency = assemblyConstituency;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getBooth() {
        return booth;
    }

    public void setBooth(String booth) {
        this.booth = booth;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSublocality() {
        return sublocality;
    }

    public void setSublocality(String sublocality) {
        this.sublocality = sublocality;
    }

}
