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

package com.apitable.workspace.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import com.apitable.shared.support.serializer.NullArraySerializer;
import com.apitable.core.support.tree.Tree;

/**
 * Node Tree View
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("Node Tree View")
public class NodeInfoTreeVo extends NodeInfoVo implements Tree {

    @ApiModelProperty(value = "Child Node List", position = 15)
    @JsonSerialize(nullsUsing = NullArraySerializer.class)
    private List<NodeInfoTreeVo> children;

    @JsonIgnore
    @Override
    public String getNodeParentId() {
        return getParentId();
    }

    @JsonIgnore
    @Override
    public List<NodeInfoTreeVo> getChildrenNodes() {
        return this.children;
    }

    @Override
    public void setChildrenNodes(List childrenNodes) {
        this.children = childrenNodes;
    }
}
