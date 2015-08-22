package org.kie.remote.services.ws.sei.deployment;

import javax.jws.WebService;

import org.kie.services.client.serialization.jaxb.impl.deploy.JaxbDeploymentUnitList;
import org.kie.services.client.serialization.jaxb.impl.process.JaxbProcessDefinitionList;

/**
 * Only used for initial WSDL generation
 */
@WebService(
        serviceName = "DeploymentService", 
        portName = "DeploymentServicePort", 
        name = "DeploymentService", 
        targetNamespace = DeploymentWebService.NAMESPACE)
public class DeploymentWebServiceWsdlGenerationImpl implements DeploymentWebService {

    @Override
    public DeploymentInfoResponse manage( DeploymentIdRequest request ) throws DeploymentWebServiceException {
        return null;
    }

    @Override
    public ProcessIdsResponse getProcessDefinitionIds( DeploymentIdRequest request ) throws DeploymentWebServiceException {
        return null;
    }

    @Override
    public JaxbProcessDefinitionList getProcessDefinitionInfo( DeploymentIdRequest request ) throws DeploymentWebServiceException {
        return null;
    }

    @Override
    public JaxbDeploymentUnitList getDeploymentInfo( DeploymentIdRequest request ) throws DeploymentWebServiceException {
        return null;
    }
    
}