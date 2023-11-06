/**
 * Api Document
 * Backend_Server Api Document
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* Account Association Request Parameters
*/
export class UserLinkOpRo {
    /**
    * Third party type(0.DingTalk;1.WeChat;2.QQ)
    */
    'type': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return UserLinkOpRo.attributeTypeMap;
    }

    public constructor() {
    }
}
