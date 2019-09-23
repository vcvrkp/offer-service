package com.tnt.offer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "title")
    private String title; // VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "description")
    private String description; // VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "userid")
    private Integer userId; // INT(11) NOT NULL,
    @Column(name = "organizationid")
    private Integer organizationId; // INT(11) NOT NULL,
    @Column(name = "contactid")
    private Integer contactId; // INT(11) NOT NULL,
    @Column(name = "creationdate")
    private Date creationDate; // DATE NOT NULL,
    @Column(name = "validitydate")
    private Date validityDate; // DATE NULL DEFAULT NULL,
    @Column(name = "maturitydate")
    private Date maturityDate; // DATE NULL DEFAULT NULL,
    @Column(name = "offerpotential")
    private String offerPotential; // VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "offerstate")
    private String offerState; // VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "offerrejectreasonid")
    private Integer offerRejectReasonId; // INT(11) NULL DEFAULT NULL,
    @Column(name = "ownerid")
    private Integer ownerId; // INT(11) NULL DEFAULT NULL,
    @Column(name = "departmentid")
    private Integer departmentId; // INT(10) UNSIGNED NULL DEFAULT NULL,
    @Column(name = "insertdate")
    private Date insertDate; // DATETIME NULL DEFAULT NULL,
    @Column(name = "updatedate")
    private Date updateDate; // DATETIME NULL DEFAULT NULL,
    @Column(name = "number")
    private String number; // VARCHAR(64) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "observations")
    private String observations; // VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "showivaintoreport" , columnDefinition = "TINYINT", length = 1)
    private boolean showIvaIntoReport; // TINYINT(1) NULL DEFAULT '1',
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
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    /**
     * @return the organizationId
     */
    public Integer getOrganizationId() {
        return organizationId;
    }
    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
    /**
     * @return the contactId
     */
    public Integer getContactId() {
        return contactId;
    }
    /**
     * @param contactId the contactId to set
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }
    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    /**
     * @return the validityDate
     */
    public Date getValidityDate() {
        return validityDate;
    }
    /**
     * @param validityDate the validityDate to set
     */
    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }
    /**
     * @return the maturityDate
     */
    public Date getMaturityDate() {
        return maturityDate;
    }
    /**
     * @param maturityDate the maturityDate to set
     */
    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }
    /**
     * @return the offerPotential
     */
    public String getOfferPotential() {
        return offerPotential;
    }
    /**
     * @param offerPotential the offerPotential to set
     */
    public void setOfferPotential(String offerPotential) {
        this.offerPotential = offerPotential;
    }
    /**
     * @return the offerState
     */
    public String getOfferState() {
        return offerState;
    }
    /**
     * @param offerState the offerState to set
     */
    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }
    /**
     * @return the offerRejectReasonId
     */
    public Integer getOfferRejectReasonId() {
        return offerRejectReasonId;
    }
    /**
     * @param offerRejectReasonId the offerRejectReasonId to set
     */
    public void setOfferRejectReasonId(Integer offerRejectReasonId) {
        this.offerRejectReasonId = offerRejectReasonId;
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
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * @return the observations
     */
    public String getObservations() {
        return observations;
    }
    /**
     * @param observations the observations to set
     */
    public void setObservations(String observations) {
        this.observations = observations;
    }
    /**
     * @return the showIvaIntoReport
     */
    public boolean isShowIvaIntoReport() {
        return showIvaIntoReport;
    }
    /**
     * @param showIvaIntoReport the showIvaIntoReport to set
     */
    public void setShowIvaIntoReport(boolean showIvaIntoReport) {
        this.showIvaIntoReport = showIvaIntoReport;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Offer [id=" + id + ", title=" + title + ", description=" + description + ", userId=" + userId
                + ", organizationId=" + organizationId + ", contactId=" + contactId + ", creationDate=" + creationDate
                + ", validityDate=" + validityDate + ", maturityDate=" + maturityDate + ", offerPotential="
                + offerPotential + ", offerState=" + offerState + ", offerRejectReasonId=" + offerRejectReasonId
                + ", ownerId=" + ownerId + ", departmentId=" + departmentId + ", insertDate=" + insertDate
                + ", updateDate=" + updateDate + ", number=" + number + ", observations=" + observations
                + ", showIvaIntoReport=" + showIvaIntoReport + "]";
    }

    
}
