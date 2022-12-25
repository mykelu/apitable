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

package com.apitable.organization.ro;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Add tag request parameters
 */
@Data
@ApiModel("Add tag request parameters")
public class CreateTagRo {

    @NotNull(message = "Space ID cannot be empty")
    @ApiModelProperty(value = "Space unique ID", example = "r4Arzo4YydiwsgAV", required = true, position = 1)
    private String spaceId;

    @NotBlank
    @Size(min = 1, max = 100, message = "Limit 1 to 100 characters and input special characters")
    @ApiModelProperty(value = "Label Name", dataType = "string", example = "New label", required = true, position = 2)
    private String tagName;
}
