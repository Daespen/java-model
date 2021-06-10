package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultObjectAttributesBuilder<T extends ObjectAttributes, B extends DefaultObjectAttributesBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for objectAttributes
     * 
     * @param objectAttributes desired value to be set
     * @return Builder object with new value for objectAttributes
     */
    public B objectAttributes(List<Reference> objectAttributes) {
        getBuildingInstance().setObjectAttributes(objectAttributes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List objectAttributes
     * 
     * @param objectAttribute desired value to be added
     * @return Builder object with new value for objectAttributes
     */
    public B objectAttribute(Reference objectAttribute) {
        getBuildingInstance().getObjectAttributes().add(objectAttribute);
        return getSelf();
    }
}
