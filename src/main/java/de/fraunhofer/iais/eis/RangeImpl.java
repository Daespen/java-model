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
* "Range"
* "An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element."@en
* "Constraint AASd-053: The semanticId of a Range submodel element shall only reference a ConceptDescription with the category PROPERTY."@en
* "Constraint AASd-068: If the semanticId of a  Range references a ConceptDescription then DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or RATIONAL_*."@en
* "Constraint AASd-069: If the semanticId of a  Range references a ConceptDescription then DataSpecificationIEC61360/levelType shall be identical to the set {Min,Max}."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Range")
public class RangeImpl implements Serializable, IRange {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Range", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected ArrayList<? extends IReference> _hasDataSpecificationDataSpecification;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasKind/kind", "hasKindKind"})
	protected ModelingKind _hasKindKind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected IReference _hasSemanticsSemanticId;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifiableQualifier"})
	protected ArrayList<? extends IConstraint> _qualifiableQualifier;


	/**
	* "has maximum value"
	* "The maximum value of the range."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Range/max", "rangeMax"})
	protected ArrayList<? extends TypedLiteral> _rangeMax;


	/**
	* "has minimum value"
	* "The minimum value of the range."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Range/min", "rangeMin"})
	protected ArrayList<? extends TypedLiteral> _rangeMin;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected ArrayList<? extends TypedLiteral> _referableDescription;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral _referableDisplayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	protected String _referableIdShort;


	/**
	* "has parent"
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI _referableParent;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	protected RangeImpl() {
		id = VocabUtil.getInstance().createRandomUrl("range");
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
	* "The maximum value of the range."@en
	* @return Returns the List of TypedLiteral for the property rangeMax.
	* More information under https://admin-shell.io/aas/3/0/RC01/Range/max
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Range/max")
	final public List<? extends TypedLiteral> getRangeMax() {
		return _rangeMax;
	}

	final public void setRangeMax (ArrayList<? extends TypedLiteral> _rangeMax_) {
		this._rangeMax = _rangeMax_;
	}

	/**
	* "The minimum value of the range."@en
	* @return Returns the List of TypedLiteral for the property rangeMin.
	* More information under https://admin-shell.io/aas/3/0/RC01/Range/min
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Range/min")
	final public List<? extends TypedLiteral> getRangeMin() {
		return _rangeMin;
	}

	final public void setRangeMin (ArrayList<? extends TypedLiteral> _rangeMin_) {
		this._rangeMin = _rangeMin_;
	}



	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @return Returns the List of String for the property referableReferableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	final public void setReferableReferableCategory (ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @return Returns the List of TypedLiteral for the property referableDescription.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<? extends TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	final public void setReferableDescription (ArrayList<? extends TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	/**
	* "Display name. Can be provided in several languages."@en
	* @return Returns the TypedLiteral for the property referableDisplayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	final public void setReferableDisplayName (TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @return Returns the String for the property referableIdShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return _referableIdShort;
	}

	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @return Returns the URI for the property referableParent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return _referableParent;
	}

	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}

	/**
	* "Additional qualification of a qualifiable element."@en
	* @return Returns the List of IConstraint for the property qualifiableQualifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<? extends IConstraint> getQualifiableQualifier() {
		return _qualifiableQualifier;
	}

	final public void setQualifiableQualifier (ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this._qualifiableQualifier = _qualifiableQualifier_;
	}

	/**
	* "Global reference to the data specification template used by the element."@en
	* @return Returns the List of IReference for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<? extends IReference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	final public void setHasDataSpecificationDataSpecification (ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	/**
	* "ModelingKind of the element: either type or instance."@en
	* @return Returns the ModelingKind for the property hasKindKind.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getHasKindKind() {
		return _hasKindKind;
	}

	final public void setHasKindKind (ModelingKind _hasKindKind_) {
		this._hasKindKind = _hasKindKind_;
	}

	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the IReference for the property hasSemanticsSemanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public IReference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	final public void setHasSemanticsSemanticId (IReference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
