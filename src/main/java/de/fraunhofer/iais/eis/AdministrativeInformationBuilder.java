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

public class AdministrativeInformationBuilder {

	private AdministrativeInformationImpl administrativeInformationImpl;

	public AdministrativeInformationBuilder() {
		administrativeInformationImpl = new AdministrativeInformationImpl();
	}

	public AdministrativeInformationBuilder(URI id) {
		this();
		administrativeInformationImpl.id = id;
	}

	/**
	* This function allows setting a value for administrativeInformationVersion
	* @param _administrativeInformationVersion_ desired value to be set
	* @return Builder object with new value for administrativeInformationVersion
	*/
	final public AdministrativeInformationBuilder _administrativeInformationVersion_(String _administrativeInformationVersion_) {
		this.administrativeInformationImpl._administrativeInformationVersion = _administrativeInformationVersion_;
		return this;
	}


	/**
	* This function allows setting a value for administrativeInformationRevision
	* @param _administrativeInformationRevision_ desired value to be set
	* @return Builder object with new value for administrativeInformationRevision
	*/
	final public AdministrativeInformationBuilder _administrativeInformationRevision_(String _administrativeInformationRevision_) {
		this.administrativeInformationImpl._administrativeInformationRevision = _administrativeInformationRevision_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public AdministrativeInformationBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.administrativeInformationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IAdministrativeInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(administrativeInformationImpl);
		return administrativeInformationImpl;
	}
}
