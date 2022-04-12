package com.tectoro.enterprise.hr.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tectoro.enterprise.hr.vo.AttributeError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is base class for all API Responses.
 */
public abstract class BaseAPIResponse {

    /**
     * attribute to capture errors if any while generating the response
     */
    @JsonProperty("errors")
    private List<AttributeError> attributeErrors = new ArrayList<AttributeError>();

    /**
     * This method is used to add attributeErrors to the list
     * @param attributeId
     * @param errorCode
     * @param errorDescription
     */
    public void addAttributeError(String attributeId, String errorCode, String errorDescription){
        AttributeError ae = new AttributeError();
        ae.setAttributeId(attributeId);
        ae.setErrorCode(errorCode);
        ae.setErrorDescription(errorDescription);
        this.attributeErrors.add(ae);
    }

    /**
     * This method is used to add attributeError to the list
     * @param ae
     */
    public void addAttributeError(AttributeError ae){
        if(ae != null)
            this.attributeErrors.add(ae);
    }

    /**
     * This method return immutable list of attribute errors
     * @return
     */
    @JsonIgnore
    public List<AttributeError> getAttributeValidationErrors(){
        return Collections.unmodifiableList(this.attributeErrors);
    }

}
