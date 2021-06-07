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
@Table(name = "voter_list")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(Include.NON_NULL)
public class Voters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    @NotNull
    private String lastName;

    @Column(name = "assemblyConstituencyNumber")
    @NotNull
    private String assemblyConstituencyNumber;

    @Column(name = "assemblyConstituencyName")
    @NotNull
    private String assemblyConstituencyName;

    @Column(name = "boothNumber")
    @NotNull
    private String boothNumber;

    @Column(name = "sectionNumber")
    @NotNull
    private String sectionNumber;

    @Column(name = "serialNumber")
    @NotNull
    private String serialNumber;

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "relationType")
    @NotNull
    private String relationType;

    @Column(name = "relativeFirstName")
    @NotNull
    private String relativeFirstName;

    @Column(name = "relativeLastName")
    @NotNull
    private String relativeLastName;

    @Column(name = "gender")
    @NotNull
    private String gender;

    @Column(name = "age")
    @NotNull
    private String age;

    @Column(name = "mobileNumber")
    @NotNull
    private String mobileNumber;

    @Column(name = "sectionName")
    @NotNull
    private String sectionName;

    @Column(name = "boothName")
    @NotNull
    private String boothName;

    @Column(name = "pollingCentre")
    @NotNull
    private String pollingCentre;

    @Column(name = "pollingStationBuildingName")
    @NotNull
    private String pollingStationBuildingName;

    @Column(name = "districtName")
    @NotNull
    private String districtName;

    @Column(name = "pinCode")
    @NotNull
    private String pinCode;

    @Column(name = "dateOfBirth")
    @NotNull
    private String dateOfBirth;

    @Column(name = "localityName")
    @NotNull
    private String localityName;

    @Column(name = "localityDetails")
    @NotNull
    private String localityDetails;

    @Column(name = "voterId")
    @NotNull
    private String voterId;

    public Voters() {
    }

    public Voters(Long id, String firstName, @NotNull String lastName, @NotNull String assemblyConstituencyNumber,
            @NotNull String assemblyConstituencyName, @NotNull String boothNumber, @NotNull String sectionNumber,
            @NotNull String serialNumber, @NotNull String address, @NotNull String relationType,
            @NotNull String relativeFirstName, @NotNull String relativeLastName, @NotNull String gender,
            @NotNull String age, @NotNull String mobileNumber, @NotNull String sectionName, @NotNull String boothName,
            @NotNull String pollingCentre, @NotNull String pollingStationBuildingName, @NotNull String districtName,
            @NotNull String pinCode, @NotNull String dateOfBirth, @NotNull String localityName,
            @NotNull String localityDetails, @NotNull String voterId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.assemblyConstituencyNumber = assemblyConstituencyNumber;
        this.assemblyConstituencyName = assemblyConstituencyName;
        this.boothNumber = boothNumber;
        this.sectionNumber = sectionNumber;
        this.serialNumber = serialNumber;
        this.address = address;
        this.relationType = relationType;
        this.relativeFirstName = relativeFirstName;
        this.relativeLastName = relativeLastName;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.sectionName = sectionName;
        this.boothName = boothName;
        this.pollingCentre = pollingCentre;
        this.pollingStationBuildingName = pollingStationBuildingName;
        this.districtName = districtName;
        this.pinCode = pinCode;
        this.dateOfBirth = dateOfBirth;
        this.localityName = localityName;
        this.localityDetails = localityDetails;
        this.voterId = voterId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAssemblyConstituencyNumber() {
        return assemblyConstituencyNumber;
    }

    public void setAssemblyConstituencyNumber(String assemblyConstituencyNumber) {
        this.assemblyConstituencyNumber = assemblyConstituencyNumber;
    }

    public String getAssemblyConstituencyName() {
        return assemblyConstituencyName;
    }

    public void setAssemblyConstituencyName(String assemblyConstituencyName) {
        this.assemblyConstituencyName = assemblyConstituencyName;
    }

    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getRelativeFirstName() {
        return relativeFirstName;
    }

    public void setRelativeFirstName(String relativeFirstName) {
        this.relativeFirstName = relativeFirstName;
    }

    public String getRelativeLastName() {
        return relativeLastName;
    }

    public void setRelativeLastName(String relativeLastName) {
        this.relativeLastName = relativeLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getBoothName() {
        return boothName;
    }

    public void setBoothName(String boothName) {
        this.boothName = boothName;
    }

    public String getPollingCentre() {
        return pollingCentre;
    }

    public void setPollingCentre(String pollingCentre) {
        this.pollingCentre = pollingCentre;
    }

    public String getPollingStationBuildingName() {
        return pollingStationBuildingName;
    }

    public void setPollingStationBuildingName(String pollingStationBuildingName) {
        this.pollingStationBuildingName = pollingStationBuildingName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getLocalityDetails() {
        return localityDetails;
    }

    public void setLocalityDetails(String localityDetails) {
        this.localityDetails = localityDetails;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

}
