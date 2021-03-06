// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWSImpl.java.vsl in andromda-webservices.
//
package bw.ac.ub.cs.auth;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin()
public class AuthenticationControllerImpl extends AuthenticationControllerBase {

    protected static Logger log = LoggerFactory.getLogger(AuthenticationControllerImpl.class);


    @Override
    public ResponseEntity<org.springframework.http.ResponseEntity<?>> handleSignin(String username, String password) {
        Optional<ResponseEntity<?>> data = Optional.empty(); // TODO: Add custom code here
        ResponseEntity<org.springframework.http.ResponseEntity<?>> response;

        if(data.isPresent()) {
            response = ResponseEntity.status(HttpStatus.OK).body(data.get());
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @Override
    public ResponseEntity<org.springframework.http.ResponseEntity<?>> handleSignout(String refreshToken) {
        Optional<ResponseEntity<?>> data = Optional.empty(); // TODO: Add custom code here
        ResponseEntity<org.springframework.http.ResponseEntity<?>> response;

        if(data.isPresent()) {
            response = ResponseEntity.status(HttpStatus.OK).body(data.get());
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }
}