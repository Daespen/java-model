package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

/** 
* "Access ControlPolicy Points"
* "Container for access control policy points."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControlPolicyPoints")
public class AccessControlPolicyPointsImpl implements Serializable, IAccessControlPolicyPoints {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access ControlPolicy Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Container for access control policy points.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has policy administration point"
	* "The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint", "accessControlPolicyPointsPolicyAdministrationPoint"})
	protected IPolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint;


	/**
	* "has policy decision point"
	* "The access control policy decision point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint", "accessControlPolicyPointsPolicyDecisionPoint"})
	protected IPolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint;


	/**
	* "has policy enforcement point"
	* "The access control policy enforcement point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint", "accessControlPolicyPointsPolicyEnforcementPoint"})
	protected IPolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint;


	/**
	* "has policy information points"
	* "The access control policy information points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints", "accessControlPolicyPointsPolicyInformationPoints"})
	protected IPolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints;


	// no manual construction
	protected AccessControlPolicyPointsImpl() {
		id = VocabUtil.getInstance().createRandomUrl("accessControlPolicyPoints");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "The access control administration policy point of the AAS."@en
	* @return Returns the IPolicyAdministrationPoint for the property accessControlPolicyPointsPolicyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	final public IPolicyAdministrationPoint getAccessControlPolicyPointsPolicyAdministrationPoint() {
		return _accessControlPolicyPointsPolicyAdministrationPoint;
	}

	final public void setAccessControlPolicyPointsPolicyAdministrationPoint (IPolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint_) {
		this._accessControlPolicyPointsPolicyAdministrationPoint = _accessControlPolicyPointsPolicyAdministrationPoint_;
	}

	/**
	* "The access control policy decision point of the AAS."@en
	* @return Returns the IPolicyDecisionPoint for the property accessControlPolicyPointsPolicyDecisionPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	final public IPolicyDecisionPoint getAccessControlPolicyPointsPolicyDecisionPoint() {
		return _accessControlPolicyPointsPolicyDecisionPoint;
	}

	final public void setAccessControlPolicyPointsPolicyDecisionPoint (IPolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint_) {
		this._accessControlPolicyPointsPolicyDecisionPoint = _accessControlPolicyPointsPolicyDecisionPoint_;
	}

	/**
	* "The access control policy enforcement point of the AAS."@en
	* @return Returns the IPolicyEnforcementPoints for the property accessControlPolicyPointsPolicyEnforcementPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	final public IPolicyEnforcementPoints getAccessControlPolicyPointsPolicyEnforcementPoint() {
		return _accessControlPolicyPointsPolicyEnforcementPoint;
	}

	final public void setAccessControlPolicyPointsPolicyEnforcementPoint (IPolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint_) {
		this._accessControlPolicyPointsPolicyEnforcementPoint = _accessControlPolicyPointsPolicyEnforcementPoint_;
	}

	/**
	* "The access control policy information points of the AAS."@en
	* @return Returns the IPolicyInformationPoints for the property accessControlPolicyPointsPolicyInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	final public IPolicyInformationPoints getAccessControlPolicyPointsPolicyInformationPoints() {
		return _accessControlPolicyPointsPolicyInformationPoints;
	}

	final public void setAccessControlPolicyPointsPolicyInformationPoints (IPolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints_) {
		this._accessControlPolicyPointsPolicyInformationPoints = _accessControlPolicyPointsPolicyInformationPoints_;
	}
}
