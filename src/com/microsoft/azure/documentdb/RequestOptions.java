/* 
 * Copyright (c) Microsoft Corporation.  All rights reserved.
 */

package com.microsoft.azure.documentdb;

import java.util.List;

/**
 * Encapsulates options that can be specified for a request issued to the Azure
 * DocumentDB service.
 */
public final class RequestOptions {

    private List<String> preTriggerInclude;

    /**
     * Gets the triggers to be invoked before the operation.
     * 
     * @return the triggers to be invoked before the operation.
     */
    public List<String> getPreTriggerInclude() {
        return this.preTriggerInclude;
    }

    /**
     * Sets the triggers to be invoked before the operation.
     * 
     * @param preTriggerInclude the triggers to be invoked before the operation.
     */
    public void setPreTriggerInclude(List<String> preTriggerInclude) {
        this.preTriggerInclude = preTriggerInclude;
    }

    private List<String> postTriggerInclude;

    /**
     * Gets the triggers to be invoked after the operation.
     * 
     * @return the triggers to be invoked after the operation.
     */
    public List<String> getPostTriggerInclude() {
        return this.postTriggerInclude;
    }

    /**
     * Sets the triggers to be invoked after the operation.
     * 
     * @param postTriggerInclude the triggers to be invoked after the operation.
     */
    public void setPostTriggerInclude(List<String> postTriggerInclude) {
        this.postTriggerInclude = postTriggerInclude;
    }

    private AccessCondition accessCondition;

    /**
     * Gets the conditions associated with the request.
     * 
     * @return the access condition.
     */
    public AccessCondition getAccessCondition() {
        return this.accessCondition;
    }

    /**
     * Sets the conditions associated with the request.
     * 
     * @param accessCondition the access condition.
     */
    public void setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
    }

    private IndexingDirective indexingDirective;

    /**
     * Gets the indexing directive (index, do not index etc).
     * 
     * @return the indexing directive.
     */
    public IndexingDirective getIndexingDirective() {
        return this.indexingDirective;
    }

    /**
     * Sets the indexing directive (index, do not index etc).
     * 
     * @param indexingDirective the indexing directive.
     */
    public void setIndexingDirective(IndexingDirective indexingDirective) {
        this.indexingDirective = indexingDirective;
    }

    private ConsistencyLevel consistencyLevel;

    /**
     * Gets the consistency level required for the request.
     * 
     * @return the consistency level.
     */
    public ConsistencyLevel getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * Sets the consistency level required for the request.
     * 
     * @param consistencyLevel the consistency level.
     */
    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    private String sessionToken;

    /**
     * Gets the token for use with session consistency.
     * 
     * @return the session token.
     */
    public String getSessionToken() {
        return this.sessionToken;
    }
    
    /**
     * Sets the token for use with session consistency.
     * 
     * @param sessionToken the session token.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    private Integer resourceTokenExpirySeconds;

    /**
     * Gets the expiry time for resource token. Used when creating, updating, reading permission.
     * 
     * @return the resource token expiry seconds.
     */
    public Integer getResourceTokenExpirySeconds() {
        return this.resourceTokenExpirySeconds;
    }

    /**
     * Sets the expiry time for resource token. Used when creating, updating, reading permission.
     * 
     * @param resourceTokenExpirySeconds the resource token expiry seconds.
     */
    public void setResourceTokenExpirySeconds(Integer resourceTokenExpirySeconds) {
        this.resourceTokenExpirySeconds = resourceTokenExpirySeconds;
    }

    private String offerType;

    /**
     * Gets the offer type when creating a document collection.
     * 
     * @return the offer type.
     */
    public String getOfferType() {
        return this.offerType;
    }

    /**
     * Sets the offer type when creating a document collection.
     * 
     * @param offerType the offer type.
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }
}
