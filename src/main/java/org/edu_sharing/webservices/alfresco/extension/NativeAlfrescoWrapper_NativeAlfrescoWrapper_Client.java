
package org.edu_sharing.webservices.alfresco.extension;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:45:11.070+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
public final class NativeAlfrescoWrapper_NativeAlfrescoWrapper_Client {

    private static final QName SERVICE_NAME = new QName("http://extension.alfresco.webservices.edu_sharing.org", "NativeAlfrescoWrapperService");

    private NativeAlfrescoWrapper_NativeAlfrescoWrapper_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = NativeAlfrescoWrapperService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        NativeAlfrescoWrapperService ss = new NativeAlfrescoWrapperService(wsdlURL, SERVICE_NAME);
        NativeAlfrescoWrapper port = ss.getNativeAlfrescoWrapper();

        {
        System.out.println("Invoking isOwner...");
        java.lang.String _isOwner_nodeId = "";
        java.lang.String _isOwner_user = "";
        boolean _isOwner__return = port.isOwner(_isOwner_nodeId, _isOwner_user);
        System.out.println("isOwner.result=" + _isOwner__return);


        }
        {
        System.out.println("Invoking bindEduGroupFolder...");
        java.lang.String _bindEduGroupFolder_groupName = "";
        java.lang.String _bindEduGroupFolder_folderId = "";
        port.bindEduGroupFolder(_bindEduGroupFolder_groupName, _bindEduGroupFolder_folderId);


        }
        {
        System.out.println("Invoking setUserDefinedPreview...");
        java.lang.String _setUserDefinedPreview_nodeId = "";
        byte[] _setUserDefinedPreview_content = new byte[0];
        java.lang.String _setUserDefinedPreview_fileName = "";
        port.setUserDefinedPreview(_setUserDefinedPreview_nodeId, _setUserDefinedPreview_content, _setUserDefinedPreview_fileName);


        }
        {
        System.out.println("Invoking getHomeFolderID...");
        java.lang.String _getHomeFolderID_username = "";
        java.lang.String _getHomeFolderID__return = port.getHomeFolderID(_getHomeFolderID_username);
        System.out.println("getHomeFolderID.result=" + _getHomeFolderID__return);


        }
        {
        System.out.println("Invoking addAspect...");
        java.lang.String _addAspect_nodeId = "";
        java.lang.String _addAspect_aspect = "";
        port.addAspect(_addAspect_nodeId, _addAspect_aspect);


        }
        {
        System.out.println("Invoking getPath...");
        java.lang.String _getPath_nodeID = "";
        java.lang.String _getPath__return = port.getPath(_getPath_nodeID);
        System.out.println("getPath.result=" + _getPath__return);


        }
        {
        System.out.println("Invoking getChildenByProps...");
        java.lang.String _getChildenByProps_parentId = "";
        java.lang.String _getChildenByProps_type = "";
        org.apache.xml.xml_soap.Map _getChildenByProps_props = null;
        org.apache.xml.xml_soap.Map _getChildenByProps__return = port.getChildenByProps(_getChildenByProps_parentId, _getChildenByProps_type, _getChildenByProps_props);
        System.out.println("getChildenByProps.result=" + _getChildenByProps__return);


        }
        {
        System.out.println("Invoking getPropertiesExt...");
        java.lang.String _getPropertiesExt_storeProtocol = "";
        java.lang.String _getPropertiesExt_storeId = "";
        java.lang.String _getPropertiesExt_nodeId = "";
        org.apache.xml.xml_soap.Map _getPropertiesExt__return = port.getPropertiesExt(_getPropertiesExt_storeProtocol, _getPropertiesExt_storeId, _getPropertiesExt_nodeId);
        System.out.println("getPropertiesExt.result=" + _getPropertiesExt__return);


        }
        {
        System.out.println("Invoking getChildrenRecursive...");
        java.lang.String _getChildrenRecursive_parentId = "";
        java.lang.String _getChildrenRecursive_type = "";
        org.apache.xml.xml_soap.Map _getChildrenRecursive__return = port.getChildrenRecursive(_getChildrenRecursive_parentId, _getChildrenRecursive_type);
        System.out.println("getChildrenRecursive.result=" + _getChildrenRecursive__return);


        }
        {
        System.out.println("Invoking setGroupDetails...");
        org.edu_sharing.webservices.alfresco.extension.GroupDetails _setGroupDetails_groupDetails = null;
        org.edu_sharing.webservices.alfresco.extension.GroupDetails _setGroupDetails__return = port.setGroupDetails(_setGroupDetails_groupDetails);
        System.out.println("setGroupDetails.result=" + _setGroupDetails__return);


        }
        {
        System.out.println("Invoking updateNodeAtomicValues...");
        java.lang.String _updateNodeAtomicValues_nodeId = "";
        org.apache.xml.xml_soap.Map _updateNodeAtomicValues_properties = null;
        port.updateNodeAtomicValues(_updateNodeAtomicValues_nodeId, _updateNodeAtomicValues_properties);


        }
        {
        System.out.println("Invoking setPermissionsBasic...");
        java.lang.String _setPermissionsBasic_nodeId = "";
        java.lang.String _setPermissionsBasic_authority = "";
        java.util.List<java.lang.String> _setPermissionsBasic_permissions = null;
        boolean _setPermissionsBasic_changeInherit = false;
        boolean _setPermissionsBasic_inheritPermission = false;
        port.setPermissionsBasic(_setPermissionsBasic_nodeId, _setPermissionsBasic_authority, _setPermissionsBasic_permissions, _setPermissionsBasic_changeInherit, _setPermissionsBasic_inheritPermission);


        }
        {
        System.out.println("Invoking createNode...");
        java.lang.String _createNode_parentID = "";
        java.lang.String _createNode_nodeTypeString = "";
        java.lang.String _createNode_childAssociation = "";
        org.apache.xml.xml_soap.Map _createNode_props = null;
        java.lang.String _createNode__return = port.createNode(_createNode_parentID, _createNode_nodeTypeString, _createNode_childAssociation, _createNode_props);
        System.out.println("createNode.result=" + _createNode__return);


        }
        {
        System.out.println("Invoking hasAllPermissions...");
        java.lang.String _hasAllPermissions_nodeId = "";
        java.util.List<java.lang.String> _hasAllPermissions_permissions = null;
        org.apache.xml.xml_soap.Map _hasAllPermissions__return = port.hasAllPermissions(_hasAllPermissions_nodeId, _hasAllPermissions_permissions);
        System.out.println("hasAllPermissions.result=" + _hasAllPermissions__return);


        }
        {
        System.out.println("Invoking removePermissionACEs...");
        java.lang.String _removePermissionACEs_nodeId = "";
        java.util.List<org.edu_sharing.repository.client.rpc.ACE> _removePermissionACEs_aces = null;
        port.removePermissionACEs(_removePermissionACEs_nodeId, _removePermissionACEs_aces);


        }
        {
        System.out.println("Invoking createAssociation...");
        java.lang.String _createAssociation_fromID = "";
        java.lang.String _createAssociation_toID = "";
        java.lang.String _createAssociation_association = "";
        port.createAssociation(_createAssociation_fromID, _createAssociation_toID, _createAssociation_association);


        }
        {
        System.out.println("Invoking hasPermissions...");
        java.lang.String _hasPermissions_userId = "";
        java.util.List<java.lang.String> _hasPermissions_permissions = null;
        java.lang.String _hasPermissions_nodeId = "";
        org.apache.xml.xml_soap.Map _hasPermissions__return = port.hasPermissions(_hasPermissions_userId, _hasPermissions_permissions, _hasPermissions_nodeId);
        System.out.println("hasPermissions.result=" + _hasPermissions__return);


        }
        {
        System.out.println("Invoking searchNodes...");
        java.lang.String _searchNodes_store = "";
        java.lang.String _searchNodes_luceneQuery = "";
        java.lang.String _searchNodes_permission = "";
        java.util.List<java.lang.String> _searchNodes_propertiesToReturn = null;
        java.util.List<org.edu_sharing.webservices.alfresco.extension.RepositoryNode> _searchNodes__return = port.searchNodes(_searchNodes_store, _searchNodes_luceneQuery, _searchNodes_permission, _searchNodes_propertiesToReturn);
        System.out.println("searchNodes.result=" + _searchNodes__return);


        }
        {
        System.out.println("Invoking removeUserDefinedPreview...");
        java.lang.String _removeUserDefinedPreview_nodeId = "";
        port.removeUserDefinedPreview(_removeUserDefinedPreview_nodeId);


        }
        {
        System.out.println("Invoking searchSolr...");
        java.lang.String _searchSolr_query = "";
        int _searchSolr_startIdx = 0;
        int _searchSolr_nrOfresults = 0;
        java.util.List<java.lang.String> _searchSolr_facettes = null;
        int _searchSolr_facettesMinCount = 0;
        int _searchSolr_facettesLimit = 0;
        org.edu_sharing.webservices.alfresco.extension.SearchResult _searchSolr__return = port.searchSolr(_searchSolr_query, _searchSolr_startIdx, _searchSolr_nrOfresults, _searchSolr_facettes, _searchSolr_facettesMinCount, _searchSolr_facettesLimit);
        System.out.println("searchSolr.result=" + _searchSolr__return);


        }
        {
        System.out.println("Invoking setPermissions...");
        java.lang.String _setPermissions_nodeId = "";
        java.util.List<org.edu_sharing.repository.client.rpc.ACE> _setPermissions_aces = null;
        port.setPermissions(_setPermissions_nodeId, _setPermissions_aces);


        }
        {
        System.out.println("Invoking searchNodeIdsLimit...");
        java.lang.String _searchNodeIdsLimit_luceneString = "";
        int _searchNodeIdsLimit_limit = 0;
        java.util.List<java.lang.String> _searchNodeIdsLimit__return = port.searchNodeIdsLimit(_searchNodeIdsLimit_luceneString, _searchNodeIdsLimit_limit);
        System.out.println("searchNodeIdsLimit.result=" + _searchNodeIdsLimit__return);


        }
        {
        System.out.println("Invoking setOwner...");
        java.lang.String _setOwner_nodeId = "";
        java.lang.String _setOwner_username = "";
        port.setOwner(_setOwner_nodeId, _setOwner_username);


        }
        {
        System.out.println("Invoking removeChild...");
        java.lang.String _removeChild_parentID = "";
        java.lang.String _removeChild_childID = "";
        java.lang.String _removeChild_association = "";
        port.removeChild(_removeChild_parentID, _removeChild_childID, _removeChild_association);


        }
        {
        System.out.println("Invoking invalideTicket...");
        java.lang.String _invalideTicket_ticket = "";
        port.invalideTicket(_invalideTicket_ticket);


        }
        {
        System.out.println("Invoking removeRelations...");
        java.lang.String _removeRelations_parentID = "";
        port.removeRelations(_removeRelations_parentID);


        }
        {
        System.out.println("Invoking getType...");
        java.lang.String _getType_nodeId = "";
        java.lang.String _getType__return = port.getType(_getType_nodeId);
        System.out.println("getType.result=" + _getType__return);


        }
        {
        System.out.println("Invoking getUserNames...");
        java.util.List<java.lang.String> _getUserNames__return = port.getUserNames();
        System.out.println("getUserNames.result=" + _getUserNames__return);


        }
        {
        System.out.println("Invoking setProperty...");
        java.lang.String _setProperty_nodeId = "";
        java.lang.String _setProperty_property = "";
        java.lang.String _setProperty_value = "";
        port.setProperty(_setProperty_nodeId, _setProperty_property, _setProperty_value);


        }
        {
        System.out.println("Invoking moveNode...");
        java.lang.String _moveNode_newParentId = "";
        java.lang.String _moveNode_childAssocType = "";
        java.lang.String _moveNode_nodeId = "";
        port.moveNode(_moveNode_newParentId, _moveNode_childAssocType, _moveNode_nodeId);


        }
        {
        System.out.println("Invoking getNotifyList...");
        java.lang.String _getNotifyList_nodeId = "";
        java.util.List<org.edu_sharing.repository.client.rpc.Notify> _getNotifyList__return = port.getNotifyList(_getNotifyList_nodeId);
        System.out.println("getNotifyList.result=" + _getNotifyList__return);


        }
        {
        System.out.println("Invoking getChildren...");
        java.lang.String _getChildren_parentID = "";
        java.lang.String _getChildren_type = "";
        org.apache.xml.xml_soap.Map _getChildren__return = port.getChildren(_getChildren_parentID, _getChildren_type);
        System.out.println("getChildren.result=" + _getChildren__return);


        }
        {
        System.out.println("Invoking updateNode...");
        java.lang.String _updateNode_nodeId = "";
        org.apache.xml.xml_soap.Map _updateNode_properties = null;
        port.updateNode(_updateNode_nodeId, _updateNode_properties);


        }
        {
        System.out.println("Invoking getMetadataSets...");
        java.util.List<java.lang.String> _getMetadataSets__return = port.getMetadataSets();
        System.out.println("getMetadataSets.result=" + _getMetadataSets__return);


        }
        {
        System.out.println("Invoking getPropertiesSimple...");
        java.lang.String _getPropertiesSimple_nodeId = "";
        org.apache.xml.xml_soap.Map _getPropertiesSimple__return = port.getPropertiesSimple(_getPropertiesSimple_nodeId);
        System.out.println("getPropertiesSimple.result=" + _getPropertiesSimple__return);


        }
        {
        System.out.println("Invoking getPreviewUrl...");
        java.lang.String _getPreviewUrl_storeProtocol = "";
        java.lang.String _getPreviewUrl_storeIdentifier = "";
        java.lang.String _getPreviewUrl_nodeId = "";
        org.edu_sharing.repository.client.rpc.GetPreviewResult _getPreviewUrl__return = port.getPreviewUrl(_getPreviewUrl_storeProtocol, _getPreviewUrl_storeIdentifier, _getPreviewUrl_nodeId);
        System.out.println("getPreviewUrl.result=" + _getPreviewUrl__return);


        }
        {
        System.out.println("Invoking deleteUser...");
        java.util.List<java.lang.String> _deleteUser_userNames = null;
        port.deleteUser(_deleteUser_userNames);


        }
        {
        System.out.println("Invoking getCompanyHomeNodeId...");
        java.lang.String _getCompanyHomeNodeId__return = port.getCompanyHomeNodeId();
        System.out.println("getCompanyHomeNodeId.result=" + _getCompanyHomeNodeId__return);


        }
        {
        System.out.println("Invoking hasContent...");
        java.lang.String _hasContent_nodeId = "";
        java.lang.String _hasContent_contentProp = "";
        boolean _hasContent__return = port.hasContent(_hasContent_nodeId, _hasContent_contentProp);
        System.out.println("hasContent.result=" + _hasContent__return);


        }
        {
        System.out.println("Invoking hasPermissionsSimple...");
        java.lang.String _hasPermissionsSimple_nodeId = "";
        java.util.List<java.lang.String> _hasPermissionsSimple_permissions = null;
        boolean _hasPermissionsSimple__return = port.hasPermissionsSimple(_hasPermissionsSimple_nodeId, _hasPermissionsSimple_permissions);
        System.out.println("hasPermissionsSimple.result=" + _hasPermissionsSimple__return);


        }
        {
        System.out.println("Invoking createShare...");
        java.lang.String _createShare_nodeId = "";
        java.util.List<java.lang.String> _createShare_emails = null;
        long _createShare_expiryDate = 0;
        port.createShare(_createShare_nodeId, _createShare_emails, _createShare_expiryDate);


        }
        {
        System.out.println("Invoking hasToolPermission...");
        java.lang.String _hasToolPermission_toolPermission = "";
        boolean _hasToolPermission__return = port.hasToolPermission(_hasToolPermission_toolPermission);
        System.out.println("hasToolPermission.result=" + _hasToolPermission__return);


        }
        {
        System.out.println("Invoking getChild...");
        java.lang.String _getChild_parentId = "";
        java.lang.String _getChild_type = "";
        java.lang.String _getChild_property = "";
        java.lang.String _getChild_value = "";
        org.apache.xml.xml_soap.Map _getChild__return = port.getChild(_getChild_parentId, _getChild_type, _getChild_property, _getChild_value);
        System.out.println("getChild.result=" + _getChild__return);


        }
        {
        System.out.println("Invoking getPermissions...");
        java.lang.String _getPermissions_nodeId = "";
        org.edu_sharing.repository.client.rpc.ACL _getPermissions__return = port.getPermissions(_getPermissions_nodeId);
        System.out.println("getPermissions.result=" + _getPermissions__return);


        }
        {
        System.out.println("Invoking getProperties...");
        java.lang.String _getProperties_nodeId = "";
        org.apache.xml.xml_soap.Map _getProperties__return = port.getProperties(_getProperties_nodeId);
        System.out.println("getProperties.result=" + _getProperties__return);


        }
        {
        System.out.println("Invoking removeAspect...");
        java.lang.String _removeAspect_nodeId = "";
        java.lang.String _removeAspect_aspect = "";
        port.removeAspect(_removeAspect_nodeId, _removeAspect_aspect);


        }
        {
        System.out.println("Invoking setUserDetails...");
        java.util.List<org.edu_sharing.webservices.alfresco.extension.UserDetails> _setUserDetails_userDetails = null;
        port.setUserDetails(_setUserDetails_userDetails);


        }
        {
        System.out.println("Invoking getGroupFolderId...");
        java.lang.String _getGroupFolderId__return = port.getGroupFolderId();
        System.out.println("getGroupFolderId.result=" + _getGroupFolderId__return);


        }
        {
        System.out.println("Invoking guessMimetype...");
        java.lang.String _guessMimetype_filename = "";
        java.lang.String _guessMimetype__return = port.guessMimetype(_guessMimetype_filename);
        System.out.println("guessMimetype.result=" + _guessMimetype__return);


        }
        {
        System.out.println("Invoking removeAssociation...");
        java.lang.String _removeAssociation_fromID = "";
        java.lang.String _removeAssociation_toID = "";
        java.lang.String _removeAssociation_association = "";
        port.removeAssociation(_removeAssociation_fromID, _removeAssociation_toID, _removeAssociation_association);


        }
        {
        System.out.println("Invoking getChildrenByAssociation...");
        java.lang.String _getChildrenByAssociation_storeString = "";
        java.lang.String _getChildrenByAssociation_nodeId = "";
        java.lang.String _getChildrenByAssociation_association = "";
        org.apache.xml.xml_soap.Map _getChildrenByAssociation__return = port.getChildrenByAssociation(_getChildrenByAssociation_storeString, _getChildrenByAssociation_nodeId, _getChildrenByAssociation_association);
        System.out.println("getChildrenByAssociation.result=" + _getChildrenByAssociation__return);


        }
        {
        System.out.println("Invoking validateTicket...");
        java.lang.String _validateTicket_ticket = "";
        java.lang.String _validateTicket__return = port.validateTicket(_validateTicket_ticket);
        System.out.println("validateTicket.result=" + _validateTicket__return);


        }
        {
        System.out.println("Invoking hasAllPermissionsExt...");
        java.lang.String _hasAllPermissionsExt_storeProtocol = "";
        java.lang.String _hasAllPermissionsExt_storeId = "";
        java.lang.String _hasAllPermissionsExt_nodeId = "";
        java.util.List<java.lang.String> _hasAllPermissionsExt_permissions = null;
        org.apache.xml.xml_soap.Map _hasAllPermissionsExt__return = port.hasAllPermissionsExt(_hasAllPermissionsExt_storeProtocol, _hasAllPermissionsExt_storeId, _hasAllPermissionsExt_nodeId, _hasAllPermissionsExt_permissions);
        System.out.println("hasAllPermissionsExt.result=" + _hasAllPermissionsExt__return);


        }
        {
        System.out.println("Invoking isAdmin...");
        java.lang.String _isAdmin_username = "";
        boolean _isAdmin__return = port.isAdmin(_isAdmin_username);
        System.out.println("isAdmin.result=" + _isAdmin__return);


        }
        {
        System.out.println("Invoking revertVersion...");
        java.lang.String _revertVersion_nodeId = "";
        java.lang.String _revertVersion_verLbl = "";
        port.revertVersion(_revertVersion_nodeId, _revertVersion_verLbl);


        }
        {
        System.out.println("Invoking getParents...");
        java.lang.String _getParents_nodeID = "";
        boolean _getParents_primary = false;
        org.apache.xml.xml_soap.Map _getParents__return = port.getParents(_getParents_nodeID, _getParents_primary);
        System.out.println("getParents.result=" + _getParents__return);


        }
        {
        System.out.println("Invoking getAssociationNodeIds...");
        java.lang.String _getAssociationNodeIds_nodeID = "";
        java.lang.String _getAssociationNodeIds_association = "";
        java.util.List<java.lang.String> _getAssociationNodeIds__return = port.getAssociationNodeIds(_getAssociationNodeIds_nodeID, _getAssociationNodeIds_association);
        System.out.println("getAssociationNodeIds.result=" + _getAssociationNodeIds__return);


        }
        {
        System.out.println("Invoking getShares...");
        java.lang.String _getShares_nodeId = "";
        java.util.List<org.edu_sharing.repository.client.rpc.Share> _getShares__return = port.getShares(_getShares_nodeId);
        System.out.println("getShares.result=" + _getShares__return);


        }
        {
        System.out.println("Invoking search...");
        java.util.List<org.edu_sharing.webservices.alfresco.extension.SearchCriteria> _search_searchCriterias = null;
        java.lang.String _search_metadatasetId = "";
        int _search_start = 0;
        int _search_nrOfResults = 0;
        java.util.List<java.lang.String> _search_facettes = null;
        org.edu_sharing.webservices.alfresco.extension.SearchResult _search__return = port.search(_search_searchCriterias, _search_metadatasetId, _search_start, _search_nrOfResults, _search_facettes);
        System.out.println("search.result=" + _search__return);


        }
        {
        System.out.println("Invoking addPermissionACEs...");
        java.lang.String _addPermissionACEs_nodeId = "";
        java.util.List<org.edu_sharing.repository.client.rpc.ACE> _addPermissionACEs_aces = null;
        port.addPermissionACEs(_addPermissionACEs_nodeId, _addPermissionACEs_aces);


        }
        {
        System.out.println("Invoking removeNode...");
        java.lang.String _removeNode_nodeId = "";
        java.lang.String _removeNode_fromId = "";
        port.removeNode(_removeNode_nodeId, _removeNode_fromId);


        }
        {
        System.out.println("Invoking isSubOf...");
        java.lang.String _isSubOf_type = "";
        java.lang.String _isSubOf_parentType = "";
        boolean _isSubOf__return = port.isSubOf(_isSubOf_type, _isSubOf_parentType);
        System.out.println("isSubOf.result=" + _isSubOf__return);


        }
        {
        System.out.println("Invoking removePermissions...");
        java.lang.String _removePermissions_nodeId = "";
        java.lang.String _removePermissions_authority = "";
        java.util.List<java.lang.String> _removePermissions_permissions = null;
        port.removePermissions(_removePermissions_nodeId, _removePermissions_authority, _removePermissions_permissions);


        }
        {
        System.out.println("Invoking findUsers...");
        java.util.List<org.edu_sharing.webservices.alfresco.extension.KeyValue> _findUsers_searchProps = null;
        java.lang.String _findUsers_eduGroupNodeId = "";
        int _findUsers_from = 0;
        int _findUsers_nrOfResults = 0;
        org.edu_sharing.webservices.alfresco.extension.SearchResult _findUsers__return = port.findUsers(_findUsers_searchProps, _findUsers_eduGroupNodeId, _findUsers_from, _findUsers_nrOfResults);
        System.out.println("findUsers.result=" + _findUsers__return);


        }
        {
        System.out.println("Invoking executeAction...");
        java.lang.String _executeAction_nodeId = "";
        java.lang.String _executeAction_actionName = "";
        java.lang.String _executeAction_actionId = "";
        org.apache.xml.xml_soap.Map _executeAction_parameters = null;
        boolean _executeAction_async = false;
        port.executeAction(_executeAction_nodeId, _executeAction_actionName, _executeAction_actionId, _executeAction_parameters, _executeAction_async);


        }
        {
        System.out.println("Invoking findNodeByPath...");
        java.lang.String _findNodeByPath_path = "";
        java.lang.String _findNodeByPath__return = port.findNodeByPath(_findNodeByPath_path);
        System.out.println("findNodeByPath.result=" + _findNodeByPath__return);


        }
        {
        System.out.println("Invoking removeGlobalAspectFromGroup...");
        java.lang.String _removeGlobalAspectFromGroup_groupNodeId = "";
        port.removeGlobalAspectFromGroup(_removeGlobalAspectFromGroup_groupNodeId);


        }
        {
        System.out.println("Invoking deleteGroup...");
        java.util.List<java.lang.String> _deleteGroup_groupNames = null;
        port.deleteGroup(_deleteGroup_groupNames);


        }
        {
        System.out.println("Invoking getAspects...");
        java.lang.String _getAspects_storeProtocol = "";
        java.lang.String _getAspects_storeId = "";
        java.lang.String _getAspects_nodeId = "";
        java.util.List<java.lang.String> _getAspects__return = port.getAspects(_getAspects_storeProtocol, _getAspects_storeId, _getAspects_nodeId);
        System.out.println("getAspects.result=" + _getAspects__return);


        }
        {
        System.out.println("Invoking getGroupNames...");
        java.util.List<java.lang.String> _getGroupNames__return = port.getGroupNames();
        System.out.println("getGroupNames.result=" + _getGroupNames__return);


        }
        {
        System.out.println("Invoking createNodeAtomicValues...");
        java.lang.String _createNodeAtomicValues_parentID = "";
        java.lang.String _createNodeAtomicValues_nodeTypeString = "";
        java.lang.String _createNodeAtomicValues_childAssociation = "";
        org.apache.xml.xml_soap.Map _createNodeAtomicValues_props = null;
        java.lang.String _createNodeAtomicValues__return = port.createNodeAtomicValues(_createNodeAtomicValues_parentID, _createNodeAtomicValues_nodeTypeString, _createNodeAtomicValues_childAssociation, _createNodeAtomicValues_props);
        System.out.println("createNodeAtomicValues.result=" + _createNodeAtomicValues__return);


        }
        {
        System.out.println("Invoking removeAllMemberships...");
        java.util.List<java.lang.String> _removeAllMemberships_groupNames = null;
        port.removeAllMemberships(_removeAllMemberships_groupNames);


        }
        {
        System.out.println("Invoking copyNode...");
        java.lang.String _copyNode_nodeId = "";
        java.lang.String _copyNode_toNodeId = "";
        boolean _copyNode_copyChildren = false;
        port.copyNode(_copyNode_nodeId, _copyNode_toNodeId, _copyNode_copyChildren);


        }
        {
        System.out.println("Invoking getGroupDetails...");
        java.util.List<java.lang.String> _getGroupDetails_groupNames = null;
        java.util.List<org.edu_sharing.webservices.alfresco.extension.GroupDetails> _getGroupDetails__return = port.getGroupDetails(_getGroupDetails_groupNames);
        System.out.println("getGroupDetails.result=" + _getGroupDetails__return);


        }
        {
        System.out.println("Invoking getMemberships...");
        java.lang.String _getMemberships_groupName = "";
        java.util.List<java.lang.String> _getMemberships__return = port.getMemberships(_getMemberships_groupName);
        System.out.println("getMemberships.result=" + _getMemberships__return);


        }
        {
        System.out.println("Invoking getChildrenByType...");
        java.lang.String _getChildrenByType_nodeId = "";
        java.lang.String _getChildrenByType_type = "";
        org.apache.xml.xml_soap.Map _getChildrenByType__return = port.getChildrenByType(_getChildrenByType_nodeId, _getChildrenByType_type);
        System.out.println("getChildrenByType.result=" + _getChildrenByType__return);


        }
        {
        System.out.println("Invoking writeContent...");
        java.lang.String _writeContent_nodeID = "";
        byte[] _writeContent_content = new byte[0];
        java.lang.String _writeContent_mimetype = "";
        java.lang.String _writeContent_encoding = "";
        java.lang.String _writeContent_property = "";
        port.writeContent(_writeContent_nodeID, _writeContent_content, _writeContent_mimetype, _writeContent_encoding, _writeContent_property);


        }
        {
        System.out.println("Invoking findGroups...");
        java.lang.String _findGroups_searchWord = "";
        java.lang.String _findGroups_eduGroupNodeId = "";
        int _findGroups_from = 0;
        int _findGroups_nrOfResults = 0;
        org.edu_sharing.webservices.alfresco.extension.SearchResult _findGroups__return = port.findGroups(_findGroups_searchWord, _findGroups_eduGroupNodeId, _findGroups_from, _findGroups_nrOfResults);
        System.out.println("findGroups.result=" + _findGroups__return);


        }
        {
        System.out.println("Invoking removeRelationsForNode...");
        java.lang.String _removeRelationsForNode_nodeId = "";
        java.lang.String _removeRelationsForNode_nodeParentId = "";
        port.removeRelationsForNode(_removeRelationsForNode_nodeId, _removeRelationsForNode_nodeParentId);


        }
        {
        System.out.println("Invoking setUserPassword...");
        java.lang.String _setUserPassword_userName = "";
        java.lang.String _setUserPassword_password = "";
        port.setUserPassword(_setUserPassword_userName, _setUserPassword_password);


        }
        {
        System.out.println("Invoking getRepositoryRoot...");
        java.lang.String _getRepositoryRoot__return = port.getRepositoryRoot();
        System.out.println("getRepositoryRoot.result=" + _getRepositoryRoot__return);


        }
        {
        System.out.println("Invoking getAssocNode...");
        java.lang.String _getAssocNode_nodeID = "";
        java.lang.String _getAssocNode_association = "";
        org.apache.xml.xml_soap.Map _getAssocNode__return = port.getAssocNode(_getAssocNode_nodeID, _getAssocNode_association);
        System.out.println("getAssocNode.result=" + _getAssocNode__return);


        }
        {
        System.out.println("Invoking getUserDetails...");
        java.util.List<java.lang.String> _getUserDetails_userNames = null;
        java.util.List<org.edu_sharing.webservices.alfresco.extension.UserDetails> _getUserDetails__return = port.getUserDetails(_getUserDetails_userNames);
        System.out.println("getUserDetails.result=" + _getUserDetails__return);


        }
        {
        System.out.println("Invoking searchNodeIds...");
        java.lang.String _searchNodeIds_store = "";
        java.lang.String _searchNodeIds_luceneQuery = "";
        java.lang.String _searchNodeIds_permission = "";
        java.util.List<java.lang.String> _searchNodeIds__return = port.searchNodeIds(_searchNodeIds_store, _searchNodeIds_luceneQuery, _searchNodeIds_permission);
        System.out.println("searchNodeIds.result=" + _searchNodeIds__return);


        }
        {
        System.out.println("Invoking getVersionHistory...");
        java.lang.String _getVersionHistory_nodeId = "";
        java.util.List<org.edu_sharing.webservices.alfresco.extension.RepositoryNode> _getVersionHistory__return = port.getVersionHistory(_getVersionHistory_nodeId);
        System.out.println("getVersionHistory.result=" + _getVersionHistory__return);


        }
        {
        System.out.println("Invoking getUserInfo...");
        java.lang.String _getUserInfo_userName = "";
        org.apache.xml.xml_soap.Map _getUserInfo__return = port.getUserInfo(_getUserInfo_userName);
        System.out.println("getUserInfo.result=" + _getUserInfo__return);


        }
        {
        System.out.println("Invoking removeMemberships...");
        java.lang.String _removeMemberships_groupName = "";
        java.util.List<java.lang.String> _removeMemberships_members = null;
        port.removeMemberships(_removeMemberships_groupName, _removeMemberships_members);


        }
        {
        System.out.println("Invoking getEduGroupContextOfNode...");
        java.lang.String _getEduGroupContextOfNode_nodeId = "";
        java.util.List<org.edu_sharing.webservices.alfresco.extension.KeyValue> _getEduGroupContextOfNode__return = port.getEduGroupContextOfNode(_getEduGroupContextOfNode_nodeId);
        System.out.println("getEduGroupContextOfNode.result=" + _getEduGroupContextOfNode__return);


        }
        {
        System.out.println("Invoking getChildrenCheckPermissions...");
        java.lang.String _getChildrenCheckPermissions_parentID = "";
        java.util.List<java.lang.String> _getChildrenCheckPermissions_permissionsOnChild = null;
        org.apache.xml.xml_soap.Map _getChildrenCheckPermissions__return = port.getChildrenCheckPermissions(_getChildrenCheckPermissions_parentID, _getChildrenCheckPermissions_permissionsOnChild);
        System.out.println("getChildrenCheckPermissions.result=" + _getChildrenCheckPermissions__return);


        }
        {
        System.out.println("Invoking addMemberships...");
        java.lang.String _addMemberships_groupName = "";
        java.util.List<java.lang.String> _addMemberships_members = null;
        port.addMemberships(_addMemberships_groupName, _addMemberships_members);


        }
        {
        System.out.println("Invoking createVersion...");
        java.lang.String _createVersion_nodeId = "";
        org.apache.xml.xml_soap.Map _createVersion_properties = null;
        port.createVersion(_createVersion_nodeId, _createVersion_properties);


        }
        {
        System.out.println("Invoking createChildAssociation...");
        java.lang.String _createChildAssociation_from = "";
        java.lang.String _createChildAssociation_to = "";
        java.lang.String _createChildAssociation_assocType = "";
        java.lang.String _createChildAssociation_assocName = "";
        port.createChildAssociation(_createChildAssociation_from, _createChildAssociation_to, _createChildAssociation_assocType, _createChildAssociation_assocName);


        }
        {
        System.out.println("Invoking getChildRecursive...");
        java.lang.String _getChildRecursive_parentId = "";
        java.lang.String _getChildRecursive_type = "";
        org.apache.xml.xml_soap.Map _getChildRecursive_props = null;
        org.apache.xml.xml_soap.Map _getChildRecursive__return = port.getChildRecursive(_getChildRecursive_parentId, _getChildRecursive_type, _getChildRecursive_props);
        System.out.println("getChildRecursive.result=" + _getChildRecursive__return);


        }
        {
        System.out.println("Invoking getProperty...");
        java.lang.String _getProperty_storeProtocol = "";
        java.lang.String _getProperty_storeIdentifier = "";
        java.lang.String _getProperty_nodeId = "";
        java.lang.String _getProperty_property = "";
        java.lang.String _getProperty__return = port.getProperty(_getProperty_storeProtocol, _getProperty_storeIdentifier, _getProperty_nodeId, _getProperty_property);
        System.out.println("getProperty.result=" + _getProperty__return);


        }

        System.exit(0);
    }

}
