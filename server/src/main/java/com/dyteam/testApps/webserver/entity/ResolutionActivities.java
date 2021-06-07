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
@Table(name = "resolution_activities")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(Include.NON_NULL)
public class ResolutionActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tokenId")
    @NotNull
    private String tokenId;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "isFollowUp")
    @NotNull
    private String isFollowUp;

    public ResolutionActivities() {
    }

    public ResolutionActivities(Long id, @NotNull String tokenId, @NotNull String description,
            @NotNull String isFollowUp) {
        this.id = id;
        this.tokenId = tokenId;
        this.description = description;
        this.isFollowUp = isFollowUp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsFollowUp() {
        return isFollowUp;
    }

    public void setIsFollowUp(String isFollowUp) {
        this.isFollowUp = isFollowUp;
    }

}
