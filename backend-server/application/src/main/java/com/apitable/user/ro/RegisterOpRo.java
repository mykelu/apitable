/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.user.ro;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Register operation request parameters
 */
@Data
@ApiModel("Register operation request parameters")
public class RegisterOpRo {

    @ApiModelProperty(value = "Save the token of WeChat union ID and mobile phone number", example = "thisistoken", position = 1, required = true)
    @NotBlank(message = "Token cannot be empty")
    private String token;

    @ApiModelProperty(value = "Registration invitation code", example = "test", position = 2, required = true)
    private String inviteCode;
}
