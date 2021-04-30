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
* "Qualifier"
* "A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element."@en
* "Constraint AASd-063: The semanticId of a Qualifier shall only reference a ConceptDescription with the category QUALIFIER."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Qualifier")
public class DefaultQualifier implements Qualifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Qualifier", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	protected Reference semanticId;


	/**
	* "has qualifier type"
	* "The qualifier type describes the type of the qualifier that is applied to the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	protected String type;


	/**
	* "The qualifier value is the value of the qualifier."@en
	* "Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en
	* "Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	protected TypedLiteral value;


	/**
	* "Reference to the global unqiue id of a coded value."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	protected Reference valueId;


	// no manual construction
	protected DefaultQualifier() {
		id = VocabUtil.getInstance().createRandomUrl("qualifier");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.type,
			this.value,
			this.valueId,
			this.semanticId});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultQualifier other = (DefaultQualifier) obj;
			return Objects.equals(this.type, other.type) &&
				Objects.equals(this.value, other.value) &&
				Objects.equals(this.valueId, other.valueId) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	final public String getType() {
		return type;
	}
	
	final public void setType (String type) {
		this.type = type;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	final public TypedLiteral getValue() {
		return value;
	}
	
	final public void setValue (TypedLiteral value) {
		this.value = value;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	final public Reference getValueId() {
		return valueId;
	}
	
	final public void setValueId (Reference valueId) {
		this.valueId = valueId;
	}


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
