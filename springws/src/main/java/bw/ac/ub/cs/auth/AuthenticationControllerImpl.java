// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWSImpl.java.vsl in andromda-webservices.
//
package bw.ac.ub.cs.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin()
public class AuthenticationControllerImpl extends AuthenticationControllerBase {

    @Override
    public ResponseEntity handleSignin(String username, String password) {
    }

    @Override
    public ResponseEntity handleSignout(String refreshToken) {
    }

}