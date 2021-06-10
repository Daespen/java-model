package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Permission" "Description of a single permission."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermission.class)
})
public interface Permission {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Description of the kind of permission. Possible kind of permission also include the denial of
     * the permission."@en
     * 
     * @return Returns the PermissionKind for the property kindOfPermission. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    public PermissionKind getKindOfPermission();

    /**
     * "Description of the kind of permission. Possible kind of permission also include the denial of
     * the permission."@en
     * 
     * @param kindOfPermission desired value for the property kindOfPermission. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     */
    public void setKindOfPermission(PermissionKind kindOfPermission);

    /**
     * "Reference to a property that defines the semantics of the permission."@en "Constraint AASs-010:
     * The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
     * "Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     * 
     * @return Returns the Reference for the property permission. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Permission/permission
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    public Reference getPermission();

    /**
     * "Reference to a property that defines the semantics of the permission."@en "Constraint AASs-010:
     * The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
     * "Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     * 
     * @param permission desired value for the property permission. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Permission/permission
     */
    public void setPermission(Reference permission);

}
