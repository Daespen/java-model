package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class SubmodelBuilder {

    private Map<String, Object> map;

    public SubmodelBuilder() {
        this.map = new HashMap<>();
    }

    public SubmodelBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for submodelElements
     * 
     * @param submodelElements desired value to be set
     * @return Builder object with new value for submodelElements
     */
    public SubmodelBuilder submodelElements(List<SubmodelElement> submodelElements) {
        this.map.put("submodelElements", submodelElements);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public SubmodelBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public SubmodelBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public SubmodelBuilder administration(AdministrativeInformation administration) {
        this.map.put("administration", administration);
        return this;
    }

    /**
     * This function allows setting a value for identification
     * 
     * @param identification desired value to be set
     * @return Builder object with new value for identification
     */
    public SubmodelBuilder identification(Identifier identification) {
        this.map.put("identification", identification);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public SubmodelBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public SubmodelBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public SubmodelBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public SubmodelBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public SubmodelBuilder kind(ModelingKind kind) {
        this.map.put("kind", kind);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public SubmodelBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public Submodel build() throws ConstraintViolationException {
        DefaultSubmodel defaultSubmodel = Util.fillInstanceFromMap(new DefaultSubmodel(), this.map);
        return defaultSubmodel;
    }
}
