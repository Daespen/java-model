package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class AccessControlPolicyPointsBuilder {

	private DefaultAccessControlPolicyPoints defaultAccessControlPolicyPoints;

	public AccessControlPolicyPointsBuilder() {
		defaultAccessControlPolicyPoints = new DefaultAccessControlPolicyPoints();
	}

	public AccessControlPolicyPointsBuilder(URI id) {
		this();
		defaultAccessControlPolicyPoints.id = id;
	}

	/**
	* This function allows setting a value for policyAdministrationPoint
	* @param policyAdministrationPoint desired value to be set
	* @return Builder object with new value for policyAdministrationPoint
	*/
	final public AccessControlPolicyPointsBuilder policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
		this.defaultAccessControlPolicyPoints.policyAdministrationPoint = policyAdministrationPoint;
		return this;
	}


	/**
	* This function allows setting a value for policyDecisionPoint
	* @param policyDecisionPoint desired value to be set
	* @return Builder object with new value for policyDecisionPoint
	*/
	final public AccessControlPolicyPointsBuilder policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
		this.defaultAccessControlPolicyPoints.policyDecisionPoint = policyDecisionPoint;
		return this;
	}


	/**
	* This function allows setting a value for policyEnforcementPoint
	* @param policyEnforcementPoint desired value to be set
	* @return Builder object with new value for policyEnforcementPoint
	*/
	final public AccessControlPolicyPointsBuilder policyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
		this.defaultAccessControlPolicyPoints.policyEnforcementPoint = policyEnforcementPoint;
		return this;
	}


	/**
	* This function allows setting a value for policyInformationPoints
	* @param policyInformationPoints desired value to be set
	* @return Builder object with new value for policyInformationPoints
	*/
	final public AccessControlPolicyPointsBuilder policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
		this.defaultAccessControlPolicyPoints.policyInformationPoints = policyInformationPoints;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AccessControlPolicyPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAccessControlPolicyPoints);
		return defaultAccessControlPolicyPoints;
	}
}
