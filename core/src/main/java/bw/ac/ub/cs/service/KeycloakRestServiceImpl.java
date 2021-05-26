// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: CSProject::bw.ac.ub.cs::service::KeycloakRestService
 * STEREOTYPE:  Service
 */
package bw.ac.ub.cs.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ac.ub.cs.service.KeycloakRestService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("keycloakRestService")
public class KeycloakRestServiceImpl
    extends KeycloakRestServiceBase
{

    /**
     * @see bw.ac.ub.cs.service.KeycloakRestService#login(String, String)
     */
    @Override
    protected  String handleLogin(String username, String password)
        throws Exception
    {
        // TODO implement protected  String handleLogin(String username, String password)
        throw new UnsupportedOperationException("bw.ac.ub.cs.service.KeycloakRestService.handleLogin(String username, String password) Not implemented!");
    }

    /**
     * @see bw.ac.ub.cs.service.KeycloakRestService#logout(String)
     */
    @Override
    protected  void handleLogout(String refreshToken)
        throws Exception
    {
        // TODO implement protected  void handleLogout(String refreshToken)
        throw new UnsupportedOperationException("bw.ac.ub.cs.service.KeycloakRestService.handleLogout(String refreshToken) Not implemented!");
    }

}