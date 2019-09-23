package com.tnt.offer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offerrejectreason")
public class OfferRejectReason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "title")
    private String title; // VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "description")
    private String description; // VARCHAR(1024) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "ownerid")
    private Integer ownerId; // INT(11) NULL DEFAULT NULL,
    @Column(name = "departmentid")
    private Integer departmentId; // INT(10) UNSIGNED NULL DEFAULT NULL,
    @Column(name = "insertdate")
    private Date insertDate; // DATETIME NULL DEFAULT NULL,
    @Column(name = "updatedate")
    private Date updateDate; // DATETIME NULL DEFAULT NULL,
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }
    /**
     * @param ownerId the ownerId to set
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
    /**
     * @return the departmentId
     */
    public Integer getDepartmentId() {
        return departmentId;
    }
    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    /**
     * @return the insertDate
     */
    public Date getInsertDate() {
        return insertDate;
    }
    /**
     * @param insertDate the insertDate to set
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "OfferRejectReason [id=" + id + ", title=" + title + ", description=" + description + ", ownerId="
                + ownerId + ", departmentId=" + departmentId + ", insertDate=" + insertDate + ", updateDate="
                + updateDate + "]";
    }
    
    
}
