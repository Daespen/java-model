package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification IEC 61360" "Data Specification Template for defining Property Descriptions
 * conformant to IEC 61360."@en "Constraint AASd-075: For all ConceptDescriptions using data
 * specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 extends ModelClass, DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data
     * specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en "Constraint AASd-071:
     * For a ConceptDescription with category REFERENCE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is STRING by default."@en "Constraint AASd-072: For a
     * ConceptDescription with category DOCUMENT using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
     * "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
     * 
     * @return Returns the List of DataTypeIEC61360s for the property dataTypes. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    public List<DataTypeIEC61360> getDataTypes();

    /**
     * "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category
     * VALUE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
     * 
     * @return Returns the List of LangStrings for the property definitions. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    public List<LangString> getDefinitions();

    /**
     * @return Returns the List of LevelTypes for the property levelTypes. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
    public List<LevelType> getLevelTypes();

    /**
     * @return Returns the List of LangStrings for the property preferredNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    public List<LangString> getPreferredNames();

    /**
     * @return Returns the List of LangStrings for the property shortNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    public List<LangString> getShortNames();

    /**
     * @return Returns the String for the property sourceOfDefinition. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    public String getSourceOfDefinition();

    /**
     * @return Returns the String for the property symbol. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
    public String getSymbol();

    /**
     * @return Returns the String for the property unit. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    public String getUnit();

    /**
     * @return Returns the Reference for the property unitId. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    public Reference getUnitId();

    /**
     * @return Returns the String for the property valueFormat. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
    public String getValueFormat();

    /**
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
    public String getValue();

    /**
     * "The Type \'ValueList\' lists all the allowed values for a concept description for which the
     * allowed values are listed in an enumeration. The value list is a set of value reference
     * pairs."@en
     * 
     * @return Returns the String for the property valueList. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
    public String getValueList();

    /**
     * @return Returns the Reference for the property valueId. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
    public Reference getValueId();

}
