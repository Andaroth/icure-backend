/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { XHR } from "./XHR"
import * as models from "../model/models"

export class fhcStscontrollerApi {
  host: string
  headers: Array<XHR.Header>
  constructor(host: string, headers: any) {
    this.host = host
    this.headers = Object.keys(headers).map(k => new XHR.Header(k, headers[k]))
  }

  setHeaders(h: Array<XHR.Header>) {
    this.headers = h
  }

  handleError(e: XHR.Data) {
    if (e.status == 401) throw Error("auth-failed")
    else throw Error("api-error" + e.status)
  }

  checkKeystoreExistUsingGET(keystoreId: string): Promise<boolean | any> {
    let _body = null
    
    const _url = this.host + "/sts/keystore/check/{keystoreId}".replace("{keystoreId}", keystoreId+"") + "?ts=" + new Date().getTime() 

    return XHR.sendCommand("GET", _url, this.headers, _body)
      .then(doc =>  JSON.parse(JSON.stringify(doc.body)))
      .catch(err => this.handleError(err))
}
  checkTokenValidUsingGET(tokenId: string): Promise<boolean | any> {
    let _body = null
    
    const _url = this.host + "/sts/token/check/{tokenId}".replace("{tokenId}", tokenId+"") + "?ts=" + new Date().getTime() 

    return XHR.sendCommand("GET", _url, this.headers, _body)
      .then(doc =>  JSON.parse(JSON.stringify(doc.body)))
      .catch(err => this.handleError(err))
}
  registerTokenUsingPOST(token: string, tokenId: string): Promise<any | Boolean> {
    let _body = null
    _body = token
    
    const _url = this.host + "/sts/token/{tokenId}".replace("{tokenId}", tokenId+"") + "?ts=" + new Date().getTime() 

    return XHR.sendCommand("POST", _url, this.headers, _body)
      .then(doc => (doc.contentType.startsWith("application/octet-stream") ? doc.body : true))
      .catch(err => this.handleError(err))
}
  requestTokenUsingGET(passPhrase: string, ssin: string, keystoreId: string, isMedicalHouse?: boolean): Promise<models.SamlTokenResult | any> {
    let _body = null
    
    const _url = this.host + "/sts/token/{keystoreId}".replace("{keystoreId}", keystoreId+"") + "?ts=" + new Date().getTime()  + (passPhrase ? "&passPhrase=" + passPhrase : "") + (ssin ? "&ssin=" + ssin : "") + (isMedicalHouse ? "&isMedicalHouse=" + isMedicalHouse : "")

    return XHR.sendCommand("GET", _url, this.headers, _body)
      .then(doc =>  new models.SamlTokenResult(doc.body as JSON))
      .catch(err => this.handleError(err))
}
  uploadKeystoreUsingPOST(file: any): Promise<models.UUIDType | any> {
    let _body = null
    ;file && (_body = (_body || new FormData())).append('file', new Blob(file, {type: "application/octet-stream"}))
    const _url = this.host + "/sts/keystore" + "?ts=" + new Date().getTime() 

    return XHR.sendCommand("POST", _url, this.headers, _body)
      .then(doc =>  new models.UUIDType(doc.body as JSON))
      .catch(err => this.handleError(err))
}
}

