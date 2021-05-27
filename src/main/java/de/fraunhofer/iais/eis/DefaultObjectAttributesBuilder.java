package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultObjectAttributesBuilder extends AbstractBuilder<DefaultObjectAttributes> {

    public DefaultObjectAttributesBuilder() {
        super();
    }

    public DefaultObjectAttributesBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for objectAttributes
     * 
     * @param objectAttributes desired value to be set
     * @return Builder object with new value for objectAttributes
     */
    public DefaultObjectAttributesBuilder objectAttributes(List<Reference> objectAttributes) {
        this.map.put("objectAttributes", objectAttributes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultObjectAttributes build() {
        DefaultObjectAttributes defaultObjectAttributes = Util.fillInstanceFromMap(new DefaultObjectAttributes(), this.map);
        return defaultObjectAttributes;
    }
}
