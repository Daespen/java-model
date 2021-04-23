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

/**
* "Identifier"
* "Used to uniquely identify an entity by using an identifier."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultIdentifier.class)
})
public interface Identifier {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();

	/**
	* This function returns a hash code value for the Identifier for the benefit of e.g. hash tables.
	* @return a hash code value for the Identifier
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Identifier is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	* @return Returns the List of TypedLiterals for the property identifiers.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
	public List<TypedLiteral> getIdentifiers();

	/**
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	* @return Returns the IdentifierType for the property idType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
	public IdentifierType getIdType();

}
