package com.tnt.offer.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offercost")
public class OfferCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "offerid")
    private Integer offerId; // INT(11) NOT NULL,
    @Column(name = "name")
    private String name; // VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "cost")
    private BigDecimal cost; // DECIMAL(10,2) NOT NULL,
    @Column(name = "billable", columnDefinition = "TINYINT", length = 1)
    private boolean billable; // TINYINT(1) NOT NULL DEFAULT '1',
    @Column(name = "iva")
    private BigDecimal iva; // DECIMAL(4,2) NOT NULL DEFAULT '16.00',
    @Column(name = "ownerid")
    private Integer ownerId; // INT(11) NULL DEFAULT NULL,
    @Column(name = "departmentid")
    private Integer departmentId; // INT(10) UNSIGNED NULL DEFAULT NULL,
    @Column(name = "insertdate")
    private Date insertDate; // DATETIME NULL DEFAULT NULL,
    @Column(name = "updatedate")
    private Date updateDate; // DATETIME NULL DEFAULT NULL,
    @Column(name = "units")
    private BigDecimal units; // DECIMAL(10,2) NOT NULL DEFAULT '0.00',
    @Column(name = "place")
    private Integer place; // INT(11) NULL DEFAULT NULL,

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
     * @return the offerId
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * @param offerId the offerId to set
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * @return the billable
     */
    public boolean isBillable() {
        return billable;
    }

    /**
     * @param billable the billable to set
     */
    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    /**
     * @return the iva
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(BigDecimal iva) {
        this.iva = iva;
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
     * @return the units
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(BigDecimal units) {
        this.units = units;
    }

    /**
     * @return the place
     */
    public Integer getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(Integer place) {
        this.place = place;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "OfferCost [id=" + id + ", offerId=" + offerId + ", name=" + name + ", cost=" + cost + ", billable="
                + billable + ", iva=" + iva + ", ownerId=" + ownerId + ", departmentId=" + departmentId
                + ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", units=" + units + ", place=" + place
                + "]";
    }

}
