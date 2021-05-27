package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultPolicyEnforcementPointsBuilder extends AbstractBuilder<DefaultPolicyEnforcementPoints> {

    public DefaultPolicyEnforcementPointsBuilder() {
        super();
    }

    public DefaultPolicyEnforcementPointsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for externalPolicyEnforcementPoint
     * 
     * @param externalPolicyEnforcementPoint desired value to be set
     * @return Builder object with new value for externalPolicyEnforcementPoint
     */
    public DefaultPolicyEnforcementPointsBuilder externalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        this.map.put("externalPolicyEnforcementPoint", externalPolicyEnforcementPoint);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyEnforcementPoints build() {
        DefaultPolicyEnforcementPoints defaultPolicyEnforcementPoints =
            Util.fillInstanceFromMap(new DefaultPolicyEnforcementPoints(), this.map);
        return defaultPolicyEnforcementPoints;
    }
}
