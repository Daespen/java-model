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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "Entity Type"
* "Enumeration for denoting whether an entity is a self-managed entity or a co-managed entity."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:EntityType")
public enum EntityType {

	/** 
	* "Co-managed Entity"
	* "For co-managed entities there is no separate AAS. Co-managed entities need to be part of a self-managed entity."@en
	*/
	CO_MANAGED_ENTITY("https://admin-shell.io/aas/3/0/RC01/EntityType/CO_MANAGED_ENTITY", Arrays.asList(new TypedLiteral("Co-managed Entity", "")), Arrays.asList(new TypedLiteral("For co-managed entities there is no separate AAS. Co-managed entities need to be part of a self-managed entity.", "en"))),

	/** 
	* "Self-managed Entity"
	* "Self-Managed Entities have their own AAS but can be part of the bill of material of a composite self-managed entity. The asset of an I4.0 Component is a self-managed entity per definition."@en
	*/
	SELF_MANAGED_ENTITY("https://admin-shell.io/aas/3/0/RC01/EntityType/SELF_MANAGED_ENTITY", Arrays.asList(new TypedLiteral("Self-managed Entity", "")), Arrays.asList(new TypedLiteral("Self-Managed Entities have their own AAS but can be part of the bill of material of a composite self-managed entity. The asset of an I4.0 Component is a self-managed entity per definition.", "en")));

	private static final Map<String,EntityType> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	EntityType(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}
	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	@JsonIgnore
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	@JsonIgnore
	final public List<TypedLiteral> getComment() {
		return comment;
	}


	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@Override
	public String toString() {
		return id.toString();
	}

}
