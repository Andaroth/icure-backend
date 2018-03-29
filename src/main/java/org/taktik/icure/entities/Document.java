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

package org.taktik.icure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.taktik.icure.entities.base.StoredICureDocument;
import org.taktik.icure.entities.embed.Delegation;
import org.taktik.icure.entities.embed.DocumentStatus;
import org.taktik.icure.entities.embed.DocumentType;

import java.io.Serializable;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Document extends StoredICureDocument implements Serializable {
	protected String attachmentId;

    @JsonIgnore
    protected byte[] attachment;
    @JsonIgnore
    private boolean attachmentDirty;

    protected DocumentType documentType;
	protected DocumentStatus documentStatus;

    protected String externalUri;

	protected String mainUti;
	protected String name;
    protected Set<String> otherUtis = new HashSet<>();

    //The ICureDocument (Form, Contact, ...) that has been used to generate the document
    protected String storedICureDocumentId;

	public Document solveConflictWith(Document other) {
		super.solveConflictsWith(other);
		this.otherUtis.addAll(other.otherUtis);

		return this;
	}

	public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    @JsonIgnore
    public boolean isAttachmentDirty() {
        return attachmentDirty;
    }

    @JsonIgnore
    public void setAttachmentDirty(boolean attachmentDirty) {
        this.attachmentDirty = attachmentDirty;
    }

    @JsonIgnore
    public byte[] getAttachment() {
        return attachment;
    }

    @JsonIgnore
    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainUti() {
        return mainUti;
    }

    public void setMainUti(String mainUti) {
        this.mainUti = mainUti;
    }

    public Set<String> getOtherUtis() {
        return otherUtis;
    }

    public void setOtherUtis(Set<String> otherUtis) {
        this.otherUtis = otherUtis;
    }

    public String getStoredICureDocumentId() {
        return storedICureDocumentId;
    }

    public void setStoredICureDocumentId(String storedICureDocumentId) {
        this.storedICureDocumentId = storedICureDocumentId;
    }

    public String getExternalUri() {
        return externalUri;
    }

    public void setExternalUri(String externalUri) {
        this.externalUri = externalUri;
    }

	public DocumentStatus getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(DocumentStatus documentStatus) {
		this.documentStatus = documentStatus;
	}

	private String encryptedSelf;
	@Override
	public String getEncryptedSelf() {
		return encryptedSelf;
	}

	@Override
	public void setEncryptedSelf(String encryptedSelf) {
		this.encryptedSelf = encryptedSelf;
	}
}