// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { AuthenticationController } from '@app/service/bw/ac/ub/cs/auth/authentication-controller';

@Injectable()
export class AuthenticationControllerImpl extends AuthenticationController {

    constructor(private injector: Injector) {
        super(injector);
    }

    public signin(username: string, password: string): Observable<ResponseEntity> {

        let formData: any = new FormData();
        formData.append("username", username)
        formData.append("password", password)
        return this.http.post<ResponseEntity>(this.path + "/signin" + "/", formData);

    }

    public signout(refreshToken: string): Observable<ResponseEntity> {

        let formData: any = new FormData();
        formData = refreshToken;
        return this.http.post<ResponseEntity>(this.path + "/signout" + "/", formData);

    }

}