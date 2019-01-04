# edu-sharing WS for OpenOLAT

The SOAP interfaces for edu-sharing used by OpenOLAT. You can download the WSDLs from [GitHub](https://github.com/edu-sharing/Edu-Sharing/tree/develop/Backend/webservices/wsdl) or form the frentix edu-sharing test instance.

```
https://edusharing.frentix.com/edu-sharing/services/FolderTemplate?wsdl
https://edusharing.frentix.com/edu-sharing/services/NativeAlfrescoWrapper?wsdl
https://edusharing.frentix.com/edu-sharing/services/RenderInfo?wsdl
https://edusharing.frentix.com/edu-sharing/services/ShibbolethLogoutNotification?wsdl
https://edusharing.frentix.com/edu-sharing/services/authbyapp?wsdl
https://edusharing.frentix.com/edu-sharing/services/crud?wsdl
https://edusharing.frentix.com/edu-sharing/services/authentication?wsdl
https://edusharing.frentix.com/edu-sharing/services/permission?wsdl
https://edusharing.frentix.com/edu-sharing/services/tracking?wsdl
https://edusharing.frentix.com/edu-sharing/services/usage?wsdl
https://edusharing.frentix.com/edu-sharing/services/usage2?wsdl
```

Compile the WSDLs with the following command:

```bash
mvn clean generate-sources
```
