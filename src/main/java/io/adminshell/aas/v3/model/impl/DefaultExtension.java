package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Extensions" "Single extension of an element."@en "Constraint AASd-077: The name of an extension
 * within HasExtensions needs to be unique."@en
 */

public class DefaultExtension implements Extension {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has extension name" "An extension of the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    protected String name;

    /**
     * "has extension reference to" "Reference to an element the extension refers to."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    protected Reference refersTo;

    /**
     * "has extension value" "Value of the extension."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    protected String value;

    /**
     * "has extension value type" "Type of the value of the extension."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    protected String valueType;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    public DefaultExtension() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.name,
            this.valueType,
            this.value,
            this.refersTo,
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
            DefaultExtension other = (DefaultExtension) obj;
            return Objects.equals(this.name, other.name) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.refersTo, other.refersTo) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    final public String getName() {
        return name;
    }

    final public void setName(String name) {
        this.name = name;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    final public String getValueType() {
        return valueType;
    }

    final public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    final public Reference getRefersTo() {
        return refersTo;
    }

    final public void setRefersTo(Reference refersTo) {
        this.refersTo = refersTo;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    public static class Builder extends DefaultExtensionBuilder<DefaultExtension, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultExtension newBuildingInstance() {
            return new DefaultExtension();
        }
    }
}
