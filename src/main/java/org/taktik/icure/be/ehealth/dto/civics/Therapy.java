/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.taktik.icure.be.ehealth.dto.civics;

import java.util.Date;

import org.taktik.icure.be.ehealth.dto.civics.*;

public class Therapy {

	org.taktik.icure.be.ehealth.dto.civics.Atm atm;

	String chapterName;
	String paragraphName;
	Date startDate;
	Date createdTms;
	String createdUserId;
	Date endDate;
	String maskedInd;
	String reimbCriteriaCv;
	String reimbCategoryCv;
	String modificationStatus;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public ReimbursementCategory getReimbCategory() {;
         return ReimbursementCategory.findByReimbCategoryCv(reimbCategoryCv);
     };

     public ReimbursementCriteria getReimbCriteria() {;
         return ReimbursementCriteria.findByReimbCriteriaCv(reimbCriteriaCv);
     };*/

    public org.taktik.icure.be.ehealth.dto.civics.Atm getAtm() {
        return atm;
    }

    public void setAtm(org.taktik.icure.be.ehealth.dto.civics.Atm atm) {
        this.atm = atm;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getParagraphName() {
        return paragraphName;
    }

    public void setParagraphName(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCreatedTms() {
        return createdTms;
    }

    public void setCreatedTms(Date createdTms) {
        this.createdTms = createdTms;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMaskedInd() {
        return maskedInd;
    }

    public void setMaskedInd(String maskedInd) {
        this.maskedInd = maskedInd;
    }

    public String getReimbCriteriaCv() {
        return reimbCriteriaCv;
    }

    public void setReimbCriteriaCv(String reimbCriteriaCv) {
        this.reimbCriteriaCv = reimbCriteriaCv;
    }

    public String getReimbCategoryCv() {
        return reimbCategoryCv;
    }

    public void setReimbCategoryCv(String reimbCategoryCv) {
        this.reimbCategoryCv = reimbCategoryCv;
    }

    public String getModificationStatus() {
        return modificationStatus;
    }

    public void setModificationStatus(String modificationStatus) {
        this.modificationStatus = modificationStatus;
    }
}
