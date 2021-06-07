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
@Table(name = "tickets")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(Include.NON_NULL)
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId")
    @NotNull
    private String userId;

    @Column(name = "constituency")
    @NotNull
    private String constituency;

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

    @Column(name = "purpose")
    @NotNull
    private String purpose;

    @Column(name = "issueTitle")
    @NotNull
    private String issueTitle;

    @Column(name = "issueDescription")
    @NotNull
    private String issueDescription;

    @Column(name = "status")
    @NotNull
    private String status;

    public Tickets() {
    }

    public Tickets(Long id, @NotNull String userId, @NotNull String constituency, @NotNull String ward,
            @NotNull String booth, @NotNull String locality, @NotNull String sublocality, @NotNull String purpose,
            @NotNull String issueTitle, @NotNull String issueDescription, @NotNull String status) {
        this.id = id;
        this.userId = userId;
        this.constituency = constituency;
        this.ward = ward;
        this.booth = booth;
        this.locality = locality;
        this.sublocality = sublocality;
        this.purpose = purpose;
        this.issueTitle = issueTitle;
        this.issueDescription = issueDescription;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
